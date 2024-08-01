# design-pattern
Javaでデザインパターンを試す

https://refactoring.guru/design-patterns

# 開発用コマンド

## Classファイルの生成時

### Build時

```
javac -sourcepath ./src -d ./class src/com/example/Main.java 
javac -sourcepath ./src -d ./class src/com/example/agent/JavaAgent.java
```
`./class`配下に`.class`ファイルが生成される

## executable jar fileの生成

### Build 
```
jar --create --verbose --file build/injectedApp.jar --main-class com/example/Main -C class/ .
jar --create --verbose --file build/javaAgent.jar --main-class com/example/agent/JavaAgent -C class/ .
jar --create --verbose --file build/javaAgent.jar --manifest src/com/example/resources/MANIFEST.MF -C class/ .
```

### 実行
```
java -jar build/injectedApp.jar
java -jar build/javaAgent.jar

java -javaagent:build/javaAgent.jar -jar build/injectedApp.jar
```

