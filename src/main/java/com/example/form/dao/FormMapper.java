package com.example.form.dao;

import com.example.form.entity.FormBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface FormMapper {
    FormBean selectFormByName(FormBean formBean);
    List<FormBean> getAllForm();
    int addForm(String form_name,String form_info);
    int modifyForm(FormBean formBean);
    int delForm(FormBean formBean);

}
