package utils;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.TimeZone;

/**
 * @author wen
 * @apiNote RConstants
 * @since 2022-05-27
 */
public interface RConstants {

    interface Num {

        int INT_0 = 0;
        int INT_1 = 1;
        int INT_2 = 2;
        int INT_3 = 3;
        int INT_4 = 4;
        int INT_5 = 5;
        int INT_6 = 6;
        int INT_7 = 7;
        int INT_8 = 8;
        int INT_9 = 9;
        int INT_10 = 10;
        int INT_15 = 15;
        int INT_16 = 16;
        int INT_20 = 20;
        int INT_23 = 23;
        int INT_24 = 24;
        int INT_30 = 30;
        int INT_48 = 48;
        int INT_49 = 49;
        int INT_50 = 50;
        int INT_59 = 59;
        int INT_60 = 60;
        int INT_100 = 100;
        int INT_200 = 200;
        int INT_256 = 256;
        int INT_300 = 300;
        int INT_490 = 490;
        int INT_500 = 500;
        int INT_1000 = 1000;
        int INT_1002 = 1002;
        int INT_999999 = 999999;
        int INT_100000 = 100000;
        int INT_1000000 = 1000000;
        int INT_100000000 = 100000000;

        Integer MINUS_INTEGER_1 = -1;
        Integer MINUS_INTEGER_2 = -2;
        Integer INTEGER_0 = 0;
        Integer INTEGER_1 = 1;
        Integer INTEGER_2 = 2;
        Integer INTEGER_3 = 3;
        Integer INTEGER_4 = 4;
        Integer INTEGER_5 = 5;
        Integer INTEGER_6 = 6;
        Integer INTEGER_7 = 7;
        Integer INTEGER_8 = 8;
        Integer INTEGER_9 = 9;
        Integer INTEGER_10 = 10;
        Integer INTEGER_11 = 11;
        Integer INTEGER_13 = 13;
        Integer INTEGER_14 = 14;
        Integer INTEGER_15 = 15;

        Integer INTEGER_26 = 26;
        Integer INTEGER_30 = 30;
        Integer INTEGER_31 = 31;
        Integer INTEGER_32 = 32;
        Integer INTEGER_33 = 33;

        Integer INTEGER_100 = 100;
        Integer INTEGER_300 = 300;
        Integer INTEGER_500 = 500;

        Integer INTEGER_1032 = 1032;
        Integer INTEGER_1031 = 1031;
        Integer INTEGER_1033 = 1033;
        Integer INTEGER_1034 = 1034;


        Long LONG_0 = 0L;
        Long LONG_1 = 1L;
        Long LONG_2 = 2L;

        Long LONG_5 = 5L;

        Long LONG_8 = 8L;
        Long LONG_60 = 60L;
        Long LONG_500 = 500L;
        Long MINUS_LONG_1 = -1L;

        long MINUS_BASE_LONG_1 = -1L;
        long MINUS_BASE_LONG_7 = -7L;
        long BASE_LONG_0 = 0L;
        long BASE_LONG_1 = 1L;
        long BASE_LONG_2 = 2L;
        long BASE_LONG_3 = 3L;
        long BASE_LONG_5 = 5L;
        long BASE_LONG_7 = 7L;
        long BASE_LONG_9 = 9L;
        long BASE_LONG_10 = 10L;
        long BASE_LONG_20 = 20L;
        long BASE_LONG_30 = 30L;
        long BASE_LONG_50 = 50L;

        long BASE_LONG_60 = 60L;

        long BASE_LONG_300 = 300L;
        long BASE_LONG_500 = 500L;
        long BASE_LONG_800 = 800L;
        long BASE_LONG_100 = 100L;
        long BASE_LONG_1000 = 1000L;
        long BASE_LONG_3000 = 3000L;
        long BASE_LONG_5000 = 5000L;
        long BASE_LONG_10000 = 10000L;
        long BASE_LONG_NO_ID = 1111123456789999090L;
        long BASE_LONG_ACC_STEP_ID = 1200123456789999090L;
        long BASE_LONG_ACC_STEP_ID_V2 = 28621L;
        long BASE_LONG_LIVE_ROOM_STEP_ID = 1200987654321999090L;

        long BASE_LONG_LIVE_ROOM_STEP_ID_V2 = 1013650L;

