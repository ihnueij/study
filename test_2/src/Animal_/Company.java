package Animal_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
    public static void main(String[] args) {
        String result ="";
        Employee emp = null;
        Manager mng = null;
        String empNo = null;
        String name = null;
        String part = null;
        String position =null;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("사번입력 : ");
            empNo = in.readLine();
            System.out.println("이름입력 : ");
            name = in.readLine();
            System.out.println("부서입력 : ");
            part = in.readLine();
            System.out.println("직책입력 : ");
            position = in.readLine();

        }catch (Exception e){
            e.printStackTrace();
        }
        if(position.equals("1")){
            emp = new Employee(empNo,name,part);
            result += emp.resultStr();
        }else{
            position= (position.equals("2")) ? "대리":"과장";
            mng = new Manager(empNo,name,part,position);
            result += mng.resultStr()+mng.addStr();
        }
        System.out.println(result);
    }
}
