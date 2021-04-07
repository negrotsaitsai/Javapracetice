
public class Program
{
    static{
        System.out.println("Static Block");
    }
    Program(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Program p1 = new Program();
        Program p2 = new Program();
    }
}