# dio-criando-banco-digital-amdocs
DIO - Bootcamp Amdocs - Desafio Criando Banco Digital

Além do que já foi desenvolvido, existem algumas diferenças
 - Utilizado a classe BigDecimal para valores monetários quando foi utilizado Double;
 - Adicionado atributo cpf a classe cliente;
 - Criado a classe de seguro para aquisição do cliente;
 - Após o cliente adquirir o seguro, o valor referente ao seguro contratado é debito automáticamente da conta corrente do cliente;
 - criado um extrato para mostrar a contratação feita pelo cliente;
 - Mostrato o saldo final da conta corrente do cliente com os eventuais débitos descontados.


Saída da aplicação:
== Extrato Conta Corrente
== Cliente: João Victor
== CPF: 87643287218
== Agencia: 1
== Conta: 1
== Saldo: R$100

== Extrato Conta Corrente ==
== Cliente: João Victor
== CPF: 87643287218
== Agencia: 1
== Conta: 1
== Saldo: R$57

== Extrato Conta Poupança ==
== Cliente: João Victor
== CPF: 87643287218
== Agencia: 1
== Conta: 2
== Saldo: R$43

== Seguro de Vida ==
CPF: 87643287218
Nome: João Victor
Seguro contratado com sucesso no valor de R$30

== Extrato Conta Corrente ==
== Cliente: João Victor
== CPF: 87643287218
== Agencia: 1
== Conta: 1
== Saldo: R$27
