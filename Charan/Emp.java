package Charan;
class List {
	int id;
	String name;
	int sal;
	String address;
	String company;
	public List(int id, String name, int sal, String address, String company) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + ", company=" + company
				+ "]";
	}

}
public class Emp {

	public static void main(String[] args) {
		
		List e1 = new List(100,"Ramu",45000,"Hyd","Hp");
		System.out.println(e1);
		
		
		
	}

}