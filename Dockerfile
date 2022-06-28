FROM tomcat:9.0.46

COPY ./build/libs/webapp.war $CATALINA_HOME/webapps/
