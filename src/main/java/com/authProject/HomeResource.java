package com.authProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping(path = "/home")
    public String home(){return "<h1>User</h1>";}

    @GetMapping(path = "/user")
    public String user(){return "<h1>User</h1>";}

    @GetMapping(path = "/admin")
    public String admin(){return "<h1>admin</h1>";}

    @GetMapping(path = "/endpoint1")
    public String doStuff1(){return "<h1>endpoint1</h1>";}

    @GetMapping(path = "/endpoint2")
    public String doStuff2(){return "<h1>endpoint2</h1>";}

    @GetMapping(path = "/endpoint3")
    public String doStuff3(){return "<h1>endpoin3</h1>";}
}
