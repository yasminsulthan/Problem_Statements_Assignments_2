package com.yasmin;
import java.io.*;
import java.util.*;
public class Demo{ 
		static void findFrequency(int[] input, int n)
	{
	    for (int i = 0; i < n; i++)
	        input[i]--;

	    for (int i = 0; i < n; i++)
	        input[input[i] % n] += n;

	    for (int i = 0; i < n; i++) {
	        if ((input[i] / n) != 0)
	            System.out.println(
	                "Element " + (i + 1) + " occurs "
	                + input[i] / n + " times");
	        // Change the element back to original value
	        input[i] = input[i] % n + 1;
	    }
	}

	// Driver function
	public static void main(String[] args)
	{
	   int[] arr
	       = { 2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9  };
	    
		
		int n = arr.length;
	    findFrequency(arr,n);
	}
	}

