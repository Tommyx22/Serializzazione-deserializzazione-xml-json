7) Serializzazione deserializzazione xml/json

Repository di esempio:
https://github.com/benve-meucci/xml_json

Documentazione Jackson:
https://www.baeldung.com/jackson-object-mapper-tutorial

---------------------------------------

Esercizio:
Creare due POJO Alunno e Classe con i seguenti attributi:

Alunno
 nome (string)
 cognome (string)
 dataNascita (date)

Classe
 numero (es 5)
 sezione (es AIA)
 aula (es 04-TC)
 alunni (List<Alunno>)

Inizializzare e valorizzare sul server un oggetto classe contenente 4 alunni 
Deserializzare l'oggetto sul client
