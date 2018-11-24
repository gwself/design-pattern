package com.yunus.behavior.command;

// Client
public class FileSystemClient {

	public static void main(String[] args) {
		// creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		// creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		// creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		
		// perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();

	}

}
