 #Raising our own error outputs using the raise function
while True:
     try:
         age = int(input('Please enter your age'))
         10*age # Entering age =0 creates a zero division errors
         raise ValueError('Cut it out')
     except ValueError: # Except block runs only once and once it catches an error it stops
          print('Please enter a number')
     except ZeroDivisionError: #Mentioning the type of errors will lead to proper error handeling of a program. Find the proper type of errors to handle such kind
         print('Please enter age higher than 0 ')
     else:
         print ('Thank You')
         break
