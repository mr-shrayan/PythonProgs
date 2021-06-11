# List/ Set/ Dictionaries Comprehensions
my_list = []

for char in "hello":
    my_list.append(char)

print(my_list)

#Or we can also write the program in a cleaner way such as 

my_list2 = [char for char in "hello"]
my_list3 = [num for num in range(0,200)]
my_list4 = [num*2 for num in range(0,200)]
my_list5 = [num*2 for num in range(0,200) if num%2 ==0]
print(my_list2)
print(my_list3)
print(my_list4)
print(my_list5)