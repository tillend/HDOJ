package AC_2020;
/**
 * @author LIn
 * 问题：求平均成绩
 * 详细解析：http://blog.csdn.net/why_still_confused/article/details/51222366
 * */
import java.util.Scanner;

public class Main_2023 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	int m = in.nextInt();
        	
        	Student[] stu = new Student[n];  //创建n个学生对象的数组
        	double[] avg = new double[m];    //各科的平均成绩
        	int i,j;
        	int sum,num = 0;
        	
        	for(i = 0; i < n; i++){
        		sum = 0;
        		stu[i] = new Student(m);
        		for(j = 0; j < m; j++){    //依次读入一个学生的各科成绩
        			stu[i].grade[j] = in.nextInt(); 
        			sum += stu[i].grade[j];             //一个学生实例的成绩总和 
        			avg[j] += stu[i].grade[j];          //各科的总成绩
        		}
        		stu[i].setAvg(sum*1.0/m);   //设置该学生的平均成绩
        	}
        	for(j = 0; j < m; j++){   //各科的总成绩取平均
        		avg[j] /= n;
        	}

        	boolean flag;
        	//计算各科成绩均大于等于平均成绩的学生数量
        	for(i = 0; i < n; i++){
        		flag = true;
        		for(j = 0; j < m; j++){
        			if(stu[i].grade[j] < avg[j]){
        				flag = false;
        				break;
        			}
        		}
        		//flag为true时代表该学生各科成绩均大于等于平均成绩
        		if(flag){   
        			num++;
        		}    		
        	}
        	
        	//输出,切记要依照格式,System.out.printf("%.2f\n",a);的格式会PE
        	for(i = 0; i < n-1; i++){
        		System.out.printf("%.2f ",stu[i].avg);
        	}
        	System.out.printf("%.2f",stu[n-1].avg);
        	System.out.println();  
        	for(i = 0; i < m-1; i++){
        		System.out.printf("%.2f ",avg[i]);
        	}
        	System.out.printf("%.2f",avg[m-1]);
        	System.out.println();  
        	System.out.println(num);
        	System.out.println();    	
        }

	}
	//Student类
	public static class Student{
		double avg;
		double[] grade;
		//Student类的构造函数
		public Student(int m){
			grade = new double[m];  //实例化每个Student的成绩数组
		}
			
		public void setAvg(double avg){
			this.avg = avg;
		}
	}

}
