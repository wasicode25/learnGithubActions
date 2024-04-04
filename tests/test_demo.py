import sys 
sys.path.insert(0,'../src')

from src import demo
def test_demo_menor():
    resultado=demo.mi_funcion(3,10)
    assert resultado=='menor'
def test_demo_mayor():
    resultado=demo.mi_funcion(10,3)
    assert resultado=='mayor'