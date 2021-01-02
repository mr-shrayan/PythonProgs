#Side affect since new_list=[] is defined outside multiply_by2
new_list=[]
def multiply_by2(li):
    for items in li:
        new_list.append(items*2)
    return new_list

print(multiply_by2([1,2,3]))

#Side effect since print is interacting with the outside world since its giving the output.

def multiply_by2(li):
    new_list=[]
    for items in li:
        new_list.append(items*2)
    return print(new_list)

multiply_by2([1,2,3])

# Output printed twicw since 2 programs are present