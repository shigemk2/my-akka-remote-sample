FROM docker.io/java:openjdk-8-jdk

ENV ACTIVATOR_VER 1.3.10
 
RUN apt-get install -y unzip

RUN cd /opt \
 && wget http://downloads.typesafe.com/typesafe-activator/${ACTIVATOR_VER}/typesafe-activator-${ACTIVATOR_VER}.zip \
 && unzip typesafe-activator-${ACTIVATOR_VER}.zip \
 && ln -s /opt/activator-dist-${ACTIVATOR_VER} /opt/activator \
 && rm -f /opt/typesafe-activator-${ACTIVATOR_VER}.zip
 
# Define an entry point.
CMD cd /opt/src/ && /opt/activator/bin/activator "runMain com.server.RemoteServerApp"

