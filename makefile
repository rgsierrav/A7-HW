build:
    javac Main.java Array.java Stack.java

run:
    java Main

clean:
    rm -rf *.class

.PHONY: build run clean
