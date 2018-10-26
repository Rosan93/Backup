i =1
while i <= 4:
    print("#",end="")
    j=1
    while j<=4:
        print("#",end="")
        j+=1
    i+=1
    print()

a=1
while a<=100:
    if(a%3 !=0 and a%5!=0):
        print(a)
    a+=1