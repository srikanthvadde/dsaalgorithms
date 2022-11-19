//CountLessNumbers.java

class CountLessNumbers{

   public static void main(String[]args){

       int [] array = new int[]{1,2,2,2,5,7,8};
       int target = 2;
       int count=0;

       int size= array.length;

       for(int i=0;i<size;i++){

       	 if(array[i]>target){
       	 	System.out.println(count);
       	 }
       	 count++;
       }
       System.out.println(count);


   }

}
