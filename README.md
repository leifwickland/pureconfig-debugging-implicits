In [A.scala](src/main/scala/A.scala) `C` and `D` aren't case classses so no converter can be created for them automatically.
I'd expect sbt compile to report something blaming `C` and `D` based on my following the directions at [debugging-implicits-not-found](https://pureconfig.github.io/docs/debugging-implicits-not-found.html)

Instead I'm getting the typical error message:

```
[error] src/main/scala/Main.scala:4: could not find a ConfigReader instance for type A
[error]   pureconfig.loadConfig[A]
[error]                        ^
```
