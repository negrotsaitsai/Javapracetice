
public class mp3File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[]  file= {"BMI.java","customer.doc","I Love you.mp3",
    		          "homework.txt","salary.xlsx","boodbye.mp3"};
       
       int i;
       for(i=0;i<file.length;i++)
    	   if(file[i].endsWith("mp3"))
    		   System.out.println(file[i]);
	}

}
