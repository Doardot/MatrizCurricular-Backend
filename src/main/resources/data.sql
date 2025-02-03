SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE requirements;
TRUNCATE TABLE course_subject;
TRUNCATE TABLE subject;
TRUNCATE TABLE course;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AL', 'Engenharia de Software', 8, 120);
INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AJ', 'Ciência da Computação', 8, 120);
INSERT INTO course (curriculum_code, name, number_semesters, extracurricular_hours) values ('98AH', 'Ciência de Dados e IA', 8, 120);

INSERT INTO subject (credit_code, name, credits, description) VALUES ('254CF-02', 'Formação do Empreendedor', 2, 'Disciplina para fomentar o espírito empreendedor.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611C-06', 'Fundamentos de Programação', 6, 'Introdução à lógica e algoritmos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95300-04', 'Cálculo I', 4, 'Conceitos fundamentais de cálculo diferencial e integral.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95303-04', 'Matemática Discreta', 4, 'Conceitos matemáticos para lógica computacional.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98705-02', 'Introdução à Computação', 2, 'Introdução aos conceitos básicos da computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98900-02', 'Introdução à Engenharia de Software', 2, 'Visão geral da engenharia de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611E-04', 'Lógica para Computação', 4, 'Estudo da lógica aplicada à computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611F-04', 'Programação Orientada a Objetos', 4, 'Conceitos e práticas de POO.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645G-04', 'Algoritmos e Estruturas de Dados I', 4, 'Introdução a estruturas de dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46506-04', 'Engenharia de Requisitos', 4, 'Técnicas e práticas de levantamento de requisitos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46509-02', 'Gerenciamento de Config. de Software', 2, 'Controle de versões e gerenciamento de mudanças.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('980EA-24', 'Disciplinas Eletivas', 24, 'Disciplinas optativas para diversificação do conhecimento.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98800-04', 'Fundamentos de Sistemas Computacionais', 4, 'Bases de arquitetura de computadores.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98901-04', 'Banco de Dados I', 4, 'Conceitos básicos de bancos de dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4645H-04', 'Algoritmos e Estruturas de Dados II', 4, 'Continuação do estudo de estruturas de dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46515-04', 'Linguagens, Autômatos e Computação', 4, 'Teoria da computação e linguagens formais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46522-04', 'Prática na Ages I (120h)', 4, 'Desenvolvimento de projeto interdisciplinar.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46526-02', 'Programação de Software Básico', 2, 'Técnicas fundamentais para programação de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('95304-04', 'Probabilidade e Estatística', 4, 'Estatística e probabilidade para computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98902-02', 'Banco de Dados II', 2, 'Estudo avançado de bancos de dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646Z-04', 'Projeto e Otimização de Algoritmos', 4, 'Desenvolvimento e análise de algoritmos eficientes.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46514-04', 'Linguagens de Programação', 4, 'Conceitos e paradigmas de linguagens de programação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46523-04', 'Prática na Ages II (120h)', 4, 'Continuação do projeto interdisciplinar.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98713-04', 'Fundamentos de Processamento Paralelo e Distribuído', 4, 'Processamento paralelo e distribuído na computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98903-02', 'Processos de Software', 2, 'Estudo de metodologias e processos de desenvolvimento de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98904-04', 'Verificação e Validação de Software', 4, 'Testes de software e qualidade.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46507-02', 'Engenharia de Software Experimental', 2, 'Prática em cenários reais de engenharia de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46510-04', 'Gerenciamento de Projeto de Software', 4, 'Gerenciamento de equipes e recursos em projetos de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98700-04', 'Sistemas Operacionais', 4, 'Conceitos fundamentais de sistemas operacionais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98708-04', 'Inteligência Artificial', 4, 'Introdução à inteligência artificial.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98905-04', 'Experiência do Usuário', 4, 'Design centrado no usuário e usabilidade.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98906-04', 'Projeto e Arquitetura de Software', 4, 'Estruturação e arquitetura de sistemas.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('1501A-04', 'Ética e Cidadania', 4, 'Reflexões éticas e cidadania no contexto profissional.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4471V-02', 'Sistemas de Planejamento e Custos para Engenharia', 2, 'Planejamento e custos aplicados à engenharia.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46504-04', 'Construção de Software', 4, 'Desenvolvimento avançado de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98H00-04', 'Infraestrutura para Gestão de Dados', 4, 'Infraestrutura e tecnologias para gerenciamento de dados.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98709-04', 'Fundamentos de Redes de Computadores', 4, 'Conceitos básicos de redes de computadores.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98710-02', 'Laboratório de Redes de Computadores', 2, 'Práticas em redes de computadores.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('13397-02', 'Psicologia e Gestão de Pessoas em TI', 2, 'Gestão de equipes e aspectos psicológicos.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4471X-02', 'Engenharia Econômica', 2, 'Conceitos econômicos aplicados à engenharia.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4611G-04', 'Simulação e Métodos Analíticos', 4, 'Métodos analíticos e simulação computacional.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4636N-04', 'Infraestrutura de Tecnologia da Informação', 4, 'Tecnologias e infraestrutura de TI.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('4646M-04', 'Métodos Formais para Computação', 4, 'Modelos formais e verificações matemáticas na computação.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46524-04', 'Prática na Ages III (120h)', 4, 'Projeto interdisciplinar avançado.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('11521-04', 'Humanismo e Cultura Religiosa', 4, 'Estudo de valores humanos e religião.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46517-02', 'Melhoria de Processos de Software', 2, 'Otimização de processos no desenvolvimento de software.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('46525-04', 'Prática na Ages IV (120h)', 4, 'Conclusão do projeto interdisciplinar.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('980P5-00', 'Atividades Complementares (120h)', 0, 'Atividades extracurriculares obrigatórias.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98715-04', 'Segurança de Sistemas', 4, 'Segurança e proteção de sistemas computacionais.');
INSERT INTO subject (credit_code, name, credits, description) VALUES ('98907-02', 'Engenharia e Gestão do Conhecimento', 2, 'Gestão de informações e conhecimento em engenharia.');

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '254CF-02', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611C-06', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95300-04', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95303-04', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98705-02', 1);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98900-02', 1);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611E-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611F-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4645G-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46506-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46509-02', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '980EA-24', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98800-04', 2);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98901-04', 2);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4645H-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46515-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46522-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46526-02', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '95304-04', 3);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98902-02', 3);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4646Z-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46514-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46523-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98713-04', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98903-02', 4);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98904-04', 4);

INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46507-02', 5);
INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '46510-04', 5, 60);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98700-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98708-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98905-04', 5);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98906-04', 5);

INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '1501A-04', 6, 60);
INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '4471V-02', 6, 80);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46504-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98H00-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98709-04', 6);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98710-02', 6);

INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '13397-02', 7, 80);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4471X-02', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4611G-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4636N-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '4646M-04', 7);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46524-04', 7);

INSERT INTO course_subject (course_id, subject_id, semester, position_requirement) VALUES ('98AL', '11521-04', 8, 60);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46517-02', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '46525-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '980P5-00', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98715-04', 8);
INSERT INTO course_subject (course_id, subject_id, semester) VALUES ('98AL', '98907-02', 8);

INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95303-04', '4611E-04'); -- PREREQUISITE: Matemática Discreta para Lógica para Computação
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '4611F-04'); -- PREREQUISITE: Fundamentos de Programação para Programação Orientada a Objetos
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611C-06', '4645G-04'); -- PREREQUISITE: Fundamentos de Programação para Algoritmos e Estruturas de Dados I
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98900-02', '46506-04'); -- PREREQUISITE: Introdução à Engenharia de Software para Engenharia de Requisitos
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98705-02', '98800-04'); -- SPECIAL: Introdução à Computação para Fundamentos de Sistemas Computacionais
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645G-04', '4645H-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados I para Algoritmos e Estruturas de Dados II
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95303-04', '46515-04'); -- SPECIAL: Matemática Discreta para Linguagens, Autômatos e Computação
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98900-02', '46522-04'); -- SPECIAL: Introdução à Engenharia de Software para Prática na Ages I
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '46509-02', '46522-04'); -- SPECIAL: Gerenciamento de Configuração de Software para Prática na Ages I
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '46522-04'); -- PREREQUISITE: Programação Orientada a Objetos para Prática na Ages I
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4645G-04', '46526-02'); -- SPECIAL: Algoritmos e Estruturas de Dados I para Programação de Software Básico
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '95300-04', '95304-04'); -- SPECIAL: Cálculo I para Probabilidade e Estatística
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98901-04', '98902-02'); -- PREREQUISITE: Banco de Dados I para Banco de Dados II
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645H-04', '4646Z-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados II para Projeto e Otimização de Algoritmos
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46515-04', '46514-04'); -- PREREQUISITE: Linguagens, Autômatos e Computação para Linguagens de Programação
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46522-04', '46523-04'); -- PREREQUISITE: Prática na Ages I para Prática na Ages II
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98901-04', '46523-04'); -- PREREQUISITE: Banco de Dados I para Prática na Ages II
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46515-04', '98713-04'); -- PREREQUISITE: Linguagens, Autômatos e Computação para Fundamentos de Processamento Paralelo
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611F-04', '98713-04'); -- PREREQUISITE: Programação Orientada a Objetos para Fundamentos de Processamento Paralelo
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46506-04', '98904-04'); -- PREREQUISITE: Engenharia de Requisitos para Verificação e Validação de Software
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95304-04', '46507-02'); -- PREREQUISITE: Probabilidade e Estatística para Engenharia de Software Experimental
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98800-04', '98700-04'); -- PREREQUISITE: Fundamentos de Sistemas Computacionais para Sistemas Operacionais
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '98708-04'); -- PREREQUISITE: Lógica para Computação para Inteligência Artificial
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4645H-04', '98708-04'); -- PREREQUISITE: Algoritmos e Estruturas de Dados II para Inteligência Artificial
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46506-04', '98905-04'); -- PREREQUISITE: Engenharia de Requisitos para Experiência do Usuário
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646Z-04', '98906-04'); -- PREREQUISITE: Projeto e Otimização de Algoritmos para Projeto e Arquitetura de Software
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98906-04', '46504-04'); -- PREREQUISITE: Projeto e Arquitetura de Software para Construção de Software
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98902-02', '98H00-04'); -- PREREQUISITE: Banco de Dados II para Infraestrutura para Gestão de Dados
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98700-04', '98709-04'); -- PREREQUISITE: Sistemas Operacionais para Fundamentos de Redes de Computadores
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (2, '98709-04', '98710-02'); -- COREQUISITE: Fundamentos de Redes de Computadores para Laboratório de Redes
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '4471V-02', '4471X-02'); -- SPECIAL: Sistemas de Planejamento e Custos para Engenharia para Engenharia Econômica
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '95304-04', '4611G-04'); -- PREREQUISITE: Probabilidade e Estatística para Simulação e Métodos Analíticos
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98902-02', '4636N-04'); -- PREREQUISITE: Banco de Dados II para Infraestrutura de TI
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4611E-04', '4646M-04'); -- PREREQUISITE: Lógica para Computação para Métodos Formais
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46504-04', '46524-04'); -- PREREQUISITE: Construção de Software para Prática na Ages III
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46523-04', '46524-04'); -- PREREQUISITE: Prática na Ages II para Prática na Ages III
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (1, '98904-04', '46524-04'); -- SPECIAL: Verificação e Validação de Software para Prática na Ages III
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '98904-04', '46517-02'); -- PREREQUISITE: Verificação e Validação de Software para Melhoria de Processos
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46524-04', '46525-04'); -- PREREQUISITE: Prática na Ages III para Prática na Ages IV
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '46510-04', '46525-04'); -- PREREQUISITE: Gerenciamento de Projetos para Prática na Ages IV
INSERT INTO requirements (requisite_type, required_id, subject_id) VALUES (0, '4646Z-04', '98715-04'); -- PREREQUISITE: Projeto e Otimização de Algoritmos para Segurança de Sistemas
