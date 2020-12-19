#oop
class PlayerCharacter:
    def __init__(self, name, age ):
        self.name = name 
        self.age = age

    def run(self):
        print('run')

    def speak(self):
        print(f'my name is{self.name} and my age is{self.age}')

player1=PlayerCharacter('shrayan',20)

player1.name = ' !!!'
player1.speak = ' BOOOOO'

print (player1.speak) # The speak method is called directly without having to use speak() because player1.speak = ' BOOO00' is not
#Inside a class. We know that is Object is inside of a class it becomes method.  