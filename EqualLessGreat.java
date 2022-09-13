import java.util.Scanner;

public class EqualLessGreat {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter any number (-2147483648 to 2147483647):");
    int number = input.nextInt();
    if(number > 10) {
      System.out.println("The number you entered (" + number + ") is greater than 10");
    } else if(number < 10) {
      System.out.println("The number you entered (" + number + ") is less than 10");
    } else if(number == 10) {
      System.out.println("The number you entered (" + number + ") is equal to 10");
    }
  }
}
