package org.function_examples;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

public class SupplierExamples {

    public static void main(String[] args) {

//        1. Supply a constant string
        Supplier<String> getMessage = ()->"Hello World";
        System.out.println(getMessage.get());

//        2. Get current time
        Supplier<Long> getCurrentTime = ()->System.currentTimeMillis();
        System.out.println(getCurrentTime.get());

//       3. Supply today's date
        Supplier<LocalDate> getTodayData = ()-> LocalDate.now();
        System.out.println(getTodayData.get());

//      5. Supply a random number between 0 and 100
        Supplier<Integer> getRandomNumber = ()-> new Random().nextInt(101);
        System.out.println(getRandomNumber.get());

//       6. Supply a default user name
        Supplier<String> getUserName = ()->"userName";
        System.out.println(getUserName.get());

//       7. Supply a random boolean value
        Supplier<Boolean> getRandomBooleanValue = ()-> new Random().nextBoolean();
        System.out.println(getRandomBooleanValue.get());

    }
}
