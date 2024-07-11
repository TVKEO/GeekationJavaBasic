package basicSyntax;

import java.security.PublicKey;

public class GeekIntroduction {

	public static void greeting(int age, double height) {

		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");

		//

	}

	public static void specialSkill(int num1, int num2) {
		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		} else if (num2 <= num1) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		} else if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}
		while (num1 <= num2) {
			if (num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.println(num1 + "は3の倍数かつ5の倍数です。");
				num1++;
				continue;
			} else if (num1 % 3 == 0) {
				System.out.println(num1 + "は3の倍数です。");
				num1++;
				continue;
			} else if (num1 % 5 == 0) {
				System.out.println(num1 + "は5の倍数です。");
				num1++;
				continue;
				
			}
			System.out.println(num1);
			num1++;
		}
	}
}

//Geek君が自己紹介をするためのクラス(GeekIntroduction)を作成して下記の内容をMainクラスでコンソールに出力してください。
//メソッド1: 挨拶メソッド(greeting)
//引数:
//引数1: int age (年齢)
//引数2: double height (身長)
//戻り値: void
//挙動: コンソールに下記内容を出力する
//出力内容:
//"こんにちは! 私はGeek君でごわす。"
//"年は" + age + "でごわす。"
//"身長は" + height + "でごわす。"

//メソッド2: 特技メソッド(specialSkill)
//引数:
//引数1: int num1
//引数2: int num2
//戻り値: void
//挙動: num1からnum2の範囲内(num1とnum2の値は含む)で値が1ずつ増えていく繰り返し処理を行い、数値をコンソールに出力する。ただし、下記の仕様を満たすこと。
//num1またはnum2が1より小さい場合
//"num1とnum2は0より大きい値にしてください。"と出力
//そこでメソッドの処理は終了
//num1がnum2以上の場合
//"num2はnum1より大きい値にしてください。"と出力
//そこでメソッドの処理は終了
//num1またはnum2が300より大きい場合
//"num1とnum2は300以下にしてください。"と出力
//そこでメソッドの処理は終了
//繰り返し処理の中で数値が3の倍数かつ5の倍数の場合
//"{対象の値}は3の倍数かつ5の倍数です。"と出力
//そのターンは処理をスキップ
//繰り返し処理の中で数値が3の倍数の場合
//"{対象の値}は3の倍数です。"と出力
//そのターンは処理をスキップ
//繰り返し処理の中で数値が5の倍数の場合
//"{対象の値}は5の倍数です。"と出力
//そのターンは処理をスキップ