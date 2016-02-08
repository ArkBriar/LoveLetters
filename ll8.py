import random

class People:
    def __init__(self, gender = ''):
        self.gender = gender
        self.happiness = random.random()
        self.sorrow = 1- self.happiness
        self.missing = None

def met(you, me):
    with_you = True
    me.missing, you.missing = you, me

our_life = []
me = People('male')
you = People('female')
with_you = False

for every_minute in our_life:
    met(you, me)
    if with_you:
        me.happiness = you.happiness = me.happiness + you.happiness
        me.sorrow = you.sorrow = None
    if not with_you:
        time *= 365
        me.missing /= 0.0001

