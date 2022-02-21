package com.assignment.springAssignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
  @RequestMapping("/details")
  public String details(){
      return "{Name: Devraj Jain, Age: 21, Designation: Software Developer, Contact number: 9543434523}";
  }
}
