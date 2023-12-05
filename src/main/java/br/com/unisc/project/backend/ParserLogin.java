
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package br.com.unisc.project.backend;

import java_cup.runtime.*;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import br.com.unisc.project.backend.Scanner;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/**
 * CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
 */
@SuppressWarnings({"rawtypes"})
public class ParserLogin extends java_cup.runtime.lr_parser {

    public final Class getSymbolContainer() {
        return Tokens.class;
    }

    /**
     * Default constructor.
     */
    @Deprecated
    public ParserLogin() {
        super();
    }

    /**
     * Constructor which sets the default scanner.
     */
    @Deprecated
    public ParserLogin(java_cup.runtime.Scanner s) {
        super(s);
    }

    /**
     * Constructor which sets the default scanner.
     */
    public ParserLogin(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /**
     * Production table.
     */
    protected static final short _production_table[][] =
            unpackFromStrings(new String[]{
                    "\000\002\000\002\002\002\000\002\002\004"});

    /**
     * Access to production table.
     */
    public short[][] production_table() {
        return _production_table;
    }

    /**
     * Parse-action table.
     */
    protected static final short[][] _action_table =
            unpackFromStrings(new String[]{
                    "\000\003\000\004\002\001\001\002\000\004\002\005\001" +
                            "\002\000\004\002\000\001\002"});

    /**
     * Access to parse-action table.
     */
    public short[][] action_table() {
        return _action_table;
    }

    /**
     * <code>reduce_goto</code> table.
     */
    protected static final short[][] _reduce_table =
            unpackFromStrings(new String[]{
                    "\000\003\000\004\002\003\001\001\000\002\001\001\000" +
                            "\002\001\001"});

    /**
     * Access to <code>reduce_goto</code> table.
     */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /**
     * Instance of action encapsulation class.
     */
    protected CUP$ParserLogin$actions action_obj;

    /**
     * Action encapsulation object initializer.
     */
    protected void init_actions() {
        action_obj = new CUP$ParserLogin$actions(this);
    }

    /**
     * Invoke a user supplied parse action.
     */
    public java_cup.runtime.Symbol do_action(
            int act_num,
            java_cup.runtime.lr_parser parser,
            java.util.Stack stack,
            int top)
            throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$ParserLogin$do_action(act_num, parser, stack, top);
    }

    /**
     * Indicates start state.
     */
    public int start_state() {
        return 0;
    }

    /**
     * Indicates start production.
     */
    public int start_production() {
        return 1;
    }

    /**
     * <code>EOF</code> Symbol index.
     */
    public int EOF_sym() {
        return 0;
    }

    /**
     * <code>error</code> Symbol index.
     */
    public int error_sym() {
        return 1;
    }


    /**
     * User initialization code.
     */
    public void user_init() throws java.lang.Exception {

    }

    /**
     * Scan to get the next Symbol.
     */
    public java_cup.runtime.Symbol scan()
            throws java.lang.Exception {
        return s.next_token();
    }

    private List<Object> valores = new ArrayList<>();
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String setor;

    public void end() {
        System.out.println("Fim do Fluxo!");
    }

    public String getNome(List<Object> o) {
        String name = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return name;
    }

    public String getSobrenome(List<Object> o) {
        String sobrenome = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return sobrenome;
    }

    public String getSetor(List<Object> o) {
        String setor = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return setor;
    }

    public String getDataNascimento(List<Object> o) {
        return o.toString().replace("[", "").replace("]", "");
    }

    private void salvarValor(List<String> values) {
        try {
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter("src/main/java/br/com/unisc/project/backend/files/LoginGenereted");

            // Cria um objeto BufferedWriter para escrever de forma mais eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Itera sobre a lista e escreve cada string em uma nova linha
            for (String value : values) {
                bufferedWriter.write(value);
                bufferedWriter.newLine(); // Adiciona uma quebra de linha após cada string
            }

            // Fecha os recursos para liberar os recursos do sistema
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("As informações foram salvas no arquivo com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String gerarLogin(String nome, String sobrenome, String setor, String dataNascimentoStr) {
        // Geração de valor aleatório
        Random random = new Random();

        // Formatar a data de nascimento
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        Date dataNascimento;
        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr.replace("/", ""));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter a data de nascimento.", e);
        }

        // Criar variações para a parte inicial da Senha
        String variacao1 = nome.substring(0, 1).toLowerCase() + sobrenome.toLowerCase() + setor.toUpperCase();
        String variacao2 = nome.toLowerCase() + sobrenome.substring(0, 1).toLowerCase() + setor.toLowerCase();
        String variacao3 = nome.substring(0, 1).toUpperCase() + setor.toLowerCase() + sobrenome.toLowerCase();
        String variacao4 = nome.toLowerCase() + setor.toLowerCase() + sobrenome.substring(0, 1).toUpperCase();
        String variacao5 = setor.toLowerCase() + nome.substring(0, 1).toLowerCase() + sobrenome.toLowerCase();
        String variacao6 = setor.toLowerCase() + nome.toLowerCase() + sobrenome.substring(0, 1).toUpperCase();

        // Escolher aleatoriamente uma variação
        int escolhaVariacao = random.nextInt(6); // Escolher aleatoriamente entre as 6 variações

        String variacaoEscolhida;
        switch (escolhaVariacao) {
            case 0:
                variacaoEscolhida = variacao1;
                break;
            case 1:
                variacaoEscolhida = variacao2;
                break;
            case 2:
                variacaoEscolhida = variacao3;
                break;
            case 3:
                variacaoEscolhida = variacao4;
                break;
            case 4:
                variacaoEscolhida = variacao5;
                break;
            case 5:
                variacaoEscolhida = variacao6;
                break;
            default:
                variacaoEscolhida = variacao1;
        }

        // Criar a combinando as informações
        String login = variacaoEscolhida;

        return login;

    }

