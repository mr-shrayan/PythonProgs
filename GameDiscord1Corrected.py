# -*- coding: utf-8 -*-
import random

def gen_ans():
    ans = []
    while len(ans) != 4:
        n = random.randrange(0, 10)
        if not n in ans:
            ans.append(n)
    print("--debug only--")
    print(ans)
    return ans

def check_input(user_input):
    numbers = user_input.split(' ')
    if len(numbers) != 4:
        return False
    return True

def check_answer(ans, nums):
    a, b = 0, 0
    for n in nums:
        if n in ans:
            if nums.index(n) == ans.index(n):
                a += 1
            else:
                b += 1
    return a, b

def main():
    answer = gen_ans()

    guessing = True
    while guessing:
        user_input = raw_input("Give me 4 numbers: ")
        if check_input(user_input):
            numbers = user_input.split(' ')
            numbers = map(int, numbers)
            a, b = check_answer(answer, numbers)
            print("\n%dA%dB" % (a, b))
            if a == 4:
                print("Nice job!")
                guessing = False
            else:
                print("Keep trying!")
        else:
            print("\nYou need to guess 4 numbers between 0 ~ 9 and separated by space.")
            print("For example: 1 2 3 4")
            print("Please try again.")

if __name__ == "__main__":
    print("Welcome to 1A2B")
    print("You need to guess 4 numbers between 0 ~ 9 and separated by space.")
    print("The numbers won't be repeated.")
    main()