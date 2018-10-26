class Pycharm:
    def execute(self):
        print("Compile")
        print("Run")

class Laptop:
    def code(self,ide):
        ide.execute()

ide = Pycharm()

lap1 = Laptop()
lap1.code(ide)