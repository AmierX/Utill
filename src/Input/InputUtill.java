package Input;

import java.util.Objects;
import java.util.Scanner;
/**
 * Use:InputUtill.inputInt/inputStr()
 * @description InputUtill
 * @author JAVASM
 * @date 2020年5月6日
 * @version 1.0
 */
public class InputUtill {
	private static Scanner input;
	static {
		input = new Scanner(System.in);
	}
	public static int inputInt() {
		return input.nextInt();
	}
	public static String inputStr(String regex,String msg) {
		Objects.requireNonNull(regex);
		while(true) {
			String put = input.nextLine();
			if(put.matches(regex)) {
				return put;
			}else {
				System.out.println(msg);
			}
		}
	}
}
