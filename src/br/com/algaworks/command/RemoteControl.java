package br.com.algaworks.command;

public class RemoteControl {

	Command on [];
	Command off [];
	
	public RemoteControl() {
		on = new Command[2];
		off = new Command[2];
	}
	
	public void setSlot(Command on, Command off, int index) {
		this.on[index] = on;
		this.off[index] = off;
	}
	
	public void buttonOnWasPressed(int slot) {
		this.on[slot].execute();
	}
	
	public void buttonOffWasPressed(int slot) {
		this.off[slot].execute();
	}
}
