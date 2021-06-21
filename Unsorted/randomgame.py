import random
rnd_num = random.randint(1, 10)

print('::::This is a umber guessing game::::')
num1 = input('enter any number from 1 to 10')

if num1 == rnd_num:
    print('you have guessed right')
else:
    print('wrong choice')
