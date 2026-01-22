package sn.ssi.togo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "jos_users")
	public class SygEspaceEntreprise  implements java.io.Serializable {
		
  		private Long id;
		private String name,username,email,password,usertype,activation,params,address,bureau,cellulaire;
		private Integer block,sendEmail,gid;
		private Date registerDate,lastvisitDate;
		
		
		public SygEspaceEntreprise() {
		}

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 10)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "name",  length = 255)
		public String getName() {
			return this.name;
		}
    	public void setName(String name) {
			this.name = name;
		}


		@Column(name = "username")
		public String getUsername() {
			return username;
		}
    	public void setUsername(String username) {
			this.username = username;
		}


    	@Column(name = "email")
		public String getEmail() {
			return email;
		}
    	public void setEmail(String email) {
			this.email = email;
		}


    	@Column(name = "password")
		public String getPassword() {
			return password;
		}
    	public void setPassword(String password) {
			this.password = password;
		}


    	@Column(name = "usertype")
		public String getUsertype() {
			return usertype;
		}
		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}


		@Column(name = "activation")
		public String getActivation() {
			return activation;
		}
		public void setActivation(String activation) {
			this.activation = activation;
		}


		@Column(name = "params")
		public String getParams() {
			return params;
		}
    	public void setParams(String params) {
			this.params = params;
		}


    	@Column(name = "address")
		public String getAddress() {
			return address;
		}
    	public void setAddress(String address) {
			this.address = address;
		}


    	@Column(name = "bureau")
		public String getBureau() {
			return bureau;
		}
		public void setBureau(String bureau) {
			this.bureau = bureau;
		}


		@Column(name = "cellulaire")
		public String getCellulaire() {
			return cellulaire;
		}
    	public void setCellulaire(String cellulaire) {
			this.cellulaire = cellulaire;
		}


    	@Column(name = "block")
		public Integer getBlock() {
			return block;
		}
    	public void setBlock(Integer block) {
			this.block = block;
		}


    	@Column(name = "sendemail")
		public Integer getSendEmail() {
			return sendEmail;
		}
    	public void setSendEmail(Integer sendEmail) {
			this.sendEmail = sendEmail;
		}


    	@Column(name = "gid")
		public Integer getGid() {
			return gid;
		}
    	public void setGid(Integer gid) {
			this.gid = gid;
		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "registerdate", length = 7)
//		public Date getRegisterDate() {
//			return registerDate;
//		}
//    	public void setRegisterDate(Date registerDate) {
//			this.registerDate = registerDate;
//		}
//
//
//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "lastvisitdate", length = 7)
//		public Date getLastvisitDate() {
//			return lastvisitDate;
//		}
//    	public void setLastvisitDate(Date lastvisitDate) {
//			this.lastvisitDate = lastvisitDate;
//		}

		
	}

