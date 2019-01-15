package com.example.tryajax.controllerrs;

import com.example.tryajax.dao.CatDao;
import com.example.tryajax.dao.UserDao;
import com.example.tryajax.models.Cat;
import com.example.tryajax.models.User;
import com.example.tryajax.servises.transferFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class AsyncController {
    @Autowired
    UserDao userDao;
    @Autowired
    CatDao catDao;
    @Autowired
    transferFileService transferFileService;

    @PostMapping("/add")
    public List<User> add(@RequestBody User user) {
        userDao.save(user);
        return userDao.findAll(Sort.by("name"));
    }

    @PostMapping("/addcat")
    public void addcat(@RequestParam String catname, @RequestParam MultipartFile catimg) throws IOException {
        Cat cat = new Cat(catname, catimg.getOriginalFilename());
        transferFileService.transfer(catimg);
        catDao.save(cat);
    }
}
