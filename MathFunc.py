def add(num1, num2):
    return num1 + num2

def substract(num1, num2):
    return num1 - num2

def divide(num1, num2):
    return num1 / num2

def multiply(num1, num2):
    return num1 * num2

operations = {
            '+':'add',
            '-':'Substract',
            '/':'divide',
            '':'multiply'
            }

def math_function():
    while True:
        num1 = int(input("Please Enter the first Number: "))
        for key in operations:
            print(key)
        user_input = input("pick an operation from the line above: ")
        num2 = int(input("Please Enter the Second Number: "))

        if user_input == '+':
            result = add(num1, num2)
        elif user_input == '-':
            result = substract(num1, num2)
        elif user_input == '/':
            result = divide(num1, num2)
        elif user_input == '':
            result = multiply(num1, num2)
        print(f"{num1} {user_input} {num2} = {result} ")

        response = input("would you like to do another manupulation")
        if response == 'y':
            math_function()
        elif response == 'n':
            break
math_function()