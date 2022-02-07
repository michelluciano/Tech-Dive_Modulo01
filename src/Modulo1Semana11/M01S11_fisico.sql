/* M01S11_logico: */

CREATE TABLE Aluno (
    Id INTEGER PRIMARY KEY,
    Nome VARCHAR,
    Fone VARCHAR,
    Cpf VARCHAR,
    DtNasc DATE,
    Sexo VARCHAR
);

CREATE TABLE Professor (
    Id INTEGER PRIMARY KEY,
    Nome VARCHAR,
    Graduacao VARCHAR,
    Fone VARCHAR
);

CREATE TABLE Endereco (
    Id INTEGER,
    Rua VARCHAR,
    Numero VARCHAR,
    Bairro VARCHAR,
    Cidade VARCHAR,
    Estado VARCHAR,
    Outros VARCHAR,
    fk_Aluno_Id INTEGER,
    PRIMARY KEY (Id, fk_Aluno_Id)
);

CREATE TABLE Curso (
    Id INTEGER PRIMARY KEY,
    Nome VARCHAR,
    Semestre VARCHAR
);

CREATE TABLE Disciplina (
    Id INTEGER PRIMARY KEY,
    Nome VARCHAR,
    fk_Professor_Id INTEGER,
    fk_Curso_Id INTEGER
);

CREATE TABLE Matricula (
    Id INTEGER PRIMARY KEY,
    Data_Matricula DATE,
    fk_Curso_Id INTEGER,
    fk_Aluno_Id INTEGER
);
 
ALTER TABLE Endereco ADD CONSTRAINT FK_Endereco_2
    FOREIGN KEY (fk_Aluno_Id)
    REFERENCES Aluno (Id)
    ON DELETE CASCADE;
 
ALTER TABLE Disciplina ADD CONSTRAINT FK_Disciplina_2
    FOREIGN KEY (fk_Professor_Id)
    REFERENCES Professor (Id)
    ON DELETE RESTRICT;
 
ALTER TABLE Disciplina ADD CONSTRAINT FK_Disciplina_3
    FOREIGN KEY (fk_Curso_Id)
    REFERENCES Curso (Id)
    ON DELETE RESTRICT;
 
ALTER TABLE Matricula ADD CONSTRAINT FK_Matricula_2
    FOREIGN KEY (fk_Curso_Id)
    REFERENCES Curso (Id)
    ON DELETE SET NULL;
 
ALTER TABLE Matricula ADD CONSTRAINT FK_Matricula_3
    FOREIGN KEY (fk_Aluno_Id)
    REFERENCES Aluno (Id)
    ON DELETE SET NULL;