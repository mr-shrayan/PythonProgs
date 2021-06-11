def Func1(arg1, arg2, arg3): 
    print("arg1:", arg1) 
    print("arg2:", arg2) 
    print("arg3:", arg3)  
      
# Using *args or **kwargs to pass arguments to this function
args = ("Sarah", "Jacob", "Alison") 
Func1(*args) 
  
kwargs = {"arg1" : "Sarah", "arg2" : "Jacob", "arg3" : "Alison"} 
Func1(**kwargs) 