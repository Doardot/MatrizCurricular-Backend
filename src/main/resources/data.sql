SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE requirements;
TRUNCATE TABLE course_subject;
TRUNCATE TABLE subject;
TRUNCATE TABLE course;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AL', 'Engenharia de Software', 8, 120);
INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AH', 'Ciência de Dados e IA', 8, 120);

INSERT INTO subject (credit_code, name, credits, description) VALUES ('95303-04', 'Matemática Discreta', 4, 'Estudo da lógica proposicional e técnicas básicas de demonstração. Estudo da álgebra de conjuntos. Estudo e discussão dos conceitos de relações, funções totais e parciais, relações de ordem parcial e total e relações de equivalência. Análise de definições indutivas, recursão e do princípio de indução. Introdução à álgebra Booleana.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('254CF-02', 'Formação do Empreendedor', 2, 'Compreensão dos conceitos: empreendedorismo e empreendedor, empreendimento e empresa. Análise do contexto do empreendedorismo e da inovação. Caracterização do perfil empreendedor: motivação e liderança. Visão sobre a prática empreendedora e as ferramentas úteis ao empreendedor. Modelagem de Negócios e Plano de Negócios: estudo das suas etapas, processos e elaboração. Perspectivas do Empreendedorismo no Brasil.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611C-06', 'Fundamentos de Programação', 6, 'Discussão sobre algoritmos como ferramenta para a descrição da solução de problemas e os fundamentos necessários para sua implementação usando linguagens de programação. Exame das noções de constantes, variáveis, tipos e expressões. Estudo de programas sequenciais, comandos de entrada e saída e o processo de compilação. Construção de programas com seleção, iterativos e uso do conceito de subprogramas. Estudo e uso de estruturas de dados usando arranjos e matrizes e conceitos básicos de classes e objetos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95300-04', 'Cálculo I', 4, 'Caracterização de funções de uma variável. Estudo do domínio e representação gráfica dessas funções. Análise de limites e continuidade. Definições e aplicações de derivadas diferenciais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98900-02', 'Introdução à Engenharia de Software', 2, 'Introdução aos conceitos relacionados a área de Engenharia de Software, incluindo processo, atividades, papéis e modelos de processo. Diferença entre a área de Engenharia de Software e outras Engenharias e cursos de computação. Estudo dos modelos de ciclos de vida de software e das disciplinas relacionadas à Engenharia de Software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98705-02', 'Introdução à Computação', 2, 'Apresentação da Computação como área de estudo: suas origens, seu tema de estudo e sua relação com os diversos cursos de computação. Apresentação das grandes camadas de um sistema computacional: informação, hardware, sistema operacional, aplicações. Estudo teórico-prático da representação de informação, com ênfase em sistemas de numeração, em particular o sistema binário. Discussão sobre os grandes desafios da computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611E-04', 'Lógica para Computação', 4, 'Estudos dos principais conceitos da Lógica Matemática e de sua aplicação na Ciência da Computação. Exame e discussão dos conceitos de sintaxe e semântica, equivalência, relação de consequência lógica, relação de dedutibilidade, cálculo de dedução natural e outros sistemas de dedução tanto para a lógica proposicional como para a lógica de predicados. Aplicação do raciocínio automático na computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98901-04', 'Banco de Dados I', 4, 'Entendimento da arquitetura típica de um banco de dados. Estudo sobre modelos de dados: clássicos, relacional e pós-relacionais. Compreensão dos diferentes formalismos para modelagem conceitual. Solução de projetos de bancos de dados pelo uso de dependências funcionais, formas normais e de restrições de integridade. Solução de implementação de bancos de dados: modelo lógico e físico, e mapeamento do modelo conceitual para o de implementação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645G-04', 'Algoritmos e Estruturas de Dados I', 4, 'Construção e raciocínio sobre diferentes algoritmos e implementações para estruturas de dados lineares e hierárquicas: listas, filas, pilhas e árvores. Exame da adequação destes algoritmos na solução de diversas classes de problemas. Construção de algoritmos e implementações para problemas de ordenação e pesquisa. Discussão, análise e raciocínio sobre a complexidade de algoritmos e implementações correspondentes.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611F-04', 'Programação Orientada a Objetos', 4, 'Desenvolvimento de sistemas de software de complexidade média utilizando o paradigma de orientação a objetos. Estudo e análise dos conceitos de abstração, herança e polimorfismo. Discussão de aspectos avançados sobre classes. Uso de bibliotecas de coleções. Projeto de sistemas orientados a objetos. Manipulação básica de arquivos texto. Noções de programação orientada a eventos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46506-04', 'Engenharia de Requisitos', 4, 'Estudo de conceitos e fundamentos básicos sobre engenharia de requisitos. Estudo do ciclo de vida de requisitos e os processos associados. Compreensão da distinção entre requisitos de negócio, de sistema, funcionais e não funcionais. Compreensão do processo de negociação e definição do escopo de um sistema de software. Estudo de metodologias, técnicas e ferramentas para apoio à engenharia de requisitos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98800-04', 'Fundamentos de Sistemas Computacionais', 4, 'Estudo dos sistemas de numeração. Introdução a um sistema computacional básico: entrada e saída, unidade de processamento e memória. Apresentação da relação software-hardware: conceito de operação com o processador, linguagem de montagem, compiladores, montadores, ligadores e carregadores. Estudo de circuitos combinacionais e otimização de representações Booleanas: portas lógicas e formas algébricas. Exploração de problemas básicos: definição de caminho crítico e tipos de conflitos em processadores pipeline. Apresentação dos princípios e padrões subjacentes a sistemas de entrada e saída em sistemas computacionais. Estudo de conceitos relativos à hierarquia de memória, com foco no papel da memória cache. Estudo de conceitos básicos de multiprocessamento. Avaliação de desempenho de arquiteturas de computadores.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46509-02', 'Gerenciamento de Configuração de Software', 2, 'Estudo do processo de gerenciamento de configuração de software no que tange a sua identificação e planejamento, a verificação e auditoria da configuração, o controle de mudanças e o gerenciamento de entregas. Análise e apresentação de opções de ferramentas de apoio ao gerenciamento de configuração de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46515-04', 'Linguagens, Autômatos e Computação', 4, 'Introdução às linguagens formais: definições, propriedades e operações. Estudo de linguagens na hierarquia de Chomsky: regulares, livres de contexto, sensíveis ao contexto, enumeráveis recursivamente. Estudo de máquinas como reconhecedores de linguagens: autômatos finitos, autômatos de pilha e máquinas de Turing. Estudo teórico prático de expressões regulares. Introdução ao conceito de computabilidade.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98902-02', 'Banco de Dados II', 2, 'Visão geral das principais formas de uso de bancos de dados: orientados a transação, orientados ao processamento analítico e orientados a consultas de dados não convencionais. Visão geral da definição de dados na abordagem relacional, em modelos OLAP, bem como nas abordagens sem esquemas prévios (NoSQL). Estudo sobre linguagens de definição e manipulação de banco de dados e, em especial, SQL. Definição e consultas de dados nas principais formas de uso de bancos de dados, com entendimento dos principais fatores envolvidos com desempenho.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645H-04', 'Algoritmos e Estruturas de Dados II', 4, 'Construção e raciocínio sobre diferentes algoritmos e implementações para estruturas de dados não lineares: heaps, tabelas de espalhamento e grafos. Apresentação de aplicações avançadas das estruturas de dados: heapsort, conjuntos, tries, árvores B, quadtrees e codificação de Huffman. Exame da adequação destes algoritmos na solução de diversas classes de problemas. Discussão, análise e raciocínio sobre a complexidade de algoritmos e implementações correspondentes.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46526-02', 'Programação de Software Básico', 2, 'Estudo de linguagem de programação adequada para os chamados sistemas “de software básico” ou que exijam alto desempenho. Aprendizado de uma linguagem de programação que tenha acesso direto a recursos de hardware e sistema operacional, e que propicie implementações eficientes.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95304-04', 'Probabilidade e Estatística', 4, 'Organização, análise, interpretação de dados e estudo de modelos probabilísticas enfatizando o princípio da incerteza. Investigação da relação entre variáveis. Noções de amostragem visando à estimação de parâmetros e o estabelecimento de hipóteses estatísticas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46522-04', 'Prática na Agência Experimental I (120h)', 4, 'Realização de atividades integradoras de capacitação e qualificação na Agência Experimental de Engenharia de Software. Desenvolvimento de habilidades e competências em Engenharia de Software por meio de atuação em projetos de desenvolvimento de software. Estabelecimento de relações entre o conhecimento teórico e a aplicação prática da Engenharia de Software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46514-04', 'Linguagens de Programação', 4, 'Introdução aos processos de compilação e interpretação. Apresentação de conceitos de análise léxica, sintaxe e de semântica de linguagens, incluindo: amarração, tipos de dados, avaliação de expressões, passagem de parâmetros. Estudo comparativo de paradigmas de linguagens de programação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98903-02', 'Processos de Software', 2, 'Apresentação das metodologias de desenvolvimento de software e metodologias ágeis. Estudo de lean e user centered design. Integração entre metodologias ágeis, lean e user centered design. Apresentação de tendências no processo de desenvolvimento de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646Z-04', 'Projeto e Otimização de Algoritmos', 4, 'Estudo teórico e prático das principais técnicas para o projeto de algoritmos, como algoritmos gulosos, divisão e conquista, programação dinâmica, backtracking, branch and bound e algoritmos aproximativos como algoritmos genéticos, gradiente descendente e outros.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98713-04', 'Fundamentos de Processamento Paralelo e Distribuído', 4, 'Introdução à computação concorrente e sua representação com sistemas de transição de estados. Estudo de processos e threads. Estudo sobre memória compartilhada e passagem de mensagem. Descrição da semântica de mecanismos de sincronização e seu uso na programação concorrente. Apresentação de abordagens para modelagem e avaliação de propriedades de sistemas concorrentes. Apresentação dos objetivos e pressupostos ambientais para sistemas paralelos e para sistemas distribuídos. Análise das abordagens para modelagem de aplicações paralelas com memória compartilhada e passagem de mensagem. Estudo das principais abstrações para programação distribuída. Apresentação de estudos de caso de sistemas paralelos e de sistemas distribuídos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98904-04', 'Verificação e Validação de Software', 4, 'Apresentação dos conceitos fundamentais de qualidade de software no contexto de processo de software. Discussão do conceito de Dependabilidade para compreender a qualidade de um produto de software, com ênfase na confiabilidade. Discussão dos conceitos de verificação e validação como técnicas de remoção de falhas. Apresentação dos níveis de verificação e validação. Estudo teórico-prático de técnicas e ferramentas para verificação e validação de software em diferentes plataformas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46523-04', 'Prática na Agência Experimental II (120h)', 4, 'Realização de atividades integradoras de capacitação e qualificação na Agência Experimental de Engenharia de Software. Aprofundamento de habilidades e competências em Engenharia de Software por meio de atuação em projetos de desenvolvimento de software. Estabelecimento de relações entre o conhecimento teórico e a aplicação prática da Engenharia de Software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98708-04', 'Inteligência Artificial', 4, 'Estudo teórico-prático das diversas abordagens de formalização e resolução de problemas utilizando algoritmos de inteligência artificial. Estudo teórico-prático de algoritmos de busca para resolução de problemas em agentes autônomos. Apresentação de abordagens para representação de conhecimento. Apresentação de técnicas de geração automática de planos. Introdução ao Aprendizado de Máquina com ênfase em Aprendizado por reforço.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98906-04', 'Projeto e Arquitetura de Software', 4, 'Introdução aos conceitos fundamentais de projeto de software. Estudo de arquiteturas de referência, padrões de arquitetura e de projeto. Uso de notações de projeto de software. Aplicação de métodos e estratégias de projeto de software. Uso de ferramentas de projeto.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98905-04', 'Experiência do Usuário', 4, 'Reflexão sobre conceitos e teorias relacionados à qualidade de uso e design de sistemas interativos. Aplicação de técnicas para elicitação e análise de dados sobre usuários e tarefas. Aplicação de fundamentos e técnicas para concepção de interfaces e de interação. Aplicação de métodos de avaliação de sistemas interativos. Investigação de interfaces não-convencionais e seu impacto em sistemas interativos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98700-04', 'Sistemas Operacionais', 4, 'Apresentação da organização básica de sistemas operacionais. Estudo da evolução da estrutura e funcionamento dos sistemas operacionais. Apresentação do conceito de processos e de mecanismos de sincronização entre processos que compartilham memória e sua implementação em um sistema operacional. Exemplos práticos de criação e sincronização de processos. Introdução e exploração do conceito de algoritmos de escalonamento. Estudo da comunicação inter-processos. Análise e discussão de problemas relacionados à “deadlock” e à comunicação entre processos. Estudo sobre gerenciamento de memória, gerenciamento de entrada e saída e gerenciamento de arquivos. Análise e discussão de problemas relacionados ao gerenciamento de memória, gerenciamento de entrada e saída e gerenciamento de arquivos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46510-04', 'Gerenciamento de Projeto de Software', 4, 'Estudo do conceito e dos objetivos da gerência de projetos e apresentação do ciclo de vida de gerenciamento de projeto, de seus processos e dos papéis envolvidos. Discussão do alinhamento de um projeto de Tecnologia da Informação (TI) com as estratégias organizacionais. Compreensão sobre um portfólio de projetos de TI e sobre o PMO (Project Management Office). Estudo de metodologias, técnicas e ferramentas para o apoio do gerenciamento de projeto de TI.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46507-02', 'Engenharia de Software Experimental', 2, 'Estudo de conceitos introdutórios sobre e Engenharia de Software Experimental, incluindo conceitos de experimentação e método científico. Caracterização de tipos de estudos experimentais e não-experimentais (empíricos) na Engenharia de Software, focando em revisão da literatura, estudos de caso, surveys, experimentos controlados e estudos baseados em simulações. Planejamento e execução de estudos experimentais no contexto da Engenharia de Software. Apresentação de técnicas de coleta e análise qualitativa e quantitativa de dados para apoio ao desenvolvimento de estudos experimentais em Engenharia de Software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46504-04', 'Construção de Software', 4, 'Visão geral sobre os fundamentos de construção de software. Estudo de conceitos relacionados à reutilização de software. Entendimento e exploração dos conceitos de frameworks, componentes e linhas de produtos de software. Conhecimento dos conceitos de engenharia de software dirigida por modelos. Desenvolvimento e uso de ferramentas de reutilização de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98H00-04', 'Infraestrutura para Gestão de Dados', 4, 'Visão geral de sistemas de bancos de dados, suas principais funcionalidades e formas de uso: orientados a transação, orientados ao processamento analítico e orientados a consultas de dados não convencionais. Entendimento dos modelos de transações de bancos de dados, de gerência de memória principal e secundária, de controle de concorrência e de recuperação após falhas. Estudo sobre a otimização de consultas e de transações em bancos de dados. Visão geral sobre a gestão de bancos de dados sem esquemas prévios.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4471V-02', 'Sistemas de Planejamento e Custos para Engenharia', 2, 'Introdução ao planejamento estratégico e indicadores de desempenho. Estudo de modelos econométricos de análise da oferta e da demanda. Estudo de planejamento integrado de vendas, produção e suprimentos. Análise de custos em engenharia: custos diretos e custos indiretos; custos fixos e custos variáveis; custo total e custo unitário. Análise econômica para tomada de decisão: receitas, custos, lucro e cálculo do ponto de equilíbrio em empresas multiprodutos e multiprocessos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98709-04', 'Fundamentos de Redes de Computadores', 4, 'Estudo dos Modelos de referência de interconexão de computadores OSI/ISO e da Arquitetura Internet, apresentando em mais detalhamento os Níveis de Rede, Transporte e Aplicação, com seus conceitos, funções e protocolos. Estudo e análise do impacto das funções dos protocolos de comunicação no desenvolvimento e desempenho das aplicações.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98710-02', 'Laboratório de Redes de Computadores', 2, 'Desenvolvimento de experimentos que abranjam operação, configuração e análise de protocolos da Arquitetura Internet. Desenvolvimento e análise de comportamento de aplicações distribuídas com diferentes requisitos de qualidade. Simulação e análise de arquiteturas de comunicação variadas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46524-04', 'Prática na Agência Experimental III (120h)', 4, 'Realização de atividades integradoras de capacitação e qualificação na Agência Experimental de Engenharia de Software. Aprofundamento de habilidades e competências em Engenharia de Software por meio de atuação em projetos de desenvolvimento de software. Estabelecimento de relações entre o conhecimento teórico e a aplicação prática da Engenharia de Software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646M-04', 'Métodos Formais para Computação', 4, 'Conceitos essenciais de especificação formal, verificação formal e métodos formais. Especificação e verificação de modelos e programas. Estudo da lógica de Hoare. Especificação de assertivas, pré e pós-condições, invariantes e variantes. Aplicação de ferramentas de verificação automática sobre especificações e programas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('13397-02', 'Psicologia e Gestão de Pessoas em TI', 2, 'Estudo de contribuições da psicologia à gestão de pessoas. Interfaces entre percepção, comunicação e relações interpessoais. Estudo dos papéis grupais. Reflexão sobre liderança e motivação no contexto de trabalho contemporâneo. Implicações das contínuas mudanças de base tecnológica para usuários e profissionais de TI.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4471X-02', 'Engenharia Econômica', 2, 'Introdução à engenharia econômica e à análise de projetos de investimento. Estudo de conceitos de matemática financeira: juros e taxas de juros, valor do dinheiro no tempo e sistemas de amortização de financiamentos. Apresentação de critérios para avaliação econômica de projetos de investimento: valor presente líquido, valor uniforme líquido, taxa interna de retorno e tempo de recuperação do capital. Análise de depreciação e imposto de renda.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4636N-04', 'Infraestrutura de Tecnologia da Informação', 4, 'Apresentação dos componentes que formam uma infraestrutura de Tecnologia de Informação (TI) e suas funções. Estudo dos principais pontos relacionados à infraestrutura de TI nos modelos de gestão de TI. Análise do uso de técnicas de virtualização. Apresentação dos principais dispositivos para processamento, comunicação e armazenamento. Estudo das características da infraestrutura em ambientes de computação em nuvem. Apresentação do conceito de Green IT. Avaliação de estudos de casos de infraestrutura de TI.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611G-04', 'Simulação e Métodos Analíticos', 4, 'Estudo de técnicas e opções para simulação e análise estocástica através de modelos computacionais. Apresentação de técnicas de representação de estados e de tempo, de aleatoriedade e determinismo em contexto computacional. Estudo de métodos e ferramentas básicas de simulação e métodos analíticos. Apresentação de formalismos clássicos e estruturados para representação de modelos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('1501A-04', 'Ética e Cidadania', 4, 'Abordagem de problemas e conceitos filosóficos relacionados à moralidade e ao exercício da cidadania. Introdução aos principais temas e problemas de Ética, presentes na História da Filosofia. Reflexão filosófica sobre o ideal democrático, a cidadania e os direitos humanos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('11521-04', 'Humanismo e Cultura Religiosa', 4, 'A condição humana aberta ao transcendente; Fé cristã e cultura atual; O estudo do fenômeno religioso em suas diferentes Tradições; Elementos da cultura e da religiosidade afro-brasileira e indígena; A relação entre fé e razão, e ciência e religião; Motivação para ações comunitárias, como engajamento consequente de uma consciência social e da fé cristã.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98715-04', 'Segurança de Sistemas', 4, 'Apresentação e implementação de criptografia clássica; cifras de fluxo (stream ciphers) e cifras de bloco (block ciphers). Entendimento de integridade de mensagens (Message Authentication Codes). Conhecimento de criptografia simétrica, aritmética modular; números primos e fatoração, funções e geradores pseudo-aleatórios, e criptografia assimétrica. Uso de bibliotecas de criptografia. Apresentação do Marco Civil da Internet. Entendimento e como cumprir a Lei de Proteção de Dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98907-02', 'Engenharia e Gestão do Conhecimento', 2, 'Introdução à sociedade e economia do conhecimento. Apresentação dos conceitos de dado, informação e conhecimento. Apresentação da definição de Engenharia e Gestão do Conhecimento. Estudo de organizações baseadas em conhecimento. Análise e diagnóstico de Gestão do Conhecimento em organizações. Estudo de organizações de conhecimento. Apresentação de práticas e de ferramentas de Gestão do Conhecimento. Apresentação de inovações, novas tendências, ecossistemas de inovação e ambientes de inovação em Gestão do Conhecimento.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46517-02', 'Melhoria de Processos de Software', 2, 'Fundamentação de melhoria e avaliação de processo de software. Estudo sobre qualidade de serviço. Definição de métricas de software. Uso de ferramentas de processo de software. Definição e avaliação de processos de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46525-04', 'Prática na Agência Experimental IV (120h)', 4, 'Realização de atividades integradoras de capacitação e qualificação na Agência Experimental de Engenharia de Software. Aprofundamento de habilidades e competências em Engenharia de Software por meio de atuação em projetos de desenvolvimento de software. Estabelecimento de relações entre o conhecimento teórico e a aplicação prática da Engenharia de Software.');

-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '254CF-02', 1);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611C-06', 1);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95300-04', 1);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95303-04', 1);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98705-02', 1);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98900-02', 1);

