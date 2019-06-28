package com.dream.hzq;

import java.util.ArrayList;
import java.util.List;

public class Te {
    public static void main(String[] args){
        // 开始时间
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 3000; i++) {
            list.add(i + "-=-");
        }
         System.out.println();
    }
}
