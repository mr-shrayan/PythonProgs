my_list = [1,2,3]
i=0
while i<len(my_list):
    print(my_list[i])
    i+=1
    continue

while i<len(my_list):#This block of code wont return anything since the continue statement in it will send the control to the start of the loop everytime.
    i+=1
    continue
    print(my_list[i])