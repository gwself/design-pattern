package com.yunus.general.ioc;

public class EmailSender implements INotifier {

	public void notify(String message) {
		// 发送Email
		System.out.println("Send email, message : " + message);
	}

}
