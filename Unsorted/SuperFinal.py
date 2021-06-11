class User():
    def __init__(self,email):
        self.email = email

    def sign_in(self):
        print('Logged in')


class Wizard(User):
    def __init__(self, name, power, email): # Call the method from the init of the user here too
        super().__init__(email)#Super is a new additio in python3. Using super it refers to the super class. and it makes the code cleaner since we no longer need to use the self.
        self.name = name
        self.power = power
    def attack(self):
        print(f'{self.name} Attacking with a power of {self.power}')
wizard1 = Wizard('Marlyn', 200, 'marlyn@gmail.com')
print(wizard1.email)# Now we can access the email of the user object's init method