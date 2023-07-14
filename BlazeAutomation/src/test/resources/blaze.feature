#language: pt
Funcionalidade: 
  Automação do site DemonBlaze

  @ID_0001
  Cenário: Fazer login no site
    Dado que acesso o site

  E acesso o painel de login
  Quando digito o usuário
  E a senha
  E clico no botão de logar
  Então confirmo o usuario logado
  
  @ID_0002
  Cenário: Fazer logout no site
  Dado que clico em logout
  Então valido login ausente
  
  @ID_0003
  Cenário: Cadastrar Usuário no site
  Dado que clico em sing Up
  Quando digito o usuário novo
  E a nova senha
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
  Então confirmo video andamento
  
  @ID_0006
  Cenário: Mensagem pelo contato
  Dado que clico em contato
  Quando escrevo o email
  E escrevo o nome
  E escrevo a mensagem
  E clico em enviar mensagem
  Então valido envio da mensagem
  
  @ID_0007
  Cenário: Verificar Notebook
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E a senha
    E clico no botão de logar
    E confirmo o usuario logado
    Quando que clico em laptops
    E confirmo a marca
    E adiciono no carrinho
    E confirmo o produto
    Então retorno pagina home

  @ID_0008
  Cenário: Verificar Monitor
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E a senha
    E clico no botão de logar
    E confirmo o usuario logado
    Quando que clico em monitors
    E seleciono o primeiro item
    E adiciono no carrinho
    E confirmo o produto
    E clico em cart
    E confirmo o monitor
    Então retorno pagina home
