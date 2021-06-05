import networkx as nx
import matplotlib.pyplot as plt

G = nx.barbell_graph(4, 2)
nx.draw(G)
plt.show()

G = nx.ladder_graph(5)
nx.draw(G)
plt.show()

G = nx.star_graph(5)
nx.draw(G)
plt.show()

G = nx.path_graph(5)
nx.draw(G)
plt.show()

G = nx.complete_graph(5)
nx.draw(G)
plt.show()

G = nx.gnp_random_graph(5, 0.5, directed=True)
nx.draw(G)
plt.show()