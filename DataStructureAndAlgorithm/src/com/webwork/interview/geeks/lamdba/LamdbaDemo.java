package com.webwork.interview.geeks.lamdba;

import com.webwork.interview.geeks.lamdba.functionalInterfaces.BiFunctional;
import com.webwork.interview.geeks.lamdba.functionalInterfaces.Calculate;
import com.webwork.interview.geeks.lamdba.functionalInterfaces.Predicate;

public class LamdbaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 10, d = 12;
	
		
		Calculate cal = (  a, b ) ->  a + b ;
		
		int sum = cal.calculate(c, d);
		
		System.out.println(sum);
		
		
		Predicate predicate = (value) -> value == null;
		
		
		System.out.println(predicate.comapreNullCheck(sum));
		
		BiFunctional biFunctional = (  i,  j ) ->  i + j;
	}

}
