package Day3_Assignment;

public class Address {
	
		private String city;
		private String state;
		private int pin;
		private int Dno;
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getDno() {
			return Dno;
		}
		public void setDno(int dno) {
			Dno = dno;
		}
		public int getPin() {
			return pin;
		}
		@Override
		public String toString() {
			return "Address [city=" + city + ", state=" + state + ", pin=" + pin + ", Dno=" + Dno + "]";
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		
		
		

		

}
