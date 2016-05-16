package AC_2090;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_2093 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        answer asr[] = new answer[200];
        while(in.hasNext()){
            int n = in.nextInt();
            int t = in.nextInt();
            int a = 0;
            int num;  //提交正确的题目数
            int time; //提交的时间
            while(in.hasNext()){
                asr[a] = new answer();
                student s = new student();
                s.name = in.next();
//                if(s.name.equals("#")){
//                	break;
//                }
                asr[a].name=s.name;
                num =n;
                time=0;
                s.strMark= new String[n];
                for(int i = 0; i < n; i++){
                    s.strMark[i] = in.next();
                    if(s.strMark[i].charAt(0)=='-' || s.strMark[i].equals("0")){
                        num--;   //如果提交次数为0，或者没有提交通过，则num--
                    }else{
                        //提交通过的
                        String s1 = "";  //s1是提交的时间
                        String s2 = "";  //s2是提交错误的次数
                        boolean isS1 = true;
                        for(int k = 0; k < s.strMark[i].length(); k++){
                            if(isS1){
                                if(s.strMark[i].charAt(k) == '('){
                                    isS1=false;
                                    continue;
                                }
                                s1 = s1 + s.strMark[i].charAt(k);
                            }else{
                                if(s.strMark[i].charAt(k) == ')'){
                                    break;
                                }
                                s2 = s2 + s.strMark[i].charAt(k);
                            }
                        }
                        if(s2.equals("")){
                            //如果提交错误次数为0
                            time += Integer.parseInt(s1);
                        }else{
                            //有提交次数错误的
                            time += Integer.parseInt(s1)+(Integer.parseInt(s2)*t);
                        }
                    }
                }
                asr[a].time = time;
                asr[a].num = num;
                a++;
            }
            Arrays.sort(asr,0,a, new Comparator<answer>() {
                @Override
                public int compare(answer o1, answer o2) {
                    //提交正确的题目多的排前面
                    if(o1.num>o2.num){
                        return -1;
                    }
                    if(o1.num<o2.num){
                        return 1;
                    }
                    //如果提交的正确题目数量是一样的，则time小的排前面。
                    return o1.time-o2.time;
                }
            });
            for(int i=0;i<a;i++){
                System.out.printf("%-10s %2d %4d",asr[i].name,asr[i].num,asr[i].time);
                System.out.println();
            }
        }
    }
}

class student {
    String name;
    String strMark[];
}

class answer {
    String name;
    int num;
    int time;
}
