package leetcode;

import java.util.Arrays;

public class Sort {
    public static void main(String args[]) {  
        int []a = new int[] {16,25,34,27,30,5,7,4,41,55};
        Sort.heapSort(a);
        System.out.println(Arrays.toString(a));
    }
    static int parent(int i) {
        return (i - 1)/2;
    }
    static int left(int i) {
        return 2*i + 1;
    }
    static int right(int i) {
        return 2*i + 2;
    }
    static void maxHeapfy(int []a,int i,int heapSize) {   
        int left = left(i);    
        int right = right(i);   
        int largest = i;
        if(left < heapSize && a[left] > a[largest]) {   //
            largest = left;
        }
        if(right < heapSize && a[right] > a[largest])  
        {
            largest = right;
        }
        if(largest != i) {      
            a[largest] = a[largest] ^ a[i];
            a[i] = a[largest] ^ a[i];
            a[largest] = a[largest] ^ a[i];
            maxHeapfy(a,largest,heapSize);    
        }
    }
    static void buildMaxHeap(int []a,int heapSize) {
        for(int i = (heapSize-2)/2;i >= 0;i--) {
            maxHeapfy(a,i,heapSize);
        }
    }
    static void heapSort(int []a) {
        int len = a.length;
         buildMaxHeap(a,len);  
         a[len-1] = a[0] ^ a[len-1];    
         a[0] = a[0] ^ a[a.length-1];
         a[len-1] = a[0] ^ a[len-1];
         for(int i = 1;i<len-1;i++) { 
             maxHeapfy(a,0,len-i);
             a[len-1-i] = a[0] ^ a[len-1-i];   
             a[0] = a[0] ^ a[len-1-i];
             a[len-1-i] = a[0] ^ a[len-1-i];
         }
    }
}

