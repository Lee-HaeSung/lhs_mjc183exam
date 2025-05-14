package com.mjc.studyjava;

import java.util.ArrayList;

public class JavaChap04Exam {

    public String slove05() {
        ArrayList<int[]> result = new ArrayList<int[]>();

        for(int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++){
                result.add(new int[] {x,y});
            }
        }
        String answer = "";
        for ( int i = 0; i < result.size(); i++ ) {
            answer += this.getResultString(result.get(i));
        }
        return answer;
    }
    private String getResultString(int[] result) {
        // for 2번 중첩해서 모든 원소를 문자열로 표시해야 한다. (3,2), (1,4), ...
        return "";
    }
}
