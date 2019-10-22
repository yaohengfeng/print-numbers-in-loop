package com.github.hcsp.controlflow;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end   区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1 || i % 2 == -1) {//判断是否为奇数
                System.out.print(i);
                /*如何少打出一个逗号？
                利用奇偶数相间，那么最后一个数字一定是最后一个数字或者倒数第二个数字
                如果是这两个数字，则不打印出逗号，进行换行，其他情况打印出逗号*/
                if (i == end - 1 || i == end) {
                    System.out.println();
                } else {
                    System.out.print(",");
                }


            }
        }
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
