//PerfectArray.java
//for loop two pointers one at first and another at last;


// start=0 end=5
  //1==1
//start=1 end =4 
  //2==2;
//start=2 end=3;
  //3==3;
//start=3 end=2
  //loop out


class PerfectArray{

    public static void main(String[]args){
     
     int[]array = new int[]{1,2,3,2,1};
     System.out.println(checkPerfect(array,array.length));
    }

    private static String checkPerfect(int[] array,int l){

      int start =0;
      int end =array.length-1;
      if(array.length==1) return "PERFECT";
      while(start<end)
      {
        if(array[start]!=array[end]){
           return "NOT PERFECT";
        }
        start++;
        end--;
      }

      return "PERFECT";
}
}