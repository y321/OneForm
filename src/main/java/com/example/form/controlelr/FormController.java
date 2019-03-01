package com.example.form.controlelr;

import com.example.form.entity.FormBean;
import com.example.form.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/myForm")
public class FormController {
    @Autowired
    private FormService formService;

    @RequestMapping("/getAllForm")
    @ResponseBody
    public List<FormBean> getAllForm(){
        List<FormBean> allform=null;
        try {
            allform = formService.getAllForm();
        }catch (Exception e){
            System.out.println(e );
        }
        return allform;
    }
    @RequestMapping("/addForm")
    public boolean addForm(String form_name,String form_info){
        System.out.println(form_name+":"+form_info+"abc");
        return formService.addForm(form_name,form_info);


    }
}
