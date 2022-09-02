package com.key.vault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/key-vault")
public class SecretController {

    @Value("${urlBd}")
    private String secret;

    @GetMapping("secret")
    public String get() {
        return secret;
    }

}
