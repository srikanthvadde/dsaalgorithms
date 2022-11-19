class IntegerSum{

	public static void main(String[] args) throws Exception{
        //input
	
		int[] array = new int[]{1,2,3,4};

		
		int value = array.length-1;
		int sum =0;
		if(value==0){
			sum = array[0];
			System.out.println(sum);
		}
		
		for(int i=0;i<value;i++){
            sum = sum+array[i];

		}
		System.out.println(sum);
	}
}