import java.util.Arrays;

//FascinatingNumber.java

public class FascinatingNumber{

    public static void main(String[]args){

      int number = 853;
      System.out.println(checkFascinating(number));

    }

    private static String checkFascinating(int number){
         StringBuilder sb = new StringBuilder();
         sb.append(String.valueOf(number));
         sb.append(String.valueOf(number *2));
         sb.append(String.valueOf(number*3));

         System.out.println(sb.toString());
         if(sb.toString().length()>9){
         	return "nonfascinating";
         }

         int[]array = new int[sb.toString().length()];
         
         for(int i=0;i<sb.toString().length();i++){
          System.out.println(sb.toString().charAt(i));
         	array[i]= Character.getNumericValue(sb.toString().charAt(i));
         }
        
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));
         for(int i=1;i<=9;i++)
         {
             if(i!=array[i-1])
             {
             	return "nonfascinating";
             } 
         }

         return "fascinating";




    }

}