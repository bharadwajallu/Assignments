package assign_6;

public class contact {
		
		long pNumber;
		String name;
		String email;
		String gender;
		
		public contact(long pNumber, String name, String email, String gender) {
			super();
			this.pNumber = pNumber;
			this.name = name;
			this.email = email;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "[Number=" + pNumber + ", Name=" + name + ", Email=" + email + ", Gender=" + gender + "]" + "\n";
		}

	}

