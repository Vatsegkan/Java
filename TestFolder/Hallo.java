import java.util.Scanner;

class Hallo{

    public static void main(String[] args){
        Scanner nummer = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein:");
        int zahl = nummer.nextInt();

        if(zahl == 10){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("bye!!");
        }
            
    }
}