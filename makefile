JAVAC=javac
JAVA=java
SRC=$(wildcard *.java)
CLS=$(SRC:.java=.class)

# Detect OS
ifeq ($(OS),Windows_NT)
    detected_OS := Windows
else
    detected_OS := $(shell uname)
endif

default: compile

compile: $(CLS)

%.class: %.java
	$(JAVAC) $<

run: compile
	$(JAVA) Main

clean:
ifeq ($(detected_OS),Windows)
	del *.class
else
	rm -f *.class
endif