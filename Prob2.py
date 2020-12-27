class MyGen:
    current_state_of_next = 0

    def __init__(self, start, stop):
        self.start = start
        self.stop = stop

    def __iter__(self): 
        return self

    def __next__(self): 
        if MyGen.current_state_of_next < self.stop:
            num = MyGen.current_state_of_next
            MyGen.current_state_of_next += 1
            return num

        raise StopIteration


gen = MyGen(0, 100)
for i in gen:
    print(i)
