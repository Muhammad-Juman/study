public class Array2{
public static void main(String[] args){
	int[] intArray = {15,16,19,20,25};
	int intArraySize = intArray.length;
	
	int intSum = 0; //15
	double doubleSum = 0;

	for(int a=intArraySize-1;a>=0;a--){
		intSum += intArray[a];
	System.out.println(intArray[a]);
	
	}
	System.out.println("Total int array sum :"+intSum);
	
	
	
	double[] doubleArray = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.10,};
	int doubleArraySize = doubleArray.length;
	for(int b=doubleArraySize-1;b>=0;b--){
		doubleSum += doubleArray[b];//double += 1.2
	System.out.println(doubleArray[b]);
		
		
	}
	System.out.println("Total double array sum :"+doubleSum);
	

	}

}
