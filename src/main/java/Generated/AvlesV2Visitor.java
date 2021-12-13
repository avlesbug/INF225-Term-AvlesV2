package Generated;// Generated from AvlesV2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AvlesV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AvlesV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AvlesV2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AvlesV2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#doexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoexpr(AvlesV2Parser.DoexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#funcdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdec(AvlesV2Parser.FuncdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(AvlesV2Parser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(AvlesV2Parser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(AvlesV2Parser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BEqSEq}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBEqSEq(AvlesV2Parser.BEqSEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(AvlesV2Parser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BigSmall}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigSmall(AvlesV2Parser.BigSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(AvlesV2Parser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolEqNo}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEqNo(AvlesV2Parser.BoolEqNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqNo}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNo(AvlesV2Parser.EqNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAndOr}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAndOr(AvlesV2Parser.BoolAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link AvlesV2Parser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(AvlesV2Parser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListSize}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSize(AvlesV2Parser.ListSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AvlesV2Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(AvlesV2Parser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(AvlesV2Parser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(AvlesV2Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(AvlesV2Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(AvlesV2Parser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListGet}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListGet(AvlesV2Parser.ListGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link AvlesV2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AvlesV2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDec}
	 * labeled alternative in {@link AvlesV2Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(AvlesV2Parser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDec}
	 * labeled alternative in {@link AvlesV2Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDec(AvlesV2Parser.ListDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintNum}
	 * labeled alternative in {@link AvlesV2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNum(AvlesV2Parser.PrintNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintId}
	 * labeled alternative in {@link AvlesV2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(AvlesV2Parser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link AvlesV2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBool(AvlesV2Parser.PrintBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Printarray}
	 * labeled alternative in {@link AvlesV2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintarray(AvlesV2Parser.PrintarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link AvlesV2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(AvlesV2Parser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvlesV2Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AvlesV2Parser.ArrayContext ctx);
}