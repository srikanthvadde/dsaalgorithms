import java.util.Arrays;

//Findlat2Greatest.java

public class Findlat2Greatest {


	public static void main(String[] args){

        int [] array = new int[]{7, -2, 3, 4, 9, -1};

        System.out.println(Arrays.toString(findLast2Greatest(array)));


	}

	private static int[] findLast2Greatest(int[] array){

		for(int i=0;i<array.length;i++){
           
           for(int j=i+1;j<array.length;j++){

           	    if(array[i]>array[j])
           	    {
           	    	int temp = array[i];
           	    	array[i]= array[j];
           	    	array[j]=temp;
           	    }
           }

		}
	 
     int[] array1 = new int[array.length-2];

      System.arraycopy(array,0,array1,0,array1.length);

	  return array1;

		

	}
}