package com.yunus.behavior.command;

// Invoker
public class FileInvoker {

	private Command command;
	
	public FileInvoker(Command c) {
		this.command = c;
	}
	
	public void execute() {
		this.command.execute();
	}
}
