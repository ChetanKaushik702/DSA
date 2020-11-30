import networkx as nx
import matplotlib.pyplot as plt
# G = nx.Graph()
# nodes = [1, 2, 3]
# G.add_nodes_from(nodes)
# G.add_edge(1, 2)
# G.add_edge(2, 3)
# G.add_edge(1, 3)
# print(G.edges)

# G = nx.complete_graph(10)

G = nx.gnp_random_graph(20,0.1)
print(G.nodes)
print(G.edges)
nx.draw(G)
plt.show()