import numpy as np
from scipy import stats
#rol
list = [2, 4, 4, 4, 5, 5, 7, 9] 
#cálculo da média
print('cálculo da média : ', np.average(list))
#cálculo da Mediana
print('cálculo da mediana : ',np.median(list))
# cálculo da variância
print('cálculo da variância : ',np.var(list))
#cálculo do desvio padrão
print('cálculo do desvio padrão : ',np.std(list))
#moda
print('Moda : ', stats.mode(list))

