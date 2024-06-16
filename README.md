# Simple java swing native app

## Link
- [How to turn AWT applications into native images](https://bell-sw.com/blog/how-to-turn-awt-applications-into-native-images/)
- [Desktop Java with Swing and GraalVM (and Spring, of course)](https://www.youtube.com/watch?v=Thbvb8ejaG8)
- [Gradle plugin for GraalVM Native Image building](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)

## Command

### Solution 1: Using build-in native-image
```shell
native-image -Djava.awt.headless=false -jar java-crud-swing-1.0-SNAPSHOT.jar
```
### Solution 2: Using gradle plugin
```shell
./gradlew clean nativeCompile
```
