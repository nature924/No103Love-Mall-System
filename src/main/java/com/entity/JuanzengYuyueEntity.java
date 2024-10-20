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
 * 用户捐赠
 *
 * @author 
 * @email
 */
@TableName("juanzeng_yuyue")
public class JuanzengYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JuanzengYuyueEntity() {

	}

	public JuanzengYuyueEntity(T t) {
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
     * 报名编号
     */
    @ColumnInfo(comment="报名编号",type="varchar(200)")
    @TableField(value = "juanzeng_yuyue_uuid_number")

    private String juanzengYuyueUuidNumber;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名理由
     */
    @ColumnInfo(comment="报名理由",type="longtext")
    @TableField(value = "juanzeng_yuyue_text")

    private String juanzengYuyueText;


    /**
     * 捐赠照片
     */
    @ColumnInfo(comment="捐赠照片",type="varchar(200)")
    @TableField(value = "juanzeng_yuyue_photo")

    private String juanzengYuyuePhoto;


    /**
     * 报名状态
     */
    @ColumnInfo(comment="报名状态",type="int(11)")
    @TableField(value = "juanzeng_yuyue_yesno_types")

    private Integer juanzengYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "juanzeng_yuyue_yesno_text")

    private String juanzengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "juanzeng_yuyue_shenhe_time")

    private Date juanzengYuyueShenheTime;


    /**
     * 捐赠时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="捐赠时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：报名编号
	 */
    public String getJuanzengYuyueUuidNumber() {
        return juanzengYuyueUuidNumber;
    }
    /**
	 * 设置：报名编号
	 */

    public void setJuanzengYuyueUuidNumber(String juanzengYuyueUuidNumber) {
        this.juanzengYuyueUuidNumber = juanzengYuyueUuidNumber;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getJuanzengYuyueText() {
        return juanzengYuyueText;
    }
    /**
	 * 设置：报名理由
	 */

    public void setJuanzengYuyueText(String juanzengYuyueText) {
        this.juanzengYuyueText = juanzengYuyueText;
    }
    /**
	 * 获取：捐赠照片
	 */
    public String getJuanzengYuyuePhoto() {
        return juanzengYuyuePhoto;
    }
    /**
	 * 设置：捐赠照片
	 */

    public void setJuanzengYuyuePhoto(String juanzengYuyuePhoto) {
        this.juanzengYuyuePhoto = juanzengYuyuePhoto;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getJuanzengYuyueYesnoTypes() {
        return juanzengYuyueYesnoTypes;
    }
    /**
	 * 设置：报名状态
	 */

    public void setJuanzengYuyueYesnoTypes(Integer juanzengYuyueYesnoTypes) {
        this.juanzengYuyueYesnoTypes = juanzengYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getJuanzengYuyueYesnoText() {
        return juanzengYuyueYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setJuanzengYuyueYesnoText(String juanzengYuyueYesnoText) {
        this.juanzengYuyueYesnoText = juanzengYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJuanzengYuyueShenheTime() {
        return juanzengYuyueShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setJuanzengYuyueShenheTime(Date juanzengYuyueShenheTime) {
        this.juanzengYuyueShenheTime = juanzengYuyueShenheTime;
    }
    /**
	 * 获取：捐赠时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：捐赠时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JuanzengYuyue{" +
            ", id=" + id +
            ", juanzengYuyueUuidNumber=" + juanzengYuyueUuidNumber +
            ", yonghuId=" + yonghuId +
            ", juanzengYuyueText=" + juanzengYuyueText +
            ", juanzengYuyuePhoto=" + juanzengYuyuePhoto +
            ", juanzengYuyueYesnoTypes=" + juanzengYuyueYesnoTypes +
            ", juanzengYuyueYesnoText=" + juanzengYuyueYesnoText +
            ", juanzengYuyueShenheTime=" + DateUtil.convertString(juanzengYuyueShenheTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
