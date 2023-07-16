package com.example.editorial.service;

import com.example.editorial.entity.EditorialEntity;
import com.example.editorial.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServiceImpl implements EditorialService{
    @Autowired
    EditorialRepository editorialRepository;
    @Override
    public EditorialEntity saveEditorial(EditorialEntity editorial) {

        return editorialRepository.save(editorial);
    }


}
