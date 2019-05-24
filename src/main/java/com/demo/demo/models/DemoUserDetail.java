/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.models;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ABC
 */
@Getter
@Setter
public class DemoUserDetail {
    
    private Long id;

    private String username;

    private String password;
    
    private String role;
    
}
