#How things works underneath the hood for range.

class My_gen():
    current = 0 
    def __init__(self, first, last):
        self.first = first
        self.last = last

    def __iter__(self):
        return self

    def __next__(self):
        if My_gen.current < self.last:
            num  = My_gen.current
            My_gen.current +=1
            return num
        raise StopIteration

gen= My_gen (0,100)

for i in gen:
    print(i)

