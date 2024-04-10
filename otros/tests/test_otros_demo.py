import sys 
sys.path.insert(0,'../src')

from bronze import main
def test_demo_menor():
    resultado=main.mi_funcion(3,10)
    assert resultado=='menor'
def test_demo_mayor():
    resultado=main.mi_funcion(10,3)
    assert resultado=='mayor'
    