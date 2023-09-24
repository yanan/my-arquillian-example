package my.liferay.service.impl;

import org.osgi.service.component.annotations.Component;

import my.liferay.service.MyService;

@Component(immediate = true, service=MyService.class)
public class MyServiceImpl implements MyService {

	@Override
	public String myOutput() {
		return "Hello World";
	}

}
