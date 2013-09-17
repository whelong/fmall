package com.fmall.springmvc.convertor.interfaces;

public interface Convertor {
	public <T,S> T toVO(S s);
	public <T,S> S fromVo(T t);
}
