


class   N2  {
         static int   i=10;    
         int y=99;
         } //static宣告為共用!!
    
 class   Varable2 {
     public  static   void   main( String[ ]  args)
     {     N2    n1,n2;
           n1=new   N2();
           n2=new   N2();
           System.out.println( "Before:n1.i=" + n1.i);             //10
           System.out.println( "Before:n2.i=" + n2.i);             //10
           n1.i=5;
           System.out.println( "After:n1.i="+ n1.i);                //5
           System.out.println( "After:n2.i=" +n2.i);                //5
           N2.i=8;                                                                    //不需要建立物件
           System.out.println( "After:n1.i=" + n1.i);                //8
           System.out.println( "After:n2.i=" + n2.i);    
           
           Varable2.print();
     }
     
     public static void print()
     {
    	 System.out.println(N2.i);
    	// System.out.println(y);
     }
     
}