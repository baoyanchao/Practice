public class SelectionSort {
	public static void main(String[] args){
		// 1.声明一个数组并赋值
		int[] nums = {22,55,33,66,44,88,77};
		// 2.声明临时变量
		int minIndex = 0;
		int temp = 0;
		// 3.建立一个外层for循环
		for(int i = 0; i < nums.length - 1; i++){
			minIndex = i;
			// 4.建立一个内层for循环
			for(int j = i + 1; j < nums.length; j++){
				if (nums[j] < nums[minIndex]){
					minIndex = j;
				}
			}
			// 5.进行两数互换
			if(minIndex != i){
				temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
			System.out.println(nums[i]);
		}
			
		
	}
}