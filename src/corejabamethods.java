
public class corejabamethods {

	public static void main(String[] args) {
		
		corejabamethods obj = new corejabamethods();
		// TODO Auto-generated method stub
		obj.test1();
		otherclass obj1=new otherclass();
		String output=obj1.test();
		System.out.println(output);
		
	}
	
	public  void test1() {
		System.out.println("method from same class");
	}
}

