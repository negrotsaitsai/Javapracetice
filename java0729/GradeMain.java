package gao.mymain;

import gao.myclass.Grade;

public class GradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Grade g=new Grade(99,88,77);
    System.out.println("tal:"+g.tal());
    System.out.println("avg:"+g.avg());
    System.out.println("grade:"+g.isGrade());
	}
}