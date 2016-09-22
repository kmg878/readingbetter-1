package kr.ac.readingbetter.vo;

public class MemberVo {
	
	private Long no;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String tel;
	private String lastDate;
	private Integer position;
	private Integer penalty;
	private Integer grade;
	private Integer classNo;
	private Integer schoolNo;
	private String kwd;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getPenalty() {
		return penalty;
	}
	public void setPenalty(Integer penalty) {
		this.penalty = penalty;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getClassNo() {
		return classNo;
	}
	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}
	public Integer getSchoolNo() {
		return schoolNo;
	}
	public void setSchoolNo(Integer schoolNo) {
		this.schoolNo = schoolNo;
	}
	
	public String getKwd() {
		return kwd;
	}
	public void setKwd(String kwd) {
		this.kwd = kwd;
	}
	
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", tel="
				+ tel + ", lastDate=" + lastDate + ", position=" + position + ", penalty=" + penalty + ", grade="
				+ grade + ", classNo=" + classNo + ", schoolNo=" + schoolNo + ", kwd=" + kwd + "]";
	}
}
