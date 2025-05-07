package com.stream_api_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileRunner {

    public static void main(String[] args) {
        List<Mobile> mobiles= new ArrayList<Mobile>();
        mobiles.add(new Mobile(Mobile.Brand.APPLE, "iPhone 14 Pro", 128, 999.99, 48, 6.1, "Deep Purple"));
        mobiles.add(new Mobile(Mobile.Brand.SAMSUNG, "Galaxy S23 Ult", 256, 1199.99, 200, 6.8, "Phantom Black"));
        mobiles.add(new Mobile(Mobile.Brand.MOTO, "Moto Edge 40", 128, 599.99, 50, 6.55, "Nebula Green"));
        mobiles.add(new Mobile(Mobile.Brand.GOOGLE, "Pixel 8 Pro", 128, 899.99, 50, 6.7, "Obsidian"));
        mobiles.add(new Mobile(Mobile.Brand.ONEPLUS, "OnePlus 11", 256, 699.00, 50, 6.7, "Titan Black"));
        mobiles.add(new Mobile(Mobile.Brand.NOKIA, "Nokia G400", 64, 239.99, 48, 6.58, "Meteor Grey"));
        mobiles.add(new Mobile(Mobile.Brand.XIAOMI, "Redmi 12 Pro", 128, 329.99, 50, 6.67, "Glacier Blue"));
        mobiles.add(new Mobile(Mobile.Brand.APPLE, "iPhone SE2022", 64, 429.00, 12, 4.7, "Starlight"));
        mobiles.add(new Mobile(Mobile.Brand.SAMSUNG, "Galaxy A54", 128, 449.99, 50, 6.4, "Awesome Lime"));
        mobiles.add(new Mobile(Mobile.Brand.MOTO, "Moto G Power 5G", 128, 299.99, 50, 6.5, "Midnight Blue"));
        mobiles.add(new Mobile(Mobile.Brand.GOOGLE, "Pixel 7a", 128, 499.99, 64, 6.1, "Sea"));
        mobiles.add(new Mobile(Mobile.Brand.ONEPLUS, "Nord CE 3 Lite", 128, 249.00, 108, 6.72, "Pastel Lime"));
        mobiles.add(new Mobile(Mobile.Brand.NOKIA, "Nokia XR21", 128, 499.99, 64, 6.49, "Pine Green"));
        mobiles.add(new Mobile(Mobile.Brand.XIAOMI, "Xiaomi 13 Pro", 256, 999.00, 50, 6.73, "Ceramic White"));
        mobiles.add(new Mobile(Mobile.Brand.APPLE, "iPhone 13 Mini", 128, 699.99, 12, 5.4, "Pink"));

        System.out.printf("| %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |%n", "BRAND", "MODEL", "MEMORY", "PRICE", "MEGAPIXEL",
                "DISPLAYSIZE", "COLOR");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (Mobile mobi: mobiles){
            System.out.printf("| %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |%n", mobi.getBrand(),mobi.getModel(), mobi.getMemory()
                                , mobi.getPrice(), mobi.getMegapixel(), mobi.getDisplaySize(), mobi.getColor());
        }

        System.out.println("Sort data by mobile price");
        Collections.sort(mobiles);
        System.out.printf("| %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |%n", "BRAND", "MODEL", "MEMORY", "PRICE", "MEGAPIXEL",
                "DISPLAYSIZE", "COLOR");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (Mobile mobi: mobiles){
            System.out.printf("| %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |  %-15s |%n", mobi.getBrand(),mobi.getModel(), mobi.getMemory()
                    , mobi.getPrice(), mobi.getMegapixel(), mobi.getDisplaySize(), mobi.getColor());
        }

    }

}
