# Reproduce

1. `./gradlew compileJava`
2. Update in `src/main/java/mn/test/ByeController.java` the text `"Bye $n"` to `"Byte $n+1"`.
3. `./gradlew compileJava`

The second `compileJava` should fail with the error `error: The route declares a uri variable named [id], but no corresponding method argument is present
`.
