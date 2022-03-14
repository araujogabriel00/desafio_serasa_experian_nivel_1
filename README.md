</head><body>
  <article id="b81cbbb5-8ca1-4e6d-a2cd-98ae51dd6877" class="page sans">
    <header>
      <h1 class="page-title">Desafio Serasa Experian – Nível 1</h1>
    </header>
    <div class="page-body">
      <ul id="50136464-22a9-49d0-8a4c-1665da66c9d3" class="bulleted-list">
        <li style="list-style-type:disc">Usar linguagem Java (preferência Java 11);</li>
      </ul>
      <ul id="9d6478ae-ffd4-4cec-bb27-0447bb319a62" class="bulleted-list">
        <li style="list-style-type:disc">Usar maven no build do projeto;</li>
      </ul>
      <ul id="8d8e131a-f6ec-4e69-8878-e756614d0c09" class="bulleted-list">
        <li style="list-style-type:disc">Pode criar archetype usando o <a href="http://start.spring.io/">start.spring.io</a> (adicione as dependências que achar relevantes); </li>
      </ul>
      <ul id="a807277f-24b1-4a44-8081-296fa788737a" class="bulleted-list">
        <li style="list-style-type:disc">Usar framework Spring (incluindo Spring Boot, para iniciar o serviço);</li>
      </ul>
      <ul id="0f3b4b11-8a1a-4cc9-9752-f424bc802f9c" class="bulleted-list">
        <li style="list-style-type:disc">Montar um banco de dados em memória (pode usar o H2 ou HSQLDB), usando Hibernate na persistência de dados;</li>
      </ul>
      <ul id="5b73ea10-675b-423f-adfe-8db5ca03618d" class="bulleted-list">
        <li style="list-style-type:disc">Necessário pelo menos um teste unitário para cada método da camada Service, usando JUnit e Mockito;</li>
      </ul>
      <p id="1b8d207d-8644-402d-a62b-7148af830e15" class=""></p>
      <h2 id="77ddce57-be72-445f-ab6f-134216aa0a6a" class="">Lógica do Serviço</h2>
      <ul id="3875a5a9-0cfa-4b63-aecb-f8ca8ec6d8ca" class="bulleted-list">
        <li style="list-style-type:disc">Montar lógica na camada Service, para retornar o atributo scoreDescricao, correspondente ao score encontrado entre scoreInicial e scoreFinal;</li>
      </ul>
      <table id="fc93d8c9-e313-43ab-b656-55bcd3215c64" class="simple-table">
        <thead>
          <tr id="28012b7d-02f3-4716-bd82-15255a604a08">
            <th id="tmEr" class="simple-table-header">scoreDescricao</th>
            <th id="mBr=" class="simple-table-header">scoreInicial</th>
            <th id="_JMT" class="simple-table-header">scoreFinal</th>
          </tr>
        </thead>
        <tbody>
          <tr id="dcd47868-c4dd-468e-a592-25d97ae93033">
            <td id="tmEr">Insuficiente</td>
            <td id="mBr=">0</td>
            <td id="_JMT">200</td>
          </tr>
          <tr id="1d7df357-9e32-4ab3-91f2-5c4aab779c07">
            <td id="tmEr">Inaceitável</td>
            <td id="mBr=">201</td>
            <td id="_JMT">500</td>
          </tr>
          <tr id="9bb6c65d-4de2-4a22-9d4e-2decdd83bd83">
            <td id="tmEr">Aceitável</td>
            <td id="mBr=">501</td>
            <td id="_JMT">700</td>
          </tr>
          <tr id="5150e8d8-4aa2-4ccf-b20d-ee79863f04d6">
            <td id="tmEr">Recomendável</td>
            <td id="mBr=">701</td>
            <td id="_JMT">1000</td>
          </tr>
        </tbody>
      </table>
      <p id="d191b95d-b5dd-4cfc-ba91-d02cd1d3609a" class=""></p>
      <h2 id="d5b7e811-b4d7-446a-a9d7-74a4af317267" class="">ENTIDADES </h2>
      <h3 id="58f149fe-faf3-48f0-bc49-05d76bdbdedf" class="">PESSOA</h3>
      <ul id="634c1644-d46e-45f6-ac06-728fae6b5f76" class="bulleted-list">
        <li style="list-style-type:disc">id – numérico</li>
      </ul>
      <ul id="c048c9fd-63e6-4c17-9fa6-103eedec71fd" class="bulleted-list">
        <li style="list-style-type:disc">nome – texto</li>
      </ul>
      <ul id="78b9b792-43a9-4ba6-b153-7be619a9927f" class="bulleted-list">
        <li style="list-style-type:disc">telefone – texto</li>
      </ul>
      <ul id="4759bcd6-fbbd-448c-afbb-e9d748be2bb2" class="bulleted-list">
        <li style="list-style-type:disc">idade – numérico</li>
      </ul>
      <ul id="a678fc25-213c-481f-92c4-b6fa3ce15e3d" class="bulleted-list">
        <li style="list-style-type:disc">cidade – texto</li>
      </ul>
      <ul id="3100e224-1192-4f3a-8649-c787b7c21eca" class="bulleted-list">
        <li style="list-style-type:disc">estado – texto</li>
      </ul>
      <ul id="942af8f3-9bdc-4f65-ac49-094525a1c8c0" class="bulleted-list">
        <li style="list-style-type:disc">score – numérico</li>
      </ul>
      <h2 id="c2cfbc2d-8667-4084-8233-4d329f7d9fd7" class="">Endpoints do serviço</h2>
      <h3 id="f7056d70-45bf-4f1d-baeb-81419fc5d69d" class="">POST /pessoa</h3>
      <ul id="1641890a-caf3-44f1-9687-44c54bff2fbc" class="bulleted-list">
        <li style="list-style-type:disc">Informar a seguinte estrutura de dados na inclusão;</li>
      </ul>
      <ul id="7bfeeb8d-68cb-4634-8dad-e573a35028ef" class="bulleted-list">
        <li style="list-style-type:disc">Adicionar um atributo id automático, além dos dados do POST, durante inclusão dos dados no banco;</li>
      </ul>
      <ul id="3dd40556-a69b-46e3-b1ac-c74110666e4e" class="bulleted-list">
        <li style="list-style-type:disc">Retornar 201 no sucesso da inclusão;</li>
      </ul>
      <pre id="0c1c8b5d-2024-4e9e-92ac-9ed8e2681d63" class="code">
			<code>{
“nome”: “Fulano de Tal”,
“telefone”: “99 99999-9999”,
“idade”: 99,
“cidade”: “Cidade de Fulano”,
“estado”: “XX”,
“score”: 1000 // Entre 0 e 1000
}</code>
		</pre>
      <h3 id="506966e1-bab0-4f0c-815a-8115f3e8a809" class="">GET /pessoa/{id}</h3>
      <ul id="95716a21-96b1-4b1a-be40-cc52e23b3e48" class="bulleted-list">
        <li style="list-style-type:disc">Se id encontrado no banco, retornar a seguinte estrutura de dados:</li>
      </ul>
      <ul id="cb6b7f36-9fd8-4c38-8eb5-6c985d42f61a" class="bulleted-list">
        <li style="list-style-type:disc">Se id encontrado no banco, retornar 200, com a estrutura de dados;</li>
      </ul>
      <ul id="02eaab9e-39f7-4e23-9336-6bee3928ff80" class="bulleted-list">
        <li style="list-style-type:disc">Se id não encontrado no banco, retornar 204 (no content);</li>
      </ul>
      <pre id="6dc5b42f-01d0-43f2-a6e2-135c4ef1e249" class="code">
			<code>{
“nome”: “Fulano de Tal”,
“telefone”: “99 99999-9999”,
“idade”: 99,
“scoreDescricao”: “Recomendável”
}</code>
		</pre>
      <h3 id="d7fa2e6e-2a0c-4d24-8882-b10fe743543c" class="">GET /pessoa</h3>
      <ul id="5fbe6f3f-5cc6-4340-9c90-35947f9a1149" class="bulleted-list">
        <li style="list-style-type:disc">Retornar uma lista de todo o cadastro, sendo cada item da lista com a seguinte estrutura de dados:</li>
      </ul>
      <ul id="0bb0ad19-7766-4004-90a2-3bd7b3e1d89b" class="bulleted-list">
        <li style="list-style-type:disc">Se algum cadastro encontrado no banco, retornar 200, com a estrutura JSON;</li>
      </ul>
      <ul id="38814700-fa61-4db3-a1ec-b8f9fbc62cd4" class="bulleted-list">
        <li style="list-style-type:disc">Se nenhum item encontrado no banco, retornar 204 (no content);</li>
      </ul>
      <pre id="dcc78f31-afc7-47dc-9aac-3222bb2c1d31" class="code">
			<code>[
	{
“nome”: “Fulano de Tal”,
“cidade”: “Cidade de Fulano”,
“estado”: “XX”,
“scoreDescricao”: “Recomendável”
},
{
“nome”: “Sicrano de Tal”,
“cidade”: “Cidade de Sicrano”,
“estado”: “YY”,
“scoreDescricao”: “Insuficiente”
	}
]</code>
		</pre>
      <h1 id="0617b774-48b7-40b2-929a-c5490c4efb5b" class="">TESTE</h1>
      <figure id="47bf535a-dfc3-4e2e-9654-ecda2a85cde9">
        <a href="https://inside.contabilizei.com.br/conceitos-basicos-sobre-mockito-73b931ce0c2c" class="bookmark source">
          <div class="bookmark-info">
            <div class="bookmark-text">
              <div class="bookmark-title">Conceitos básicos sobre Mockito</div>
              <div class="bookmark-description">Dois assuntos que não são novos mas vem ganhando força atualmente são: a utilização de TDD e testes unitários. Muitas pessoas idealizam e defendem, mas quando vão colocar na prática acabam esbarrando nas dificuldades de se isolar o domínio e responsabilidades a serem testadas.</div>
            </div>
            <div class="bookmark-href">https://inside.contabilizei.com.br/conceitos-basicos-sobre-mockito-73b931ce0c2c</div>
          </div>
          <img src="https://miro.medium.com/max/800/1*7w64vyBXihVBrjNBBOIF9g.png" class="bookmark-image" />
        </a>
      </figure>
      <p id="106da74d-13eb-4607-90a5-5dbb6cf6cf33" class=""></p>
      <p id="ca718ae0-ae2d-448b-93d2-56b2bd8f50ef" class=""></p>
    </div>
  </article>undefined
</body>undefined</html>
