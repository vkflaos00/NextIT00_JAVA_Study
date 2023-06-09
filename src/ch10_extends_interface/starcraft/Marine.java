package ch10_extends_interface.starcraft;

public class Marine extends StarUint{

	
	public Marine () {
		this("마린", 6, 50, 0);
		
	}
	
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
	}
	
	public void attack(StarUint unit) {
		unit.setHp(unit.getHp() - super.getDamage() );
	}
	
	public void attack(Zealot zealot) {
		zealot.setHp(zealot.getHp() - super.getDamage() );
	}

	public void attack(HighTemplar highTemplar) {
		highTemplar.setHp(highTemplar.getHp() - super.getDamage() );
	}
	
	public void stimpack() {
		System.out.println("우아아아아!");
		
		super.setHp(super.getHp() -10);
		super.setDamage(super.getDamage() * 2);
		
	}
	@Override
	public String toString() {
		return "Marine [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + "]";
	}
	
}
