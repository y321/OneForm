package com.example.form.service;

import com.example.form.dao.FormMapper;
import com.example.form.entity.FormBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "formServiceI")
public class FormService implements FormServiceI {
    @Resource
    private FormMapper formMapper;

    @Override
    public List<FormBean> getAllForm() {
        return formMapper.getAllForm();
    }

    @Override
    public boolean addForm(String form_name,String form_info) {

        if(formMapper.addForm(form_name,form_info)!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean modifyForm(FormBean formBean) {
        return false;
    }

    @Override
    public boolean delForm(FormBean formBean) {
        return false;
    }
}
