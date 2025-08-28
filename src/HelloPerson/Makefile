JAVAC = javac
JAVA  = java

all: HelloWorld1 HelloWorld2

HelloWorld1: HelloWorld1.java Person.java
	$(JAVAC) Person.java HelloWorld1.java

run1:
	$(JAVA) HelloWorld1

HelloWorld2: HelloWorld2.java Person.java
	$(JAVAC) Person.java HelloWorld2.java

run2:
	$(JAVA) HelloWorld2

clean:
	rm -f Person.class
	rm -f HelloWorld1.class
	rm -f HelloWorld2.class
