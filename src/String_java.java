
public class String_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Happy new year keerthi!";
		
		String s2=new String("testing the new onject");
		
		String[] splittedarr=s1.split(" ");
		
		for(int i=0;i<splittedarr.length;i++) {
			System.out.println(splittedarr[i]);
		}
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
			
		}
	}

}
