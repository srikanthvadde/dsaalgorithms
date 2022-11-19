//IndexKey.java

//Steps:
//1.given an array 
//2.and index key 
//3.need to print the element inside the index;



class IndexKey{

     public static void main(String[]args) throws Exception{
         
          int [] array = new int[]{2,3,4,5,6,7,8};
          int index = 4;
          

          if(array.length<=index){
          	throw new Exception("Array size is too small");
          }

          System.out.println(array[index]);

     }



}

