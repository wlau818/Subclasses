
public class Environment extends Location {
	
	private String environment;
	private String animal;
	
	public Environment (String sphere, String cont, String count, String env, String ani) {
		super(sphere, cont, count);
		environment = env;
		animal = ani;
	}
	
	public String getEnv() {
		return environment;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public void setEnv(String envi) {
		environment = envi;
	}

	public void setAnimal(String anim) {
		animal = anim;
	}
}
