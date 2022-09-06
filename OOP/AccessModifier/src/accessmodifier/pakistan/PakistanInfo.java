package accessmodifier.pakistan;

public class PakistanInfo {
 //create a main method
	public static void main(String[] args) {
		//create a object  
		Sindh sindh1=new Sindh();
		Punjab punjab2=new Punjab();
		Balochistan balochistan3=new Balochistan();
		KhyberPakhtunkhwa khyberPakhtunkhawa4=new KhyberPakhtunkhwa();
		
		//call method with the help of method name
		System.out.println("Sindh Information");
		System.out.println();
		sindh1.sindhInfo();
		System.out.println();
		System.out.println("Punjab Information");
		System.out.println();
		punjab2.punjabInfo();
		System.out.println();
		System.out.println("Balochistan");
		System.out.println();
		balochistan3.balochistanInfo();
		System.out.println();
		System.out.println("Khyber Pakhtunkhwa");
		System.out.println();
		khyberPakhtunkhawa4.khyberPaktunkhwa();
	}
}
