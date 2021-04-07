package gao.mymain;

import gao.myclass.Withdraw;

public class WithdrawMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Withdraw  w=new Withdraw("1234-5678",1000);
        System.out.println("account:"+w.getAccount());
        System.out.println("balance:"+w.getBalance());
        w.getMoney(5000);
        System.out.println("balance:"+w.getBalance());
        w.Saving(6000);
        System.out.println("balance:"+w.getBalance());
        w.getMoney(3000);
        System.out.println("balance:"+w.getBalance());
	}

}
