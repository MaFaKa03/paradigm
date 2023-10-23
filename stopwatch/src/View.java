import java.util.Scanner;
// собственно пользовательский класс, но через него некорректно записываются данные в переменные,
// которые явдяются полями класса Logic
public class View {
    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println("Enter 'Start'");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        logic.start();
        boolean flag = true;
        while (flag){
            System.out.println("Enter command 'Pause', 'Resume', 'Stop': ");
            scanner = new Scanner(System.in);
            command = scanner.nextLine();
            switch (command){
                case "Pause":
                    logic.pause();
                break;
                case "Resume":
                    logic.resume();
                break;
                case "Stop": {
                    logic.stop();
                    flag = false;
                }
                break;
            }

        }
        System.out.println(logic.getResTime() / 1000);
    }
}