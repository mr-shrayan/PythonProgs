#Set and Dictionart comprehensions


# my_list2 = {char for char in "hello"}#Sets does not allow any duplicates. Only unique items.
# my_list3 = {num for num in range(0,200)}
# my_list4 = [num*2 for num in range(0,200)]
# my_list5 = [num*2 for num in range(0,200) if num%2 ==0]
# print(my_list2)
# print(my_list3)
# print(my_list4)
# print(my_list5)

sampledict= {'a':1, 'b':2}
my_dict = {key:value**2 for key,value in sampledict.items()}
my_dict2 = {num:num*2 for num in [1,2,3]}

print(my_dict2)