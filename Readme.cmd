java -jar  -Dwebdriver.chrome.driver="chromedriver.exe" selenium-server-standalone-3.0.1.jar -role hub

java -jar  -Dwebdriver.chrome.driver="chromedriver.exe" selenium-server-standalone-3.0.1.jar -role node -hub http://localhost:4444/grid/register -browser "browserName=chrome,version=ANY,platform=WINDOWS,maxInstances=20" -maxSession 20