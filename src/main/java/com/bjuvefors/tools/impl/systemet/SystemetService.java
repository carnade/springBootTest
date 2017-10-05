package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Reductions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class SystemetService {

    @Autowired
    private SystemetRepository systemetRepository;

    private List<Reductions> reductions = Arrays.asList(
            new Reductions(2, 1234, 123, "name1", 12,1, "sdf","test", "asd", "adf", "adf", "adf", "adf", new Date()),
            new Reductions(2,22, 223, "name2", 12, 1,"sdf","test", "asd", "adf", "adf", "adf", "adf", new Date())
            );

    public List<Reductions> getReductions() {
        List<Reductions> reductionsList = new ArrayList<>();

        systemetRepository.findAll().forEach(reductionsList::add);

        return reductionsList;
    }

    public Page<Reductions> getReductionsPage(Pageable page) {

        return systemetRepository.findAll(page);
    }


}
