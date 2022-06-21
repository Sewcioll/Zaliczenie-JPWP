import java.io.IOException;
import java.util.Scanner;


  public class Main {
 

  public static int nwd(int x, int y) {
    int c;
    while (y != 0) {
    c=x % y;
    x=y;
    y=c;
    
  
  }
  return x;
  }
  public static void main(String[] args) {
    int x,y;
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę: ");
    x = sc.nextInt();
    System.out.println("Podaj drugą liczbę: ");
    y = sc.nextInt();
   System.out.println("NWW liczb " + x + " i " + y + " wynosi: " + ((x*y)/nwd(x,y)));
  }
  }
