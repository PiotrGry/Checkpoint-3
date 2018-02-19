package view;

import java.util.Scanner;

public class View {

    public String getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int getNumberFromUser(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public void showMenu(){
        System.out.println("Press 1 to show books");
    }

}
