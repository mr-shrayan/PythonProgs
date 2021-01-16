#In order to uderstand decorators we need to undertand functions. Functions are just 
#variables that can be passed around ex:
def hello(func):
    func()
def greet():
    print('Still There!')

a = hello(greet)

print(a)