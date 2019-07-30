package io.choerodon.hap.system.dto;

/**
 * Auto Generated By Hap Code Generator
 **/

import io.choerodon.mybatis.entity.BaseDTO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "sys_user_shortcut")
public class Shortcut extends BaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shortcutId;

    private Long userId; //用户id

    @Length(max = 50)
    private String functionCode; //功能id

    @Transient
    private String functionName;

    @Transient
    private String url;


    @Transient
    private String functionIcon;

    public Shortcut() {
    }

    ;

    public Shortcut(Long userId, String functionCode) {
        this.userId = userId;
        this.functionCode = functionCode;
    }


    public void setShortcutId(Long shortcutId) {
        this.shortcutId = shortcutId;
    }

    public Long getShortcutId() {
        return shortcutId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFunctionIcon() {
        return functionIcon;
    }

    public void setFunctionIcon(String functionIcon) {
        this.functionIcon = functionIcon;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
