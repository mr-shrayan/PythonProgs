#oop

class PlayerCharacter:
    #Class object attribute
    membership = True
    def __init__(self, name):
        self.name = name #Attributes

    def run(self):
        print('run')#it dosent return anything 
        return('done')

player1 = PlayerCharacter('shrayan')
player2 = PlayerCharacter('Tom')

print(player1.name)
print(player2.name)
print(player1.run())
print(player1.membership)
print(player2.membership)