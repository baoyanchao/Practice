public class TaskNumberThree{
	public static void main(String[] args){
		//数组循环赋值和取值
		//创建一个输入器
		java.util.Scanner input = new java.util.Scanner(System.in);
		//声明一个长度为5的数组
		int[] nums = new int[5];
		int num = 0;
		for(int i = 0; i < nums.length; i++){
			System.out.println("请输入第"+ (i+1) +"一个数字:");
			nums[i] = input.nextInt();
			
			
			
		}
		/*for(int n : nums){
			System.out.println(n);
		}
		*/
		for(int i = 0; i < nums.length; i++){
			num = nums[i];
			System.out.println("第"+(i+1)+"位数是"+num);
		}
	}
}