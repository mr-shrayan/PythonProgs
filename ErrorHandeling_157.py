# def sum(num1,num2):
#     return num1+num2

# print(sum('1',2))

# The above line of code will output an error since we are adding a string to an integer.
# in order to handle any sort of error we need to use a try and catch block. 
# we could use a try and except block on the print statement or instead the best practice would be to use the block inside the def function.
def sum(num1,num2):
    try:
        return num1+num2
    except TypeError as err:#Catching the type of errors helps the programmer understand what type of error it is.
        print(f'Please enter numbers{err}')
print(sum('1',2))
