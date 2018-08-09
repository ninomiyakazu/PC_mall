
public class Subscriberinfo {

	
		String name, id, password;
		String phoneNo, address;
		Subscriberinfo(String name, String id, String password) {
			this.name=name;
			this.id=id;
			this.password = password;	
		}
		Subscriberinfo(String name, String id, String password,
				       String phoneNo, String address) {
			this.name= name;
			this.id = id;
			this.password = password;
			this.phoneNo = phoneNo;
			this.address= address;
		}
		void changePasworld(String password) {
			this.password= password;
		}
		void setPhoneNo(String phoneNo) {
			this.phoneNo= phoneNo;
		}
		void setAddress(String address) {
			this.address = address;
		}

	}


