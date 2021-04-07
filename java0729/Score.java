package gao.myclass;

public class Score {
  //成員變數
    private int ch,eng,math; //成員變數會有初始值
    //建構子
    public Score()
    {
    	//ch=eng=math=0;
    }
    public Score(int ch,int eng,int math)
    {
       this.ch=ch;
       this.eng=eng;
       this.math=math;
       System.out.println("Score(int,int,int)");
    }
    
    //方法
    public int tal()
    {
    	return ch+eng+math;
    }
    public double avg()
    {
    	return tal()/3.0;
    }
}