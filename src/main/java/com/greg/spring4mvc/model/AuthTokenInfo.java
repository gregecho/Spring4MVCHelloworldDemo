package com.greg.spring4mvc.model;

public class AuthTokenInfo {

	private String Access_token;
	private String Token_type;
	private String Refresh_token;
	private int Expires_in;
	private String Scope;

	public String getAccess_token() {
		return Access_token;
	}

	public void setAccess_token(String access_token) {
		Access_token = access_token;
	}

	public String getToken_type() {
		return Token_type;
	}

	public void setToken_type(String token_type) {
		Token_type = token_type;
	}

	public String getRefresh_token() {
		return Refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		Refresh_token = refresh_token;
	}

	public int getExpires_in() {
		return Expires_in;
	}

	public void setExpires_in(int expires_in) {
		Expires_in = expires_in;
	}

	public String getScope() {
		return Scope;
	}

	public void setScope(String scope) {
		Scope = scope;
	}

}
