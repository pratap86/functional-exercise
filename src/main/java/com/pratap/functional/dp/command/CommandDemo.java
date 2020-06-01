package com.pratap.functional.dp.command;

public class CommandDemo {

	public static void main(String[] args) {

		AC ac1 = new AC();
		AC ac2 = new AC();
		
		ACAutomationRemote remote = new ACAutomationRemote();
		
		remote.setCommand( () -> ac2.turnOn() );
		remote.buttonPressed();
	}

}
