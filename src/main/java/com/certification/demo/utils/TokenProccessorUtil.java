/**
 * 生成Token的工具类：
 */
package com.certification.demo.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * 生成Token的工具类
 * 
 * @author lijn
 *
 */
public class TokenProccessorUtil {

	private TokenProccessorUtil() {
	};

	private static final TokenProccessorUtil instance = new TokenProccessorUtil();

	public static TokenProccessorUtil getInstance() {
		return instance;
	}

	/**
	 * 生成Token
	 * 
	 * @return
	 */
	public String makeToken() {
		String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest(token.getBytes());
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(md5);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}
