
import java.util.Scanner;

public class Application {
	
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    System.out.println(i*i);
    scanner.close();
  }
}
