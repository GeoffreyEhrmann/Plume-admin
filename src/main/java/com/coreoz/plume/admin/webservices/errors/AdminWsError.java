package com.coreoz.plume.admin.webservices.errors;

import com.coreoz.plume.jersey.errors.WsError;

public enum AdminWsError implements WsError {

	WRONG_LOGIN_OR_PASSWORD,
	TOO_MANY_WRONG_ATTEMPS,
	EMAIL_ALREADY_EXISTS,
	USERNAME_ALREADY_EXISTS,
	PASSWORDS_DIFFERENT

}
