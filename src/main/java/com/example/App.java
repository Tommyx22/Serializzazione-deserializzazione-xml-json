package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) throws IOException{
        try {

            Alunno a = new Alunno("Davide", "Xie", 19);

            System.out.println("-------- XML -------");
            XmlMapper xmlMapper = new XmlMapper();

            // Serializzazione su stringa
            String s1 = xmlMapper.writeValueAsString(a);
            System.out.println(s1);

            // Serializzazione su file
            xmlMapper.writeValue(new File("test.xml"), a);

            // deserializzazione
            Alunno b = xmlMapper.readValue(s1, Alunno.class); // Da stringa
            // Alunno b = xmlMapper.readValue(new File("test.xml"), Alunno.class); // Da
            // file
            System.out.println(b.cognome);
            System.out.println(b.nome);

            System.out.println();
            System.out.println("-------- JSON -------");
            ObjectMapper objectMapper = new ObjectMapper();

            // Serializzazione su stringa
            String s2 = objectMapper.writeValueAsString(a);
            System.out.println(s2);

            // Serializzazione su file
            objectMapper.writeValue(new File("test.json"), a);

            // Deserializzazione
            Alunno c = objectMapper.readValue(s2, Alunno.class); // da stringa
            // Alunno c = objectMapper.readValue(new File("test.json"), Alunno.class); // da
            // file
            System.out.println(c.cognome);
            System.out.println(c.nome);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("errore durante l'istanza del server");
            System.exit(1);
        }
    }
}