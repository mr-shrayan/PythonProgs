#oop

class PlayerCharacter:
    #Class object attribute
    def __init__(self, name, age ):
        self.name = name #Attributes
        self.age = age

    def run(self):
        print('run')#it dosent return anything 
        return('done')

    @classmethod
    def adding_things(cls, num1, num2):
     return cls('Tommy' , num1 + num2)
# the only difference between the two is that @classmethod has access to the class body and does care about its parameters 
# whereas @staticmethod is self dependent and has no access to cls or the class parameters. thus cls is not required
    @staticmethod
    def adding_things2(num1,num2):
        return num1+num2


player3 = PlayerCharacter.adding_things(2,3)

print(player3.age)