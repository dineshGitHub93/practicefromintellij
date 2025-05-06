package com.function_examples;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BillingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input original price
        System.out.println("Enter original MRP :");
        double maxRetailPrice = sc.nextDouble();

        //Input percentage discount
        System.out.println("Enter discount (%) :");
        double discount = sc.nextDouble();

        //BiFunction to calculate final price after discount
        BiFunction<Double,Double,Double> finalAmountAfetrDiscount = (price, disc)-> {
          double discountAmount = price*disc/100;
          return price-discountAmount;
        };

        //calculate Final amount
       double finalAmount = finalAmountAfetrDiscount.apply(maxRetailPrice, discount);

       Function<Double, Double> taxAdder = amount -> amount + (amount * 0.18); // 18% GST
        double finalWithTax = finalAmountAfetrDiscount.andThen(taxAdder).apply(maxRetailPrice, discount);

       //output
        System.out.printf("Final amount after %.2f%% discount: RS:%.2f%n", discount, finalAmount);
        System.out.printf("Amount after discount + tax: ₹%.2f%n", finalWithTax);
        sc.close();
    }

}
