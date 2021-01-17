# Decorators just supercharges a function. The main function of a decorator is to give extra fuctionalities to a function.
def my_decorator(func):
    def wrap_func():
        print('***********************')
        func()
        print('***********************')
    return wrap_func()

@my_decorator
def hello():
    print('Hellooooo')
    return
print(hello)