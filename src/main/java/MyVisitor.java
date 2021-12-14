import Generated.AvlesV2BaseVisitor;
import Generated.AvlesV2Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends AvlesV2BaseVisitor<Double> {
    private Map<String,Double> variables;
    private Map<String,String> funcvarnames;
    private Map<String,ArrayList<Double>> lists;
    private Map<String, AvlesV2Parser.ExprContext> funcret;
    private Map<String, List<AvlesV2Parser.DoexprContext>> funcbdy;

    public MyVisitor(){
        variables = new HashMap<>();
        lists = new HashMap<>();
        funcret = new HashMap<>();
        funcbdy = new HashMap<String, java.util.List<AvlesV2Parser.DoexprContext>>();
        funcvarnames = new HashMap<>();
    }

    @Override
    public Double visitFuncdec(AvlesV2Parser.FuncdecContext ctx) {
        String funcname = ctx.funcname.getText();
        for(int i=1; i<ctx.ID().size();i++) {
            String varId = ctx.ID(i).getText();
            funcvarnames.put(funcname + i, varId);
        }
        funcbdy.put(funcname,ctx.doexpr());
        funcret.put(funcname,ctx.funcret);
        return null;
    }


    @Override
    public Double visitFunccall(AvlesV2Parser.FunccallContext ctx) {
        String funccall = ctx.getText();
        String funcname = ctx.ID().getText();
        if(funcret.containsKey(funcname)) {
            for(int i=0; i<ctx.expr().size();i++) {
                Double param = visit(ctx.expr(i));
                variables.put(funcvarnames.get(funcname + (i+1)), param);
            }
            AvlesV2Parser.ExprContext funcreturn = funcret.get(funcname);
            List<AvlesV2Parser.DoexprContext> functionbody = funcbdy.get(funcname);
            for(AvlesV2Parser.DoexprContext exp : functionbody){
                visit(exp);
            }
            Double result = visit(funcreturn);
            for(int i=0; i<ctx.expr().size();i++) {
                variables.remove(funcname + i+1);
            }
            return result;
        }else{
            System.out.println("Funksjonen "+funccall+" finnnes ikke..");
            return null;
        }
    }

    @Override
    public Double visitVarDec(AvlesV2Parser.VarDecContext ctx) {
        String id = ctx.ID().getText();
        if(lists.containsKey(id)){
            System.out.println("Det finnes allerede en liste med navnet "+id+"!");
        }else {
            Double value = visit(ctx.expr());
            variables.put(id, value);
        }
        return null;
    }

    @Override
    public Double visitListDec(AvlesV2Parser.ListDecContext ctx) {
        String id = ctx.ID().getText();
        if(variables.containsKey(id)){
            System.out.println("Det finnes allerede en variabel med navnet "+id+"!");
        }else {
            ArrayList value = visitList(ctx.array());
            lists.put(id, value);
        }
        return visitArray(ctx.array());
    }


    private ArrayList visitList(AvlesV2Parser.ArrayContext array) {
        ArrayList result = new ArrayList<Double>();
        for(TerminalNode num : array.NUMBER()){
            result.add(Double.valueOf(num.getText()));
        }
        return result;
    }

    @Override
    public Double visitListSize(AvlesV2Parser.ListSizeContext ctx) {
        String listname = ctx.list.getText();
        if(listname != null){
            if(lists.containsKey(listname)){
                ArrayList list = lists.get(listname);
                return Double.valueOf(list.size());
            }
        }
        System.out.println("Fant ikke listen "+listname+"..");
        return null;
    }

    @Override
    public Double visitListGet(AvlesV2Parser.ListGetContext ctx) {
        Double index = visit(ctx.index);
        ArrayList<Double> list = getList(ctx.ID());
        if(index==null || list==null){
            System.out.println("En av variablene er null");
            return null;
        }
        if((index < list.size()) && (index >=0)) {
            return list.get(index.intValue());
        }
        System.out.println("indeks " +index+ " er utenfor grensene til " + ctx.ID().getText()+"..");
        return null;
    }

    public ArrayList getList(TerminalNode index){
        if(lists.containsKey(index.getText())){
            return lists.get(index.getText());
        }else{
            System.out.println("Listen " + index.getText() + " finnes ikke..");
            return null;
        }

    }


    @Override
    public Double visitId(AvlesV2Parser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( variables.containsKey(id) ) return variables.get(id);
        return null;
    }

    @Override
    public Double visitPrintNum(AvlesV2Parser.PrintNumContext ctx) {
        if(ctx.NUMBER()!=null){
            DecimalFormat df = new DecimalFormat("0.00");
            Double result = Double.parseDouble(ctx.NUMBER().getText());
            System.out.println(df.format(result));
        }
        return null;
    }

    @Override
    public Double visitPrintId(AvlesV2Parser.PrintIdContext ctx) {
        if (variables.containsKey(ctx.ID().getText())) {
            DecimalFormat df = new DecimalFormat("0.00");
            if (variables.get(ctx.ID().getText()) != null) {
                System.out.println(df.format(variables.get(ctx.ID().getText())));
            }else {
                System.out.println("Fant ingen verdi for: " + ctx.ID().getText() + "..");
            }
        } else if (lists.containsKey(ctx.ID().getText())) {
            if (lists.get(ctx.ID().getText()) != null) {
                System.out.println(lists.get(ctx.ID().getText()));
            }else {
                System.out.println("Fant ingen liste for: " + ctx.ID().getText() + "..");
            }
        } else {
            System.out.println(ctx.ID().getText() + " er ikke deklarert");
        }
        return null;
    }

    @Override
    public Double visitPrintBool(AvlesV2Parser.PrintBoolContext ctx) {
        if(visit(ctx.boolexpr())==null){
            System.out.println("Logikk uttrykket er null");
        } else if(visit(ctx.boolexpr())==1.0){
            System.out.println("sant");
        }else{
            System.out.println("usant");
        }
        return null;
    }

    @Override
    public Double visitPrintString(AvlesV2Parser.PrintStringContext ctx) {
        StringBuilder tekst = new StringBuilder();
        for(TerminalNode s : ctx.ID()){
            tekst.append(s.getText());
            tekst.append(" ");
        }
        tekst.deleteCharAt(tekst.length()-1);
        System.out.println(tekst.toString());
        return null;
    }


    @Override
    public Double visitNumber(AvlesV2Parser.NumberContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    @Override
    public Double visitMulDiv(AvlesV2Parser.MulDivContext ctx) {

        Double left = visit(ctx.left);
        Double right = visit(ctx.right);

        if(left==null || right==null){
            System.out.println("En av variablene er null");
            return null;
        }

        if(ctx.op.getType() == AvlesV2Parser.MUL) {
            return left * right;
        }else{
            return left / right;
        }
    }

    @Override
    public Double visitAddSub(AvlesV2Parser.AddSubContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);
        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }
        if (ctx.op.getType() == AvlesV2Parser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Double visitParens(AvlesV2Parser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitEqNo(AvlesV2Parser.EqNoContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);
        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }
        if (ctx.op.getType() == AvlesV2Parser.EQ) {
            if (left == right) {
                return Double.valueOf(1);
            }else {
                return Double.valueOf(0);
            }
        }else {
            if (left != right) {
                return Double.valueOf(1);
            }else {
                return Double.valueOf(0);
            }
        }
    }

    @Override
    public Double visitBigSmall(AvlesV2Parser.BigSmallContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);

        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }

        if (ctx.op.getType()==AvlesV2Parser.BIG) {
            if (left > right)
                return Double.valueOf(1);
            else
                return Double.valueOf(0);
        } else {
            if (left < right)
                return Double.valueOf(1);
            else
                return Double.valueOf(0);
        }
    }

    @Override
    public Double visitBEqSEq(AvlesV2Parser.BEqSEqContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);

        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }

        if (ctx.op.getType() == AvlesV2Parser.EQBIG) {
            if (left >= right)
                return Double.valueOf(1);
            else
                return Double.valueOf(0);
        }
        if (left <= right)
            return Double.valueOf(1);
        else
            return Double.valueOf(0);
    }

    @Override
    public Double visitBoolEqNo(AvlesV2Parser.BoolEqNoContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);

        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }

        if(ctx.op.getType() == AvlesV2Parser.EQ){
            if(left == right){
                return Double.valueOf(1);
            }else{
                return Double.valueOf(0);
            }
        }else{
            if(left != right){
                return Double.valueOf(1);
            }else{
                return Double.valueOf(0);
            }
        }
    }

    @Override
    public Double visitBoolAndOr(AvlesV2Parser.BoolAndOrContext ctx) {
        Double left = visit(ctx.left);
        Double right = visit(ctx.right);

        if (left==null || right==null) {
            System.out.println("En av variablene er null");
            return null;
        }

        if(ctx.op.getType() == AvlesV2Parser.AND){
            if(left==1.0 && right==1.0){
                return Double.valueOf(1);
            }else{
                return Double.valueOf(0);
            }
        }else{
            if(left==1.0 || right==1.0){
                return Double.valueOf(1);
            }else{
                return Double.valueOf(0);
            }
        }
    }

    @Override
    public Double visitNot(AvlesV2Parser.NotContext ctx) {
        Double bool = visit(ctx.boolexpr());
        if (bool==null) {
            System.out.println("En av variablene er null");
            return null;
        }
        if(bool.equals(1.0)){
            return 0.0;
        }else{
            return 1.0;
        }
    }

    @Override
    public Double visitBool(AvlesV2Parser.BoolContext ctx) {
        return fromBool(ctx.BOOLEAN());
    }

    @Override
    public Double visitIfexpr(AvlesV2Parser.IfexprContext ctx) {
        Double boolExpr = visit(ctx.boolexpr());
        if (boolExpr==null) {
            System.out.println("En av variablene er null");
            return null;
        }
        if(boolExpr==1){
            visit(ctx.first);
        }else{
            visit(ctx.second);
        }
        return Double.valueOf(0);
    }

    @Override
    public Double visitWhileloop(AvlesV2Parser.WhileloopContext ctx) {
        while(toBool(visit(ctx.boolexpr()))){
            for(int i=0; i<ctx.statement().size();i++){
                visit(ctx.statement(i));
            }
        }
        return 0.0;
    }

    @Override
    public Double visitForloop(AvlesV2Parser.ForloopContext ctx) {
        Double first = visit(ctx.first);
        Double second = visit(ctx.second);
        for(double i=first; i<second; i++){
            for(int j=0; j<ctx.statement().size();j++){
                visit(ctx.statement(j));
            }
        }
        return 0.0;
    }

    public Double fromBool(TerminalNode bool){
        if(bool.getText().equals("sant")){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    public boolean toBool(Double bool){
        if(bool.equals(1.0)){
            return true;
        }else{
            return false;
        }
    }
}