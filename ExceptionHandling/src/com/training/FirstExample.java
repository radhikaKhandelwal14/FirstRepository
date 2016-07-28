package com.training;

;

public class FirstExample {

	public String underStandFinally() throws NumberFormatException{
		String number="Four";
		try{
		int val=Integer.parseInt(number); //number format excepton-unchecked
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			throw e;
		}
		finally{
			System.out.println("inside finally block");
		}
//	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("abc.txt")); //checked exception it should be handled
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstExample f1=new FirstExample();
		System.out.println(f1.underStandFinally());
		/*String s=null;
		try{
			System.out.println("String Length="+s.length());
		}
		catch(NullPointerException e){
			System.err.println("string is null");
			System.err.println(e.getMessage());
		
		}
		catch(Exception e){
			System.out.println("generic exception");
		}
		finally{
			System.out.println("inside finally");
			
		}
		System.out.println("Bye");*/
		

	}

}
