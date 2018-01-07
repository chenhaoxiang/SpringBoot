package cn.chenhaoxiang.enums;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/7.
 * Time: 下午 3:31.
 * Explain:
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    ERROR(0,"失败"),
    SUCCESS(1,"成功"),
    FLUNK(100,"不及格"),
    WELL(101,"良好")
    ;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private  String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
