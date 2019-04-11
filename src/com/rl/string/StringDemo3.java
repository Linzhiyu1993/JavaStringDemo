package com.rl.string;

import java.util.Scanner;

public class StringDemo3 {
  public static void main(String[] args)
  {
	  String str="this is test";
	  //printChar(str);
	  
	  Scanner sc=new Scanner(System.in);
	  String inputstr=sc.nextLine();
	  //printChar(inputstr);
	  countNum(inputstr);
  }
  public static void printChar(String str)
  {
	  for(int i=0;i<str.length();i++)
	  {
		  char c=str.charAt(i);
		  System.out.println(c+"\t");
	  }
  }
  /**
   * 计算一个字符串中大写字母和小写字母的数量
   * ch>='A'&&ch<='Z'大写字母
   * ch>='a'&&ch<='z'小写字母
   * ch>='48'&&ch<='57'数字
   * @param str
   */
  public static void countNum(String str) {
	  int bigChar=0;
	  int smallChar=0;
	  int nums=0;
	  for(int i=0;i<str.length();i++)
	  {
		  char ch=str.charAt(i);
		  if(ch>='A'&&ch<='Z') {bigChar++;}
		  else if(ch>='a'&&ch<='z') {smallChar++;}
		  else if(ch>='0'&&ch<='9') {nums++;}
	  }
	  System.out.println("大写字母："+bigChar);
	  System.out.println("小写字母："+smallChar);
	  System.out.println("数字："+nums);
  }
}
