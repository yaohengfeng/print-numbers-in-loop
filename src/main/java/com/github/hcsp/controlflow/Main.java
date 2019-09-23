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
        // 打印最后一个奇数，后面不加 ","
        // 即 end 为奇数，单独判断打印后 1 位
        // end 为偶数，单独判断打印后 2 位
        // 注意 start end 有负数情况
        int tempEnd = end % 2 == 0 ? end - 2 : end - 1;
        for (int i = start; i <= tempEnd; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
        for (int j = tempEnd; j <= end; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
