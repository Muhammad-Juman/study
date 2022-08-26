public class Array5{
public static void main(String[] args){
	
	long[] longArray = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};
	int longArraySize = longArray.length;
	for(int a=0;a<longArraySize;a++)
		System.out.println("Long Array :" + longArray[a]);
		System.out.println();
		
	int[] intArray = {1,2,3,4,5,6,7,8,9,10,15,16,17,18,19,20};
	int intArraySize = intArray.length;
	for(int b=0;b<intArraySize;b++)
		System.out.println("Int Array :" + intArray[b]);
		System.out.println();
		
	float[] floatArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int floatArraySize = floatArray.length;
	for(int c=0;c<floatArraySize;c++)
		System.out.println("Float Array :" + floatArray[c]);
		System.out.println();
	
	double[] doubleArray = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.0};
	int doubleArraySize = doubleArray.length;
	for(int f=0;f<doubleArraySize;f++)
		System.out.println("Double Array :" + doubleArray[f]);
		System.out.println();
			
	short[] shortArray = {10,20,30,40,50,60,70,80,90,100};	
	int shortArraySize = shortArray.length;
	for(int s=0;s<shortArraySize;s++)
		System.out.println("Short Array :" + shortArray[s]);
		System.out.println();
		
	byte[] byteArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};	
	int byteArraySize = byteArray.length;
	for(int d=0;d<byteArraySize;d++)
		System.out.println("Byte Array :" + byteArray[d]);
		System.out.println();
		
	String[] stringArray = {"Hello","student","this","is","java","toturial","for",
							"basic","topics","such","as","intoducion","loops","condition","arrays"};
		System.out.println();
	int stringArraySize = stringArray.length;
	for(int e=0;e<stringArraySize;e++)
		System.out.print(stringArray[e] + " ");
	
	
	}
	
	
	
	
}