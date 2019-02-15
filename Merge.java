public class Merge{


	public static int[] mergeArray(int[] first, int[] second){

		int a = first.length;
		int b = second.length;
		int[] array = new int[a+b];

        int c = 0;

        for(int i=0; i<a; i++)
        {
        	array[i] = first[i];
        	c++;
        }	
        for(int i=0; i<b; i++){
        	array[c++] = second[i];
        }

        return array;
	}

	
	public static void printArray(int[] array){
	
	for(int i : array){	
		System.out.println(i+ " ");
		//System.out.println();

}

	}
	public static void main(String[] args){

		int[] firstArray = new int[]{1,2,3};
		int[] secondArray = new int[]{4,5,6,7};
		
		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{1};
		secondArray = new int[]{};
 
		printArray(firstArray);
	
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{};
		secondArray = new int[]{4};

		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));
	}

}
