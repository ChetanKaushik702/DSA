import networkx as nx
import numpy

G = nx.read_edgelist("facebook_combined.txt")
N = list(G.nodes())
spll = []

for u in N:
    for v in N:
        if u != v:
            l = nx.shortest_path_length(G, u, v)
            # print("Minimum distance between", u, "and v", v, "is ", l)
            spll.append(l)
    # break
mpl = min(spll)
gpl = max(spll)
avg = numpy.average(spll)
print("Minimum path length:", mpl)
print("Maximum path length:", gpl)
print("Average path length:", avg)