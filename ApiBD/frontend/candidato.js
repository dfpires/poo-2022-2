// função assíncrona, sem saber quando o dado será obtido
async function cadastraCandidato(){
    // recupera os dados para inserção
    let nome = document.getElementById("nome").value
    let partido = document.getElementById("partido").value
    let idade = Number(document.getElementById("idade").value)
    let nota = Number(document.getElementById("nota").value)

    let id = Number(document.getElementById("id").value)
    let candidato
    let metodo
    if (id){
        // cria um objeto com os dados do usuário, com id
        candidato = {
            id, nome, partido, idade, nota
        }     
        metodo = 'PUT'   // atualiza
    }
    else {
        // cria um objeto com os dados do usuário, sem id
        candidato = {
            nome, partido, idade, nota
        }
        metodo = 'POST'  // insere
    }

    // efetivamente chama a API e aguarda a resposta
    await fetch(`http://localhost:8080/api/candidato`, {
        method: metodo,
        body: JSON.stringify(candidato),
        headers: { 
            "Content-Type": "application/json; charset=UTF-8"
        }
    })
    .then (resposta => alert(`Candidato inserido com sucesso`)) // quando resposta chegar
    .catch( erro => alert(erro)) // erro ao tentar consumir API
    // limpa os campos
    document.getElementById("nome").value = ''
    document.getElementById("partido").value = ''
    document.getElementById("idade").value = ''
    document.getElementById("nota").value = ''
    consultaCandidatos()
}

async function remover(id){
    let conf = confirm(`Confirma a exclusão do candidato ${id}`)
    if (conf){ // usuário quer remover
        await fetch(`http://localhost:8080/api/candidato/${id}`, {
            method: 'DELETE'
        })
        .then( resposta => {
            alert(`Candidato ${id} foi removido com sucesso`)
        })
        .catch(erro => {
            alert(erro)
        })
    }
    consultaCandidatos()
}

function atualizar(id, nome, partido, idade, nota){
    document.getElementById('id').value = id
    document.getElementById('nome').value = nome
    document.getElementById('idade').value = idade
    document.getElementById('partido').value = partido
    document.getElementById('nota').value = nota
}
async function consultaCandidatos(){
    // GET
    let candidatos = await fetch(`http://localhost:8080/api/candidato`)
                    .then( resposta => { // obtive resposta do servidor
                        return resposta.json() // converte para JSON
                    })
                    .catch(erro => { // obtive erro do servidor
                        alert(erro)
                    })
    // para cada candidato
    let conteudoTabela = ''
    candidatos.forEach( candidato => {
        // cria uma linha da tabela para cada candidato
        conteudoTabela += `<tr> <td> ${candidato.nome} </td> <td> ${candidato.partido} </td> <td> ${candidato.idade} </td> <td> ${candidato.nota} </td> <td> <i onClick="remover(${candidato.id})" class="bi bi-trash"/></td> <td> <i onClick="atualizar(${candidato.id}, '${candidato.nome}', '${candidato.partido}', ${candidato.idade}, ${candidato.nota})" class="bi bi-pencil"/> </tr>`
    })
    document.getElementById("conteudoTabela").innerHTML = conteudoTabela
}