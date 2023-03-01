class Flor:
    def __init__(self, nome, numPet, preco):
        # O construtor da classe recebe três parâmetros: nome, número de pétalas e preço, o prefixo "__" antes do nome dos atributos torna-os "privados", o que significa que eles só podem ser acessados por métodos da própria classe e não por outras partes do programa
        self.__nome = nome
        self.__numPet = numPet
        self.__preco = preco
        
    def getNome(self):
        # O método getNome é um "getter" para o atributo __nome, ou seja, pode acessar de forma controlada fora da classe
        return self.__nome
    
    def getNumPet(self):
        # O método getNumPet é um "getter" para o atributo __numPet, pode acessar de forma controlada fora da classe
        return self.__numPet
    
    def getPreco(self):
        # O método getPreco é um "getter" para o atributo __preco, pode acessar de forma controlada fora da classe
        return self.__preco




def main():
    # Cria dois objetos da classe Flor, passando nome, número de pétalas e o preço como parâmetros
    rosa = Flor("Rosa", 12, 3.50)
    margarida = Flor("Margarida", 20, 2.75)
    
    # Imprime na tela a info de cada flor usando os métodos getters
    print("Flor 1 - Nome: " + rosa.getNome() + ", Número de pétalas: " + str(rosa.getNumPet()) + ", Preço: R$" + str(rosa.getPreco()))
    print("Flor 2 - Nome: " + margarida.getNome() + ", Número de pétalas: " + str(margarida.getNumPet()) + ", Preço: R$" + str(margarida.getPreco()))

if __name__ == "__main__":
    main()
