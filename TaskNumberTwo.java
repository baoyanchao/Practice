public class TaskNumberTwo{
	public static void main(String[] args){
		//�������ζ����ʺ�
		//1.����һ��������
		java.util.Scanner input = new java.util.Scanner(System.in);
		int count = 0;
		String lastErrorUserName = "";
		//2.����һ�������ѭ��
		while(true){
			System.out.println("�����������û�����");
			String userName = input.next();
			
			System.out.println("�������������룺");
			String password = input.next();
			//3.����֪���û���������������Ľ��бȽ�
			if("tom".equals(userName)&&"123".equals(password)){
				System.out.println("��¼�ɹ���");
				break;
			}else{
				//4.ͬһ���˺�������֤���󣬼�����1����ͬ�˺���֤����
		        //���������Լ�1,ͬʱ���û����Ƹ�ֵ���ϴδ�����˻���
				System.out.println("��¼ʧ�ܣ�");
				
				if(lastErrorUserName.equals(userName)){
					count++;
				}else{
						lastErrorUserName = userName;
						count = 0;
						count++;
					}
				}
				//5.�������ζ����ʺ�
			if(count == 3){
				System.out.println(lastErrorUserName+"�˻�����");
				break;
					
				}
		}
		
		
		
	}
}