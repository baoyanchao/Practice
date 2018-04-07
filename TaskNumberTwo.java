public class TaskNumberTwo{
	public static void main(String[] args){
		//错误三次冻结帐号
		//1.创建一个输入器
		java.util.Scanner input = new java.util.Scanner(System.in);
		int count = 0;
		String lastErrorUserName = "";
		//2.建立一个输入的循环
		while(true){
			System.out.println("请输入您的用户名：");
			String userName = input.next();
			
			System.out.println("请输入您的密码：");
			String password = input.next();
			//3.将已知的用户名和密码与输入的进行比较
			if("tom".equals(userName)&&"123".equals(password)){
				System.out.println("登录成功！");
				break;
			}else{
				//4.同一个账号连续验证错误，计数加1，不同账号验证错误，
		        //计数清零自加1,同时将用户名称赋值给上次错误的账户。
				System.out.println("登录失败！");
				
				if(lastErrorUserName.equals(userName)){
					count++;
				}else{
						lastErrorUserName = userName;
						count = 0;
						count++;
					}
				}
				//5.错误三次冻结帐号
			if(count == 3){
				System.out.println(lastErrorUserName+"账户冻结");
				break;
					
				}
		}
		
		
		
	}
}