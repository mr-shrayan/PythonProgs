while True:
     try:
         age = int(input('Please enter your age'))
         10/age # Entering age =0 creates a zero division errors
     except ValueError: # Except block runs only once and once it catches an error it stops
         print('Please enter a number')
     except ZeroDivisionError: #Mentioning the type of errors will lead to proper error handeling of a program. Find the proper type of errors to handle such kind
         print('Please enter age higher than 0')
     else:
         print('Thank You')
         break
     finally:# finaly rins regardless of what the program outputs. even if it chatches an error it still runs the code under the finally command
        print('Ok. I am finally done')