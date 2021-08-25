import numpy as np  
import pandas as pd 
# Visualização de dados.
import seaborn as sns
import matplotlib.pyplot as plt 

from sklearn.datasets import load_iris
 
iris = load_iris()
X = iris.data[:, 0:5] # selecionando as colunas de 0 a 4 para a variável X, o 5 foi declarado, mas por padrão ele não é considerado.
y = iris.target # definindo o y na variável targer, essa será nossa variavel dependente
feature_names = ['sepal length (cm)', 'sepal width (cm)', 'petal length (cm)', 'petal width (cm)']
target_names =  ['setosa', 'versicolor', 'virginica']
X = pd.DataFrame(X, columns=feature_names)

print(X.head(5)) # utilizamos o head para exibir as primeiras linhas do dataframe (por padrão 5)

print(X.sample(4)) # Retorna uma amostra (aleatória) de n elementos, no nosso exemplo 4 elementos

print(X.describe()) # Retorna uma descrição do data set

# Três aspas simples éum comentário de bloco

Q1 = X['sepal length (cm)'].quantile(0.25)
Q2 = X['sepal length (cm)'].quantile(0.5)
Q3 = X['sepal length (cm)'].quantile(0.75)
print('Primeiro quartil ', Q1)
print('Segundo quartil (Mediana)', Q2)
print('Terceiro quartil ', Q3)

IQR = Q3 - Q1
print('Intervalo interquartil ', IQR)


# Plotando os Gráficos
#BoxPlot
sns.boxplot(X['sepal length (cm)'])
plt.show()
# Histograma
sns.distplot(X['sepal length (cm)']) 
plt.show()

