package EncodeAndDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodePassword {

	public static void main(String[] args) {
		
		String pswd = "admin123";
		byte[] encode = Base64.encodeBase64(pswd.getBytes());
		System.out.println("Encoded String is "+new String(encode));
		
		byte[] decoded = Base64.decodeBase64(encode);
		System.out.println("Decoded String is "+ new String(decoded));
		

	}

}
