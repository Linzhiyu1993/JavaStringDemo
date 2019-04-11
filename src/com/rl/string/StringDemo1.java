package com.rl.string;

public class StringDemo1 {
  public static void main(String[] args)
  {
	  String s1="Hello World";
	  String s2="Hellwolloworld";
	  System.out.println(s1.length());
	  
	  char c=s1.charAt(4);
	  System.out.println(c);
	  System.out.println(s1.indexOf('o'));
	  
	  System.out.println("获得从某个索引器指定的第一次出现字符串的索引："+s2.indexOf("wo",3));
	  
	  System.out.println("字符串单端截取"+s1.substring(3));
	  System.out.println("字符串双端截取"+s2.substring(2,6));
  }
}
