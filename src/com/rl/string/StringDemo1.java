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
	  
	  System.out.println("��ô�ĳ��������ָ���ĵ�һ�γ����ַ�����������"+s2.indexOf("wo",3));
	  
	  System.out.println("�ַ������˽�ȡ"+s1.substring(3));
	  System.out.println("�ַ���˫�˽�ȡ"+s2.substring(2,6));
  }
}
