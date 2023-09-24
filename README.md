# Sample liferay workspace project

The liferay workspace project is built with gradle with liferay dxp portal 7.4 U93. And it includes a sample service project and a test project for the service project.

## Service project

The name of service project is `my-service` which is located in `my-arquillian-ws/modules`. The method `myOutput` will return a String "Hello World" in `MyServiceImpl.java`.

## Test project for the service project

The name of the test project is `my-service-test`, it assert the service is not null and can returns a correct String in the test. The test project is also located in `my-arquillian-ws/modules` with some dependencies configured

* com.liferay.arquillian.extension.junit.bridge
* junit
* com.liferay.portal.test.integration

## How to run the test

The project is built on JDK 1.8, while it will prmopt one of the dependencies requires jdk 11, so we need to switch to JDK 11 for now to run the test
* run `gw initBundle` in the liferay-wrokspace project, then the 7.4 U93 server will be located in `my-arquillian-ws/bundles` by default
* run `gw testIntegration --tests MyServiceIntegrationTest.testMyOutputService`
