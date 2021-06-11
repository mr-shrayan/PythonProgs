def another_func(num1, num2):
     return sum(args)


total = add(10, 20)
print(total)
# 'Args And Kwargs'


def super_func(args):
    print(args)
    return add(args)


print(super_func(1, 2, 3, 4, 5))


def super_func(args):
    print(args)
    return sum(args)


super_func(1, 2, 3, 4, 5)
print(super_func(1, 2, 3, 4, 5))


def super_func(args, **kwargs):
    print(kwargs)
    return sum(args)


print(super_func(1, 2, 3, 4, 5, num1=5, num2=10))


def super_func(args, kwargs):
    total = 0
    for items in kwargs.values():
        total += items
    return sum(args) + total


print(super_func(1, 2, 3, 4, 5, num1=5, num2=10))


def super_func(name, *args, i='hi', kwargs):
    total = 0
    for items in kwargs.values():
        total += items
    return sum(args) + total


print(super_func('Offset', 1, 2, 3, 4, 5, num1=5, num2=10))
print("/n")
print("/n")