public class Loop {
	public static void main(String[] args){
		//1 输入用户名和密码
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int errorNum = 0;
		String lastErrorUserName = "";
		
		while(true){
			
			System.out.println("请输入你的用户名：");
			String userName = input.next();
		
			System.out.println("请输入你的密码：");
			String password = input.next();
	    //2 校验用户名和密码
		
		//2.1 如果用户名和密码都正确，那么输出"登录成功！"，跳出循环。
			if("jack".equals(userName)&&"123".equals(password)){
				System.out.println("登录成功！");
				break;
			//2.2 如果用户名密码不正确，那么输出"用户名密码错误！"，并统计次数。
			}else{
					System.out.println("用户名密码错误！");
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
							
		
		//2.2.1 判断输入的错误用户名和上次输入的是否一致，
		//3 判断错误次数是否达到三次，如果达到，输出"账户冻结"，跳出循环。
				if(errorNum == 3){
					System.out.println(lastErrorUserName+":账户冻结");
					break;
				}
			}
		}
	
		
		
		
		
		
		
		
		/*
		//首先输入总人数
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入学生的总人数：");
		int count = input.nextInt();
		//输入总人数中每个同学的成绩
		
		double total = 0.0;
		int tempcount = 0;
		int i = 1;
		while(i <= count){
			System.out.println("请输入第"+i+"位同学的成绩：");
			double score = input.nextDouble();
			if(score > 80){
				total = total + score;
				tempcount++;
			}
			
			i++;
		}
		//根据循环得到同学成绩的累加获得总成绩
		//总成绩除以总人数得到平均成绩
		//计算80分以上同学的成绩
		double avg = 0.0;
		if(tempcount != 0){
			avg = total/tempcount;
		}
		
		
		System.out.println("平均成绩为："+ avg);
		*/
	}
}