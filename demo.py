print("DEMO")
from flask import Flask
def mi_funcion():
  a=1
  b=3
  if a>b:
    return 'mayor'
  else:
    return 'menor'

def my_pow(num, exponent):  # Noncompliant
    num = num * my_pow(num, exponent - 1)
    return num  # this is never reached

app = Flask(__name__)
app.config['JWT_SECRET_KEY'] = secret_key  # Noncompliant

def func(var: str):
    pass

func(42)  # Noncompliant: 42 is not of type str.

round("not a number")  # Noncompliant: the builtin function round requires a number as first parameter.

def foo():
    my_dict = {'k1': 42}
    ...
    value = my_dict['k2']  # Noncompliant: the key "k2" does not exist.
def my_fun(my_dict):
    for key in my_dict:
        if my_dict[key] == 'foo':
            my_dict.pop(key) # Noncompliant: this will make the iteration unreliable

del (1, 2)[0]  # Noncompliant: tuples are immutable
(1, 2)[0] = 42  # Noncompliant
(1, 2)[0]

class A:
    def __init__(self, values):
        self._values = values

a = A([0,1,2])

a[0]  # Noncompliant
del a[0]  # Noncompliant
a[0] = 42  # Noncompliant

class B:
    pass

B[0]  # Noncompliant
