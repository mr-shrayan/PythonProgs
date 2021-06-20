def fib(number):
    a = 0 
    b = 1
    for i in range(number):
        yield a
        temp = a
        a = b
        b = temp+b

test = fib (21)
for x in test:
    print(x)