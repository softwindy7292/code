package vote.vo;

import java.sql.Timestamp;

//이름       널?       유형           
//-------- -------- ------------ 
//P_CODE   NOT NULL VARCHAR2(2)  
//P_NAME            VARCHAR2(20) 
//P_INDATE          DATE         
//P_READER          VARCHAR2(20) 
//P_TEL1            VARCHAR2(3)  
//P_TEL2            VARCHAR2(4)  
//P_TEL3            VARCHAR2(4)  
public class PartyVO {
	private String p_code;
	private String p_name;
	private Timestamp p_indate;
	private String p_reader;
	private String p_tel1;
	private String p_tel2;
	private String p_tel3;
	
	public PartyVO(){}

	public PartyVO(String p_code, String p_name, Timestamp p_indate, String p_reader, String p_tel1, String p_tel2, String p_tel3) {
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_indate = p_indate;
		this.p_reader = p_reader;
		this.p_tel1 = p_tel1;
		this.p_tel2 = p_tel2;
		this.p_tel3 = p_tel3;
	}

	public String getP_code() {
		return p_code;
	}

	public void setP_code(String p_code) {
		this.p_code = p_code;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Timestamp getP_indate() {
		return p_indate;
	}

	public void setP_indate(Timestamp p_indate) {
		this.p_indate = p_indate;
	}

	public String getP_reader() {
		return p_reader;
	}

	public void setP_reader(String p_reader) {
		this.p_reader = p_reader;
	}

	public String getP_tel1() {
		return p_tel1;
	}

	public void setP_tel1(String p_tel1) {
		this.p_tel1 = p_tel1;
	}

	public String getP_tel2() {
		return p_tel2;
	}

	public void setP_tel2(String p_tel2) {
		this.p_tel2 = p_tel2;
	}

	public String getP_tel3() {
		return p_tel3;
	}

	public void setP_tel3(String p_tel3) {
		this.p_tel3 = p_tel3;
	}
	
}
