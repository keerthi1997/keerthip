import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int i,n,sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
sum=sum+i;
System.out.println(sum);
}
}
