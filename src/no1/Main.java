package no1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //매년 고정비용 A
        //한대당 재료비 인건비가변비용 B
        //노트북 가격 C
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.print(BreakPoint(a,b,c));


    }

     static int BreakPoint(int a, int b, int c) {
        int n = 0; //현재 비용
        n = n-a;
        int cnt = 0; //댓수

        for(int i=n; i<=0; i+=c-b){
            cnt++;
        }
        return cnt;

    }
};