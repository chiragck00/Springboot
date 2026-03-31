package com.springboot.learning.AOP;

import com.springboot.learning.AOP.Service.Servicecode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Servicecode service;

    @GetMapping("fetch1")
    public String fetch1(){
        String str = "Fetch 1 invoked";
        System.out.println(str);
        return str;
    }
    @GetMapping("fetch2")
    public String fetch2(){
        String str = "Fetch 2 invoked";
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch3")
    public String fetch3(){
        String str = "Fetch 3 invoked";
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch11")
    public String fetch11(@RequestParam boolean input){
        String str = "Fetch 11 invoked";
        System.out.println(str);
        return str;
    }
    @GetMapping("fetch22")
    public String fetch22(@RequestParam boolean input){
        String str = "Fetch 22 invoked";
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch33")
    public String fetch33(@RequestParam boolean input){
        String str = "Fetch 33 invoked";
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch44")
    public String fetch44(@RequestParam int a, @RequestParam int b){
        String str = "Fetch 44 invoked with values: " + a + ", " + b;
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch55")
    public String fetch55(@RequestParam int x, @RequestParam int y){
        String str = "Fetch 55 invoked with values: " + x + ", " + y;
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch66")
    public String fetch66(@RequestParam int num1, @RequestParam int num2){
        String str = "Fetch 66 invoked with values: " + num1 + ", " + num2;
        System.out.println(str);
        return str;
    }

    @GetMapping("fetch111")
    public int fetch111(@RequestParam int num){
        String str = "Fetch 111 invoked with value: " + num;
        System.out.println(str);
        return num;
    }

    @GetMapping("fetch222")
    public int fetch222(@RequestParam int num){
        String str = "Fetch 222 invoked with value: " + num;
        System.out.println(str);
        return num;
    }

    @GetMapping("fetch333")
    public int fetch333(@RequestParam int num){
        String str = "Fetch 333 invoked with value: " + num;
        System.out.println(str);
        return num;
    }

    @GetMapping("fetch1111")
    public int fetch111() {
        System.out.println("Fetch 1111 invoked");
        return 1;
    }

    @GetMapping("fetch2222")
    public int fetch222() {
        System.out.println("Fetch 2222 invoked");
        return 2;
    }

    @GetMapping("fetch3333")
    public int fetch333() {
        System.out.println("Fetch 3333 invoked");
        return 3;
    }

    @GetMapping("/call0")
    public String call0() {
        service.service();
        return "call0 invoked";
    }

    @GetMapping("/call1")
    public String call1(@RequestParam int num) {
        service.service();
        System.out.println("Received num: " + num);
        return "call1 invoked with num=" + num;
    }

    @GetMapping("/call2")
    public String call2(int a, int b) {
        service.service();
        System.out.println("Received a: " + a + ", b: " + b);
        return "call2 invoked with a=" + a + ", b=" + b;
    }
}