    Scanner s;


    ParserLogin(Scanner s) throws java.lang.Exception {
        this.s = s;


        Symbol symbol = s.next_token();
        while (symbol.sym != Tokens.EOF) {
            valores.add(symbol.value);
            System.out.printf("<%d, %s>\n", symbol.sym, symbol.value);
            symbol = s.next_token();
        }
        nome = getNome(valores);
        sobrenome = getSobrenome(valores);
        setor = getSetor(valores);
        dataNascimento = getDataNascimento(valores);

        List<String> logins = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            String login = gerarLogin(nome, sobrenome, setor, dataNascimento);
            logins.add(login);
        }

        salvarValor(logins);

    }


    /**
     * Cup generated class to encapsulate user supplied action code.
     */
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    class CUP$ParserLogin$actions {
        private final ParserLogin parser;

        /**
         * Constructor
         */
        CUP$ParserLogin$actions(ParserLogin parser) {
            this.parser = parser;
        }

        /**
         * Method 0 with the actual generated action code for actions 0 to 300.
         */
        public final java_cup.runtime.Symbol CUP$ParserLogin$do_action_part00000000(
                int CUP$ParserLogin$act_num,
                java_cup.runtime.lr_parser CUP$ParserLogin$parser,
                java.util.Stack CUP$ParserLogin$stack,
                int CUP$ParserLogin$top)
                throws java.lang.Exception {
            /* Symbol object for return from actions */
            java_cup.runtime.Symbol CUP$ParserLogin$result;

            /* select the action based on the action number */
            switch (CUP$ParserLogin$act_num) {
                /*. . . . . . . . . . . . . . . . . . . .*/
                case 0: // fim ::=
                {
                    Object RESULT = null;
                    end();
                    CUP$ParserLogin$result = parser.getSymbolFactory().newSymbol("fim", 0, ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.peek()), RESULT);
                }
                return CUP$ParserLogin$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 1: // $START ::= fim EOF
                {
                    Object RESULT = null;
                    int start_valleft = ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.elementAt(CUP$ParserLogin$top - 1)).left;
                    int start_valright = ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.elementAt(CUP$ParserLogin$top - 1)).right;
                    Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.elementAt(CUP$ParserLogin$top - 1)).value;
                    RESULT = start_val;
                    CUP$ParserLogin$result = parser.getSymbolFactory().newSymbol("$START", 0, ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.elementAt(CUP$ParserLogin$top - 1)), ((java_cup.runtime.Symbol) CUP$ParserLogin$stack.peek()), RESULT);
                }
                /* ACCEPT */
                CUP$ParserLogin$parser.done_parsing();
                return CUP$ParserLogin$result;

                /* . . . . . .*/
                default:
                    throw new Exception(
                            "Invalid action number " + CUP$ParserLogin$act_num + "found in internal parse table");

            }
        } /* end of method */

        /**
         * Method splitting the generated action code into several parts.
         */
        public final java_cup.runtime.Symbol CUP$ParserLogin$do_action(
                int CUP$ParserLogin$act_num,
                java_cup.runtime.lr_parser CUP$ParserLogin$parser,
                java.util.Stack CUP$ParserLogin$stack,
                int CUP$ParserLogin$top)
                throws java.lang.Exception {
            return CUP$ParserLogin$do_action_part00000000(
                    CUP$ParserLogin$act_num,
                    CUP$ParserLogin$parser,
                    CUP$ParserLogin$stack,
                    CUP$ParserLogin$top);
        }
    }

}
