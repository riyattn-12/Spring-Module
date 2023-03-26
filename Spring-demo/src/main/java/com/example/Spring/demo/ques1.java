package com.example.Spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//ques 3: (3) Use @Compenent and @Autowired annotations to in
// Loosely Coupled code for dependency management
@Component

public class ques1
{
    @Autowired
    private SortAlgo sortAlgo;

    public ques1(SortAlgo sortAlgo) {
        this.sortAlgo = sortAlgo;
    }
    public int BinarySearch(int[] num, int number_search)
    {

        int[] sortedNumber = sortAlgo.sort(num);
        System.out.println(sortAlgo);

        return 3;

    }
}
