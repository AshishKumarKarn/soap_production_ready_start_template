package com.karn.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.karn.pojo.CustomRequest;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{

	@WebMethod String getHelloWorldAsString();

	@WebMethod String getHelloWorldCustom(CustomRequest customRequest);
}
