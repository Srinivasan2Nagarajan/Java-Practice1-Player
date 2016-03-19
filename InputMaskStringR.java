public class CorrectQuestion {
public static void main(String[] args) {
String s1=”crazy for code”	;
String s2=”cod”;
char [] arr=new char[256];
System.out.println();
for(int i=0;i<s2.length();i++)
{
arr[s2.charAt(i)]++;
}
String Str =" ";
for(int i=0;i<s1.length();i++)
{

if(arr[s1.charAt(i)] == 0)
{
Str+=s1.charAt(i);
}
}
System.out.println(Str.trim());
}
}
