package me.salisuwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    @Autowired
    BlogRespository blogRespository;

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRespository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogRespository.findOne(blogId);
    }
    

    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body){
    
        String username = body.get("username");
        String password = body.get("password");
        return blogRespository.save(new Blog(username, password));
    }

   
    


}