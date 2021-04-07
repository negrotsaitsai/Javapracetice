package gao.myclass;

public class Grade extends Score {
	//成員變數
	
	//建構子
	public Grade()
	{
		
	}
	public Grade(int c,int e,int m)
	{
	 super(c,e,m);  //呼叫父類別建構子
	 System.out.println("Grade(int,int,int)");
	}
	//方法
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