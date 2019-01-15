package com.example.tryajax.servises;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

@Service
public class transferFileService {
    public void transfer(MultipartFile file, String path) throws IOException {
        file.transferTo(new File(path, file.getOriginalFilename()));
    }

    public void transfer(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\IdeaProjects\\Advanced_Java\\Video try ajax\\src\\main\\resources\\static", file.getOriginalFilename()));

    }
}
