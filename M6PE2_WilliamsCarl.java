import java.util.Scanner;
public class lastname_M4PE2
{  //program to calculate Total bill including tip and tax
    static final float TAX_RATE = 0.07f;
	static final float TIP_RATE = 0.15f;
	public static void main(String[] args) {
	    float food, tip, tax, total;
        Scanner myObj = new Scanner(System.in);
	   	System.out.print("Enter food charges: ");
		food = myObj.nextFloat();
		tip = food* TIP_RATE;  //calculating tip
		tax = food* TAX_RATE; //calculating tax
		total = food + tip +tax; //calculating total
		System.out.println("Tip: $"+tip);
		System.out.println("Tax: $"+tax);
		System.out.println("Total: $"+total);