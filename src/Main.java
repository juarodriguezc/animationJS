// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {
    public static void main(String[] args) throws Exception {
        //try{
            // create a CharStream that reads from standard input
            // create a lexer that feeds off of input CharStream
            AnimationJSLexer lexer;
            if (args.length>0)
                lexer = new AnimationJSLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new AnimationJSLexer(CharStreams.fromStream(System.in));

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            AnimationJSParser parser = new AnimationJSParser(tokens);
            ParseTree tree = parser.code();

            // begin parsing at init rule
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new AnimationToJS(lexer), tree);
            System.out.println(); // print a \n after translation
        //} catch (Exception e){
        //    System.err.println("Error en el análisis léxico / sintáctico / semántico. " + e);
        //}


    }
}