package it.exolab.exoecomm.api;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {
		
	private boolean success=true;
	private String err_code;
	private String err;
	private T data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErr_code() {
		return err_code;
	}
	public void setErr_code(String err_code) {
		success=false;
		this.err_code = err_code;
	}
	public String getErr() {
		return err;
	}
	public void setErr(String err) {
		this.err = err;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BaseResponse(String err_code, String err) {
		super();
		this.success = false;
		this.err_code = err_code;
		this.err = err;
		
	}
	
	public BaseResponse(T data) {
		super();
		this.success = true;
		this.data = data;
	}
	public BaseResponse() {
		super();
		
	}

}
