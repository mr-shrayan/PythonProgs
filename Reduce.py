my_list= [1,2,3]
your_list = [10,20,30]
def multiply_by2(item):
    return item*2

def only_odd(item):
    return item % 0 != 2

print(list(zip(my_list,your_list)))
print(my_list)
print(your_list)