        BigDecimal DECIMAL_D5 = new BigDecimal(Str.NUM_D5);
        BigDecimal DECIMAL_D6 = new BigDecimal(Str.NUM_D6);
        BigDecimal DECIMAL_D3 = new BigDecimal(Str.NUM_D3);
        BigDecimal DECIMAL_D4 = new BigDecimal(Str.NUM_D4);
        BigDecimal MINUS_DECIMAL_10000000 = new BigDecimal(Str.MINUS_NUM_10000000);
        BigDecimal DECIMAL_D7 = new BigDecimal(Str.NUM_D7);
        BigDecimal DECIMAL_1 = new BigDecimal(Str.NUM_1);
        BigDecimal DECIMAL_3 = new BigDecimal(Str.NUM_3);
        BigDecimal DECIMAL_D01 = new BigDecimal(Str.NUM_D01);
        BigDecimal DECIMAL_D05 = new BigDecimal(Str.NUM_D05);
        BigDecimal DECIMAL_D1 = new BigDecimal(Str.NUM_D1);
        BigDecimal DECIMAL_35 = new BigDecimal(Str.NUM_35);
        BigDecimal DECIMAL_45 = new BigDecimal(Str.NUM_45);
        BigDecimal DECIMAL_50 = new BigDecimal(Str.NUM_50);
        BigDecimal DECIMAL_100 = new BigDecimal(Str.NUM_100);
        BigDecimal DECIMAL_300 = new BigDecimal(Str.NUM_300);
        BigDecimal DECIMAL_350 = new BigDecimal(Str.NUM_350);
        BigDecimal DECIMAL_450 = new BigDecimal(Str.NUM_450);
        BigDecimal DECIMAL_500 = new BigDecimal(Str.NUM_500);
        BigDecimal DECIMAL_600 = new BigDecimal(Str.NUM_600);

        BigDecimal DECIMAL_5000 = new BigDecimal(Str.NUM_5000);
        BigDecimal DECIMAL_10000 = new BigDecimal(Str.NUM_10000);

        Integer INT_11 = 11;
        Long LONG_5000 = 5000L;

        Double DOUBLE_0 = 0D;

        Double MINUS_DOUBLE_1 = -1D;
        Double DOUBLE_1 = 1D;
        Long LONG_10 = 10L;
        Long LONG_3 = 3L;
        Long LONG_4 = 4L;
        int INT_12 = 12;

        int INT_64 = 64;


        int MINUS_INT_1 = -1;

        int INT_10000 = 10000;
        int INT_8999999 = 8999999;
        int INT_9999999 = 9999999;

        Integer INTEGER_66 = 66;
        Integer INTEGER_666 = 666;
        Long LONG_30 = 30L;
        Long LONG_100 = 100L;
        Long LONG_200 = 200L;

        long BASE_LONG_12 = 12L;

        long BASE_LONG_27 = 27L;
        long BASE_LONG_200 = 200L;
        long BASE_LONG_1000000 = 1000000L;
        long BASE_LONG_1000000_0000000 = 10000000000000L;

        long BASE_LONG_10000_0000 = 100000000L;

        BigDecimal DECIMAL_D8 = new BigDecimal(Str.NUM_D8);
        BigDecimal DECIMAL_10 = new BigDecimal(Str.NUM_10);

        double BASE_DOUBLE_50 = 50D;
        double BASE_DOUBLE_150 = 150D;

        Integer CONST_200 = 200;
    }

    interface Str {

        String CH_COMMA = "，";
        String CH_SPACE = " ";

        String NUM_0 = "0";
        String NUM_1 = "1";
        String NUM_2 = "2";
        String NUM_3 = "3";
        String NUM_4 = "4";
        String NUM_5 = "5";
        String NUM_6 = "6";
        String NUM_7 = "7";
        String NUM_8 = "8";
        String NUM_9 = "9";
        String NUM_10 = "10";
        String NUM_30 = "30";
        String NUM_35 = "35";
        String NUM_45 = "45";
        String NUM_50 = "50";
        String NUM_100 = "100";
        String NUM_D01 = "0.01";
        String NUM_D05 = "0.05";
        String NUM_D1 = "0.1";
        String NUM_D3 = "0.3";
        String NUM_D4 = "0.4";
        String NUM_D5 = "0.5";
        String NUM_D6 = "0.6";
        String NUM_D7 = "0.7";
        String NUM_D8 = "0.8";
        String NUM_300 = "300";
        String NUM_350 = "350";
        String NUM_450 = "450";
        String NUM_500 = "500";
        String NUM_600 = "600";

        String NUM_5000 = "5000";
        String NUM_10000 = "10000";
        String MINUS_NUM_1 = "-1";
        String MINUS_NUM_10000000 = "-10000000";

        String SYMBOL_UNDERSCORE = "_";

        String EMPTY_JSON_ARRAY = "[]";

