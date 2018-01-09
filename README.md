# Archetype for Vaadin + Spring Boot projects

This is a WIP archetype for Vaadin + Spring Boot projects. The result is pretty much the same as you get from
[start.spring.io](https://start.spring.io/), but with a UI class with an integration to a dummy Spring service.

Note, the archetype is not regularly update to contain the latest Vaadin bugfix release, so check the latest version from vaadin.com/releases or use LATEST.

Until the final version is out, you can use the SNAPSHOT with following command:

    mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
        -DarchetypeGroupId=in.virit  \
        -DarchetypeArtifactId=spring-app-archetype  \
        -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
        -DarchetypeVersion=0.0.1-SNAPSHOT

