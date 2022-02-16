
package com.martin.churchsaas.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author martin
 */
@ManagedBean@SessionScoped
@Getter@Setter
public class ChurchSetting {
    private int churchSettingId;
    private String churchRegion;
    private int churchSettingPresbyteryId;
    private int churchSettingParishId;
    private int churchSettingCongregation;
    private String churchSettingAddress;
    private String churchSettingName;
    private String churchSettingSlogan;
    private String churchSettingEmailAddress;
    private String churchSettingTown;
    private String churchSettingLogo;
    private String churchSettingLetterHead;
    public ChurchSetting(){}
}
