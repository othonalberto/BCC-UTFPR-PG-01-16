#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Autor: Othon Alberto

Data: 21/03/2016 

Lista: 1
Exercício: 5

Descrição:
Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
"""

n1 = float(raw_input("Nota 1: " ))
n2 = float(raw_input("Nota 2: " ))
n3 = float(raw_input("Nota 3: " ))

n1 = n1 * 2
n2 = n2 * 3
n3 = n3 * 5

nota_ponderada = (n1 + n2 + n3)/10

print("Média do aluno: {0}" .format(nota_ponderada))