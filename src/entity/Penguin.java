package entity;

public class Penguin extends Aquatic{
	protected float swimmingDepth;
	public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) throws AgeException {
		super(family,name,age,isMammal,habitat);
		this.swimmingDepth=swimmingDepth;
	}
	public float getSwimmingDepth() {
		return swimmingDepth;
	}
	public void setSwimmingDepth(float swimmingDepth) {
		this.swimmingDepth = swimmingDepth;
	}
	@Override
	public String toString() {
		return "Penguin [swimmingDepth=" + swimmingDepth + ", habitat=" + habitat + ", family=" + family + ", name="
				+ name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}
	public void swim() {
		System.out.println("penguin is swimming");
	}

}
