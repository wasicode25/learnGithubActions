print("DEMO")
from flask import Flask
def mi_funcion():
  a=1
  b=3
  if a>b:
    return 'mayor'
  else
    return 'menor'

def my_pow(num, exponent):  # Noncompliant
    num = num * my_pow(num, exponent - 1)
    return num  # this is never reached

app = Flask(__name__)
app.config['JWT_SECRET_KEY'] = secret_key  # Noncompliant
