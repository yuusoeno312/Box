package main;

import java.util.Scanner;

import logic.ConvertStr;

/**
 *
 * @author yuu.s
 * @version 2018/7/2
 * */
public class QuinaryNumber {
	/** 5進数変換用変数*/
	public static final int quinaryNum = 5;

	public static void main(String[] args) {
		/** 入力受け取り：文字列（5進数） */
		String inputAddend1 = null;
		String inputAddend2 = null;
		/** 5進数（String型で格納） */
		String fifthNo1;
		String fifthNo2;
		/** 変換処理用 */
		ConvertStr fc = new ConvertStr();
		Scanner sc = new Scanner(System.in);

		// 入力された文字を受け取る。
		inputAddend1 = sc.next();
		inputAddend2 = sc.next();

		// スキャナーをクローズ
		sc.close();

		// 入力が正しいか、ConvertStrクラスのinputCheck()メソッドを使って確認する
		if (fc.inputCheck(inputAddend1) && fc.inputCheck(inputAddend2)) {
			// 受け取った2つの文字列を5進数に変換
			fifthNo1 = fc.inputConvertQuinary(inputAddend1);
			fifthNo2 = fc.inputConvertQuinary(inputAddend2);
		} else {
			// 入力が不正の場合
			return;
		}

		// 5進数⇒10進数に変換し、合計を格納する
		int amountNum = Integer.parseInt(fifthNo1, quinaryNum)
				+ Integer.parseInt(fifthNo2, quinaryNum);
		// 10進数での合計を5進数に変換
		String amountFifthNum = Integer.toString(amountNum, quinaryNum);

		// 戻された文字列を出力する
		System.out.println(fc.convertStr(amountFifthNum));
	}
}
