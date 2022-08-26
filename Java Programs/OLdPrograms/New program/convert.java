public class convert{
public static void main(String[] args){
	
	long a = 123L;
	int b = 11;
	float c = 22.22f;
	double d = 33.33d;
	short e = 44;
	byte f = 55;
	
	    System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println();
		System.out.println();
		System.out.println("Now Convert Number");
		System.out.println();
		System.out.println();
		
		float g = a;
		float h = b;
		int i = (int) a;
		int j = (int) c;
		byte k = (byte) a;
		short l = (short) a;
		double m = (double) a;
		byte n = (byte) b;
		double o = b;
		
		
		System.out.println("long convert float  :" + g);
		System.out.println("int convert float   :" + h);
		System.out.println("long convert int    :" + i);
		System.out.println("float convert int   :" + j);
		System.out.println("long convert byte   :" + k);
		System.out.println("long convert short  :" + l);
		System.out.println("long convert double :" + m);
		System.out.println("int convert byte    :" + n);
		System.out.println("int convert double  :" + o);
}
}