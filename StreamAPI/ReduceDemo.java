package com.cg.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		
		List<Integer> intList=Arrays.asList(5,7,13,9,21);
		
		//intList.stream().map(n->n*n).forEach(n->System.out.println(n));
		
		//intList.stream().filter(n -> n<10).forEach(n->System.out.println(n));
		intList.stream().map(n->n*n).filter(n -> n>70).forEach(System.out::println);
		
		System.out.println("==================");
		
		Long result =intList.stream().count();  //Count is a terminal operation
		System.out.println(result);
		System.out.println("==================");
		//OPTIONAL class
		
		List<Integer> intList2 = Arrays.asList(9,11,8,12,6);
		Optional<Integer> sum =intList2.stream().reduce((a,b) -> a+b);  
		if(sum.isPresent()) {                    //always need to check or else might throw nullpointer Exception
			System.out.println(sum.get());
		}
		

	}

}
