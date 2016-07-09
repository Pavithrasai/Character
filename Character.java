import java.io.*;
import java.util.*;
import java.lang.*;
public class Number
{
public static void main(String[]args)
{
char ch;
System.out.println("Enter the Character");
Scanner sc=new Scanner(System.in);
ch=sc.nextChar();
if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
{
System.out.println("Given character is Vowel");
}
else
{
System.out.println("Given character is Consonant");
}
}
}
