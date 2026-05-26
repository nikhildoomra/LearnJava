package com.learnjava;

import java.util.ArrayList;
import java.util.Iterator;

class LearnArrayList {
    public static void main(String[] args) {
        // System.out.println("Hello");
        ArrayList<String> myList = new ArrayList<>();

        myList.add("item1");
        myList.add("item2");
        myList.add("item1");
        myList.add("item3");

        Iterator<String> myIterator = myList.iterator();
        
        while(myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}