classpath = -cp .:junit-4.11.jar:hamcrest-core-1.3.jar
sources = *.java

all:
	javac $(classpath) $(sources)

test:
	java $(classpath) org.junit.runner.JUnitCore StringUtilsTest

.PHONY: all test
