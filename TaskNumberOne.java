public class TaskNumberOne {
	public static void main(String[] args) {
		//求数组最大值
		//1.定义一个长度为6的int型数组
		int[] nums = {22,33,44,55,66,77,88};
		//2.定义一个Int类型变量max，并将数组中第一个元素赋值给max
		int max = nums[0];
		//3.将数组中的元素轮流与max进行比较，将比max大的数组元素的值赋值给max
		for(int i = 1; i < nums.length; i++){
			if(max < nums[i]){
				max = nums[i];
			}
		}
		//4.打印出max的值
		System.out.println("max="+max);
	}
}