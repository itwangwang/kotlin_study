package com.itwang.kotlin.quickstarts;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ListForEachTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hi");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.stream().forEach(s -> System.out.println(s));

    }
}
