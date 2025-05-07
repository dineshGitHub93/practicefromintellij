package com.stream_api_examples;

import java.util.Comparator;

public class PriceLowtoHigh implements Comparator<Mobile2> {

    @Override
    public int compare(Mobile2 o1, Mobile2 o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
