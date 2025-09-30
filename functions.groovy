def fib(n) {
    return n < 2 ? 1 : fib(n - 1) + fib(n - 2)
}

assert fib(10) == 89

def fact(n) {
    n > 1 ? n * fact(n - 1) : 1
}

assert fact(5) == 120