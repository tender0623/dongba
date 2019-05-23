package com.jt.sys.pojo;

/**
 * Created by CGB on 2019/3/7.
 */

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jt.common.DateJsonSerializer;

import java.io.Serializable;
import java.util.Date;

/**持久化对象
 * 这样对象,编写时应注意
 * 1.实现Serializable接口,并提供版本ID
 * 2.提供无参构造函数
 * 3.提供属性以及对应的set/get方法,一帮属性名要与表中的字段名保持一致
 * 4.有选择性的重写tostring方法
 * */
public class SysRole implements Serializable{
    private static final long serialVersionUID = -5225339701513043662L;
    private Integer id;
    private String name;
    private String note;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    @JsonSerialize(using = DateJsonSerializer.class)
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    @JsonSerialize(using = DateJsonSerializer.class)
    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                ", createdUser='" + createdUser + '\'' +
                ", modifiedUser='" + modifiedUser + '\'' +
                '}';
    }
}
