import java.util.Scanner;
//В этом классе я попытался реализовать секундомер не в ООП, а в структурной парадигме
public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        long pause = 0;
        long resume = 0;
        long stop = 0;
        long result = 0;
        long timeFromStartToPause = 0;
        long timeFromResumeToPause = 0;
        System.out.println("Start: ");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        long start = System.currentTimeMillis();

        while (flag) {
            System.out.println("Stop/Pause/Resume: ");
            sc = new Scanner(System.in);
            command = sc.nextLine();
            switch (command) {
                case "Pause":
                    pause = System.currentTimeMillis();
                    if (resume <= start) {
                        timeFromStartToPause = pause - start;
                        result = result + timeFromStartToPause;
                    }
                    else {
                        timeFromResumeToPause = pause - resume;
                        result = result + timeFromResumeToPause;
                        resume = 0;
                    }
                    //result = result + (pause - start);
                    break;
                case "Resume":
                    if (pause > resume)
                        resume = System.currentTimeMillis();

                    break;
                case "Stop": {
                    stop = System.currentTimeMillis();
                    result= result + (stop - resume);

                    flag = false;
                }
                break;
            }
        }
        //long stop = System.currentTimeMillis();
        System.out.println(result / 1000);

    }
}
