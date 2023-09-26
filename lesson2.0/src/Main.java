public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{6, -7, -7, 4, -8, 5};
        int target = -7;

        //findIf(array, target);
    }
    public static void findIf(int [] array, int target){
        //процедурная парадигдма
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(target == array[i])
                count++;
        }
        System.out.println("Number " + target + " repeat " + count + " time");
    }
}