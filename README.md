# MyContaBanco
Programa simples para estudo de herança e polimorfismo

# Exercício proposto

Elabore uma classe ContaBancaria com os seguintes atributos:
• nomeCliente
• numConta
• saldo

E os seguintes métodos:
• sacar (o saldo não pode ficar negativo)
• depositar

Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as 
seguintes características:

ContaPoupanca
• atributo diaRendimento
• método calcularNovoSaldo, recebe taxa de rendimento da poupaça e 
atualiza o saldo

ContaEspecial
• atributo limite
• sobrescreva o método sacar com a nova lógica necessária

Crie$uma classe Teste que contenha a seguinte lógica:
• Criar contas
• Sacar um valor das contas
• Depositar
• Mostrar um novo saldo a partir de um rendimento
• Mostrar os dados da conta do cliente
