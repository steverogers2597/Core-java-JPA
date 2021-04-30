package com.cg.functionalinterfaceDemo;
/* Consumer
Supplier
Predicate
Function
*/

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaceDemo {
	public static void main(String args[]) {
		
		Consumer<Integer> inverter= n -> System.out.println(n*n); //pre-defined interface-Consumer.
		
		Consumer<Integer> inverter1= n -> System.out.println(-n);
		int age=35;
		Consumer<Integer> addage= a ->{a+=10; System.out.println(a);};
		
		inverter.accept(5); //always accept(), no return type.
		inverter1.accept(51);
		addage.accept(age);
		
		System.out.println("=============");
		
		Supplier<Integer> supplier=() -> new Random().nextInt(100);
		System.out.println(supplier.get()); //something has to be returned. get() is used
		
		int x =90;
		Supplier<Integer> supplier1=() -> x/10 ;
		System.out.println(supplier1.get());
		
		System.out.println("=============");
		
		Predicate<Integer> isEven=num -> num %2 ==0; //used for testing
		if(isEven.test(16))
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println("=============");
		
		Function<Integer,Integer> square=num -> num*num; 
				//input  output
	
		System.out.println(square.apply(10));
		System.out.println("=============");
		BiFunction<String,String,Boolean> findEquals=(s1,s2) -> s1.equals(s2);
		System.out.println( findEquals.apply("CG","CG123"));
	}
}
