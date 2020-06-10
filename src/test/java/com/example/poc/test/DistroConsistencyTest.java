package com.example.poc.test;

import com.example.poc.PocApp;
import com.example.poc.consistency.ConsistencyService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @date: 2020/6/3 13:44
 * @author: farui.yu
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PocApp.class})
public class DistroConsistencyTest {

    @Autowired
    private ConsistencyService distroConsistencyService;

}
