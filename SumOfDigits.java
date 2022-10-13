package ashwin;

import java.util.Scanner;

public class SumOfDigits 
{
  static void sum(int result) {
	  int temp1 = result;
	  int res =0;
	  while(result > 0)
	  {
		  temp1 = result % 10;
		   res = res + temp1;
		   result = result / 10;
	  }
		  
	  result = res;
	  if(result > 10)
	  {
		  sum(result);
	  }
	  System.out.println(result);
  }
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	String num = sc.next();
	int b = Integer.parseInt(num);
	int temp = b,i =num.length(),result = 0;
	while(temp > 0) 
	{
		b = temp % 10;
		result += Math.pow(b,i);
		temp = temp / 10;
		i--;
	}
	sum(result);
	 
}
}
