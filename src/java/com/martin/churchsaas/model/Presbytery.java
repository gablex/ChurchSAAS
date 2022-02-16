/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.churchsaas.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author martin
 */
@ManagedBean
@RequestScoped
@Getter @Setter
public class Presbytery {
    private int presbyteryId;
    private String presbyteryName;
    public  Presbytery(){}
}
