# kozeium
This a maven project for android mobile test automation with appium selenium and java.
The project dynamically identify connected devices at run time, a dynamic json-device list is then created. 
The states of the devices are also dynamically updated in the list. A device can be in one of the following state (0=no test started, 
1=test is about to be started, 2=test running, 3=test succefully completed, 4=test failed)
    
With this framework you can execute automated test scenarios parallelly on multiple android mobile devices:
1. by running a test scenario simultaneously on different devices (Test scenario 1 is parallely executed on device_1, device_2,... device_n).
2. by running different test scenarios simultaneously each on a dedicated device (test scenario 1  is executed on device_1 while 
tet scenario_2 parallely run on device_2 ... test scenario_n run on device_n).

Jenkins integration: the project can be run and reported in jenkins as maven project. It create a json-report for use with cucumber-report-plugins in jenkins
 
#Required tools and software

1. Eclipse IDE
2. Java 1.8
3. Apache maven 3.0.4
4. Selenium 3.4.0 
5. Appium-java-client 4.1.2
6. Appium 1.7.2
7. Cucumber 1.2.5
8. junit 4.12
8. Jenkins 2.112 (+ maven plugin and cucumber plugin)
9. Android(adb-tool and emulator). 
10. nodeJS, 
11. log4j (optional)

visit my blogfor more details: https://kozeium.blogspot.de
