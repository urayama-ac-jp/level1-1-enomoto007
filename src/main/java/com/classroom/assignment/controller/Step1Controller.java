package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step1")
public class Step1Controller {

  @GetMapping
  public String index(Model model) {
    // 課題 level1 step1
    model.addAttribute("title", "ここを書き換えてみよう!");
    return "step1/index";
  }
}
