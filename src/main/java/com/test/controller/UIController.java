package com.test.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UIController {

    @GetMapping(value = "/test", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String getDataToShowViaAjax() {
        return "Test";
    }

}
