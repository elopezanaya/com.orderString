package com.orderString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.kata.vo.TextVO;

public class OrderStringByLength {

	
	public String[] order(String[] arrayStringsToOrder) {
	
		
		if (arrayStringsToOrder!= null && arrayStringsToOrder.length>0){
			
			List<TextVO> textVoList= new ArrayList<TextVO>();
			
			for (String text : arrayStringsToOrder){
				
				if (!StringUtils.isEmpty(text) && (text.trim().length()>0)) {
					textVoList.add(new TextVO(text.length(), text));
						
				}
				
				
			}
			
			Collections.sort(textVoList, new TextVO());		
			
			System.out.println("HERE : "+ Arrays.deepToString(textVoList.toArray()));
			
			return wrapResult(textVoList);
			
			
		}
		
		return null;
		}


	
	private String[] wrapResult(List<TextVO> textVoList){
		
		String[] result = new String[textVoList.size()];
		int counter =0;
		for (TextVO textVO : textVoList){
			result[counter]= textVO.getText();
			counter++;
		}
		
		return result;
		
	}
}
