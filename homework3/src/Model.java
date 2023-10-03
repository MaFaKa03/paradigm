import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    public String [][] place;
    public Model(){

    }
    public Model(String[][] place) {
        this.place = place;
    }

    public String[][] getPlace() {
        return place;
    }

    public void setPlace() {
        String [] [] place = new String [3][3];
        this.place =  place;
    }
    public String [][] createPlace(){
        //int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                //count++;
                place[i][j] = String.valueOf(i +1) + " " + String.valueOf(j + 1);
            }
        }
        return place;
    }
    public void addX(int i, int j, String x) throws ArrayIndexOutOfBoundsException{
        if (i <= place.length && j <= place[0].length){
            for (int k = 0; k < place.length; k++) {
                for (int l = 0; l < place[k].length; l++) {
                    if (k == i - 1 && l == j - 1) {
                        if (x.equals("x") || x.equals("X")
                                || x.equals("х") || x.equals("Х"))
                            place[k][l] = x;
                    }
                }
            }
        } else throw new ArrayIndexOutOfBoundsException("Wrong position");
    }
    public void addO(int i, int j, String o) throws ArrayIndexOutOfBoundsException{
        if (i <= place.length && j <= place[0].length){
            for (int k = 0; k < place.length; k++) {
                for (int l = 0; l < place[k].length; l++) {
                    if (k == i - 1 && l == j -1) {
                        if (o.equals("o") || o.equals("O")
                                || o.equals("о") || o.equals("О"))
                            place[k][l] = o;
                    }
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                System.out.print(place[i][j] + "    ");

            }
            System.out.println();
            System.out.println("\n");
        }
    }
    public boolean win(){
        boolean win = false;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if ((place[0][0].equals(place[0][1]) && place[0][1].equals(place[0][2]))
                   || (place[1][0].equals(place[1][1]) && place[1][1].equals(place[1][2]))
                 || (place[2][0].equals(place[2][1]) && place[2][1].equals(place[2][2]))
                || (place[0][0].equals(place[1][0]) && place[1][0].equals(place[2][0]))
                    || (place[0][1].equals(place[1][1]) && place[1][1].equals(place[2][1]))
                    || (place[0][2].equals(place[1][2]) && place[1][2].equals(place[2][2]))
                || (place[0][0].equals(place[1][1]) && place[1][1].equals(place[2][2]))
                        || (place[0][2].equals(place[1][1]) && place[1][1].equals(place[2][0])))
                    win = true;
            }
        }
        return win;
    }


}
