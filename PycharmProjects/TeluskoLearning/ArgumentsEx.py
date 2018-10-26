
# Position
def person(name,age):
    print(name)
    print(age)

person('Roshan',28)

# Keyword
def person1(name,age):
    print(name)
    print(age)

person1(age=20,name="Roshan")

# Default
def person3(name,age=50):
    print(name)
    print(age)

person3('Roshan')

# Variable length
def sum(a,*b):
    c=a

    for i in b:
        c = c+i

    print(c)

sum(5,5,5,5)

#Keyword Variable length arguments
def person4(name,**data):
    print(name)
    print(data)

person4('Roshan',age=24,city='Ktm',mob=112)