        String EMPTY_JSON_OBJECT = "{}";

        String TIME_SUFFIX = "_time";

        String ID_SUFFIX = "_id";

        String CONST_NULL = "null";

        String CONST_JIN = "#";

        String CONST_SHA256 = "SHA256";

        /**
         * 特殊字符集
         */
        String CONST_SPECIAL_STR = ".*[*?（）()!&￥$%^#,./@\";:><\\]\\[}{\\-=+_\\\\|》《。，、？’‘“”~`）﹕︰—﹡﹦°゜ˉ￣﹒．∕∥﹨╲﹐！﹔﹑丶ヽ﹗‵′〃₪﹖〝˙·；…‥〞﹤﹥‧].*$";

        String CONST_CN = "CN";

        String CONST_JY = "JY";

        String CONST_NO = "NO";

        String CONST_1_RATE = "1:";


        String NUM_100000 = "100000";

        String CONST_TX = "TX";

        String CONST_TD = "TD";

        String AMPERSAND = "&";
        String AND = "and";
        String AT = "@";
        String ASTERISK = "*";
        String STAR = ASTERISK;
        String BACK_SLASH = "\\";
        String COLON = ":";
        String COMMA = ",";
        String DASH = "-";
        String DOLLAR = "$";
        String DOT = ".";
        String DOTDOT = "..";
        String DOT_CLASS = ".class";
        String DOT_JAVA = ".java";
        String DOT_XML = ".xml";
        String EMPTY = "";
        String EQUALS = "=";
        String FALSE = "false";
        String SLASH = "/";
        String HASH = "#";
        String HAT = "^";
        String LEFT_BRACE = "{";
        String LEFT_BRACKET = "(";
        String LEFT_CHEV = "<";
        String DOT_NEWLINE = ",\n";
        String NEWLINE = "\n";
        String N = "n";
        String NO = "no";
        String NULL = "null";
        String OFF = "off";
        String ON = "on";
        String PERCENT = "%";
        String PIPE = "|";
        String PLUS = "+";
        String QUESTION_MARK = "?";
        String EXCLAMATION_MARK = "!";
        String QUOTE = "\"";
        String RETURN = "\r";
        String TAB = "\t";
        String RIGHT_BRACE = "}";
        String RIGHT_BRACKET = ")";
        String RIGHT_CHEV = ">";
        String SEMICOLON = ";";
        String SINGLE_QUOTE = "'";
        String BACKTICK = "`";
        String SPACE = " ";
        String TILDA = "~";
        String LEFT_SQ_BRACKET = "[";
        String RIGHT_SQ_BRACKET = "]";
        String TRUE = "true";
        String UNDERSCORE = "_";
        String UTF_8 = "UTF-8";
        String US_ASCII = "US-ASCII";
        String ISO_8859_1 = "ISO-8859-1";
        String Y = "y";
        String YES = "yes";
        String ONE = "1";
        String ZERO = "0";
        String DOLLAR_LEFT_BRACE = "${";
        String HASH_LEFT_BRACE = "#{";
        String CRLF = "\r\n";

        String HTML_NBSP = "&nbsp;";
        String HTML_AMP = "&amp";
        String HTML_QUOTE = "&quot;";
        String HTML_LT = "&lt;";
        String HTML_GT = "&gt;";

        String[] EMPTY_ARRAY = new String[0];

        byte[] BYTES_NEW_LINE = NEWLINE.getBytes();

        /**
         * GBK 字符集
         */
        String GBK = "GBK";

        /**
         * RMI 远程方法调用
         */
        String LOOKUP_RMI = "rmi://";

        /**
         * LDAP 远程方法调用
         */
        String LOOKUP_LDAP = "ldap://";

        /**
         * http请求
         */
        String HTTP = "http://";

        /**
         * https请求
         */
        String HTTPS = "https://";
        String CONST_IMG = "img";
        String CONST_SRC = "src";
        String DOT3 = "...";
        String CONST_DATA = "data";
        String CONST_POST = "post";
        /**
         * token头部认证RFC和HTTP标准头
         */
        String AUTH_BEARER = "Bearer";

        String CONST_OK = "ok";

        String CONST_CNY = "CNY";

        String CONST_AES = "AES";

        String CONST_SUCCESS = "SUCCESS";

        String CONST_UN_KNOW = "UN_KNOW";

        String CONST_CONTENT_TYPE = "Content-Type";

        String REQUEST_PARAMS_KEY = "REQUEST_PARAMS_KEY";

        String REQUEST_POST_BODY = "REQUEST_POST_BODY";

        String CONST_MULTIPART = "multipart/";

