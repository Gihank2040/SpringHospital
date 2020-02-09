package com.example.demo.controller;


import com.example.demo.module.Patient;
import com.example.demo.services.PatientService;
import com.example.demo.services.Pservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    PatientService patientService;

    @Autowired
    Patient patient;

    //Implemantation and request in this methord
    @RequestMapping(value = "c",method = RequestMethod.POST)
    public List<String> getProduct() {
        List<String> test = new ArrayList<>();
        test.add("Gihan");
        test.add("Nish");

        System.out.println(test);
        return test;
    }

    //set values in body
    @RequestMapping(value = "rBody",method = RequestMethod.POST)
    public Map<String,String> request(@RequestBody String id,String name) {
        Map<String,String> test = new HashMap<>();
        test.get(id);
       // test.put("Name",name);


        System.out.println(test);
        return test;
    }
    //values return to module
    @RequestMapping(value = "student" ,method = RequestMethod.POST)
    public Map <Integer,String>studentDetails(){
        String name="name";
        String grade="";
        String subject="";
        String mark="";
        Integer x=10;
        HashMap<Integer, String> test = new HashMap();
        test.put(x,"Gihan");
        //Student details= new Student(String name, String grade, String subject, String mark);
        System.out.println(test.size());
        return test;
    }


 @RequestMapping(value = "patient" , method = RequestMethod.POST)
    public Patient savePatient(@RequestBody Patient patient){
     return patientService.save();

    }


}


