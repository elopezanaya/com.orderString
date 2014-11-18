package com.kata.vo;

import java.util.Comparator;

public class TextVO implements Comparator<TextVO> , Comparable<TextVO>{
	
	
	private int length ;
	private String text;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TextVO(int length, String text) {
		super();
		this.length = length;
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextVO other = (TextVO) obj;
		if (length != other.length)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TextVO [length=" + length + ", text=" + text + "]";
	}
	public int compareTo(TextVO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int compare(TextVO o1, TextVO o2) {
	
		
		return o1.length-o2.length;
	}

	public TextVO() {
		// TODO Auto-generated constructor stub
	}

}
