package cn.sunn.forensiclion.domain;

// Generated 2013-2-8 23:09:37 by Hibernate Tools 3.4.0.CR1

/**
 * CaseCharge generated by hbm2java
 */
public class CaseCharge implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2287085978216368916L;
	private Long chargeId;
	private String caseId;
	private String chargeClass;
	private String chargeStandardType;
	private Long chargeAmount;
	private String chargeRemark;

	public CaseCharge() {
	}

	public CaseCharge(String caseId, String chargeClass,
			String chargeStandardType, Long chargeAmount, String chargeRemark) {
		this.caseId = caseId;
		this.chargeClass = chargeClass;
		this.chargeStandardType = chargeStandardType;
		this.chargeAmount = chargeAmount;
		this.chargeRemark = chargeRemark;
	}

	public Long getChargeId() {
		return this.chargeId;
	}

	public void setChargeId(Long chargeId) {
		this.chargeId = chargeId;
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getChargeClass() {
		return this.chargeClass;
	}

	public void setChargeClass(String chargeClass) {
		this.chargeClass = chargeClass;
	}

	public String getChargeStandardType() {
		return this.chargeStandardType;
	}

	public void setChargeStandardType(String chargeStandardType) {
		this.chargeStandardType = chargeStandardType;
	}

	public Long getChargeAmount() {
		return this.chargeAmount;
	}

	public void setChargeAmount(Long chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeRemark() {
		return this.chargeRemark;
	}

	public void setChargeRemark(String chargeRemark) {
		this.chargeRemark = chargeRemark;
	}

}
