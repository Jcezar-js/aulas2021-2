import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from scipy import stats

df=pd.read_csv('mtcars.csv')
# df=pd.read_csv('pokemon.csv')

print(stats.pearsonr(df['mpg'], df['hp']))
#sns.lmplot(x='hp', y='cyl', data=df)
mapa = df.corr()
print(round(mapa,2))

sns.heatmap(mapa)
plt.show()
'''
mpg  - milhas/galão
cyl  - # cilindros
disp - Deslocamento
hp   - Horse Power - potência
draft- Relação do eixo traseiro
wt   - Peso
qsec - Tempo para percorer 1/4 milha
vs   - motor em v - 0 ou em linha - 1
am   - Transmissão 0 - automática 1 - manual 
gear - # marchas
carb - # carburadores
'''
# monte pelo menos 3 correlações distintas com ou sem agrupamento hue


#Para o dataset do pokemon monte e mostre as seguintes correlações

#Correlação ataque x defesa

# sns.scatterplot(x='attack', y='defense', data=df);
# plt.show()

# #Correlação ataque x defesa agrupado po ser legendário ou não

# sns.lmplot(x='sp_attack', y='attack', data=df, hue='is_legendary');
# plt.show()

# #Correlação ataque x defesa por tipo (type1)

# sns.scatterplot(x='sp_attack', y='sp_defense', data=df, hue='type1');
# plt.show()

# #Corelação peso x altura (weight_kg x height_m) só dos poquemons do tipo água (type1 = 'whater')

# sns.scatterplot(x='weight_kg', y='height_m', data=df[df["type1"]=='water'],);
# plt.show()
