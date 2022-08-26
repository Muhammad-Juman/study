public class Value{
	public static void main(String[] args){
		
		int a = 50;
		
		double e = a;
		double h = 50.87d;
		int c = (int)h;
		
	    
		int ii = 2;
		float ff= ii;
		float fff = 5.5f;
		int iii = (int)fff;
		
		
		String s ="2";
		String st = "hello";
		String ss = "true"; 
		int i = Integer.parseInt(s);
		long l = Long.parseLong(s);
		short sh = Short.parseShort(s);
		byte by = Byte.parseByte(s);
		char ch = st.charAt(0);
		float f = Float.parseFloat(s);
		double d = Double.parseDouble(s);
		boolean b = Boolean.parseBoolean(ss);
		
		if(b){
			System.out.println("Hello");
		}
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(ff);
		System.out.println(iii);
		System.out.println(e);
		System.out.println(c);
		System.out.println(ch);
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("sfsdf = "+ !(num1 < num2 && num2 > num1));
		System.out.println("sfsdf = "+ !(num1 > num2 && num2 > num1));
		
		
	}
}

