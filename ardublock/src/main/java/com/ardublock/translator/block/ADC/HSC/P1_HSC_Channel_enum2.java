package com.ardublock.translator.block.ADC.HSC;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class P1_HSC_Channel_enum2 extends TranslatorBlock {

	public P1_HSC_Channel_enum2(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{		
			return codePrefix + "2" + codeSuffix;
		}
}