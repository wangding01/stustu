package com.shuttle.common.utils;

/**
 * 返回消息对像
 * 
 * @author admin
 *
 */
public class Response {
	/**
	 * 返回消息状态码(必填)，0 失败, 1 成功
	 */
	private int errCode = 0;

	/**
	 * 返回消息文本(可选)
	 */
	private String msg = "";

	/**
	 * 返回值(可选)
	 */
	private Object result;

	public int getErrCode() {
		return errCode;
	}

	/**
	 * 返回消息状态码(必填)，0 失败, 1 成功
	 */
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
