```groovy
def myMethod(String str) {
    if (str == null) {
        return ""
    }
    return str.toUpperCase()
}

println myMethod(null) //This works fine
println myMethod(123)  //This throws a runtime exception
```