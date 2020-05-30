package xlsreadwritedemo.bean;

public class StudentDetail {
	
	int studId;
	String studName;
	int mechMarks;
	int civilMarks;
	int electMarks;
	int computerMarks;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMechMarks() {
		return mechMarks;
	}
	public void setMechMarks(int mechMarks) {
		this.mechMarks = mechMarks;
	}
	public int getCivilMarks() {
		return civilMarks;
	}
	public void setCivilMarks(int civilMarks) {
		this.civilMarks = civilMarks;
	}
	public int getElectMarks() {
		return electMarks;
	}
	public void setElectMarks(int electMarks) {
		this.electMarks = electMarks;
	}
	public int getComputerMarks() {
		return computerMarks;
	}
	public void setComputerMarks(int computerMarks) {
		this.computerMarks = computerMarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
		result = prime * result
				+ ((studName == null) ? 0 : studName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDetail other = (StudentDetail) obj;
		if (studId != other.studId)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentDetail [studId=" + studId + ", studName=" + studName
				+ ", mechMarks=" + mechMarks + ", civilMarks=" + civilMarks
				+ ", electMarks=" + electMarks + ", computerMarks="
				+ computerMarks + "]";
	}
	
	

}