-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611E-04', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611F-04', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4645G-04', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46506-04', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46509-02', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98800-04', 2);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98901-04', 2);

-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4645H-04', 3);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46515-04', 3);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46522-04', 3);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46526-02', 3);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95304-04', 3);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98902-02', 3);

-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4646Z-04', 4);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46514-04', 4);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46523-04', 4);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98713-04', 4);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98903-02', 4);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98904-04', 4);

-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46507-02', 5);
-- INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '46510-04', 5, 60);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98700-04', 5);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98708-04', 5);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98905-04', 5);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98906-04', 5);

-- INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '1501A-04', 6, 60);
-- INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '4471V-02', 6, 80);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46504-04', 6);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98H00-04', 6);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98709-04', 6);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98710-02', 6);

-- INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '13397-02', 7, 80);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4471X-02', 7);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611G-04', 7);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4636N-04', 7);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4646M-04', 7);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46524-04', 7);

-- INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '11521-04', 8, 60);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46517-02', 8);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46525-04', 8);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98715-04', 8);
-- INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98907-02', 8);

-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95303-04', '4611E-04'); -- PREREQUISITE: Matemática Discreta para Lógica para Computação
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '4611F-04'); -- PREREQUISITE: Fundamentos de Programação para Programação Orientada a Objetos
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '4645G-04'); -- PREREQUISITE: Fundamentos de Programação para Algoritmos e Estruturas de Dados I
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98900-02', '46506-04'); -- PREREQUISITE: Introdução à Engenharia de Software para Engenharia de Requisitos
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98705-02', '98800-04'); -- SPECIAL: Introdução à Computação para Fundamentos de Sistemas Computacionais
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645G-04', '4645H-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados I para Algoritmos e Estruturas de Dados II
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95303-04', '46515-04'); -- SPECIAL: Matemática Discreta para Linguagens, Autômatos e Computação
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98900-02', '46522-04'); -- SPECIAL: Introdução à Engenharia de Software para Prática na Ages I
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '46509-02', '46522-04'); -- SPECIAL: Gerenciamento de Configuração de Software para Prática na Ages I
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '46522-04'); -- PREREQUISITE: Programação Orientada a Objetos para Prática na Ages I
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4645G-04', '46526-02'); -- SPECIAL: Algoritmos e Estruturas de Dados I para Programação de Software Básico
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95300-04', '95304-04'); -- SPECIAL: Cálculo I para Probabilidade e Estatística
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98901-04', '98902-02'); -- PREREQUISITE: Banco de Dados I para Banco de Dados II
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645H-04', '4646Z-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados II para Projeto e Otimização de Algoritmos
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46515-04', '46514-04'); -- PREREQUISITE: Linguagens, Autômatos e Computação para Linguagens de Programação
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46522-04', '46523-04'); -- PREREQUISITE: Prática na Ages I para Prática na Ages II
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98901-04', '46523-04'); -- PREREQUISITE: Banco de Dados I para Prática na Ages II
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46515-04', '98713-04'); -- PREREQUISITE: Linguagens, Autômatos e Computação para Fundamentos de Processamento Paralelo
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '98713-04'); -- PREREQUISITE: Programação Orientada a Objetos para Fundamentos de Processamento Paralelo
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46506-04', '98904-04'); -- PREREQUISITE: Engenharia de Requisitos para Verificação e Validação de Software
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95304-04', '46507-02'); -- PREREQUISITE: Probabilidade e Estatística para Engenharia de Software Experimental
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98800-04', '98700-04'); -- PREREQUISITE: Fundamentos de Sistemas Computacionais para Sistemas Operacionais
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '98708-04'); -- PREREQUISITE: Lógica para Computação para Inteligência Artificial
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645H-04', '98708-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados II para Inteligência Artificial
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46506-04', '98905-04'); -- PREREQUISITE: Engenharia de Requisitos para Experiência do Usuário
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646Z-04', '98906-04'); -- PREREQUISITE: Projeto e Otimização de Algoritmos para Projeto e Arquitetura de Software
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98906-04', '46504-04'); -- PREREQUISITE: Projeto e Arquitetura de Software para Construção de Software
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98902-02', '98H00-04'); -- PREREQUISITE: Banco de Dados II para Infraestrutura para Gestão de Dados
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98700-04', '98709-04'); -- PREREQUISITE: Sistemas Operacionais para Fundamentos de Redes de Computadores
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (2, '98709-04', '98710-02'); -- COREQUISITE: Fundamentos de Redes de Computadores para Laboratório de Redes
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4471V-02', '4471X-02'); -- SPECIAL: Sistemas de Planejamento e Custos para Engenharia para Engenharia Econômica
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95304-04', '4611G-04'); -- PREREQUISITE: Probabilidade e Estatística para Simulação e Métodos Analíticos
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98902-02', '4636N-04'); -- PREREQUISITE: Banco de Dados II para Infraestrutura de TI
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '4646M-04'); -- PREREQUISITE: Lógica para Computação para Métodos Formais
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46504-04', '46524-04'); -- PREREQUISITE: Construção de Software para Prática na Ages III
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46523-04', '46524-04'); -- PREREQUISITE: Prática na Ages II para Prática na Ages III
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98904-04', '46524-04'); -- SPECIAL: Verificação e Validação de Software para Prática na Ages III
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98904-04', '46517-02'); -- PREREQUISITE: Verificação e Validação de Software para Melhoria de Processos
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46524-04', '46525-04'); -- PREREQUISITE: Prática na Ages III para Prática na Ages IV
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46510-04', '46525-04'); -- PREREQUISITE: Gerenciamento de Projetos para Prática na Ages IV
-- INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646Z-04', '98715-04'); -- PREREQUISITE: Projeto e Otimização de Algoritmos para Segurança de Sistemas



INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AJ', 'Ciência da Computação', 8, 120);
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98707-02', 'Metodologia Científica', 2, 'Conceitos fundamentais sobre pesquisa científica, métodos e técnicas para elaboração de trabalhos acadêmicos e científicos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95301-04', 'Cálculo II', 4, 'Continuação de Cálculo I, abordando integração avançada, séries, equações diferenciais e aplicações.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646B-04', 'Fundamentos de Sistemas Digitais', 4, 'Estudo de circuitos digitais, lógica combinacional e sequencial, portas lógicas, flip-flops e aplicações.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98G03-04', 'Organização e Arquitetura de Processadores', 4, 'Conceitos sobre arquitetura de computadores, pipeline, memória cache e execução paralela.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98701-04', 'Programação de Baixo Nível', 4, 'Programação em linguagem assembly e conceitos fundamentais de arquitetura computacional.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98702-04', 'Prática em Pesquisa', 4, 'Metodologia para desenvolvimento de pesquisa científica aplicada à computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98716-04', 'Computação Gráfica', 4, 'Fundamentos da computação gráfica, modelagem 3D, rasterização e renderização.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98801-04', 'Engenharia de Software I', 4, 'Princípios e metodologias para desenvolvimento de software, incluindo requisitos e design.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4636H-04', 'Fundamentos de Desenvolvimento de Software', 4, 'Introdução aos processos de engenharia de software e boas práticas de programação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98703-02', 'Programação Funcional', 2, 'Introdução à programação funcional, incluindo funções de ordem superior, imutabilidade e paradigmas declarativos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95302-04', 'Álgebra Linear e Geometria Analítica', 4, 'Estudo de vetores, matrizes, sistemas lineares e transformações geométricas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98802-02', 'Engenharia de Software II', 2, 'Técnicas avançadas de engenharia de software, incluindo testes, manutenção e qualidade.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646N-04', 'Métodos Numéricos', 4, 'Aplicação de métodos numéricos para resolução de problemas computacionais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646X-04', 'Projeto de Desenvolvimento de Jogos', 4, 'Conceitos e práticas de desenvolvimento de jogos digitais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4647F-04', 'Teoria da Computabilidade e Complexidade', 4, 'Estudo dos limites da computação, problemas computáveis e classes de complexidade.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646I-04', 'Laboratório de Sistemas Operacionais', 4, 'Experimentos práticos sobre funcionamento e implementação de sistemas operacionais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98704-04', 'Prática em Engenharia de Software', 4, 'Aplicação de técnicas de engenharia de software em projetos reais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98706-04', 'Aprendizado de Máquina', 4, 'Introdução ao aprendizado de máquina, incluindo modelos supervisionados e não supervisionados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645K-04', 'Construção de Compiladores', 4, 'Fundamentos do design e implementação de compiladores.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4647A-04', 'Redes de Computadores Avançadas', 4, 'Tópicos avançados em redes de computadores, segurança e administração.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98711-02', 'Trabalho de Conclusão I', 2, 'Desenvolvimento de pesquisa aplicada em computação, primeira fase.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645J-04', 'Computação Paralela', 4, 'Estudo de algoritmos e arquiteturas para computação paralela.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4647B-04', 'Sistemas Distribuídos', 4, 'Estudo de sistemas distribuídos, arquiteturas e protocolos de comunicação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98714-02', 'Trabalho de Conclusão II', 2, 'Desenvolvimento e apresentação final de projeto de conclusão de curso.');

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '95300-04', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4611C-06', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98705-02', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '95303-04', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98707-02', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '1501A-04', 1);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4645G-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98901-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '95301-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646B-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4611E-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4611F-04', 2);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4645H-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98902-02', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '46515-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98G03-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '95304-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98701-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98702-04', 3);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98716-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98801-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4636H-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98713-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98H00-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98703-02', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '95302-04', 4);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98802-02', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98905-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646N-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646X-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646Z-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98700-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4647F-04', 5);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98709-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98708-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98710-02', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646I-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4646M-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98704-04', 6);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98706-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4645K-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4647A-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4611G-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98711-02', 7);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4645J-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '11521-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98715-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '4647B-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AJ', '98714-02', 8);

INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95300-04', '95301-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98705-02', '4646B-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95303-04', '4611E-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '4611F-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645G-04', '4645H-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98901-04', '98902-02');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95303-04', '46515-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646B-04', '98G03-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95301-04', '95304-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646B-04', '98701-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '98701-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (2, '4645H-04', '98702-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98701-04', '98716-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (2, '4636H-04', '98801-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '4636H-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '98713-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46515-04', '98713-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98902-02', '98H00-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4611E-04', '98703-02');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98801-04', '98802-02');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98801-04', '98905-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95302-04', '4646N-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95301-04', '4646N-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98716-04', '4646X-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645H-04', '4646Z-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98G03-04', '98700-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98713-04', '98700-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '46515-04', '4647F-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98700-04', '98709-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '98708-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (2, '98709-04', '98710-02');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98700-04', '4646I-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '4646M-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98802-02', '98704-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98708-04', '98706-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '46515-04', '4645K-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98G03-04', '4645K-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98709-04', '4647A-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95304-04', '4611G-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4646I-04', '4645J-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646Z-04', '98715-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98709-04', '4647B-04');
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98711-02', '98714-02');
