package com.entity.vo;

import com.entity.JuanzengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户捐赠
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("juanzeng_yuyue")
public class JuanzengYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "juanzeng_yuyue_uuid_number")
    private String juanzengYuyueUuidNumber;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名理由
     */

    @TableField(value = "juanzeng_yuyue_text")
    private String juanzengYuyueText;


    /**
     * 捐赠照片
     */

    @TableField(value = "juanzeng_yuyue_photo")
    private String juanzengYuyuePhoto;


    /**
     * 报名状态
     */

    @TableField(value = "juanzeng_yuyue_yesno_types")
    private Integer juanzengYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "juanzeng_yuyue_yesno_text")
    private String juanzengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "juanzeng_yuyue_shenhe_time")
    private Date juanzengYuyueShenheTime;


    /**
     * 捐赠时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：报名编号
	 */
    public String getJuanzengYuyueUuidNumber() {
        return juanzengYuyueUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setJuanzengYuyueUuidNumber(String juanzengYuyueUuidNumber) {
        this.juanzengYuyueUuidNumber = juanzengYuyueUuidNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名理由
	 */
    public String getJuanzengYuyueText() {
        return juanzengYuyueText;
    }


    /**
	 * 获取：报名理由
	 */

    public void setJuanzengYuyueText(String juanzengYuyueText) {
        this.juanzengYuyueText = juanzengYuyueText;
    }
    /**
	 * 设置：捐赠照片
	 */
    public String getJuanzengYuyuePhoto() {
        return juanzengYuyuePhoto;
    }


    /**
	 * 获取：捐赠照片
	 */

    public void setJuanzengYuyuePhoto(String juanzengYuyuePhoto) {
        this.juanzengYuyuePhoto = juanzengYuyuePhoto;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getJuanzengYuyueYesnoTypes() {
        return juanzengYuyueYesnoTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setJuanzengYuyueYesnoTypes(Integer juanzengYuyueYesnoTypes) {
        this.juanzengYuyueYesnoTypes = juanzengYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getJuanzengYuyueYesnoText() {
        return juanzengYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setJuanzengYuyueYesnoText(String juanzengYuyueYesnoText) {
        this.juanzengYuyueYesnoText = juanzengYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getJuanzengYuyueShenheTime() {
        return juanzengYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setJuanzengYuyueShenheTime(Date juanzengYuyueShenheTime) {
        this.juanzengYuyueShenheTime = juanzengYuyueShenheTime;
    }
    /**
	 * 设置：捐赠时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：捐赠时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
