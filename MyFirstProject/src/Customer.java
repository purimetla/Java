import java.io.Serializable;


public class Customer implements Serializable{

	public int Id;
	public String Name;
	public String Mail;
	public String Phone;
	
	public Customer(int Id, String Name, String Mail, String Phone){
		// TODO Auto-generated constructor stub
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	

	
	
	

}
