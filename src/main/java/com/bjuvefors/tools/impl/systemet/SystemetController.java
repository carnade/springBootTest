package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Reductions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5000", "http://192.168.1.101"})
public class SystemetController {

    @Autowired
    private SystemetService systemetService;

    @RequestMapping("/systemet")
    public List<Reductions> getAllItems() {
        return systemetService.getReductions();
    }

    @RequestMapping("/systemetpage")
    public Page<Reductions> getAllItemsPage(Pageable page) {
        return systemetService.getReductionsPage(page);
    }

}
