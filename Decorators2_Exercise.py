# Create an @authenticated decorator that only allows the function to run if user1 has 'valid' set to True:
user1 = {
    'name': 'Sorna',
    'valid': True #changing this will either run or not run the message_friends function.
}

def authenticated(fn):
     def wrapper(*args,**kwargs):
         if user1['valid'] is True:
             return fn(*args,**kwargs)
     return wrapper
#Alternate Sollution
#   def wrapper(*args, **kwargs):
#     if args[0]['valid']:
#         return fn(*args, **kwargs)
#   return wrapper

@authenticated
def message_friends(user):
    print('message has been sent')

message_friends(user1)