package com.rl.string;

public class StringDemo2 {
  public static void main(String[] args)
  {
	  String s1=new String("abc");
	  String s2="abc";
	  //地址不同,值相同
	  System.out.println(s1.equals(s2));
  }
}
