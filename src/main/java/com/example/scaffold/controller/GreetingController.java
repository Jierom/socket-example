package com.example.scaffold.controller;

import com.example.scaffold.swagger.api.GreetingApi;
import com.example.scaffold.swagger.model.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gjwu
 * @create: 2021-03-10 15:43
 * @description:
 **/
@RestController
public class GreetingController implements GreetingApi {

    @Override
    public ResponseEntity<CommonResponse> greeting() {
        return ResponseEntity.ok(new CommonResponse().rtn(0).message("Hello"));
    }
}
