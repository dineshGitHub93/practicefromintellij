package org.function_examples;

import java.util.function.Function;

public class RunnerForConverted {

    public void classicalImplementation(){

        MoneyConvert mc = new MoneyConvert();
        System.out.println("Classical Way Implementation "+mc.convertUSDtoINR(12));
    }

    public void anonymousImplementation(){

        Function<Integer, Double> usdToInr = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer*81.50;
            }
        };
        System.out.println("Anonymous Way Implementation "+usdToInr.apply(15));
    }

    public void lambdaImplementation(){


        Function<Integer, Double> usdToInr = usd -> usd*81.50;
        System.out.println("Lambda Way Implementation "+usdToInr.apply(19));

    }
    public static void main(String[] args) {

        RunnerForConverted obj = new RunnerForConverted();
        obj.classicalImplementation();
        obj.anonymousImplementation();
        obj.lambdaImplementation();
    }
}
