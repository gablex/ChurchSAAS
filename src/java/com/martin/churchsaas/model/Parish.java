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
public class Parish {
    private int parishId;
    private String parishName;
    public Parish(){}
}
