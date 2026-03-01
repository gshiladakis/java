import java.util.Scanner;

public class Logical2java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
char ch = '\0';
while(ch != 'n' && ch !='N'){
System.out.print("Enter a number: ");
int n = scan.nextInt();
if(n>=0){
System.out.print("Given number is positive");
}
else{
System.out.print("Given number is negative");
}
if(n % 2 == 0){
System.out.println(" and even");
}
else{
System.out.println(" and odd");
}
System.out.print("Do you want to trye another number (y/n): ");
ch = scan.next().charAt(0);
}
}

}
