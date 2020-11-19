package com.athome.pojo;

/**
 * @Author zhangxw03
 * @Dat 2020-11-19 11:36
 * @Describe
 */
public class Blog {

    private Integer id;
    private String name;
    private String idNo;

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

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}
