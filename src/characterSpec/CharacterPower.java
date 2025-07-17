package characterSpec;

import java.util.Random;

public class CharacterPower extends CharacterName { //スーパークラス
	
	//ランダムな数値を入力させる
	private Random rdm = new Random();
	
	//各ステータス要素にランダムな数値を設定する
	private int hp;
	private int mp;
	private int attack;
	private int quickness;
	private int protection;
	
	public CharacterPower() {
		super();  //【メモ】バグの原因になることがあるため、定義しておく
		this.hp = rdm.nextInt(1001); //0~1000までをランダムに設定させる
		this.mp = rdm.nextInt(1001);
		this.attack = rdm.nextInt(1001);
		this.quickness = rdm.nextInt(1001);
		this.protection = rdm.nextInt(1001);
	}
	
	public void display() {
		super.display();
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + attack);
		System.out.println("素早さ：" + quickness);
		System.out.println("防御力：" + protection);
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}




}
