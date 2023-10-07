
import java.util.stream.IntStream;

public class Logic {
    private int[] array;

    public Logic(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    private static int[] splitArray(int[] array){
        if (array == null)
            return null;
        if (array.length == 1 )
            return array;
        int [] arrayB = new int[array.length / 2];
        System.arraycopy(array,0, arrayB, 0,array.length / 2);
        int [] arrayC = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayC, 0, array.length - array.length / 2);
        arrayB = splitArray(arrayB);
        arrayC = splitArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }
    private static int[] mergeArray(int[] array2, int [] array3){
        int [] resArray = new int[array2.length + array3.length];
        int positionRes = 0;
        int position2 = 0;
        int position3 = 0;
        while (position2 < array2.length && position3 < array3.length){
            if (array2[position2] < array3[position3]){
                resArray[positionRes] = array2[position2];
                position2++;
                positionRes++;
            }else  {
                resArray[positionRes] = array3[position3];
                position3++;
                positionRes ++;
            }
        }
        while (position2 < array2.length){
            resArray[positionRes] = array2[position2];
            position2++;
            positionRes++;
        }
        while (position3 < array3.length){
            resArray[positionRes] = array3[position3];
            position3++;
            positionRes ++;
        }
        return resArray;
    }
    public int binSearch(int num){
        if (array == null)
            return -1;


        if (!isSorted(array)) {
            array = splitArray(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        //В закоментированном куске кода второйвариант решения, где пользователю будет сообщено,
        // что массив не отсортирован. В случае выбора 2-го варианта блок while перемещается в блок
        // else, а верхний if удаляется
        /*
        if(!isSorted(array))
            System.out.println("Array isn't sorted");
        else {}
         */
        while (firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == num)
                return middleIndex;
            else if (array[middleIndex] < num) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > num) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;




    }

    private boolean isSorted(int [] a){
        if (a.length == 1)
            return true;
        return IntStream.range(0,a.length-1).noneMatch(i -> a[i] > a[i + 1] );
    }

}
