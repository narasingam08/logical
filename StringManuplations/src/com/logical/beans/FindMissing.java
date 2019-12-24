package com.logical.beans;

public class FindMissing {

		/*
		 * int[] a= {1,2,3,5,5,6,7,8,9,10}; for(int i=0;i<=a.length;i++) { for(int
		 * j=i+1;j<=a.length;j++) { if(a[i]+1==a[j]) { System.out.println("value"+a[i]);
		 * }else { System.out.println("missing value"+a[i]+1); } } }
		 */
	static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        return total; 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        int a[] = { 1, 2, 3, 5, 5,6,7,8,9 }; 
        int miss = getMissingNo(a, 9); 
        System.out.println(miss); 
    } 		  
	}

