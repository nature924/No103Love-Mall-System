package com.entity.model;

import com.entity.QiyeYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公益企业捐赠
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiyeYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String qiyeYuyueUuidNumber;


    /**
     * 公益企业
     */
    private Integer qiyeId;


    /**
     * 报名理由
     */
    private String qiyeYuyueText;


    /**
     * 捐赠照片
     */
    private String qiyeYuyuePhoto;


    /**
     * 报名状态
     */
    private Integer qiyeYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String qiyeYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qiyeYuyueShenheTime;


    /**
     * 捐赠时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
