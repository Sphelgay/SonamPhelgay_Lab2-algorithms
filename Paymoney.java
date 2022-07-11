import java.util.*;

public class Paymoney
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int target_value;
	
	System.out.print("Enter the size of transaction: ");
    int size = sc.nextInt();
    
    int[] values = new int[size];
    
    for (int i=0;i<size;i++)
    {
        System.out.print("Enter value: ");
        values[i]=sc.nextInt();
    }
	
    System.out.print("Enter the no.of targets: ");
    int target = sc.nextInt();
    
    
    if (size>1)
    {
    
    while (target!=0)
    {
        System.out.print("Enter target value:  ");
        target_value=sc.nextInt();
        
        int sum = 0;
            for (int i=0;i<size;i++)
            {   
                sum += values[i];
                if (sum >=target_value)
                {
                    i+=1;
                    System.out.println("Target achieved after " + i +" transaction");
                    break;
                }

            }
     target--; 
    }
    }
     else 
    {
        System.out.print("Enter target value:  ");
        target_value=sc.nextInt();
        if (target_value>values[0])
        {
            System.out.println("Given target is not achieved");
        }
    }
    }
}

    
  