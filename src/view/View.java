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
//    public Game getApplicantInput(){
//        String gameTitle = getInput("Title: ");
//        int totalSold = Integer.parseInt(getInput("Total sold copies: "));
//        int year = Integer.parseInt(getInput("year realsed: "));
//        String genre = getInput("Genre: ");
//        String publisher = getInput("Publisher: ");public Book getBookInput(){
//        String gameTitle = getInput("Title: ");
//        int totalSold = Integer.parseInt(getInput("Total sold copies: "));
//        int year = Integer.parseInt(getInput("year realsed: "));
//        String genre = getInput("Genre: ");
//        String publisher = getInput("Publisher: ");
//}
}
