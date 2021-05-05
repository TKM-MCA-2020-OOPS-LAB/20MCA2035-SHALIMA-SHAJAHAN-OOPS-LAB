package myproject;

import myproject.CPU.Processor;
import myproject.CPU.RAM;

class CPU {
	double price;
	class Processor {
		
		double cores=5.55;
		String manufacturer="intel";
		
		double getCache() {
			return 4.3;
			
		}
	}
	protected class RAM{
		
		double memory=128;
		String manufacturer="intel";
		double getClockSpeed() {
			return 5.5;
			
		}
	}
}
public class main {
	public static void main(String[] args) {
		
		CPU cpu  = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		
		System.out.println("Processor name="+processor.manufacturer);
		System.out.println("Processor core="+processor.cores);
		System.out.println("Ram name="+ram.manufacturer);
		System.out.println("Ram memory space="+ram.memory);
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("Ram Clock speed="+ram.getClockSpeed());
	}
	
		
	}
	


