package com.stackroute.unittest.pe1;


public class Charcheck
{
      public String Charcheck(String s)
	  {
		  for(int i=0; i<s.length(); i++)
		  {
			  char s1 = s.charAt(i);
			  if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u')
			  {
				   return "vowel";
			  }
			  else
			  {
			     	return "consonant";
			  }
		  }
      return "success";
	}
} 