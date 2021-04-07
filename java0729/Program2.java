
public class Program2
{
	static int x=5;
	int y=3;
    static{
        System.out.println("Static Block");
        x=10;        
    }
    Program2(){
        System.out.println("Constructor");
        y=9;
    }
    public static void main(String[] args) {
        Program2 p1 = new Program2();
        Program2 p2 = new Program2();
        System.out.println("Program2 x="+Program2.x);
        System.out.println("p1 x="+p1.x);
        System.out.println("p1 y="+p1.y);
        
    }
}