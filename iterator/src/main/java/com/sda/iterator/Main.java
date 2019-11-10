package com.sda.iterator;

import java.util.Iterator;

public class Main implements Iterable<String> {

    private String[] dataSet = {"1", "2", "3", "4"};


    public static void main(String[] args) {

        Main main = new Main();
        Iterator<String> iterator = main.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new SampleIterator(dataSet);
    }
}

