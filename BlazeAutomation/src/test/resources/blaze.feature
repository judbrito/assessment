#language: pt
Funcionalidade: 
  Automação do site DemonBlaze

  @ID_0001
  Cenário: Fazer login no site
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E digito a senha
    E clico no botão de login
    Então confirmo o usuário logado

  @ID_0002
  Cenário: Fazer logout no site
    Dado que clico em logout
    Quando confirmo o usuário logado
    Então valido o login ausente

  @ID_0003
  Cenário: Cadastrar Usuário no site
    Dado que clico em sing Up
    Quando digito o usuário novo
    E digito a nova senha
    E clico no botão submit
    Então valido a mensagem conta nova
    E retorno a página inicial

  @ID_0004
  Cenário: Validar usuário existente
    Dado que clico em sing Up
    Quando digito o usuário existente
    E digito a nova senha
    E clico no botão submit
    Então valido a mensagem conta existente
    E clico no botão fechar modal

  @ID_0005
  Cenário: Validar video existente
    Dado que clico em About Us
    Quando clico em play
    E o video inicia
    Então confirmo o video andamento

  @ID_0006
  Cenário: Enviar mensagem pelo contato
    Dado que clico em contato
    Quando escrevo o email
    E escrevo o nome
    E escrevo a mensagem
    E clico em enviar mensagem
    Então valido o envio da mensagem

  @ID_0001 @ID_0007
  Cenário: Verificar Notebook
    Dado clico em laptops
    E confirmo a marca
    E adiciono no carrinho
    E clico em cart
    E confirmo o produto
    Então retorno a página inicial

  @ID_0001 @ID_0008
  Cenário: Verificar Monitor
    Dado clico em monitors
    E seleciono o primeiro item
    Quando adiciono no carrinho
    E clico em cart
    E confirmo o produto
    E retorno a página inicial

  @ID_0001 @ID_0009
  Cenário: Verificar Multiplos produtos
    Dado clico em algumas categorias
    Quando seleciono alguns itens
    E adiciono no carrinho
    E retorno a página inicial
    Quando clico em algumas categorias
    E seleciono alguns itens
    E adiciono no carrinho
    E clico em cart
    E verifico ambos os resultados
    Então a soma de todos os valores na tabela é {int}
    E retorno a página inicial

  @ID_0001 @ID_0010
  Cenário: Verificar carrinho vazio
    Dado clico em algumas categorias
    E seleciono alguns itens
    E adiciono no carrinho
    E clico em cart
    Quando deleto um item
    E confirmo carrinho vazio
    Então retorno a página inicial

  @ID_0009 @ID_0011
  Cenário: Verificar ajuste dos valores
    Dado que clico em phones
    E seleciono alguns itens
    Quando adiciono no carrinho
    Então retorno a página inicial
    Quando clico em laptops
    E seleciono alguns itens
    E adiciono no carrinho
    E clico em cart
    Quando a soma de todos os valores na tabela é {int}
    E deleto um item
    Então a soma de todos os valores na tabela é {int}
    E retorno a página inicial

  @ID_0009 @ID_0012
  Cenário: Verificar efetivação da compra
    Dado clico em cart
    E clico no botão place order
    E digito o nome
    E digito o country
    Quando digito o city
    E digito o credit card
    E digito o month
    E digito o year
    Então clico no botão purchase
    E clico no Ok
