def maiorNumero(n1,n2,n3):
    lista = [n1,n2,n3]
    for i in range(0, len(lista)):
        if(i == 0):
            maior = lista[i]
        if(lista[i] > maior):
            maior = lista[i]
    
    return maior

def principal():
    n1 = 10
    n2 = 50
    n3 = 20
    resultado = maiorNumero(n1,n2,n3)
    print(resultado)

principal()

#8, 2, 3, 4, 5, 6, 101, 102, 103, 104, 105, 107, 6, 7, FIM