
public class dowhileTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=2;  //����
        int n=1;  //����
        double sum=1;  
        do {
        	sum+=1.0/i;
        	System.out.println("1/"+i+"="+(1.0/i));
        	i+=2;
        	n++;
        }while(n<=99);
        System.out.println("sum="+sum);
	}

}
