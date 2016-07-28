package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class GCApplication {

	public static void main(String[] args) throws RangeCheckException {
		// TODO Auto-generated method stub
		Book bk=new Book(101,"A","B",20.00);
		System.out.println(bk);
		bk=null;
				System.gc();
				
		System.out.println("look at console");
		

	}

}
