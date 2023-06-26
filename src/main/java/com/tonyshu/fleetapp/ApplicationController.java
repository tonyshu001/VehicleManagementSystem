package com.tonyshu.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tony Shu
 * @version 1.0
 * @date 1:08 26/06/2023
 * @desc
 */
@Controller
public class ApplicationController {

    //set the home page to index.html
    @GetMapping("/index")
    public String goHome(){
        return "index";
    }

}
