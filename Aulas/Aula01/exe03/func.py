def maiorValor(lista):
    for i in range(0, len(lista)):
        if(i == 0):
            maior = lista[i]
        if(lista[i] > maior):
            maior = lista[i]
    return maior