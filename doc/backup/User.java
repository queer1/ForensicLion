package cn.sunn.forensiclion.domain;

// Generated 2013-2-8 9:09:16 by Hibernate Tools 3.4.0.CR1

import java.util.*;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3040985435805589471L;
	private long id;
	private String loginname;
	private String passwd;
	private String name;
	private String major;
	private String jobtitle;
	private String practiceNum;
	private String remark;
	private Date registdate;
	private Date logindate;
	private int status;
	private Set<Dictionary> myfuns 
		= new HashSet<Dictionary>();

	public User() {
	}

	public User(String loginname, String passwd, String name, String major,
			String jobtitle, Date registdate, int status) {
		this.loginname = loginname;
		this.passwd = passwd;
		this.name = name;
		this.major = major;
		this.jobtitle = jobtitle;
		this.registdate = registdate;
		this.status = status;
	}

	public User(String loginname, String passwd, String name, String major,
			String jobtitle, String practiceNum, String remark,
			Date registdate, Date logindate, int status) {
		this.loginname = loginname;
		this.passwd = passwd;
		this.name = name;
		this.major = major;
		this.jobtitle = jobtitle;
		this.practiceNum = practiceNum;
		this.remark = remark;
		this.registdate = registdate;
		this.logindate = logindate;
		this.status = status;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getPracticeNum() {
		return this.practiceNum;
	}

	public void setPracticeNum(String practiceNum) {
		this.practiceNum = practiceNum;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRegistdate() {
		return this.registdate;
	}

	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}

	public Date getLogindate() {
		
		return this.logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<Dictionary> getMyfuns() {
		return myfuns;
	}

	public void setMyfuns(Set<Dictionary> myfuns) {
		this.myfuns = myfuns;
	}

	

}
