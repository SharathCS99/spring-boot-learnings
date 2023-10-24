package com.example.trials.search;

import com.example.trials.sortalgo.MergeSort;
import com.example.trials.sortalgo.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch<T extends Comparable<T>> {

    @Autowired
    SortAlgorithm quickSort;
    public int search(T[] arr,T key,int n)
    {
        // this particular sort is using merge sort.
        quickSort.typeOfsort(arr,n);
        int lo=0;
        int high=n-1;
        while(lo<high)
        {
            int mid=lo+((high-lo)/2);
            if(arr[mid].compareTo(key)==0)
            {
                return mid+1;
            }
            if(arr[mid].compareTo(key)>0)
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
