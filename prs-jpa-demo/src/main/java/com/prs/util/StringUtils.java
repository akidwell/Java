package com.prs.util;

import com.prs.business.Vendor;

public class StringUtils {

    public static String padWithSpaces(String s, int length) {
        if (s.length() < length) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < length) {
                sb.append(" ");
            }
            return sb.toString();
        } else {
            return s.substring(0, length);
        }
    }

	public static Object padWithSpaces(Vendor vendor, int length) {
		// TODO Auto-generated method stub
		return null;
	}
}
