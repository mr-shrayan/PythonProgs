some_list = ['a', 'b','c','b','d','m','n','n']

# duplicates = []
# for value in some_list:
#     if some_list.count(value)>1:
#         if value not in duplicates:
#             duplicates.append(value)

# print (duplicates)
# Converting the above line of code into a single line.
duplicates1 = list(set([char for char in some_list if some_list.count(char)>1 ]))
print (duplicates1)
