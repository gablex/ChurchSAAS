package com.martin.churchsaas.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author martin
 */
@SessionScoped
@ManagedBean
@Getter
@Setter
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userPhoneNumber;
    private String userEmail;
    private String userFirstName;
    private String userSecondName;
    private String userLastName;
    private int userType;
    private int userFamilyId;
    private int userTitheNumber;
    private String dateJoined;
    private int userDistrictId;
    private int userCongregationId;
    private int userParishId;
    private int userPresbyteryId;
    private int userMaritalStatusId;
    private int userElderId;
    private int userGroupsId;
    private String userDateOfBaptism;
    private String userDateOfMarriage;
    private String userDateOfBirth;
    private String userDateOfConfirmation;
    private String userDateOfDeath;
    private String userResidence;
    private boolean isElder;
    private boolean isAdmin;
    private boolean isOfficial;
    private boolean isActive;
    public User(){}
    
    
}
