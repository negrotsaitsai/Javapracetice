package gao.myclass;

public class Score {
  //�����ܼ�
    private int ch,eng,math; //�����ܼƷ|����l��
    //�غc�l
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
    
    //��k
    public int tal()
    {
    	return ch+eng+math;
    }
    public double avg()
    {
    	return tal()/3.0;
    }
}