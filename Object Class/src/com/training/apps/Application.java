package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Book bk=new Book(1010,"Kshirsagar","Gupta",4500.0);
		System.out.println(bk);
		Book bk2=new Book(102,"data mining","chang",1200.0);
		Book bk3=new Book(102,"data mining","chang",1200.0);
		
		
		System.out.println(bk2.equals(bk3));
		System.out.println("Book2="+bk2.hashCode());
		System.out.println("Book3="+bk3.hashCode());
		
		String s =new String("hari");
		System.out.println("Comparing objects of different class"+s.equals(bk2));
		Book bk4=null;
		System.out.println("Comparing null objects"+bk3.equals(bk4));
		Book bk5=bk;
		System.out.println("Checking identity"+bk5.equals(bk));
		
		}
		catch(RangeCheckException e){
			System.out.println(e.getMessage()+"in main method");
			//e.printStackTrace();
		}
	}


	

	

}
