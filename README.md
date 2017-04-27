# Skeleton of project spring boot with spring data jpa and wildfly 
Skeleton of project spring boot javaee container with wildfly

## Requirements
For this implementation you need the following items with current versions or higher

[JDK 8][1], [Lombok][2], [Maven][3], [PostgreSQL 9.4][4], [Wildfly][5]

## Setting up wildfly

### PostgreSql Driver
In the "${jboss_home}/modules/system/layers/base", create the following folder structure: "org/postgresql/main". 
Download [postgresql-9.4.1211][6] and unzip download inside the created folder. Create a module.xml file with the following content :
```
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.1" name="org.postgresql">
	<resources>
		<resource-root path="postgresql-9.4.1211.jar"/>
	</resources>
	<dependencies>
		<module name="javax.api"/>
		<module name="javax.transaction.api"/>
	</dependencies>
</module>
```

### Standalone.xml
-
[1]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[2]: https://projectlombok.org/
[3]: https://maven.apache.org/
[4]: http://www.postgresql.org/
[5]: http://wildfly.org/downloads/
[6]: https://jdbc.postgresql.org/download.html
