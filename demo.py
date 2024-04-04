print("DEMO")
from flask import Flask
def mi_funcion():
  a=1
  b=3
  if a>b:
    return 'mayor'
  else
    return 'menor'



app = Flask(__name__)
app.config['JWT_SECRET_KEY'] = secret_key  # Noncompliant
