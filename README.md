# Simple java swing native app

## Link
- [How to turn AWT applications into native images](https://bell-sw.com/blog/how-to-turn-awt-applications-into-native-images/)
- [Desktop Java with Swing and GraalVM (and Spring, of course)](https://www.youtube.com/watch?v=Thbvb8ejaG8)

## Command
```shell
native-image -Djava.awt.headless=false -jar java-crud-swing-1.0-SNAPSHOT.jar
```