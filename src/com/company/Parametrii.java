import java.util.Scanner;

public class Parametrii {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        clasa clasaObject = new clasa();

        System.out.println("Intordu numele tau aici ");

        String nume = input.nextLine();

        clasaObject.mesajSimplu(nume);


    }
}
