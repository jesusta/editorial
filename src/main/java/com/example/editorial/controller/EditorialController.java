package com.example.editorial.controller;

import com.example.editorial.entity.EditorialEntity;
import com.example.editorial.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/Editorial")
public class EditorialController {
    @Autowired
    EditorialService editorialService;
    @PostMapping("/saludar")
    public String saludar(@RequestBody String bebe){
        return "soy tu jajaja y tu eres yo  "+bebe;
    }
    @PostMapping("/saveEditorial")
    public EditorialEntity saveEditorial(@RequestBody EditorialEntity editorial){

        if(editorial.getCreated()==null && editorial.getModified()==null){
            editorial.setCreated(new Date());
            editorial.setModified(new Date());
        }
        return editorialService.saveEditorial(editorial);
    }
}
