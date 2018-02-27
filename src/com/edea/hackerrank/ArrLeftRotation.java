package com.edea.hackerrank;

import java.util.Scanner;

public class ArrLeftRotation {
	
	
	static void printArray(int a[]) {
		String result = "";  
		for(int i=0; i < a.length; i++) {
        	result += a[i];
        	if (i < a.length-1) result += " ";
        }
		System.out.println(result);
	}
	
	/*
	 * Minha solução
	 */
	static int[] arrLeft(int[] arr) {
		
		int mem = arr[0];		
		int i;
		
		for (i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i]=mem;
		
		return arr;
	}
	
	/*
	 * Function to left rotate arr[] of siz n by d
	 */
    static int[] arrLeft(int arr[], int d) {
    	int i, j, k, temp;
    	int n = arr.length;
    	for (i = 0; i < gcd(d, n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (1 != 0) {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    	return arr;
    }
    
    /*
     * Maximo divisor comum
     */
    static int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        printArray(a);
        
        while (k>0) {
        	a = arrLeft(a);
        	k--;
        }
        printArray(a);
        
        printArray(arrLeft(a, k));
        
        /*System.out.print("[");
        for(int a_i=0; a_i < n; a_i++) {        	
        	System.out.print(a[a_i]);
        	if (a_i < n-1) System.out.print(", ");
        }      
        System.out.println("]");*/
    }

}
