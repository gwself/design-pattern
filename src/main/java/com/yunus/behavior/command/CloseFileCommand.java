package com.yunus.behavior.command;

// Concrete Command
public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}
