package com.lc.cn.pojo;

/*
 * @Author: lichao
 * @Date: 2020/5/31 17:10
 */
import java.io.Serializable;

public class Index implements Serializable {
    String code;
    String name;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
