# Decorators just supercharges a function. The main function of a decorator is to give extra fuctionalities to a function.\
#Decorator Pattern
def my_decorator(func):
    def wrap_func(*args,**kwargs):
        print('***********************')
        func(*args,**kwargs)
        print('***********************')
    return wrap_func
#Now hello is accepting an argument.
@my_decorator
def hello(greeting):
    print(greeting)
    
hello('hiiiiii')