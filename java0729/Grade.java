package gao.myclass;

public class Grade extends Score {
	//�����ܼ�
	
	//�غc�l
	public Grade()
	{
		
	}
	public Grade(int c,int e,int m)
	{
	 super(c,e,m);  //�I�s�����O�غc�l
	 System.out.println("Grade(int,int,int)");
	}
	//��k
	public String isGrade()
	{
	  if(avg()>=90)
	  return "A";
	  else if(avg()>=80)
	  return "B";
	  else if(avg()>=70)
	  return "C";
	  else if(avg()>=60)
	  return "D";
	  else
	  return "E";
	}
}