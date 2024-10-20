package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 企业
 *
 * @author 
 * @email
 */
@TableName("qiye")
public class QiyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiyeEntity() {

	}

	public QiyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 企业姓名
     */
    @ColumnInfo(comment="企业姓名",type="varchar(200)")
    @TableField(value = "qiye_name")

    private String qiyeName;


    /**
     * 企业手机号
     */
    @ColumnInfo(comment="企业手机号",type="varchar(200)")
    @TableField(value = "qiye_phone")

    private String qiyePhone;


    /**
     * 企业头像
     */
    @ColumnInfo(comment="企业头像",type="varchar(200)")
    @TableField(value = "qiye_photo")

    private String qiyePhoto;


    /**
     * 企业邮箱
     */
    @ColumnInfo(comment="企业邮箱",type="varchar(200)")
    @TableField(value = "qiye_email")

    private String qiyeEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：企业姓名
	 */
    public String getQiyeName() {
        return qiyeName;
    }
    /**
	 * 设置：企业姓名
	 */

    public void setQiyeName(String qiyeName) {
        this.qiyeName = qiyeName;
    }
    /**
	 * 获取：企业手机号
	 */
    public String getQiyePhone() {
        return qiyePhone;
    }
    /**
	 * 设置：企业手机号
	 */

    public void setQiyePhone(String qiyePhone) {
        this.qiyePhone = qiyePhone;
    }
    /**
	 * 获取：企业头像
	 */
    public String getQiyePhoto() {
        return qiyePhoto;
    }
    /**
	 * 设置：企业头像
	 */

    public void setQiyePhoto(String qiyePhoto) {
        this.qiyePhoto = qiyePhoto;
    }
    /**
	 * 获取：企业邮箱
	 */
    public String getQiyeEmail() {
        return qiyeEmail;
    }
    /**
	 * 设置：企业邮箱
	 */

    public void setQiyeEmail(String qiyeEmail) {
        this.qiyeEmail = qiyeEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qiye{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", qiyeName=" + qiyeName +
            ", qiyePhone=" + qiyePhone +
            ", qiyePhoto=" + qiyePhoto +
            ", qiyeEmail=" + qiyeEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
