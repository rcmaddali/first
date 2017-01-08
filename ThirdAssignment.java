/**
 * 
 */
package learnJava;

/**
 * @author ravimaddali
 *
 */
public class ThirdAssignment {

	/**
	 * @param args
	 */
	static int i=100;
	int j= 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 10, y=20;
ThirdAssignment obj= new ThirdAssignment();
System.out.println("Local Variable x="+x);
System.out.println("Local Variable y="+y);
System.out.println("Global Static Variable i="+ThirdAssignment.i);
System.out.println("Global Non-Static Variable j="+ obj.j);
int z= x+y+i+obj.j;
System.out.println("Sum of all variables z="+ z);
int k = 0;
x=y;
y=k;
System.out.println("Local Variable x="+x);
System.out.println("Local Variable y="+y);
	}

}
