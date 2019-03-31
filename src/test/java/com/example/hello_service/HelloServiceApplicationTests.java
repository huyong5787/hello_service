package com.example.hello_service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedTransferQueue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceApplicationTests {


    @Test
    public void contextLoads() {

    }

    @Test
    public void test(){
        Queue<Object> queue=new ConcurrentLinkedQueue<>();

    }

}
