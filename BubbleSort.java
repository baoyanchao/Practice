public class BubbleSort{
	public static void main(String[] args){
		//1.定义一个长度为5的数组
		int[] nums = {33,22,66,44,55};
		//2.定义一个临时变量
		int temp = 0;
		int i = 0;
		//3.将数组中元素按对进行比较，较大的值赋值给临时变量
		for(int j = 0; j < nums.length-1;  j++){
			for(i = 0; i < nums.length-1-j; i++){
			if(nums[i] > nums[i+1]){
				temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
				}
				
			}
		
		}
		for(int a : nums){
			System.out.println(a);
		}
		
		
	}
}