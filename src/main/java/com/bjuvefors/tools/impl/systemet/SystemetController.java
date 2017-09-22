package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SystemetController {

    @Autowired
    private SystemetService systemetService;

    @RequestMapping("/systemet")
    public List<Item> getAllItems() {
        return systemetService.getItems();
    }

}
