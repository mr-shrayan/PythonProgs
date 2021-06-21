import random
import sys

rnd_num = random.randint(1, 10)
# Or you can also use this if you want to input parameters from the user while compilation.
# Ex: python3 randomgame.py 1 10
# rnd_num = random.randint(int(sys.argv[1]), int(sys.argv[2]))

print('::::This is a umber guessing game::::')


while True:
    try:
        num1 = int(input('Enter any number from 1 to 10\n ::: '))
        if 0 < num1 < 11:
            if num1 == rnd_num:
                print("right guess")
                break
        else:
            print("Hey, enter a number from 1 ~ 10")
            break

    except ValueError:
        print("Please check your number")
        continue