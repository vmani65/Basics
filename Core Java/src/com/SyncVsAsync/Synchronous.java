package com.SyncVsAsync;

import com.LinkedList.Util;

public class Synchronous {

	public static void main(String[] args) {
		(Util.getTreeMap()).forEach((k,v) -> {
			System.out.println(k+v);
		});
		System.out.println("This line will not be printed until the completion of above loop");
	}
}
