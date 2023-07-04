#language: pt
Funcionalidade: 
  Automação do site DemonBlaze

  Cenário: Fazer login no site
    Dado que acesso o site
    E acesso o painel de login
    Quando digito o usuário
    E a senha
    E clico no botão de logar
    Então confirmo o usuario logado

  Cenário: Fazer logout no site
    Dado que clico em logout
    Então valido login ausente

  Cenário: Cadastrar Usuário no site
    Dado que clico em sing Up
    Quando digito o usuário novo
    E a nova senha
    Então valido a mensagem conta existente
