package br.com.unisc.project.backend;

import java_cup.runtime.Symbol;

import java.io.FileReader;


public class LoginPasswordController {
    public static void main(String[] args) {
        try {

            /*Comandos (no prompt):
            java -jar jflex-full-1.8.2.jar scanner.flex
            java -jar java-cup-11b.jar -parser Parser -symbols Tokens parser.cup
            */


            Runtime r = Runtime.getRuntime();
            Process p;
            //posicionando na pasta src e chamar o flex por linha de comando
            //vai gerar a classe Scanner.java
            // p = r.exec(new String[]{"java", "-jar", "..\\jflex-full-1.8.2.jar", "..\\scanner.flex"}, null, new File("src\\"));
            // System.out.println(p.waitFor());//se ok, a saída será 0*/

            //vai gerar as classes Parser.java e Tokens.java
            //p = r.exec(new String[]{"java","-jar", "..\\java-cup-11b.jar", "-parser", "Parser", "-symbols", "Tokens", "..\\parser.cup"}, null, new File("src\\"));
            // System.out.println(p.waitFor());//se ok, a saída será 0*/


            LoginPasswordLexer scanner = new LoginPasswordLexer(new FileReader("src/main/java/br/com/unisc/project/backend/testeIvan/entrada.txt"));
            System.out.println("Análise Léxica: Lista de Tokens:");
            Symbol s = scanner.next_token();
            while(s.sym != PasswordSym.EOF){
                System.out.printf("<%d, %s>\n", s.sym, s.value);
                s = scanner.next_token();
            }

           /* //criando o parser passando o scanner
            Scanner scanner = new Scanner(new FileReader("src/main/java/br/com/unisc/project/backend/entrada.txt"));
            Parser parser = new Parser(scanner);
            parser.parse();*/
        }
        catch(Exception e) { System.out.println(e.getMessage());}
    }

}
