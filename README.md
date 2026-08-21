# Calculadora Posto

![GitHub repo size](https://img.shields.io/github/repo-size/pedrohenriquefalcao/calculadora-posto?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/pedrohenriquefalcao/calculadora-posto?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/pedrohenriquefalcao/calculadora-posto?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/pedrohenriquefalcao/calculadora-posto?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr/pedrohenriquefalcao/calculadora-posto?style=for-the-badge)

> Aplicação para encontrar valores (em R$, % e litragem) de combustíveis.

## Ajustes e melhorias

O projeto está em desenvolvimento contínuo. Atualmente as seguintes funcionalidades estão implementadas ou em planejamento:

- [x] Cálculo de valores e litragem (com e sem acréscimo)
- [x] Conversão entre Litragem e Valores em Reais
- [x] Cálculo da razão Álcool vs Gasolina (Qual compensa mais)
- [x] Persistência de preferência (valor de acréscimo)
- [ ] Melhorias na interface do usuário


## Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Você instalou o Java 11 ou superior.
- Você tem o Maven instalado.
- Você tem uma máquina Windows, Linux ou Mac.
- Você leu a documentação do projeto.

## Instalando e Usando a Calculadora Posto

### Para Usuários Finais (Pronto para Uso)

Você não precisa compilar o projeto para usá-lo! Uma versão pronta da aplicação está disponível na pasta `export` (um nível acima da pasta de código-fonte).

- **Windows:** Basta acessar a pasta `export` e executar o arquivo `CalculadoraPosto.exe`.
- **Outros Sistemas Operacionais (Linux/macOS):** Certifique-se de ter o Java instalado e execute o arquivo `.jar` disponível na mesma pasta:
  ```bash
  cd export
  java -jar calculadora-posto.jar
  ```

### Para Desenvolvedores (Código Fonte)

Se você deseja clonar e modificar o projeto, siga estas etapas:

```bash
git clone https://github.com/pedrohenriquefalcao/calculadora-posto.git
cd calculadora-posto/calculadora-posto
```

*(Nota: O projeto utiliza Java Swing para a interface gráfica. Importe o projeto em sua IDE favorita (Eclipse, IntelliJ, etc) para compilar e testar).*

## Contribuindo para Calculadora Posto

Para contribuir com o projeto, siga estas etapas:

1. Faça um fork deste repositório.
2. Crie um branch: `git checkout -b nome-do-branch`.
3. Faça suas alterações e confirme-as: `git commit -m 'minha contribuição'`
4. Envie para o branch remoto: `git push origin nome-do-branch`
5. Abra uma pull request.

## Seja um dos contribuidores

Quer fazer parte desse projeto? Consulte a documentação de contribuição do repositório.
