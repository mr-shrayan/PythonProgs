def generator_function(num):
    for i in range(num):
        yield i*2
g= generator_function(100)
next(g)
next(g)
next(g)
print(next(g))

#Yield pauses the function and comes back to it when the "next" function is provided. and it only keeps the most recent 
# data in the memory.  

# for item in generator_function(1000):
#     print (item)
