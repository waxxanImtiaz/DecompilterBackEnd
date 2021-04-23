package com.source.project.decompiler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ItemController {

    @RequestMapping(produces = "application/json",value = "/sis")
    public String hello() {
        return "This is JobPost finder service";
    }


}
