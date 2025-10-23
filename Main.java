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
    int d= 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("\n");
    System.out.println("Type an integer");
    int input = scan.nextInt();
     
     if (input <= 0 || input >= 50)
     {
      System.out.print("Error");
     }
     else
     {
      for (int c = input; c<=50; c++)
    {
      if (d == 5)
      {
        System.out.print(c + "\n");
        d = 0;
         d++;
      }
      else 
      {
        System.out.print(c + " ");
         d++;
      }
    }
      
    }
   System.out.print("\n");
  System.out.println("Type a positive integer");
  int num = scan.nextInt();
  if (num < 0 )
  {
     System.out.println("Error");
  }
 else
 { 
  for (int c = num; c>=0; c--)
    {
      if (c % 3 == 0 )
      {
        System.out.println(c + " ");
      }
  
    }

 }
}
}
