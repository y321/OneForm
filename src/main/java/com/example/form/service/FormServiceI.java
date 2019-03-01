package com.example.form.service;

import com.example.form.entity.FormBean;

import java.util.List;

public interface FormServiceI {
    List<FormBean> getAllForm();
    boolean addForm(String form_name,String form_info);
    boolean modifyForm(FormBean formBean);
    boolean delForm(FormBean formBean);
}

