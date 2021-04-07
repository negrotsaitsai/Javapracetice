package gao.myclass;

public class Staff extends Salary
{

	public Staff(String name, int grade, int pay) {
		super(name, grade, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoney() {
		// TODO Auto-generated method stub
		return getPay()+getGrade()*2000;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
