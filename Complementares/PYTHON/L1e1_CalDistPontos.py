#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Autor: Othon Alberto
Data: 19/03/2016
 
Lista: 1
Exercício: 1

Descrição:
Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e P(x2,y2), 
escreva a distância entre eles.

"""

import math

px1 = input("Digite o valor de X1: ")
px2 = input("Digite o valor de X2: ")
py1 = input("Digite o valor de Y1: ")
py2 = input("Digite o valor de Y2: ")

distancia = math.sqrt( ((px2 - px1) ** 2) + (py2 - py1)**2)

print ("Distância entre os pontos: {0}" .format(distancia))



