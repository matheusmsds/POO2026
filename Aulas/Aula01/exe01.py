def maiorNumero(a,b):
    if a > b:
        return a
    return b

def somarNums(a,b):
    return a + b

def principal():
    n1 = int(input("Informe o primeiro número: "))
    n2 = int(input("Informe o segundo número: "))
    soma = somarNums(n1,n2)
    maior = maiorNumero(n1,n2)
    print(f"Resultado {soma}, maior número é {maior}") 

principal()