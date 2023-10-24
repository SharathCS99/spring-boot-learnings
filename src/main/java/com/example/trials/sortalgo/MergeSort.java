package com.example.trials.sortalgo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MergeSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public void typeOfsort(T[] a, int n) {
        System.out.println("Implementing merge sort");
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        T[] l = (T[]) new Comparable[mid];
        T[] r = (T[]) new Comparable[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        typeOfsort(l, mid);
        typeOfsort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private void merge(T[] a, T[] l, T[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
