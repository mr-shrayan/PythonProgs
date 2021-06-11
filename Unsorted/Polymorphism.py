class User():
    def sign_in(self):
        print('Logged in')

    def attack(self):
        print('Do Nothing')

class Wizard(User):
    def __init__(self, name, power):
        self.name = name
        self.power = power
    def attack(self):
        User.attack(self)
        print(f'{self.name} Attacking with a power of {self.power}')
class Archer(User):
    def __init__(self, name, arrows):
        self.name = name
        self.arrows = arrows
    def attack(self):
        print(f'{self.name} Attacking with {self.arrows} arrows')

wizard1 = Wizard('Marlyn', 200)
archer1 = Archer('Ford', 500)
wizard1.attack()
# archer1.attack()

#Polymorphism
def player_attack(char):
    char.attack()

player_attack(wizard1)
player_attack(archer1)

#Another way to demonstrate

for char in (wizard1,archer1):
    char.attack()
    
