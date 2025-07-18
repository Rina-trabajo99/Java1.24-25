package character;

import java.util.Scanner;

import characterSpec.CharacterPower;

public class Character {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		
		//名前をコンソールから入力させる
		System.out.print("名前を入力してください：");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		
		//インスタンス
		CharacterPower cp = new CharacterPower();
				
		cp.setName(userName); //受け取った名前をsetterに設定する
		cp.display(); //CharacterPowerのdisplayを実行する
		
		
	}

}
