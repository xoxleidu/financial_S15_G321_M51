package com.imooc.seller.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 签名服务
 */
@Service
public class SignService {

    static Map<String,String> PUBLIC_KEYS = new HashMap<>();
    static {
        PUBLIC_KEYS.put("1000","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2+st+hwQfh7iF6UU5uBGYGwyV\n" +
                "8130BkFUX5fXkgpaUf3rtOLVi8SpglN36nocsxhNgRC0qqKQ7Lryh4Y2vYXSPNl7\n" +
                "bRUzGSMEvkDJFLydjyjPoTL5x3issNtSjNcLeuIjWzOXV9wsU22HvcBXKClNwXKk\n" +
                "5vdSszyEl6l9zpRTjQIDAQAB");
    }

    public String getPublicKey(String authId){
        return PUBLIC_KEYS.get(authId);
    }

}
