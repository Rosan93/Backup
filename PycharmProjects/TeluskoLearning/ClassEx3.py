class Car:

    # Class Variable
    wheels = 4

    # Instance Variable
    def __init__(self):
        self.mil = 10
        self.win = 4


c1 = Car()
c1.mil = 20
c2 = Car()

print(c1.mil,c2.win,Car.wheels)
print(c2.mil,c2.win,Car.wheels)