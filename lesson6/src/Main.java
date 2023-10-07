public class Main {
    public static void main(String[] args) {
        double [] array1 = new double[] {1, 2, 3, 4, 5};
        double [] array2 = new double[] {0, 2, 3, 4, 5};
        //System.out.println(mse(array1, array2));
        int [] arr = new int[] {7, 3, 4, 6, 8};
        arr = splitArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static double mse(double[] array1, double[] array2){
        double res1 = 0;
        double res2 = 0;
        for (int i = 0; i < array1.length; i++) {
            res1 += array1[i];
            res2 += array2[i];
        }
        //System.out.println(res1 + " res1");
        //System.out.println(res2 + " res2");
        return (Math.pow((res1 - res2), 2) / array1.length);
    }
    public static int[] splitArray(int[] array){
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
    public static int[] mergeArray(int[] array2, int [] array3){
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
            /*
        for (int i = 0; i < resArray.length; i++) {
            if (position2 == array2.length){
                resArray[i] = array3[i - position3];
                position3++;
            } else if (position3 == array3.length) {
                resArray[i] = array2[i - position2];
                position2++;
            } else if (array2[i - position2] < array3[i - position3]) {
                resArray[i] = array2[i - position2];
                position3++;
            }else {
                resArray[i] = array3[i - position3];
                position2++;
            }
        }
        return resArray;

             */
    }


}