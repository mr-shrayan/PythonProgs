my_list = [1,2,3]
def multiply_by2(item):
    return item*2
def only_odd(item):
    return item % 2 !=1

print(list(filter(only_odd, my_list)))
# The command filters out the even number from the list since it returns the extression (item % 2 != 0) as false. 
# Only true values are selected.