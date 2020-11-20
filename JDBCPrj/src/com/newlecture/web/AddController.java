package com.newlecture.web;

public class AddController {

	public static void main(String[] args) {
		
//		System.out.printf("args[0] : %s\n", args[0]);
//		System.out.printf("args[1] : %s\n", args[1]);

		int x = 0;
		int y = 0;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		int result = x + y;

		System.out.println(result);
		
	}

}
