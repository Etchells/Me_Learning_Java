package com.me.morse_code_task;

public class Runner {

	public static void main(String[] args) {
		
        MorseTranslator printCode = new MorseTranslator();
        
        System.out.println(printCode.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        System.out.println(printCode.translate(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
        System.out.println(printCode.translate("--. .-.. . -. -. / -. . . -.. ... / .- / -... .-. . .- -.- --..-- / -- .- -.-- -... . / .---- ..... / -- .. -. ... .-.-.-"));
        
        System.out.println("\n");
        
        System.out.println(printCode.NoStreamTranslate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        
        
	}
}
