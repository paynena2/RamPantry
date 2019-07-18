import java.util.Date;

public class Food {
	String name;
	int quantity;
	Date exp;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Date getExp() {
		return this.exp;
	}
	
	public void setExp(Date exp) {
		this.exp = exp;
	}
	
	public String toString() {
		return this.getName() + "," + this.getQuantity() + "," + this.getExp();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Food) {
			Food other = (Food)o;
			if((this.getName().equals(other.getName())) && (this.getQuantity() == other.getQuantity()) && this.getExp().equals(other.getExp())) {
				return true;
			}
		}
		return false;
	}
}
