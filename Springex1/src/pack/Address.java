package pack;

public class Address {
	int dono;
	String Street;
	public int getDono() {
		return dono;
	}
	public void setDono(int dono) {
		this.dono = dono;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Address(int dono, String street) {
		this.dono = dono;
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [dono=" + dono + ", Street=" + Street + "]";
	}

}
