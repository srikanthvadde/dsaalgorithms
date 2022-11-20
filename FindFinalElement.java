//FindFinalElement.java

public class FindFinalElement {

	public static void main(String[]args){

		int[] array = new int[]{7,8,3,4,2,9,5};
		System.out.println(findFinalElement(array));

	}


	private static int findFinalElement(int[] arr){

	sortTheArray(arr);
     return arr[arr.length%2==0 ? arr.length/2-1 : arr.length/2];
	
 }


 private static void sortTheArray(int[] array){

	for(int i=0;i<array.length;i++){
	 for(int j=i+1;j<array.length;j++){
		 if(array[i]>array[j]){
		  int temp = array[i];
		  array[i]=array[j];
		  array[j]=temp;
	  }

  }
}

}

} 