package com.example.service.impl;

import com.example.repostory.ISearchRepository;
import com.example.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService implements ISearchService {
@Autowired
ISearchRepository iSearchRepository;
    @Override
    public String search(String search1) {
        return iSearchRepository.search(search1);
    }
}
