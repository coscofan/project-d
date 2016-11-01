package org.cs.module.sys.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.cs.util.StringUtil;

/**
 * 
 * @ClassName: Admin 
 * @Description: TODO
 * @author: cosco gt.fan@msn.cn
 * @date: 2016年10月13日 下午10:42:06
 */
@Entity
@Table(name = "tb_sys_admin")
public class Admin  {
    private Integer id;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    private String account;

    @Column(name = "account", nullable=false, unique=true, columnDefinition="varchar(32)")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    private String code;

    @Column(name = "code", nullable=false, columnDefinition="varchar(16)")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String name;

    @Column(name = "name", columnDefinition="varchar(64)")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String pwd;

    @Column(name = "pwd")
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
		return pwd;
	}

	private String email;

    @Column(name = "email", columnDefinition="varchar(32)")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String phone;

    @Column(name = "phone", columnDefinition="varchar(16)")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Integer sex;

    @Column(name = "sex", columnDefinition="tinyint(1)")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private String addr;

    @Column(name = "addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private Integer type;

    @Column(name = "type", columnDefinition="tinyint(1)")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    private Integer status;

    @Column(name = "status", columnDefinition="tinyint(1)")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private Date createDate;
    @Column(name = "create_date")
    public Date getcreateDate() {
        return createDate;
    }

    public void setcreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private String remark;

    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String attr1;

    @Column(name = "attr1")
    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    private String attr2;

    @Column(name = "attr2")
    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    private String attr3;

    @Column(name = "attr3")
    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    private String attr4;

    @Column(name = "attr4")
    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    private String attr5;

    @Column(name = "attr5")
    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    @Column(name = "qq", columnDefinition="varchar(16)")
    private String qq;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin user = (Admin) o;
        
        if(StringUtil.isNotBlank(account, code) 
        		&& account.equals(user.getAccount())
        		&& code.equals(user.code)
        	){
        	return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
