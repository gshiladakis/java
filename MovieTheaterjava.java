import java.io.File;

import java.util.Scanner;

import java.util.ArrayList;

import javafx.scene.shape.Arc;

import java.util.Iterator;

public class MovieTheaterjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

AuthenticationClass authenicationObject = new AuthenticationClass();

// Create scanner object

Scanner scannerObject = new Scanner(System.in);

System.out.print("Enter username: ");

String username = "", password = "";


username = scannerObject.nextLine();

System.out.print("Enter password: ");

password = scannerObject.nextLine();

if(authenicationObject.login(username, password)){

System.out.println("Welcome!!!\n\n");

// Loops the logic until it is true

while(true){

System.out.print("1 - Search by movie name \n2 - Search by genre\n3 - Quit \nEnter your choice (1/2): ");

String chooseChoice = scannerObject.nextLine();

ArrayList<String> moviesObject = DatabaseClass.getDatabse();

if(chooseChoice.equals("1")){

Iterator<String> iteratorObject = moviesObject.iterator();

System.out.print("\nEnter name of the movie: ");

String movieNameContent = scannerObject.nextLine();

while(iteratorObject.hasNext()){

String recurionContent = iteratorObject.next();

if(recurionContent.split(",")[1].equalsIgnoreCase(movieNameContent)){

System.out.println("Movie Id: "+recurionContent.split(",")[0]);

System.out.println("Movie Name: "+recurionContent.split(",")[1]);

System.out.println("Movie genre: "+recurionContent.split(",")[2]);

System.out.println("Movie release year: "+recurionContent.split(",")[3]);

System.out.println("\n");

}

}

}

// here checks another condition whether it is 2 or not

else if(chooseChoice.equals("2")){

Iterator<String> iteratorObject = moviesObject.iterator();

System.out.print("Enter genre of the movie: ");

String movieNameContent = scannerObject.nextLine();

while(iteratorObject.hasNext()){

String recurionContent = iteratorObject.next();

if(recurionContent.split(",")[2].equalsIgnoreCase(movieNameContent)){

System.out.println("Movie Id: "+recurionContent.split(",")[0]);

System.out.println("Movie Name: "+recurionContent.split(",")[1]);

System.out.println("Movie genre: "+recurionContent.split(",")[2]);

System.out.println("Movie release year: "+recurionContent.split(",")[3]);

System.out.println("\n");

}

}
