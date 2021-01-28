#A Simple example of handling errors in your program and still kepp your program running even in the event of an error is known as error handling
#In order to accomplishing the task you will need to use Try & Catch block.
while True:
     try:
         age = int(input('Please enter your age'))
         10/age # Entering age =0 creates a zero division errors
     except ValueError: # Except block runs only once and once it catches an error it stops
         print('Please enter a number')
     except ZeroDivisionError: 
         print('Please enter age higher than 0')
     else:
         print('Thank You')
         break


# Without using the try block
# while True:
#         age = int(input('Please enter your age'))
#         print(age)
    