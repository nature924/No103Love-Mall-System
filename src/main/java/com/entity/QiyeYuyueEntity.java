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
 * 公益企业捐赠
 *
 * @author 
 * @email
 */
@TableName("qiye_yuyue")
public class QiyeYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiyeYuyueEntity() {

	}

	public QiyeYuyueEntity(T t) {
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
    @TableField(value = "qiye_yuyue_uuid_number")

    private String qiyeYuyueUuidNumber;


    /**
     * 公益企业
     */
    @ColumnInfo(comment="公益企业",type="int(11)")
    @TableField(value = "qiye_id")

    private Integer qiyeId;


    /**
     * 报名理由
     */
    @ColumnInfo(comment="报名理由",type="longtext")
    @TableField(value = "qiye_yuyue_text")

    private String qiyeYuyueText;


    /**
     * 捐赠照片
     */
    @ColumnInfo(comment="捐赠照片",type="varchar(200)")
    @TableField(value = "qiye_yuyue_photo")

    private String qiyeYuyuePhoto;


    /**
     * 报名状态
     */
    @ColumnInfo(comment="报名状态",type="int(11)")
    @TableField(value = "qiye_yuyue_yesno_types")

    private Integer qiyeYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "qiye_yuyue_yesno_text")

    private String qiyeYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "qiye_yuyue_shenhe_time")

    private Date qiyeYuyueShenheTime;


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
    public String getQiyeYuyueUuidNumber() {
        return qiyeYuyueUuidNumber;
    }
    /**
	 * 设置：报名编号
	 */

    public void setQiyeYuyueUuidNumber(String qiyeYuyueUuidNumber) {
        this.qiyeYuyueUuidNumber = qiyeYuyueUuidNumber;
    }
    /**
	 * 获取：公益企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }
    /**
	 * 设置：公益企业
	 */

    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getQiyeYuyueText() {
        return qiyeYuyueText;
    }
    /**
	 * 设置：报名理由
	 */

    public void setQiyeYuyueText(String qiyeYuyueText) {
        this.qiyeYuyueText = qiyeYuyueText;
    }
    /**
	 * 获取：捐赠照片
	 */
    public String getQiyeYuyuePhoto() {
        return qiyeYuyuePhoto;
    }
    /**
	 * 设置：捐赠照片
	 */

    public void setQiyeYuyuePhoto(String qiyeYuyuePhoto) {
        this.qiyeYuyuePhoto = qiyeYuyuePhoto;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getQiyeYuyueYesnoTypes() {
        return qiyeYuyueYesnoTypes;
    }
    /**
	 * 设置：报名状态
	 */

    public void setQiyeYuyueYesnoTypes(Integer qiyeYuyueYesnoTypes) {
        this.qiyeYuyueYesnoTypes = qiyeYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getQiyeYuyueYesnoText() {
        return qiyeYuyueYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setQiyeYuyueYesnoText(String qiyeYuyueYesnoText) {
        this.qiyeYuyueYesnoText = qiyeYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getQiyeYuyueShenheTime() {
        return qiyeYuyueShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setQiyeYuyueShenheTime(Date qiyeYuyueShenheTime) {
        this.qiyeYuyueShenheTime = qiyeYuyueShenheTime;
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
        return "QiyeYuyue{" +
            ", id=" + id +
            ", qiyeYuyueUuidNumber=" + qiyeYuyueUuidNumber +
            ", qiyeId=" + qiyeId +
            ", qiyeYuyueText=" + qiyeYuyueText +
            ", qiyeYuyuePhoto=" + qiyeYuyuePhoto +
            ", qiyeYuyueYesnoTypes=" + qiyeYuyueYesnoTypes +
            ", qiyeYuyueYesnoText=" + qiyeYuyueYesnoText +
            ", qiyeYuyueShenheTime=" + DateUtil.convertString(qiyeYuyueShenheTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
