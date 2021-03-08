package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmnixControllerSuspect {
        @RequestMapping(path = " /retrieveSuspects", method = RequestMethod.POST)
        public String index(){
            return "hello";
        }

}
