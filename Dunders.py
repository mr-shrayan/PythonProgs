class Toy():
    def __init__(self,color,age):
        self.color = color
        self.age = age
    def __str__(self):
        return f'{self.color}'

action_figure = Toy('red', 0)

print (action_figure.__str__())
print(str(action_figure))