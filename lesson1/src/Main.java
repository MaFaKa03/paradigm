import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{6, -7, -7, 4, -8, 5};
        int target = 0;
        fractionNumberDec(array);
        //search(target, array);

        //Поиск числа в декларативном стиле
        /*
        boolean found = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet())
                .contains(target);
        System.out.println(found);

         */


    }

    public static void search(int target, int [] array){
// создаем метод поиска чисила в импепраттивном стиле
        boolean tag = false;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]){
                tag = true;
                System.out.println(" число " + target + " находится на позиции " + i);
            }else tag = false;


        }
        if (tag == false)
            System.out.println("Число " + target + " Не найдено");
    }

    public static void fractionNumber(int [] array){
        //поиск доли чисел в императивном стиле
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                negative++;
            else if (array[i] > 0)
                positive++;
            else if (array[i] == 0)
                zero++;
        }
        negative = negative / array.length;
        positive = positive / array.length;
        zero = zero / array.length;
        System.out.println("Доля положительный чисел " + positive + "\n " +
                            "Доля отрицательных чисел " + negative + "\n " +
                            "Доля 0 " + zero );

    }
    public static void fractionNumberDec(int[] array){
       // IntPredicate numb;
        int [] negativeArray = Arrays.stream(array).filter(numb-> {
            return numb < 0;
        }).toArray();
        int [] positiveArray = Arrays.stream(array).filter(numb-> {
            return numb > 0;
        }).toArray();

        int [] zeroArray = Arrays.stream(array).filter(numb-> {
            return numb == 0;
        }).toArray();
        double negSize = negativeArray.length;
        double posSize = positiveArray.length;;
        double zeroSize = zeroArray.length;

        double negative = negSize / array.length;
        double positive = posSize / array.length;
        double zero = zeroSize / array.length;

        System.out.println("Доля положительный чисел " + positive + "\n " +
                "Доля отрицательных чисел " + negative + "\n " +
                "Доля 0 " + zero );

    }
}