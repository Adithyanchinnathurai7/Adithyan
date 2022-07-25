package vin;

public class For
{
public static void main(String[] args)
{
	int rows = 5;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }


/*for (int m = 1; m <=7 ; m++)
{
for (int n=7; n>m; n--)
{
System.out.print(" ");
}
for (int p=1; p<=(m * 2) -1; p++)
{
System.out.print("*");
}
System.out.println();
}
}*/
}
