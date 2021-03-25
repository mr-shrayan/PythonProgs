# A generator creates memory spaces one at a time and does not occupy a whole lot of memory together. thats why the
# function "range(100)" is also a generator to print a list of the range we use the line list(range(100)) 

# range(100)
# list(range(100))

def counter(num):
    result = []
    for i in range(num):
        result.append(i*2)
    return result

my_list = counter(100)
print(my_list)
