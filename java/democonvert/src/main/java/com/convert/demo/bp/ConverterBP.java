package com.convert.demo.bp;



import com.convert.demo.model.ConverterModel;
import com.convert.demo.model.ResponseModel;
import com.convert.demo.util.Currency;

import java.math.BigDecimal;

public interface ConverterBP {
	
	public ResponseModel getConvertedValue(Currency source, Currency target, BigDecimal amount);
	public ConverterModel getConverterModel();

}
