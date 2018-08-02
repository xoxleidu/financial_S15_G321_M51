package com.imooc.util;

import org.junit.Test;

public class RSAUtilTest {

    static final String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2+st+hwQfh7iF6UU5uBGYGwyV\n" +
            "8130BkFUX5fXkgpaUf3rtOLVi8SpglN36nocsxhNgRC0qqKQ7Lryh4Y2vYXSPNl7\n" +
            "bRUzGSMEvkDJFLydjyjPoTL5x3issNtSjNcLeuIjWzOXV9wsU22HvcBXKClNwXKk\n" +
            "5vdSszyEl6l9zpRTjQIDAQAB";
    static final String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALb6y36HBB+HuIXp\n" +
            "RTm4EZgbDJXzXfQGQVRfl9eSClpR/eu04tWLxKmCU3fqehyzGE2BELSqopDsuvKH\n" +
            "hja9hdI82XttFTMZIwS+QMkUvJ2PKM+hMvnHeKyw21KM1wt64iNbM5dX3CxTbYe9\n" +
            "wFcoKU3BcqTm91KzPISXqX3OlFONAgMBAAECgYEArguVfg9s45TT9kPw/brQuW6Z\n" +
            "JRRsvI0qnNekdX7K7ChrL0VKMbcVY+q7/CcC6cOMjUQDoOVhZhpWpBQ2nGDfJILg\n" +
            "bVsE0MaeDcIz5bJNJ0gdc/fI0PBEUIQpWUCJOKEBV1TekwBYxUZ+RNA+ytqZnPaW\n" +
            "eu5X1YlV+vRI9B7keaECQQDnm1iHr/8cEnmO/lpgvbVAtyK+O0V5J6Npj45mHKyu\n" +
            "OC8HASJS+E9k5ZS4Zoyn/ojiKHrv53iQX0J9JiDOGZyFAkEAykBZT/BpxsU/7Zcr\n" +
            "s4lRT067Isp2OoJDp0dPCV4AYqD1lrr023I0AViD+jovdE0FUnXoDqXRPHrV6lEx\n" +
            "rTztaQJAHqkuGyhteWXouclqZYw3xo14B/8Iv3VD6OGcVGBPa/D8KM05ogpFWHIc\n" +
            "Mh1BWawUqvv46nGWQGacAr1dcmtpkQJAbdhpKXt/V4+F2vqBp67q1FIEXS7s63YY\n" +
            "XF/kU0gUmXymJclAd3cdO6XheCPl5hp2y4RyFpKEg36LdAnJGze+EQJAdRXtyRnq\n" +
            "RkYD2zpJIWxaM/SOGhZfXwykkNsvR0K4aW1QdVOQxIZBjnYedsgM5sPRZwviCOK5\n" +
            "fyztkAF3B8B1eg==";

    @Test
    public void signTest(){
        String text = "{\"amount\":10,\"chanId\":\"101\",\"chanUserId\":\"U001\",\"createAt\":1533103496000,\"memo\":\"wangwu\",\"outerOrderId\":\"10001\",\"productId\":\"001\"}";
        String sign = RSAUtil.sign(text,privateKey);
        System.out.println(sign);
        System.out.println(RSAUtil.verify(text, sign, publicKey));
    }

}
