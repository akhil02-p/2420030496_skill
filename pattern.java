package MYPROJECT;
import java.util.Scanner;
public class pattern {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number (int):");
    int a=sc.nextInt();
    for(int i=a;i>=1;i--) {
      for(int j=1;j<=i;j++) {
        System.out.print(j+" ");
      }
        System.out.println();
    }
  }
}