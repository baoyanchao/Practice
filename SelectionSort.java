public class SelectionSort {
	public static void main(String[] args){
		// 1.����һ�����鲢��ֵ
		int[] nums = {22,55,33,66,44,88,77};
		// 2.������ʱ����
		int minIndex = 0;
		int temp = 0;
		// 3.����һ�����forѭ��
		for(int i = 0; i < nums.length - 1; i++){
			minIndex = i;
			// 4.����һ���ڲ�forѭ��
			for(int j = i + 1; j < nums.length; j++){
				if (nums[j] < nums[minIndex]){
					minIndex = j;
				}
			}
			// 5.������������
			if(minIndex != i){
				temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
			
		}
		for(int n : nums){
			System.out.println(n);
		}	
		
	}
}