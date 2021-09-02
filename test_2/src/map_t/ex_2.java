package map_t;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        ArrayList<Integer>score = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int inputScore= 0;
        int maxScore=0,cutOfPointA = 0, cutOfPointB=0;

        while (true){
            System.out.println("점수를 입력하세여");
            inputScore = sc.nextInt();
            if (inputScore < 0)break;

            score.add(inputScore);
            if(maxScore< inputScore)maxScore = inputScore;

        }
        System.out.println("전체학생은"+score.size()+"명이다");
        System.out.println("학생들의성적: ");
        for(int i = 0; i<score.size(); ++i){
            System.out.println(score.get(i)+"");
        }
        System.out.println();
        cutOfPointA = maxScore-10;
        cutOfPointB = maxScore-20;

        for(int i=0; i <score.size(); ++i){
            System.out.println(i +"번 학생의 성적은"+score.get(i)+"점이며 등급은");
            if(score.get(i) >= cutOfPointA){
                System.out.println("A");
            }else if (score.get(i)>= cutOfPointB){
                System.out.println("B");
            }else{
                System.out.println("C");
            }
            System.out.println("이다");
        }

    }
}
