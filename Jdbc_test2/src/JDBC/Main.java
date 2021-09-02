package JDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Create_table create = new Create_table();
        Jdbc_select select = new Jdbc_select();
        Jdbc_insert insert = new Jdbc_insert();
        Jdbc_update update = new Jdbc_update();
        Jdbc_delete delete = new Jdbc_delete();
        Drop_table drop = new Drop_table();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("==============================");
            System.out.println("1.테이블 CREATE");
            System.out.println("2.SELECT");
            System.out.println("3.INSERT");
            System.out.println("4.UPDATE");
            System.out.println("5.DELECT");
            System.out.println("6.테이블 DROP");
            System.out.println("7.종료");
            System.out.println("==============================");
            int num= sc.nextInt();

            if(num == 1){
                create.create();
            }else if(num == 2){
                select.select();
            }else if(num == 3){
                insert.insert();
            }else if(num == 4){
                update.update();
            }else if (num == 5){
                delete.delete();
            }else if(num == 6){
                drop.drop();
            }else if(num == 7){
                System.out.println("종료");
                return;
            }else{
                System.out.println("잘못된 번호");
            }
        }
    }
}
