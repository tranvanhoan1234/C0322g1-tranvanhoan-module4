package com.example.repostory.impl;

import com.example.repostory.ISearchRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SearchRepository implements ISearchRepository {
    static Map<String, String> map = new HashMap<>();

    static {
        map.put("dog", "cho");
        map.put("cat", "meo");
        map.put("bird", "trim");
        map.put("table", "bàn");
    }

    @Override
    public String search(String s) {
        return map.get(s);

    }
}
