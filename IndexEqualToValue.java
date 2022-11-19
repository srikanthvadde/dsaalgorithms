//IndexEqualToValue.java

public class IndexEqualToValue{


    public static void main(String[]args){
        
        int[] array = new int[]{1};
        int n= array.length;
        System.out.println(verifyIndexEqual(array,n));
    }

    private static boolean verifyIndexEqual(int[] array ,int n){

        for(int i=1;i<=n;i++){
        	if(i==array[i-1]){
        		return true;
        	}
        }
        return false;
    }


}