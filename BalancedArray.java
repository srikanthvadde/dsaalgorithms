import java.util.Arrays;

//BalancedArray.java

public class BalancedArray{

   public static void main(String[] args){
      
      
      int [] array = new int[]{1,2,1,2,1,3};
      int len = array.length;
      
      System.out.println(returnNumberToBalanceArray(len,array));

       

   }

   private static int returnNumberToBalanceArray(Integer n,int[] array){
      
      int val = n/2;
      int[] first= new int[val];
      int[] second = new int[val];
      System.arraycopy(array,0,first,0,val);
      System.arraycopy(array,val,second,0,val);

      int sum =0;
      for(Integer val1: first){
      	sum+=val1;
      }
      
      
      for(Integer val2: second){
      	sum-=val2;
      }

      return Math.abs(sum);

   }


}