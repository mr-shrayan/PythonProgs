class User():
    def __init__(self,email):
        self.email = email

    def sign_in(self):
        print('Logged in')


class Wizard(User):
    def __init__(self, name, power, email): # Call the method from the init of the user here too
        User.__init__(self,email)# All we did is, we called the init method of the User In the Object Wizard
        self.name = name
        self.power = power
    def attack(self):
        print(f'{self.name} Attacking with a power of {self.power}')
wizard1 = Wizard('Marlyn', 200, 'marlyn@gmail.com')
print(wizard1.email)# Now we can access the email of the user object's init method