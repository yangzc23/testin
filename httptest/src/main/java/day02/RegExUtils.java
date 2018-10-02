package day02;

public class RegExUtils {
    //��֤���֤�����������ʽ
    private static final String IDENTITY_CARD = "^\\d{15}|\\d{18}$";
    //��֤���������������ʽ
    private static final String ZIP_CODE = "^[1-9][0-9]{5}$";
    //�����ֻ������������ʽ
    private static final String PHONE_NUMBER = "^(13[0-9]{9})|(15[89][0-9]{8})$";
    /**
     * ����ַ���str�Ƿ��������ʽregexƥ��
     * 
     * @param str
     *            �ַ���
     * @param regex
     *            ������ʽ
     * @return ����ַ���str��������ʽregexƥ��,����true�����򣬷���false
     */
    private static boolean check(String str, String regex) {
        return str.matches(regex);
    }
    /**
     * ����Ƿ�Ϊ�Ϸ������֤����
     * 
     * @param str
     *            ���֤�����ַ���
     * @return ������֤�����ַ�����������ʽƥ���򷵻�true�����򷵻�false
     */
    public static boolean identityCard(String str) {
        return check(str, IDENTITY_CARD);
    }
    /**
     * ����Ƿ�Ϊ�Ϸ�����������
     * 
     * @param str
     *            ���������ַ���
     * @return ������������ַ�����������ʽƥ���򷵻�true�����򷵻�false
     */
    public static boolean zipcode(String str) {
        return check(str, ZIP_CODE);
    }
    /**
     * ����Ƿ�Ϊ�Ϸ����ֻ�����
     * 
     * @param str
     *            �ֻ������ַ���
     * @return ����ֻ������ַ�����������ʽƥ���򷵻�true�����򷵻�false
     */
    public static boolean phoneNumber(String str) {
        return check(str, PHONE_NUMBER);
    }
}

