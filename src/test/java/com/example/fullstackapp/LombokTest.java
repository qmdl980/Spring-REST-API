package com.example.fullstackapp;

import com.example.fullstackapp.domain.ResultVO;
import org.junit.jupiter.api.Test;

/**
 * Created by eastflag on 2016-11-04.
 */
public class LombokTest {

    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO(0, "hong");
        System.out.println(result);
    }
}