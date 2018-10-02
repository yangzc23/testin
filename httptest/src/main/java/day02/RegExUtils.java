package day02;

public class RegExUtils {
    //验证身份证号码的正则表达式
    private static final String IDENTITY_CARD = "^\\d{15}|\\d{18}$";
    //验证邮政编码的正则表达式
    private static final String ZIP_CODE = "^[1-9][0-9]{5}$";
    //正则手机号码的正则表达式
    private static final String PHONE_NUMBER = "^(13[0-9]{9})|(15[89][0-9]{8})$";
    /**
     * 检查字符串str是否和正则表达式regex匹配
     * 
     * @param str
     *            字符串
     * @param regex
     *            正则表达式
     * @return 如果字符串str和正则表达式regex匹配,返回true，否则，返回false
     */
    private static boolean check(String str, String regex) {
        return str.matches(regex);
    }
    /**
     * 检测是否为合法的身份证号码
     * 
     * @param str
     *            身份证号码字符串
     * @return 如果身份证号码字符串和正则表达式匹配则返回true，否则返回false
     */
    public static boolean identityCard(String str) {
        return check(str, IDENTITY_CARD);
    }
    /**
     * 检测是否为合法的邮政编码
     * 
     * @param str
     *            邮政编码字符串
     * @return 如果邮政编码字符串和正则表达式匹配则返回true，否则返回false
     */
    public static boolean zipcode(String str) {
        return check(str, ZIP_CODE);
    }
    /**
     * 检测是否为合法的手机号码
     * 
     * @param str
     *            手机号码字符串
     * @return 如果手机号码字符串和正则表达式匹配则返回true，否则返回false
     */
    public static boolean phoneNumber(String str) {
        return check(str, PHONE_NUMBER);
    }
}

