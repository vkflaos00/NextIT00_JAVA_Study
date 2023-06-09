package ch10_extends_interface.starcraft;

public class HighTemplar extends StarUint{
	private int shield;
	private int mp;
	
	public HighTemplar() {
		this("하이템플러", 0, 60, 0, 50, 150);
	}

	public HighTemplar(String name, int damage, int hp, int armor, int shield, int mp) {
		super(name, damage, hp, armor);
		this.shield = shield;
		this.mp = mp;
	}
	public void thunderStome() {
		mp -= 75 ;
		System.out.println("우르르 쾅쾅");
	}

	@Override
	public String toString() {
		return "HighTemplar [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + ", shield="
				+ shield + ", mp=" + mp + "]";
	}
	
}