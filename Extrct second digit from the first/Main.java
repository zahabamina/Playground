import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      while(n>=100)
      {
        n=n/10;
      }
      int sdigt=n%10;
      System.out.println(sdigt);
    }
}