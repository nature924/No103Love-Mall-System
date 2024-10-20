package com.entity.model;

import com.entity.JuanzengYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户捐赠
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JuanzengYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String juanzengYuyueUuidNumber;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名理由
     */
    private String juanzengYuyueText;


    /**
     * 捐赠照片
     */
    private String juanzengYuyuePhoto;


    /**
     * 报名状态
     */
    private Integer juanzengYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String juanzengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date juanzengYuyueShenheTime;


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
