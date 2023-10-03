import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        binaryTranslate(567);
        //System.out.println(5 % 2);
    }
    public static void binaryTranslate(int num){
        String res = "";
        while(num > 0) {
            res = res + String.valueOf(num % 2);
            num = num / 2;

        }
        System.out.println(res);



        char[] arrayRes = res.toCharArray();
        double size = arrayRes.length;
        int reverse = arrayRes.length -1;
        for (int i = 0; i < Math.ceil(size / 2) ; i++) {
            char temp = arrayRes[i];
            arrayRes[i] = arrayRes[reverse];
            arrayRes[reverse] = temp;
            reverse--;
        }
        res = new String(arrayRes);
        //int resInt = Integer.parseInt(res);
        System.out.println(res);
    }
}
