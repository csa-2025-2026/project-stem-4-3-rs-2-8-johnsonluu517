import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    for (int i =1; i<=25; i +=2)
    {
      System.out.print(i + " ");
    }
    System.out.print("\n");

    int b = 1;
      for (int a = 17; a<=73; a++)
    {
      if (b == 10)
      {
        System.out.print(a + "\n");
        b = 0;
         b++;
      }
      else 
      {
        System.out.print(a + " ");
         b++;
      }
      
    }
  }
}
