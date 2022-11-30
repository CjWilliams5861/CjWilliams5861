import java.util.Scanner;
class Main
{
    
    static final float TAX_RATE = 0.07f;
    static final float TIP_RATE = 0.15f;
    public static void main(String[] args)
    {
        
        M6PE1();
// Only calling of one function at a time as you are taking input from user from both functions
        // M6PE2();
    }
    
     public static void M6PE1()
    {
        // System.out.println("M6PE1 Solution ");
         
         float tractsize, acres; 
         int SQ_FEET_PER_ACRE =43560;
         
         Scanner obj=new Scanner(System.in); 
         tractsize = obj.nextFloat () ;
          System.out.print("Enter the number of square feet in the tract: "+tractsize+"\n");
         acres = tractsize/ SQ_FEET_PER_ACRE; 
         System.out.println("The size of the tract is "+acres+" acres. ");
    }
    public static void M6PE2()
    {
        // System.out.println("M6PE2 Solution ");
        
        float food, tip,tax,total;
        Scanner myObj = new Scanner(System.in);
        food = myObj.nextFloat();
        // If input is already provided for the food then you can directly call the function for the M6PE2
        System.out.print("Enter food charges: $"+food+"\n");
        tip = food * TIP_RATE;
        tax = food *TAX_RATE;
        total = food+tip+tax;
        System.out.println("Tip: $"+tip);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
        
        
    }
    
    
    
}



