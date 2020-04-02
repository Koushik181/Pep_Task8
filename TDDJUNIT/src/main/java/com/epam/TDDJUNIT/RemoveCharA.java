package com.epam.TDDJUNIT;

public class RemoveCharA {

	public Object removeA(String str) {
		if(str.length()==0)
			return "";
		String result="";
		for(int i=0;i<str.length()&&i<2;i++)
		{
			if(str.charAt(i)!='A')
				result=result+ String.valueOf(str.charAt(i));
		}
		if(str.length()>2)
			return result+str.substring(2);
		else
			return result;
		
	}

}
