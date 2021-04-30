package com.cg.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Stream is to perform operation on existing Arrays or Collections
public class Demo {
	
	public static void main(String args[]) {
		
		List nameList = Arrays.asList("John","Smith","Keanu");
		
		nameList.stream().forEach(n -> System.out.println(n)); //1st way //lambda expression
		
		Stream st = Stream.of("Sita","Gita","Ram");
		
		st.forEach(s ->System.out.println(s));  //2nd way method reference operator
		System.out.println();
		ArrayList ar=new ArrayList();
		ar.add(nameList);
		ar.add("Reeves");
		
		ar.stream().forEach(System.out::println);  //3rd and easiest way
		
		System.out.println();
		
		List<String> name = Arrays.asList("Arnab","Banerjee","Ankita","Banerjee","AB","ABCD"); //generic declaration required
		name.stream().filter(n->n.length()>=4).forEach(System.out::println);
		
		System.out.println();
		//Collect is a method that will return new list
		List<String> listSized4 = name.stream().filter(n ->n.length()<=5).collect(Collectors.toList()); //storing into another list
		
		listSized4.forEach(System.out::println);
		System.out.println();
		
		/*System.out.println("Array wth Streams");
		int[] arr = {4,5,9,7,4,2,3};
		Arrays.asList(arr).stream().forEach(n->System.out.println(n));  //this is printing address*/
		System.out.println("Multiple piped operations distinct,length,for each::::::");
		Stream<String> names = Stream.of("Ram","Sita","Sita","Ram");
		names.distinct().filter(n->n.length()<4).forEach(n -> System.out.println(n));  //removes duplicates
		
		System.out.println();
		
		List<String> l=Arrays.asList("Arnab","Tabbu","DIDI");
		l.stream().map(n->n.length()).forEach(System.out::println);  //this will map the length
		
		System.out.println();
		
		List<String> list1= Arrays.asList("ASD","QWERTY","ZXCVB");
		list1.stream().limit(2).forEach(System.out::println);  // setting the limit
		
		System.out.println();
		
		List<String> list2= Arrays.asList("ASD","QWERTY","ZXCVB");
		list2.stream().skip(2).forEach(System.out::println);    //will skip first 2 elements
		
		System.out.println();
		
		List<String> list3= Arrays.asList("ASD","QWERTY","ZXCVB");
		list2.stream().map(String::length).forEach(System.out::println); //another way to map length
	}

}
