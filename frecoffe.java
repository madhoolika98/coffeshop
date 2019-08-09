
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	 Scanner s=new Scanner(System.in);
	 int output=0;
	 int bill=s.nextInt();
     int abill=bill;
     int discount=s.nextInt();
     int val,res,money=0;
    while (bill>1)
    {
        output= bill - (bill * discount / 100);
        val=bill-output;
        res=bill-val;
        money=bill+res;
        bill=res;
        
    }
    int amount=money+abill;
    System.out.println(amount);
	}
}
