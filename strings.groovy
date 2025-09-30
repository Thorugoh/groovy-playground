foxtype = "fast"
foxcolor = ["b", "r", "o", "w", "n"]
println "The ${foxtype} ${foxcolor.join('')} fox"

x = "Hi"
y = "there"
println '$x $y' // It wont interpolate vars since it's in single quotes


x = /tic\tac\toe/ // slashy strings, it won't interpret escape sequences
y = 'tic\tac\toe'// single quoted strings, it won't interpret escape sequences

println x
println y