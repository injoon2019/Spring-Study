package com.example.restfulwebservice.helloworld;

// lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
//@NoArgsConstructor 디폴트 생성자가 추가된다
public class HelloWorldBean {

    private String message;

//    public HelloWorldBean(String message) {
//        this.message = message;
//    }
}
