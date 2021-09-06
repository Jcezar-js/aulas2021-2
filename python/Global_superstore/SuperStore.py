import pandas as pd;
import numpy as np;
import seaborn as sns; sns.set();
import matplotlib.pyplot as plt;
import plotly.express as px;




#lendo o arquivo csv  Preço x Segmento de mercado
''''''
df = pd.read_csv('GlobalSuperstore.csv')
df.head()

df_sample = df.sample(n=1000)
fig  = px.scatter(df_sample, x = 'Shipping Cost', y = 'Market', color='Segment', log_x=True)
fig.update_traces(marker = dict(size = 12, line=dict(width = 2)), selector = dict(mode = 'markers'))
fig.show()

print('cálculo do desvio padrão : ',np.std(df_sample))

#lendo o arquivo csv  Lucro x Prioridade agrupado por mercado
# df = pd.read_csv('GlobalSuperstore.csv')
# df.head()

# df_sample = df.sample(n=1000)
# fig  = px.scatter(df_sample, x = 'Profit', y = 'Market', color='Order Priority')
# fig.update_traces(marker = dict(size = 12, line=dict(width = 2)), selector = dict(mode = 'markers'))
# fig.show()