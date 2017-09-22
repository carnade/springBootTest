package com.bjuvefors.tools.impl.systemet;

import com.bjuvefors.tools.impl.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class SystemetService {

    @Autowired
    private SystemetRepository systemetRepository;

    private List<Item> items = Arrays.asList(
            new Item(2, 1234, 123, "name1", 12,1, "sdf","test", "asd", "adf", "adf", "adf", "adf", new Date()),
            new Item(2,22, 223, "name2", 12, 1,"sdf","test", "asd", "adf", "adf", "adf", "adf", new Date())
            );

    public List<Item> getItems() {
        List<Item> itemList = new ArrayList<>();

        systemetRepository.findAll().forEach(itemList::add);

        return itemList;
    }


}
