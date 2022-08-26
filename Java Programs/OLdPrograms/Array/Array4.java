public class Array4{
public static void main(String[] args){
		
	int[] intArray = new int[15];
	int intArraySize = intArray.length;
	int intSum=0;
	for(int i=0;i<intArraySize;i++){
		intArray[i] = i+5;
		intSum += intArray[i];
		System.out.println(intArray[i]);
		
		}
		System.out.println("TOTAL INT SUM :" + intSum);
		
		 String[] myStrArray = {"have","a","nice","day"};
		  int stringArraySize = myStrArray.length;
		 for(int a=0;a<stringArraySize;a++){
				System.out.print(myStrArray[a]+" "); 
		 }
		
		
		
		
		
		
		
		
		
	}
	
	
}