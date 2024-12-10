# Groovy Runtime Exception with Loose Typing

This repository demonstrates a common issue in Groovy related to its dynamic typing.  The `myMethod` function is intended to operate on strings, but when an integer is passed, a `groovy.lang.MissingMethodException` occurs.  This highlights the need for careful type handling, even in dynamically-typed languages like Groovy.