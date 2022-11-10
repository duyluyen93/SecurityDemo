FROM tomcat:9.0.8-jre8-alpine

# fixed path for copying
COPY /target/SecurityDemo.war /usr/local/tomcat/webapps/

# test 123
CMD ["catalina.sh", "run"]
