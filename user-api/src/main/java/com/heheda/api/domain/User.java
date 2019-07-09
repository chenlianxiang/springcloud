package com.heheda.api.domain;

public class User {
    /**
     * @program: spring-cloud 
     * @package_name: com.heheda.api.domain
     * @name: User
     * @description: 用户类
     * @author: clx
     * @create: 2019-07-09 17:36
     **/


    /**
     * 用户id
     */
    private long id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户地址
     */
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
