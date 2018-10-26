
# def greet():
#     print("Good morning ",end="")
#     print("Hello")
#
# greet()
#
# def add(a,b):
#     c =a+b
#     print(c)
#
# add(5,4)
#
# def add_sub(a,b):
#     c =a+b
#     d = a-b
#     return c,d
#
# result1,result2 = add_sub(5,4)
# print(result1,result2)

# Arguments
def update(x):
    print("Inseide Fuction",id(x))
    x = 10
    print(id(x))
    print("x: ",x)

a = 8
print("Outside Function",id(a))
update(a)