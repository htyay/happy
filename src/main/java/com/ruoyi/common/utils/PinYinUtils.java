/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PinYinUtils
 * Author:   YAY
 * Date:     2019-05-02 21:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ruoyi.common.utils;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * 〈〉
 * @author YAY
 * @create 2019-05-02
 * @since 1.0.0
 */
public class PinYinUtils {
    /**
     * 获取汉字首字母的方法。如： 张三 --> ZS
     * 说明：暂时解决不了多音字的问题，只能使用取多音字的第一个音的方案
     * @param hanzi 汉子字符串
     */
    public static String getHanziInitials(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                // 逐个汉字进行转换， 每个汉字返回值为一个String数组（因为有多音字）
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                    sb.append(stringArray[0].charAt(0));
            }
            if(sb.length() > 0) {
                result = sb.toString().toUpperCase();
            }
        }
        return result;
    }
        /**
         * 获取汉字拼音的方法。如： 张三 --> zhangsan
         * 说明：暂时解决不了多音字的问题，只能使用取多音字的第一个音的方案
         * @param hanzi 汉子字符串
         * @return 汉字拼音; 如果都转换失败,那么返回null
         */
    public static String getHanziPinYin(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                // 逐个汉字进行转换， 每个汉字返回值为一个String数组（因为有多音字）
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if(null != stringArray) {
                    // 把第几声这个数字给去掉
                   // sb.append(stringArray[0].replaceAll("\\d", ""));
                    sb.append(stringArray[0]);
                }
            }
            if(sb.length() > 0) {
                result = sb.toString();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(PinYinUtils.getHanziInitials("袁素芳"));
        System.out.println(PinYinUtils.getHanziPinYin("单"));
    }
}