package com.example.Spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//ques 5:Demonstrate how you will resolve ambiguity while autowiring bean.
@Primary
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo
{
    public int[] sort(int[] a) {
        //logic for quick sort
        return a;
    }
}

