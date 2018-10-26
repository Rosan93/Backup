a=10
b=30

# global
def test():

    global a
    a=20
    print("Inside Function",a)


test()
print("Outside Function",a)


# globals
def test2():

    b=40
    x=globals()['b']
    print("Inside Function",x)
    globals()['b']=40


test2()
print("Outside Function",b)

# Passing list

def passList(lst):
    even=0
    odd=0

    for i in lst:
        if i%2==0:
            even+=1
        else:
            odd+=1
    return even,odd

lst1 = [20,21,22,23,24,25,26,27,28,29,30]
odd,even =passList(lst1)

print("Odd : {} and Even : {}".format(odd,even))
