package com.shcp.common.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yuki
 * @date 2019/3/25 21:41
 */
public class StringUtilTest {

    @Test
    public void isCorrect() {
        if(StringUtil.isCorrect("280794749@qq.com")){
            System.out.println("correct");
        } else {
            System.out.println("worse");
        }
    }
}