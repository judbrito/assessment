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
    Então valido o login ausente

  @ID_0003
  Cenário: Cadastrar Usuário no site
    Dado que clico em sing Up
    Quando digito o usuário novo
    E digito a senha
    E clico no botão submit
    Então valido a mensagem conta nova

  @ID_0004
  Cenário: Validar usuário existente
    Dado que clico em sing Up
    Quando digito o usuário novo
    E a nova senha
    E clico no botão submit
    Então valido a mensagem conta existente

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

  @ID_0007
  Cenário: Verificar Notebook
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E digito a senha
    E clico no botão de login
    E confirmo o usuário logado
    Quando clico em laptops
    E confirmo a marca
    E adiciono no carrinho
    E confirmo o produto
    Então retorno a página inicial

  @ID_0008
  Cenário: Verificar Monitor
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E digito a senha
    E clico no botão de login
    E confirmo o usuário logado
    Quando clico em monitors
    E seleciono o primeiro item
    E adiciono no carrinho
    E confirmo o produto
    E clico em cart
    E confirmo o monitor
    Então retorno a página inicial

  @ID_0009
  Cenário: Verificar Multiplos produtos
    Dado que acesso o site
    E acesso o painel de login
    E digito o usuário
    E digito a senha
    E clico no botão de login
    E confirmo o usuário logado
    Quando clico em algumas categorias
    E seleciono alguns itens
    E adiciono no carrinho
    E retorno a página inicial
    Quando clico em algumas categorias
    E seleciono alguns itens
    E adiciono no carrinho
    E confirmo o produto
    E clico em cart
    Então a soma de todos os valores na tabela é {int}
    E retorno a página inicial
