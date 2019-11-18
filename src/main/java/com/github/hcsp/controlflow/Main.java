package com.github.hcsp.controlflow;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end 区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        
        //已打印到控制台的数量
        int printQua = 0;
        
        //从start开始到end的所有整数进行判断
        for (int i = start; i <= end; i++){
            
            //判断是不是奇数
            if((i % 2) != 0){
                
                //对,进行控制
                if (printQua >= 1){
                    System.out.print(",");
                }
                
                //打印奇数并使打印的数量加1，方便对,的控制
                System.out.print(i);
                printQua++;
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
