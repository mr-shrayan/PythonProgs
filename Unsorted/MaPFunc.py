def multiplyy_by2(item):
    return item*2

print(list(map(multiplyy_by2,[1,2,3])))
# Map allows us to create a whole new list without affectinf the outside world. EX:

my_list= [1,2,3]
def multiply_by2(items):
    return items*2

print(list(map(multiply_by2,my_list)))
print(my_list)
#You can see that the value of mylist havent changed a bit. 