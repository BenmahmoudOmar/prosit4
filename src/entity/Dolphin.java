package entity;

public class Dolphin extends Aquatic{
	protected float swimmingSpeed;
	public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed) throws AgeException {
		super(family,name,age,isMammal,habitat);
		this.swimmingSpeed=swimmingSpeed;
		
	}
	public float getSwimmingSpeed() {
		return swimmingSpeed;
	}
	public void setSwimmingSpeed(float swimmingSpeed) {
		this.swimmingSpeed = swimmingSpeed;
	}
	@Override
	public String toString() {
		return "Dolphin [swimmingSpeed=" + swimmingSpeed + ", habitat=" + habitat + ", family=" + family + ", name="
				+ name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}
	public void swim() {
		System.out.println("dolphin is swimming");
	}

}
