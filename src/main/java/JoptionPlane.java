import java.util.Scanner;

public  class JoptionPlane {

    int showInputDialog() {
        System.out.println("Please, enter value: ");
        Scanner sc = new Scanner(System.in);
        String a ="1";
        while(!sc.hasNextInt()){
            System.out.println("Invalid number! Try again: ");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    String continueGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter STOP, if you want to stop: ");
        String str = sc.nextLine();
       return str;
    }

}
