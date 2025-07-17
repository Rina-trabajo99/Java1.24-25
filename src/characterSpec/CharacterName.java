package characterSpec;

public class CharacterName extends CharacterPower { //スーパークラス
	
	//メンバ変数
	private String name;
	
	//getter
	public String getName() {
		return this.name;
	}
	
	//setter
	public CharacterName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("こんにちは 「" + name + "」 さん");
		super.display();
	}
	
	
	

}
