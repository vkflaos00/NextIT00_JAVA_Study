package ch10_extends_interface.starcraft;

public class Zealot extends StarUint{
	private int shield;
	
	public Zealot()  {
			this("질럿",16,100,1,60);
			}
	
	public Zealot(String name, int damage, int hp, int armor, int shield) {
		//자식 생성자 맨 위에 부모가 와야함 
		super(name, damage, hp, armor);
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + ", shield=" + shield
				+ "]";
	}

	
	
	
	
}
