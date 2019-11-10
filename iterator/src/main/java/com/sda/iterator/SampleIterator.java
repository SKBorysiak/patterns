package com.sda.iterator;

import java.util.Iterator;

public class SampleIterator implements Iterator {

    private int position = 0;
    private String dataSet[];

    public SampleIterator(String[] dataSet) {
        this.dataSet = dataSet;
    }

    public boolean hasNext() {
        if (position < dataSet.length) {
            return true;
        }
        return false;
    }

    public String next() {
        if (this.hasNext()) {
            return dataSet[position++];
        }
        return null;
    }

}

