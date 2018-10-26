import sys

print("The recursion limit is: ",sys.getrecursionlimit())

def fact(n):

    if(n==0):
        return 1

    return n*fact(n-1)


num = int(input("Enter the number "))
result = fact(num)
print("The factorial is: {}".format(result))