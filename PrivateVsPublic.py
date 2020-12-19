#oop
# The underscore before calling a variable has a convention in the python community that it is a private variable so no kind of alterations 
# Should be made to those variables. 
class PlayerCharacter:
    def __init__(self, name, age ):
        self._name = name 
        self._age = age

    def run(self):
        print('run')

    def speak(self):
        print(f'my name is {self._name} and my age is {self._age}')

player1=PlayerCharacter('shrayan',20)

# player1.name = ' !!!'
# player1.speak = ' BOOOOO' 
# Using the above 2 lines is not a problem and will not create an error but it will not follow the python community convention. 
# It is important to follow conventions of a community while coding those languages in order to make other programmers familiar and comfortable
# with the code that you have written.
print (player1.speak()) 