package com.entity.vo;

import com.entity.QiyeYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公益企业捐赠
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiye_yuyue")
public class QiyeYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "qiye_yuyue_uuid_number")
    private String qiyeYuyueUuidNumber;


    /**
     * 公益企业
     */

    @TableField(value = "qiye_id")
    private Integer qiyeId;


    /**
     * 报名理由
     */

    @TableField(value = "qiye_yuyue_text")
    private String qiyeYuyueText;


    /**
     * 捐赠照片
     */

    @TableField(value = "qiye_yuyue_photo")
    private String qiyeYuyuePhoto;


    /**
     * 报名状态
     */

    @TableField(value = "qiye_yuyue_yesno_types")
    private Integer qiyeYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "qiye_yuyue_yesno_text")
    private String qiyeYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "qiye_yuyue_shenhe_time")
    private Date qiyeYuyueShenheTime;


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
    public String getQiyeYuyueUuidNumber() {
        return qiyeYuyueUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setQiyeYuyueUuidNumber(String qiyeYuyueUuidNumber) {
        this.qiyeYuyueUuidNumber = qiyeYuyueUuidNumber;
    }
    /**
	 * 设置：公益企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }


    /**
	 * 获取：公益企业
	 */

    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 设置：报名理由
	 */
    public String getQiyeYuyueText() {
        return qiyeYuyueText;
    }


    /**
	 * 获取：报名理由
	 */

    public void setQiyeYuyueText(String qiyeYuyueText) {
        this.qiyeYuyueText = qiyeYuyueText;
    }
    /**
	 * 设置：捐赠照片
	 */
    public String getQiyeYuyuePhoto() {
        return qiyeYuyuePhoto;
    }


    /**
	 * 获取：捐赠照片
	 */

    public void setQiyeYuyuePhoto(String qiyeYuyuePhoto) {
        this.qiyeYuyuePhoto = qiyeYuyuePhoto;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getQiyeYuyueYesnoTypes() {
        return qiyeYuyueYesnoTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setQiyeYuyueYesnoTypes(Integer qiyeYuyueYesnoTypes) {
        this.qiyeYuyueYesnoTypes = qiyeYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getQiyeYuyueYesnoText() {
        return qiyeYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setQiyeYuyueYesnoText(String qiyeYuyueYesnoText) {
        this.qiyeYuyueYesnoText = qiyeYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getQiyeYuyueShenheTime() {
        return qiyeYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setQiyeYuyueShenheTime(Date qiyeYuyueShenheTime) {
        this.qiyeYuyueShenheTime = qiyeYuyueShenheTime;
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
