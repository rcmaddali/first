/**
 * 
 */
package learnJava;

/**
 * @author ravimaddali
 *
 */
public class SecondAssignment {

	/**
	 * @param args
	 */
	static int i=100;
	int j= 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("Local variable a="+ a);
 SecondAssignment obj = new SecondAssignment();
 System.out.println("Static Global Variable i="+ SecondAssignment.i);
 System.out.println("Global Variable j="+ obj.j);
	}

}
