package com.kltn.motelservice.model;

import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String address;

    private String phone;

    private boolean isBlock;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String address, String phone, boolean isBlock) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.isBlock = isBlock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }
}
