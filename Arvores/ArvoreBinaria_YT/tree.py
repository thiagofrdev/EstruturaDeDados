# Classe que representa um nó da árvore binária
class Node:
    # Construtor de um nó de uma árvore binária
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    # Método para imprimir o nó
    def __str__(self):
        return str(self.data)

class BinaryTree:
    # Método que inicializa a árvore, atribuindo o primeiro dado como raiz
    def __init__(self, data):
        node = Node(data)
        self.root = node

if __name__ == "__main__":
    tree = BinaryTree(7)
    tree.root.left = Node(18)
    tree.root.right = Node(14)

    print(tree.root)
    print(tree.root.left)
    print(tree.root.right)