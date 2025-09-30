x = 11

if (x > 10) 
    println "x is greater than 10"


// null, empty strings, 0, and empty collections are considered false
list = [1, 2, 3]
if(list != null && list.size() > 0)
    println list
else
    println "list is null or empty"

// Groovy allows to simplify the above condition
if(list)
    println list
else
    println "list is null or empty"


// Ternary operator
println list ? list : "list is null or empty"