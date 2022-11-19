//AlternativeOrder.java

//given an N array
//take the size first
//first approach: we can do it by either increment  the i by 2 times
//another approach: since starting from zero the index%2==0 then we take those elements

public class AlternativeOrder {

	public static void main(String[]args){

		int[]array = new int[]{1,2,3,4,5};

		if(array.length==1) System.out.println(array[0]);

		for(int i=0;i<array.length;){
             System.out.println(array[i]);
             i=i+2;
		}
		

	}
}