package com.example.trials.search;

import com.example.trials.sortalgo.MergeSort;
import com.example.trials.sortalgo.SortAlgorithm;

public class BinarySearch {

    SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm)
    {
        super();
        this.sortAlgorithm=sortAlgorithm;
    }
    public int search(int[] arr,int key,int n)
    {
        // this particular sort is using merge sort.
        sortAlgorithm.typeOfsort(arr,n);



        int lo=0;
        int high=n-1;
        while(lo<high)
        {
            int mid=lo+((high-lo)/2);
            if(arr[mid]==key)
            {
                return mid+1;
            }
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;

    }
}
