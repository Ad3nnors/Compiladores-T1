/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorest1.lexico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author ander
 */
public class Principal {
    public static void main(String args[]) throws IOException{
        try {
            // args[0] é o primeiro argumento da linha de comando,
            // que corresponde ao arquivo lido
            // args[1] é o segundo argumento da linha de comando,
            // que corresponde ao arquivo que será escrito como saída
            CharStream cs = CharStreams.fromFileName(args[0]);
            LALexer lex = new LALexer(cs);
            
            Token t = null;
            
            FileWriter arq = new FileWriter(args[1]);
            PrintWriter gravarArq = new PrintWriter(arq);
            int i = 1; // variável auxiliar para definir casos de parada 
            while ((t = lex.nextToken()).getType() != Token.EOF && i == 1) { 
            // t recebe proxima token até encontrar o final do arquivo ou até encontrar algum caso de parada (i != 1) 
                
                //System.out.println("<" + LALexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                //System.out.print(t.getText() + "  ");
                if (LALexer.VOCABULARY.getDisplayName(t.getType()).equals("PALAVRA_CHAVE"))
                    gravarArq.printf("<'%s','%s'>\n", t.getText(), t.getText());
                else if (LALexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_ERRADO")){
                    gravarArq.printf("Linha " + t.getLine() +": comentario nao fechado\n");
                    i = 0;
                }
                else if (LALexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_ERRADA")){
                    gravarArq.printf("Linha " + t.getLine() +": cadeia literal nao fechada\n");
                    i = 0;
                }
                else if (LALexer.VOCABULARY.getDisplayName(t.getType()).equals("ERROR")){
                    gravarArq.printf("Linha " + t.getLine() +": " + t.getText() + " - simbolo nao identificado\n");
                    i = 0;
                }
                else gravarArq.printf("<'" + t.getText() + "'," + LALexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
            }
            
            arq.close();
            
        } catch (IOException ex) {
        }
    }
}
