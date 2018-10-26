
class Person:
    def talk(self):
        print("I can talk")

    def walk(self):
        print("I can walk")

Rosan = Person()

Person.talk(Rosan)

Rosan.walk()


class Computer:
    def __init__(self,cpu,ram):
        self.cpu = cpu
        self.ram =ram


    def config(self):
        print("The configuration is: ",self.cpu,self.ram)


comp = Computer("i5","8")
comp1 = Computer("i7","4")

if __name__=="__main__":
    comp.config()
    comp1.config()
