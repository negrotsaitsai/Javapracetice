package gao.myclass;

public class Manager extends Salary
{

	public Manager(String name, int grade, int pay) {
		super(name, grade, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoney() {
		// TODO Auto-generated method stub
		return getPay()+getGrade()*5000;
	}
	    
}    


