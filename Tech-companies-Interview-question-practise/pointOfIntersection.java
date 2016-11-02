package smapleQuestionsAlgorithms;

public class pointOfIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=1.0,x2=2.0,y1=1.0,y2=2.0;
		double x3=7.0,x4=4.0,y3=10.0,y4=2.0;
		double m1=(y2-y1)/(x2-x1);
		double m2=(y3-y4)/(x3-x4);
		double x=(m2*x3-m1*x1+y1-y3)/(m2-m1);
		double y=m1*(x-x1)+y1;
		System.out.println(x);
		System.out.println(y);

	}

}
