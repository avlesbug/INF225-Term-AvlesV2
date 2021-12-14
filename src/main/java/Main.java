import Generated.AvlesV2Lexer;
import Generated.AvlesV2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        //CharStream charStream = CharStreams.fromFileName("C:\\Users\\krist\\Desktop\\INF225v2\\src\\test\\loopIftest");
        //CharStream charStream = CharStreams.fromFileName("C:\\Users\\krist\\Desktop\\INF225v2\\src\\test\\test");
        CharStream charStream = CharStreams.fromFileName("C:\\Users\\krist\\Desktop\\INF225v2\\src\\test\\funksjontest");
        //CharStream charStream = CharStreams.fromFileName("C:\\Users\\krist\\Desktop\\INF225v2\\src\\test\\enkleuttrykk");
        AvlesV2Lexer lexer = new AvlesV2Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AvlesV2Parser parser = new AvlesV2Parser(tokens);
        ParseTree tree = parser.prog(); // parse
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);
    }

}
