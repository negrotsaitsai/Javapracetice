package gao.myloan;

public interface LoanMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        House  h=new House();
        h.setType("���v�f��");
        h.setCost(20000000);
        System.out.println(h.getType());
        System.out.println(h.getCost());
}
}