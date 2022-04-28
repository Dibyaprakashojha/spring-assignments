package com.importcsvfiles.service;

import com.importcsvfiles.helper.CSVHelper;
import com.importcsvfiles.model.Tutorial;
import com.importcsvfiles.repository.ITutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    ITutorialRepository repository;
    public void save(MultipartFile file) {
        try {
            List<Tutorial> tutorials = CSVHelper.csvTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: "+e.getMessage());
        }
    }
    public List<Tutorial> getAllTutorials() {
        return  repository.findAll();
    }
}
