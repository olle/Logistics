.PHONY: docs clean

docs: target/site/apidocs/index.html

target/site/apidocs/index.html:
	mvn clean javadoc:javadoc

clean:
	mvn clean
