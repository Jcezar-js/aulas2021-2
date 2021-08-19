import seaborn as sns
import matplotlib.pyplot as plt
df = sns.load_dataset('titanic')
print(df.head())

# Três aspas simples éum comentário de bloco

# sns.barplot(data=df, x="class", y="age")

# # plt.title('Idade e Classe dos passageiros do Titanic')
# # plt.xlabel('Classe')
# # plt.ylabel('Idade Média')

# # plt.show()
# #Mostra o desvio padrão Standard Deviation
# sns.barplot(data=df, x="class", y="age", ci='sd')
# plt.show()

# # Mostra  o # de passageiros por classe
# sns.countplot(data=df, x="class")
# plt.title('Numero de Passageiros, por classe')
# plt.xlabel('Classe')
# plt.ylabel('# de Passageiros')

# plt.show()

'''

# Idade e classe por sexo
sns.barplot(data=df, x="class", y='age', hue='sex')
plt.title('Idade e classe')
plt.xlabel('Classe')
plt.ylabel('Idade Média')
plt.show()

# Mostra a quantidade de passageiros por sexo
sns.countplot(data=df, x="sex")
plt.title('Numero de Passageiros, por classe')
plt.xlabel('Classe')
plt.ylabel('# de Passageiros')

plt.show()

# Mostra a quantidade de mulheres que sobreviveram
# print(df.info())

sns.catplot(x="sex", hue='survived',kind="count", data = df[df["sex"] == "female"])
plt.show()
'''
# mostra a qunatidade por classe dos que sobreviveram
sns.catplot(hue="sex", kind="count", data=df[df["survived"]==1], x="class")

plt.show()
