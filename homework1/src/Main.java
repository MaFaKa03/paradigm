import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(0,5);
        num.add(1,3);
        num.add(2,6);
        num.add(3,2);
        num.add(4,9);
        num.add(5,4);
        num.add(6,7);
        num.add(7,1);
        num.add(8,8);
        System.out.println(num);
        //sortListImperative(num);
        sortListDeclarative(num);

    }
   public static void sortListImperative(List<Integer> numbers) {
       //пузырьковая сортировка в императивном стиле
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) < numbers.get(i + 1)) {
                    flag = false;
                    Integer value = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, value);
                }
            }

        }
       System.out.println(numbers);
    }
   public static void sortListDeclarative(List<Integer> numbers){
        //сортировка листа в декларативном стиле с помощью встроеного метода .sort
        numbers.sort(Comparator.reverseOrder());
       System.out.println(numbers);
   }


}