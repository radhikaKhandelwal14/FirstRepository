package com.training.domains;
import java.io.*;

class Father {
	public Father() throws IOException {
	System.out.print("Father");
	throw new IOException();
	}
	}

	class Son extends Father {
	public Son() throws IOException {
	System.out.print("Son");
	}
	}
public class test {

		public static void main(String[] args) {
		
		//new Son();
   		
		}
		}
