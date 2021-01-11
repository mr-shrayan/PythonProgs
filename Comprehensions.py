# List/ Set/ Dictionaries Comprehensions
my_list = []

for char in "hello":
    my_list.append(char)

print(my_list)

#Or we can also write the program in a cleaner way such as 

my_list2 = [char for char in "hello"]
print(my_list2)