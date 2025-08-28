JAVAC = javac
JAVA  = java

all: HelloWorld

HelloWorld: HelloWorld.java Person.java
	$(JAVAC) Person.java HelloWorld.java

run:
	$(JAVA) HelloWorld

clean:
	rm -f Person.class
	rm -f HelloWorld.class
