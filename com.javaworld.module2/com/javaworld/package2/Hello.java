package com.javaworld.package2;

import com.javaworld.package1.Name;

public class Hello {
	
	public static void main(String [] args) {
		Name name = new Name();
		System.out.println("Hello " + name.getIt());
	}
}