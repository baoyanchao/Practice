public class TaskNumberOne {
	public static void main(String[] args) {
		//���������ֵ
		//1.����һ������Ϊ6��int������
		int[] nums = {22,33,44,55,66,77,88};
		//2.����һ��Int���ͱ���max�����������е�һ��Ԫ�ظ�ֵ��max
		int max = nums[0];
		//3.�������е�Ԫ��������max���бȽϣ�����max�������Ԫ�ص�ֵ��ֵ��max
		for(int i = 1; i < nums.length; i++){
			if(max < nums[i]){
				max = nums[i];
			}
		}
		//4.��ӡ��max��ֵ
		System.out.println("max="+max);
	}
}