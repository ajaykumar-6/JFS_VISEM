package com.su2;
import java.util.*;
// Prime Number Program
public class App 
{
    public static void main( String[] args )
    {
        Scanner k = new Scanner(System.in);
	int num = k.nextInt();
	boolean isPrime = fun(num);
	/* 
	int count = 1;
	for(int i=2;i<Math.sqrt(num);i++){
		if(num % i == 0){
			count++;
		}
		if(count > 1){
			isPrime = false;
			break;
		}
	}
	*/
	if(isPrime){
		System.out.println("Prime Number");
	}
	else{
		System.out.println("Not a Prime Number");
	}
    }
	public static boolean fun(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num % i == 0) return false;
		}
		return true;
	}
}
