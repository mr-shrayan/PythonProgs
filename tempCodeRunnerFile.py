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

    player1.name = '!!!'
    player1.age = 'BOOOOO'

    print (player1.speak)