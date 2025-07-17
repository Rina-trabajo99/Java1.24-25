package characterSpec;

public class CharacterName { //サブクラス
	
	//メンバ変数
	private String name;
	
	/*
	public CharacterName() {  //デフォルトで呼び出される
		//System.out.println("テスト");
	}
	*/
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public void display() {
		System.out.println();
		System.out.println("こんにちは 「" + name + "」 さん");
	}
	


}
