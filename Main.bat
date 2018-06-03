mkdir main
javac -d main -encoding utf8 src\Main.java src/Patient.java
java -cp main Main
DEL main\Main.class
rmdir main
pause