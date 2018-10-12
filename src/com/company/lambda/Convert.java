package com.company.lambda;

public class Convert {

    @FunctionalInterface
    interface Converter<F, T>{
        T convert(F from);
    }

    public static void main(String[] args) {
        Converter<String, Integer> conv = (from ->
            Integer.valueOf(from)
        );

        System.out.println(conv.convert("44444"));
    }
}
