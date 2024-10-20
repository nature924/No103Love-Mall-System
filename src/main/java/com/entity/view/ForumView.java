package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 论坛
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 帖子状态的值
	*/
	@ColumnInfo(comment="帖子状态的字典表值",type="varchar(200)")
	private String forumStateValue;

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
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 报名状态
		*/
		@ColumnInfo(comment="报名状态",type="int(11)")
		private Integer yonghuYesnoTypes;
			/**
			* 报名状态的值
			*/
			@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
			private String yonghuYesnoValue;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 管理员
		/**
		* 儿童名
		*/
		@ColumnInfo(comment="儿童名",type="varchar(100)")
		private String uusername;
		/**
		* 密码
		*/
		@ColumnInfo(comment="密码",type="varchar(100)")
		private String upassword;
		/**
		* 角色
		*/
		@ColumnInfo(comment="角色",type="varchar(100)")
		private String urole;
		/**
		* 新增时间
		*/
		@ColumnInfo(comment="新增时间",type="timestamp")
		private Date uaddtime;



	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 帖子状态的值
	*/
	public String getForumStateValue() {
		return forumStateValue;
	}
	/**
	* 设置： 帖子状态的值
	*/
	public void setForumStateValue(String forumStateValue) {
		this.forumStateValue = forumStateValue;
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
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 报名状态
		*/
		public Integer getYonghuYesnoTypes() {
			return yonghuYesnoTypes;
		}
		/**
		* 设置： 报名状态
		*/
		public void setYonghuYesnoTypes(Integer yonghuYesnoTypes) {
			this.yonghuYesnoTypes = yonghuYesnoTypes;
		}


			/**
			* 获取： 报名状态的值
			*/
			public String getYonghuYesnoValue() {
				return yonghuYesnoValue;
			}
			/**
			* 设置： 报名状态的值
			*/
			public void setYonghuYesnoValue(String yonghuYesnoValue) {
				this.yonghuYesnoValue = yonghuYesnoValue;
			}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
	//级联表的get和set 管理员
		/**
		* 获取： 儿童名
		*/
		public String getUusername() {
			return uusername;
		}
		/**
		* 设置： 儿童名
		*/
		public void setUusername(String uusername) {
			this.uusername = uusername;
		}
		/**
		* 获取： 密码
		*/
		public String getUpassword() {
			return upassword;
		}
		/**
		* 设置： 密码
		*/
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		/**
		* 获取： 角色
		*/
		public String getUrole() {
			return urole;
		}
		/**
		* 设置： 角色
		*/
		public void setUrole(String urole) {
			this.urole = urole;
		}
		/**
		* 获取： 新增时间
		*/
		public Date getUaddtime() {
			return uaddtime;
		}
		/**
		* 设置： 新增时间
		*/
		public void setUaddtime(Date uaddtime) {
			this.uaddtime = uaddtime;
		}


	@Override
	public String toString() {
		return "ForumView{" +
			", forumStateValue=" + forumStateValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			", qiyeName=" + qiyeName +
			", qiyePhone=" + qiyePhone +
			", qiyePhoto=" + qiyePhoto +
			", qiyeEmail=" + qiyeEmail +
			"} " + super.toString();
	}
}
