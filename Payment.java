
import java.util.*;

public class Payment
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the size of denomination: ");
    int size = sc.nextInt();
    int[] currency = new int[size];
    
    for (int i=0;i<size;i++)
    {
        System.out.print("Enter value: ");
        currency[i]=sc.nextInt();
    }
	
    System.out.print("Enter the amount you want to pay: ");
    int amount = sc.nextInt();
    int temp;
  
  
    for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (currency[i] > currency[j]) 
                {
                    temp = currency[i];
                    currency[i] = currency[j];
                    currency[j] = temp;
                }
            }
        }
        
        System.out.print("\n");
    
    System.out.print("Currency: No.of Notes\n");
    int note_count=0;
    for(int i=size-1;i>=0;i--)
    {
      if(currency[i]<=amount)
      {
        note_count = amount/currency[i];
        amount %= currency[i];
        System.out.print(currency[i] +":"+note_count+"\n");
        
      }
    }
 
	}
}
