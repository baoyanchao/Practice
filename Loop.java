public class Loop {
	public static void main(String[] args){
		//1 �����û���������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int errorNum = 0;
		String lastErrorUserName = "";
		
		while(true){
			
			System.out.println("����������û�����");
			String userName = input.next();
		
			System.out.println("������������룺");
			String password = input.next();
	    //2 У���û���������
		
		//2.1 ����û��������붼��ȷ����ô���"��¼�ɹ���"������ѭ����
			if("jack".equals(userName)&&"123".equals(password)){
				System.out.println("��¼�ɹ���");
				break;
			//2.2 ����û������벻��ȷ����ô���"�û����������"����ͳ�ƴ�����
			}else{
					System.out.println("�û����������");
						/*if (userName.equals(lastErrorUserName)){
								errorNum++;
						}else{
								errorNum = 0;
								errorNum++;
								lastErrorUserName = userName;
						}
						*/
						if (!userName.equals(lastErrorUserName)){
							errorNum = 0;
							lastErrorUserName = userName;
						}
						
						errorNum++;
							
		
		//2.2.1 �ж�����Ĵ����û������ϴ�������Ƿ�һ�£�
		//3 �жϴ�������Ƿ�ﵽ���Σ�����ﵽ�����"�˻�����"������ѭ����
				if(errorNum == 3){
					System.out.println(lastErrorUserName+":�˻�����");
					break;
				}
			}
		}
	
		
		
		
		
		
		
		
		/*
		//��������������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("������ѧ������������");
		int count = input.nextInt();
		//������������ÿ��ͬѧ�ĳɼ�
		
		double total = 0.0;
		int tempcount = 0;
		int i = 1;
		while(i <= count){
			System.out.println("�������"+i+"λͬѧ�ĳɼ���");
			double score = input.nextDouble();
			if(score > 80){
				total = total + score;
				tempcount++;
			}
			
			i++;
		}
		//����ѭ���õ�ͬѧ�ɼ����ۼӻ���ܳɼ�
		//�ܳɼ������������õ�ƽ���ɼ�
		//����80������ͬѧ�ĳɼ�
		double avg = 0.0;
		if(tempcount != 0){
			avg = total/tempcount;
		}
		
		
		System.out.println("ƽ���ɼ�Ϊ��"+ avg);
		*/
	}
}