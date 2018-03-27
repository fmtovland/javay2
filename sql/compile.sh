#!/bin/bash
if ! ls mysql-connector-java-5.1.46-bin.jar >> /dev/zero
then
	echo please put mysql-connector-java-5.1.46-bin.jar in the build directory
else
	javac -cp mysql-connector-java-5.1.46-bin.jar -d . test.java
	jar cfm me.jar META-INF/MANIFEST.MF com
fi
