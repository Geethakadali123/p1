package com.stackroute.unittest.pe1;

public class Check
{
	public String Check(int num) {
		if ((num > 20) && (num < 30)) {
			if (num % 2 != 0) {
				return "Tom";
			} else {
				return "Jerry";
			}
		}
		else
		{
			System.out.println("Enter Numbers between 20 and 30");
		}
		return "succes";
	}
}	