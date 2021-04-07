


class   N  {
        int   i=10;    }
 class   Varable1 {
     public  static   void   main( String[ ]  args)
     {     N    n1,n2;
           n1=new   N();
           n2=new   N();
           System.out.println( "Before:n1.i=" + n1.i);                //10
           System.out.println( "Before:n2.i=" + n2.i);                //10
           n1.i=5;
           System.out.println( "After:n1.i=" + n1.i);                  //5
           System.out.println( "After:n2.i=" + n2.i);                  //10
     }
}
