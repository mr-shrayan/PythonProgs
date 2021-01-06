my_list= [1,2,3]
your_list = [10,20,30]
def multiply_by2(item):
    return item*2

def only_odd(item):
    return item % 0 != 2

print(list(zip(my_list,your_list)))
print(my_list)
print(your_list)

# the zip function will zip the items of 2 lists or tuples together regardless of them being the same or different.
# they may be tuple and tuple or list and list or list and tuple or anything. 
# if you think that this is not that useful then you might be wrong. since this is a very useful tool.
# for example if you collected usernames of a group of people in one list and the phone numbers of those group of people in another list
# and assuming they both are in the same order then we could use the zip function to zip them together, which could be way easy if we use the zip function
