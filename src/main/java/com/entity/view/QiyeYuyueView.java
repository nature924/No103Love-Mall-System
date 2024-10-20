package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.QiyeYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 公益企业捐赠
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("qiye_yuyue")
public class QiyeYuyueView extends QiyeYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 报名状态的值
	*/
	@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
	private String qiyeYuyueYesnoValue;

	//级联表 企业
		/**
		* 企业姓名
		*/

		@ColumnInfo(comment="企业姓名",type="varchar(200)")
		private String qiyeName;
		/**
		* 企业手机号
		*/

		@ColumnInfo(comment="企业手机号",type="varchar(200)")
		private String qiyePhone;
		/**
		* 企业头像
		*/

		@ColumnInfo(comment="企业头像",type="varchar(200)")
		private String qiyePhoto;
		/**
		* 企业邮箱
		*/

		@ColumnInfo(comment="企业邮箱",type="varchar(200)")
		private String qiyeEmail;



	public QiyeYuyueView() {

	}

	public QiyeYuyueView(QiyeYuyueEntity qiyeYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, qiyeYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 报名状态的值
	*/
	public String getQiyeYuyueYesnoValue() {
		return qiyeYuyueYesnoValue;
	}
	/**
	* 设置： 报名状态的值
	*/
	public void setQiyeYuyueYesnoValue(String qiyeYuyueYesnoValue) {
		this.qiyeYuyueYesnoValue = qiyeYuyueYesnoValue;
	}


	//级联表的get和set 企业

		/**
		* 获取： 企业姓名
		*/
		public String getQiyeName() {
			return qiyeName;
		}
		/**
		* 设置： 企业姓名
		*/
		public void setQiyeName(String qiyeName) {
			this.qiyeName = qiyeName;
		}

		/**
		* 获取： 企业手机号
		*/
		public String getQiyePhone() {
			return qiyePhone;
		}
		/**
		* 设置： 企业手机号
		*/
		public void setQiyePhone(String qiyePhone) {
			this.qiyePhone = qiyePhone;
		}

		/**
		* 获取： 企业头像
		*/
		public String getQiyePhoto() {
			return qiyePhoto;
		}
		/**
		* 设置： 企业头像
		*/
		public void setQiyePhoto(String qiyePhoto) {
			this.qiyePhoto = qiyePhoto;
		}

		/**
		* 获取： 企业邮箱
		*/
		public String getQiyeEmail() {
			return qiyeEmail;
		}
		/**
		* 设置： 企业邮箱
		*/
		public void setQiyeEmail(String qiyeEmail) {
			this.qiyeEmail = qiyeEmail;
		}


	@Override
	public String toString() {
		return "QiyeYuyueView{" +
			", qiyeYuyueYesnoValue=" + qiyeYuyueYesnoValue +
			", qiyeName=" + qiyeName +
			", qiyePhone=" + qiyePhone +
			", qiyePhoto=" + qiyePhoto +
			", qiyeEmail=" + qiyeEmail +
			"} " + super.toString();
	}
}
