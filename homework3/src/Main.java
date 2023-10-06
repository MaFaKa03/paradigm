import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Model model = new Model();
        model.setPlace();
        model.createPlace();
        boolean win = false;
        model.print();

        int count = 0;
        while (!win && count < 9) {

            System.out.println("Enter 'x': ");
            Scanner scanner = new Scanner(System.in);
            String player = scanner.nextLine();
            count++;

            System.out.println("Enter position from 1 to 3 (ex: 1 3): ");
            Scanner scannerPosition = new Scanner(System.in);
            String position = scannerPosition.nextLine();
            String[] numbers = position.split(" ");
            int firstIntPosition = Integer.parseInt(numbers[0]);
            int secondIntPosition = Integer.parseInt(numbers[1]);

            if (firstIntPosition <= model.place.length && secondIntPosition <= model.place[0].length)
                model.addX(firstIntPosition, secondIntPosition, player);
            else {
                while (firstIntPosition > model.place.length || secondIntPosition > model.place[0].length) {
                    System.out.println("Wrong position. Repeat please from 1 to 3: ");
                    scannerPosition = new Scanner(System.in);
                    position = scannerPosition.nextLine();
                    numbers = position.split(" ");
                    firstIntPosition = Integer.parseInt(numbers[0]);
                    secondIntPosition = Integer.parseInt(numbers[1]);
                    try {
                        model.addX(firstIntPosition, secondIntPosition, player);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("again...");
                    }
                }
            }

            if (model.getPlace()[firstIntPosition - 1][secondIntPosition - 1] != player) {

                while (model.getPlace()[firstIntPosition - 1][secondIntPosition - 1] != player) {
                    System.out.println("Wrong Entry. Repeat please: ");
                    scanner = new Scanner(System.in);
                    player = scanner.nextLine();
                    System.out.println("Enter position from 1 to 3 (ex: 1 3): ");
                    scannerPosition = new Scanner(System.in);
                    position = scannerPosition.nextLine();
                    numbers = position.split(" ");
                    firstIntPosition = Integer.parseInt(numbers[0]);
                    secondIntPosition = Integer.parseInt(numbers[1]);
                    model.addX(firstIntPosition, secondIntPosition, player);
                }
            } else model.addX(firstIntPosition, secondIntPosition, player);


            model.print();
            win = model.win();
            if (win) {
                System.out.println("X win");
                break;
            }
            if (!win && count > 9) {
                System.out.println("Draw");
                break;
            }

            System.out.println("Enter 'o': ");
            scanner = new Scanner(System.in);
            player = scanner.nextLine();
            count++;

            System.out.println("Enter position from 1 to 3 (ex: 1 3): ");
            scannerPosition = new Scanner(System.in);
            position = scannerPosition.nextLine();
            numbers = position.split(" ");
            firstIntPosition = Integer.parseInt(numbers[0]);
            secondIntPosition = Integer.parseInt(numbers[1]);

            if (firstIntPosition <= model.place.length && secondIntPosition <= model.place[0].length)
                model.addO(firstIntPosition, secondIntPosition, player);
            else {
                while (firstIntPosition > model.place.length || secondIntPosition > model.place[0].length) {
                    System.out.println("Wrong position. Repeat please from 1 to 3: ");
                    scannerPosition = new Scanner(System.in);
                    position = scannerPosition.nextLine();
                    numbers = position.split(" ");
                    firstIntPosition = Integer.parseInt(numbers[0]);
                    secondIntPosition = Integer.parseInt(numbers[1]);
                    try {
                        model.addO(firstIntPosition, secondIntPosition, player);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("again...");
                    }
                }
            }

            if (model.getPlace()[firstIntPosition - 1][secondIntPosition - 1] != player) {

                while (model.getPlace()[firstIntPosition - 1][secondIntPosition - 1] != player) {
                    System.out.println("Wrong Entry. Repeat please: ");
                    scanner = new Scanner(System.in);
                    player = scanner.nextLine();
                    System.out.println("Enter position from 1 to 3 (ex: 1 3): ");
                    scannerPosition = new Scanner(System.in);
                    position = scannerPosition.nextLine();
                    numbers = position.split(" ");
                    firstIntPosition = Integer.parseInt(numbers[0]);
                    secondIntPosition = Integer.parseInt(numbers[1]);
                    model.addO(firstIntPosition, secondIntPosition, player);
                }
            } else model.addO(firstIntPosition, secondIntPosition, player);

            model.print();

            win = model.win();
            if (win) {
                System.out.println("O win");
                break;
            }
            if (!win && count > 9) {
                System.out.println("Draw");
                break;
            }
        }
    }
}