class Test:
    def __init__(self):
        self.name = "Roshan"
        self.age = 24

    def compare(self,other):
        if self.age == other.age:
            return True
        else:
            return False


test1 = Test()
test1.age = 24
test2 = Test()

if test1.compare(test2):
    print("They are same")
else:
    print("They are different")


print(test1.name)
print(test2.name)