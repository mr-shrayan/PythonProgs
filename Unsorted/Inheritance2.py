class User():
    def sign_in(self):
        print('Logged in')

class Wizard(User):
    def __init__(self, name, power):
        self.name = name
        self.power = power
    def attack(self):
        print(f'{self.name} Attacking with a power of {self.power}')
class Archer(User):
    def __init__(self, name, arrows):
        self.name = name
        self.arrows = arrows
    def attack(self):
        print(f'{self.name} Attacking with {self.arrows} arrows')

wizard1 = Wizard('Marlyn', 200)
#archer1 = Archer('Ford', 500)
# wizard1.attack()
# archer1.attack()

print(isinstance(wizard1, Wizard)) 
print(isinstance(wizard1, User))
print(isinstance(wizard1, object))
# output
# True
# True
# True