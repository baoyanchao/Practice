public class TaskNumberThree{
	public static void main(String[] args){
		//����ѭ����ֵ��ȡֵ
		//����һ��������
		java.util.Scanner input = new java.util.Scanner(System.in);
		//����һ������Ϊ5������
		int[] nums = new int[5];
		int num = 0;
		for(int i = 0; i < nums.length; i++){
			System.out.println("�������"+ (i+1) +"һ������:");
			nums[i] = input.nextInt();
			
			
			
		}
		/*for(int n : nums){
			System.out.println(n);
		}
		*/
		for(int i = 0; i < nums.length; i++){
			num = nums[i];
			System.out.println("��"+(i+1)+"λ����"+num);
		}
	}
}