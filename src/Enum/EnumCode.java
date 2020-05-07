package Enum;
/**
 * Use:EnumCode.SUCCESS.getCode();
 * @description EnumCode
 * @author JAVASM
 * @date 2020年5月6日
 * @version 1.0
 */
public enum EnumCode {
	UNKNOWN_ERROR("-1", "未知错误"),

    SUCCESS("200", "成功"),

    PARAM_ERROR("201", "参数不合法"),

    DATABASE_ERROR("202", "数据异常");
	
	private String code;
	private String msg;
	
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}


	private EnumCode(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
}
