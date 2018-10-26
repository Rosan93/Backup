x = int(input("Enter 1st number "))
y = int(input("Enter 2nd number "))
z = int(input("Enter 3rd number "))

if(x>y and x>z):
    print("1st input is greatest number")
elif(y>x and y>z):
    print("2nd input is greatest number")
else:
    print("3rd input is greatest number")