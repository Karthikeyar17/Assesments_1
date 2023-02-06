package Tournament_Shirts;

import java.util.Scanner;
public class T_Shirts{
  public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
		int[] prices={200, 250, 300};
		int[] discounts={0, 10, 20};
		int[] cart=new int[3];
		System.out.println("Enter no.of Round-Neck T-Shirts:");
		cart[0]=scanner.nextInt();
		System.out.println("Enter no.of Collared T-Shirts:");
		cart[1]=scanner.nextInt();
		System.out.println("Enter no.of Hooded T-Shirts:");
		cart[2]=scanner.nextInt();
		int totalCost=0;
		for (int i=0;i < 3;i++){
		  totalCost+=cart[i]*prices[i];
		}
		int Shirts=cart[0]+cart[1]+cart[2];
		int discountIndex=Shirts<5?0:Shirts<=10?1:2;
		int discount=discounts[discountIndex];
		int FinalPrice=totalCost-(totalCost*discount/100);
		System.out.println("Final Price is: "+FinalPrice);
	}
  }
}