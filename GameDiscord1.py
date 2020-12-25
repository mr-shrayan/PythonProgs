import random
import sys
from random import randint
from sys import exit
player_name = input("Hello there, what is your name? ")
while True:
# Set up random number
  while True:
    guess_time = 10
    A = 0
    B = 0
    N1 = int(random.randint(0, 9))
    N2 = int(random.randint(0, 9))
    N3 = int(random.randint(0, 9))
    N4 = int(random.randint(0, 9))
    computer_guess = str(N1) + str(N2) + str(N3) + str(N4)
    if N1 != N2 and N1 != N3 and N1 != N4 and N2 != N3 and N2 != N4 and N3 != N4:
      print(f"This is a debug. Computer guess {computer_guess}")
      break
  while True:
    while True:
      print(f"Now {player_name}, you have {guess_time} times left, please guess your number.")
      guess_number = input('Your 4 digit number is? ')
      # Check the input 4 numbers/letters or not
      if len(guess_number) != 4:
        print("Please only 4 different numbers.")
        break
      # Check the input 4 numbers/letters any same or not
      if len(set(guess_number)) != 4:
        print("4 different number please.")
        break
      # Ckeck the input numbers is True or not
      if guess_number.isdigit() == False:
        print("Only numbers please.")
        break
      # Ckeck the input numbers or not
      else:
        print(f"Your answer is {guess_number}.")
      if guess_number != computer_guess and guess_time > 1:
        guess_time -= 1
        print("You have the wrong answer, keep guessing.")
        break
      if guess_number == computer_guess:
        print(f"Contratulation 4A, you have the right answer {computer_guess}")
      if guess_time <= 1:
        print(f"Sorry,You are loser! I was guessing {computer_guess}")
      p_or_q = input("Do you want to play(p) again? Or you want to quit(q)? ")
      if p_or_q == "q":
        print("Bye bye.")
        exit(0)
      if p_or_q != "p" and p_or_q != "q":
        print("Sorry, I don't understand, but I will see you next time. Bye bye.")
        exit(0)
      else:
        print("Let's play again!")
        break
