```groovy
def myMethod(String str) {
    if (str == null) {
        return ""
    }
    if (!(str instanceof String)){
        return "Invalid input type. Expected String"
    }
    return str.toUpperCase()
}

println myMethod(null) // Output: 
println myMethod(123) // Output: Invalid input type. Expected String
println myMethod("hello") // Output: HELLO
```