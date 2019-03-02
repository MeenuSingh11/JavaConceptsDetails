package com.Interviews.programs;

public class RemoveJunk {

	public static void main(String[] args) {
		String str = "meenusingh#$$%%^&&&";
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);

	}

}
