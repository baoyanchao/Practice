public class BubbleSort{
	public static void main(String[] args){
		//1.����һ������Ϊ5������
		int[] nums = {33,22,66,44,55};
		//2.����һ����ʱ����
		int temp = 0;
		int i = 0;
		//3.��������Ԫ�ذ��Խ��бȽϣ��ϴ��ֵ��ֵ����ʱ����
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