        String CONST_CONTENT_LENGTH = ", contentLength:";

        String CONST_Q = ":q";

        String RESP_CODE = "00";

        String CONST_ACC = "acc";

        String CONST_RM = "rm";
        String CONST_MQ = "MQ_";
        String CONST_R = "r";
        String CONST_V2 = "_v2";

        String CONST_H = "h_";

    }

    interface Time {

        TimeZone TIME_ZONE_GMT8 = TimeZone.getDefault();

        /**
         * 1小时时间戳
         */
        long HOUR_1_OF_MILLI = 60 * 60 * 1000L;

        /**
         * 3小时时间戳
         */
        long HOUR_3_OF_MILLI = 3 * 60 * 60 * 1000L;

        /**
         * 6小时时间戳
         */
        long HOUR_6_OF_MILLI = 6 * 60 * 60 * 1000L;

        /**
         * 24小时时间戳
         */
        long HOUR_24_OF_MILLI = 24 * 60 * 60 * 1000L;

        /**
         * 3分钟时间戳
         */
        long MINUTE_3_OF_MILLI = 3 * 60 * 1000L;

        /**
         * 1分钟时间戳
         */
        long MINUTE_1_OF_MILLI = 60 * 1000L;

        /**
         * 30秒时间戳
         */
        long SECOND_30_OF_MILLI = 30 * 1000L;

        /**
         * 33秒时间戳
         */
        long SECOND_33_OF_MILLI = 33 * 1000L;

        /**
         * 2秒时间戳
         */
        long SECOND_2_OF_MILLI = 2 * 1000L;

        /**
         * 0.5秒时间戳
         */
        long SECOND_D5_OF_MILLI = 500L;

        /**
         * 7天时间戳
         */
        long DAYS_7_OF_MILLI = 7 * 24 * 60 * 60 * 1000L;

        /**
         * 6天时间戳
         */
        long DAYS_6_OF_MILLI = 6 * 24 * 60 * 60 * 1000L;

        /**
         * 1小时秒值
         */
        long HOUR_1_OF_SECONDS = 60 * 60L;

        /**
         * 2小时秒值
         */
        long HOUR_2_OF_SECONDS = 2 * 60 * 60L;

        /**
         * 1天秒值
         */
        long DAYS_1_OF_SECONDS = 24 * 60 * 60L;

        /**
         * 5分钟秒值
         */
        long MINUTE_5_OF_SECONDS = 5 * 60L;

        /**
         * 1分钟秒值
         */
        long MINUTE_1_OF_SECONDS = 60L;

        /**
         * 10分钟秒值
         */
        long MINUTE_10_OF_SECONDS = 10 * 60L;

        /**
         * 3分钟秒值
         */
        long MINUTE_3_OF_SECONDS = 3 * 60L;

        /**
         * LocalTime时间 00:00:01
         */
        LocalTime LOCAL_TIME_0 = LocalTime.of(Num.INT_0, Num.INT_0, Num.INT_1);

        /**
         * LocalTime时间 00:30:01
         */
        LocalTime LOCAL_TIME_30 = LocalTime.of(Num.INT_0, Num.INT_30, Num.INT_1);

        /**
         * LocalTime时间 23:59:59
         */
        LocalTime LOCAL_TIME_23 = LocalTime.of(Num.INT_23, Num.INT_59, Num.INT_59);

        /**
         * 1秒时间戳
         */
        long SECONDS_1_OF_MILLI = 1000L;

        /**
         * 5秒时间戳
         */
        long SECONDS_5_OF_MILLI = 5000L;

        /**
         * 10秒时间戳
         */
        long SECONDS_10_OF_MILLI = 10_000L;

        /**
         * 30秒时间戳
         */
        long SECONDS_30_OF_MILLI = 30_000L;

        /**
         * 1分钟时间戳
         */
        long MINUTES_1_OF_MILLI = 60_000L;

        /**
         * 5分钟时间戳
         */
        long MINUTES_5_OF_MILLI = 5 * 60 * 1000L;

        /**
         * 7天时间秒
         */
        int DAYS_7_OF_SECONDS = 7 * 24 * 60 * 60;

        /**
         * 3个月秒值
         */
        long MONTH_3_OF_SECONDS = 3 * 30 * 24 * 60 * 60L;

        /**
         * 24小时时间戳
         */
        long SECOND_180_OF_MILLI = 3 * 60 * 1000L;

        /**
         * 2022年07月01日时间戳
         */
        long TIME_20220701_OF_MILLI = 1656604800000L;

        long MINUTES_15_OF_SECONDS = 900L;

    }

}
