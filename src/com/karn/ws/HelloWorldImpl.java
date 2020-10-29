package com.karn.ws;
import javax.jws.WebService;

import com.karn.pojo.CustomRequest;

//Service Implementation Bean

@WebService(endpointInterface = "com.karn.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	@Override
	public String getHelloWorldCustom(CustomRequest customRequest) {
		// TODO Auto-generated method stub
		return "Hello "+customRequest.getName();
	}

}