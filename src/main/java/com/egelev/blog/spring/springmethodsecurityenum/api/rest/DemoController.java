package com.egelev.blog.spring.springmethodsecurityenum.api.rest;

import com.egelev.blog.spring.springmethodsecurityenum.security.Authority;
import com.egelev.blog.spring.springmethodsecurityenum.security.HasAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @HasAuthority(hasAny = {Authority.READ})
  @GetMapping("/")
  public void get() {
    System.out.println("OK");
  }

  @HasAuthority(hasAny = {Authority.WRITE})
  @PostMapping("/")
  public void post() {
    System.out.println("OK");
  }

}
