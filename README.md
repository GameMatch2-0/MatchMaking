# CRUD de usuário do 
Formato do JSON para testar métodos no insomnia(Para copiar basta clicar em copy raw no canto superior direito(icone de copiar que normalmente é usado na maioria dos sites)): <br>
{ 
    "nome": "Adam Sandler", 
    "orientacaoSexual": "Pansexual", 
    "email": "Adam@sandler.com", 
    "dtNascimento": "1997-04-07", 
    "celular": 1111111111, 
    "senha": "adam123S@ndler", 
    "jogosFavoritos": ["Valorant", "LOL", "PUBG", "Minecraft", "Tetris"] 
} <br><br>
 
retorno esperado: <br>
{ 
    "nome": "Adam Sandler", 
    "orientacaoSexual": "Pansexual", 
    "dtNascimento": "07/04/1997", 
    "email": "Adam@sandler.com", 
    "celular": 1111111111, 
    "senha": "adam123S@ndler", 
    "dtCadastro": "13/09/2023 21:02:08", 
    "jogosFavoritos": [ 
        "Valorant", 
        "LOL", 
        "PUBG", 
        "Minecraft", 
        "Tetris" 
    ], 
    "deleted": false 
} <br>
