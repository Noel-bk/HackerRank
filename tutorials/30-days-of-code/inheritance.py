class Person:
	def __init__(self, firstName, lastName, idNumber):
		self.firstName = firstName
		self.lastName = lastName
		self.idNumber = idNumber
	def printPerson(self):
		print "Name:", self.lastName + ",", self.firstName
		print "ID:", self.idNumber

class Student(Person):
    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores
    def calculate(self):
        avg = sum(self.scores) / len(self.scores)
        if avg >= 90 and avg <= 100:
            grade = 'O'
        elif avg >= 80 and avg < 90:
            grade = 'E'
        elif avg >= 70 and avg < 80:
            grade = 'A'
        elif avg >= 55 and avg < 70:
            grade = 'P'
        elif avg >= 40 and avg < 55:
            grade = 'D'
        elif avg < 40:
            grade = 'T'
        return grade

line = raw_input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(raw_input()) # not needed for Python
scores = map(int, raw_input().split())
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print "Grade:", s.calculate()
