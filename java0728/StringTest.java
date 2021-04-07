
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1=new String();
       s1="Java";
       String s2=new String("Java");
       String s3="Hello everybody";
       char[]  x= {'a','b','c','d','e'};
       String s4=new String(x);
       System.out.println("s1="+s1);
       System.out.println("s2="+s2);
       System.out.println("s3="+s3);
       System.out.println("s4="+s4);
       
       byte[]  y= {65,66,67,68,69};
       String s5=new String(y);
       System.out.println("s5="+s5);
       //字串長度
       System.out.println("s3 len:"+s3.length());
       
       //字串連接
       String s6=s1.concat(s3);
       System.out.println("s1="+s1);
       System.out.println("s6="+s6);
       String s7=s2+s4;
       System.out.println("s2="+s2);
       System.out.println("s7="+s7);
       
       //字串比對
       System.out.println("s1="+s1);
       System.out.println("s2="+s2);
       System.out.println(s1.equals(s2));
       System.out.println(s1.equalsIgnoreCase(s2));
       System.out.println(s1.compareTo(s2));
       System.out.println(s1==s2);
       
       if(s1.equals(s2))
          System.out.println("相同");
       else
    	   System.out.println("不相同"); 
       
       //取字元
       System.out.println("s3:"+s3.charAt(10));
       
       //字串轉陣列
       char[]  z=s3.toCharArray();
       for(int i=0;i<z.length;i++)
    	   System.out.print(z[i]+" ");
       
       System.out.println();
       //取代字元(有考過)
       String s8=s3.replace('y','Y');
       System.out.println("s3="+s3);
       System.out.println("s8="+s8);
       
       //去除左右空格(有考過)
       String s9="   hello everybody   ";
       String s10=s9.trim();
       System.out.println("s9="+s9+"*");
       System.out.println("s10="+s10+"*");
       
       //轉小寫,轉大寫
       String s11=s3.toUpperCase();
       System.out.println("s11="+s11);
       String s12=s11.toLowerCase();
       System.out.println("s12="+s12);
       
       //比對字串開頭,結尾
       System.out.println(s3.startsWith("Hel"));
       System.out.println(s3.endsWith("dy"));
       
       //數字轉字串
       System.out.println(String.valueOf(100)+50);
       System.out.println(100+50);
       System.out.println(100+""+50);
       
       
       
       
       
       
	}

}
