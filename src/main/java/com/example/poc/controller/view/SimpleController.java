package com.example.poc.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date: 2020/6/9 10:12
 * @author: farui.yu
 */
@Controller
public class SimpleController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/follower")
    public String follower() {
        return "follower";
    }

    @GetMapping("/task")
    public String task() {
        return "task";
    }

    @GetMapping("/task/job")
    public String taskJob() {
        return "taskJob";
    }

    @GetMapping("/task/step")
    public String taskStep() {
        return "taskStep";
    }
}
