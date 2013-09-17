package com.fmall.springmvc.utils.tech.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtilFactory {
	public static LoggerUtil getLogger(Class claz){
		return new LoggerUtil(claz);
	}
	
	public static class LoggerUtil{
		private static final String COMMENT="********************";
		private Logger logger;
		private Class claz;
		private LoggerUtil(){};
		public LoggerUtil( Class claz) {
			super();
			this.claz = claz;
			this.logger = LoggerFactory.getLogger(claz);
			
		}
		
		public void trace(Object obj){
			if(logger.isTraceEnabled()){
				logger.trace(COMMENT+obj.toString()+COMMENT);
			}
		}
		public void info(Object obj){
			if(logger.isInfoEnabled()){
				logger.debug(COMMENT+obj.toString()+COMMENT);
			}
		}
		public void debug(Object obj){
			if(logger.isDebugEnabled()){
				logger.debug(COMMENT+obj.toString()+COMMENT);
			}
		}
		public void error(String title ,Throwable e){
			if(logger.isErrorEnabled()){
				logger.error(COMMENT+title+COMMENT,e);
			}
		}
	}
	
	public static void main(String[] args) {
		LoggerUtil lu = LoggerUtilFactory.getLogger(LoggerUtil.class);
		lu.info("sssss");
	}
}
