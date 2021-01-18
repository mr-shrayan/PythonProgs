# Decorators just supercharges a function. The main function of a decorator is to give extra fuctionalities to a function.
def my_decorator(func):
    def wrap_func(x):
        print('***********************')
        func(x)
        print('***********************')
    return wrap_func
#Now hello is accepting an argument.
@my_decorator
def hello(greeting):
    print(greeting)
    
hello('hiiiiii')