package com.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{
	@Autowired
	@Qualifier("snapdragone")
	private Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}
	
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	
	public void specification()
	{
		System.out.println("Samsung Phone");
		cpu.process();
	}
}
