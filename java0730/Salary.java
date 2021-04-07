package gao.myclass;

public abstract class Salary{
  private String name;
  private int grade,pay;
  
  public Salary(String name, int grade, int pay) {
	super();
	this.name = name;
	this.grade = grade;
	this.pay = pay;
}
   
   public String getName() {
	return name;
}
   public void setName(String name) {
	this.name = name;
}
   public int getGrade() {
	return grade;
}
   public void setGrade(int grade) {
	this.grade = grade;
}
   public int getPay() {
	return pay;
}
   public void setPay(int pay) {
	this.pay = pay;
}
  public abstract int getMoney();
}
