package gao.myloan;

public class House implements Loan{
  String name;
  int cost;
  
  public void setType(String n) {
		// TODO Auto-generated method stub
		name=n;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setCost(int c) {
		// TODO Auto-generated method stub
		cost=c;
	}

	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
}
}