class AnimalFarm():
	def __init__(self):
		super(AnimalFarm, self).__init__()
		self.content = []

	def addAnimal(self, animal):
		self.content.append(animal)

	def printAnimal(self):
		for c in self.content:
			print(c.name)

class Sheep:
	def __init__(self, name):
		self.name = name

class Chicken:
	def __init__(self, name):
		self.name = name

animal_farm = AnimalFarm()

sheep_1 = Sheep('Sheep 1')
sheep_2 = Sheep('Sheep 2')
sheep_3 = Sheep('Sheep 3')
sheep_4 = Sheep('Sheep 4')
chick_1 = Chicken('Chick 1')
chick_2 = Chicken('Chick 2')
chick_3 = Chicken('Chick 3')
chick_4 = Chicken('Chick 4')

animal_farm.addAnimal(sheep_1)
animal_farm.addAnimal(sheep_2)
animal_farm.addAnimal(sheep_3)
animal_farm.addAnimal(sheep_4)
animal_farm.addAnimal(chick_1)
animal_farm.addAnimal(chick_2)
animal_farm.addAnimal(chick_3)
animal_farm.addAnimal(chick_4)

animal_farm.printAnimal()