package com.athome;

import java.util.List;
import java.util.Map;

/**
 * @Author zhangxw03
 * @Dat 2020-11-10 9:11
 * @Describe
 */
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Double score;

    private List<String> pen;
    private Map<String, String> map;

    public User() {

    }

    public User(Integer id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User(Integer id, String name, Integer age, String address, Double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<String> getPen() {
        return pen;
    }

    public void setPen(List<String> pen) {
        this.pen = pen;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
