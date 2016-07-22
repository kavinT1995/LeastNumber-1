# LeastNumber

public class Least{

public static void main(String[] args) {
int a=24635;
String s=""+a;
String s1="";
int b[]=new int[s.length()];
int c=0;
int i=0;
while(a>0)
{
c=a%10;
b[i]=c;
i++;
a=a/10;
}
Arrays.sort(b);
for(int j=0;j<=1;j++)
{
s1=""+b[0]+b[1];
}
System.out.println(s1);
}
}
