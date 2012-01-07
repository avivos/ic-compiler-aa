
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Dec 20 13:32:13 IST 2011
//----------------------------------------------------

package IC.Parser;

import java.util.List;
import java.util.LinkedList;
import IC.AST.*;
import IC.Parser.SyntaxError;
import IC.Parser.Token;
import IC.Parser.Lexer;
import java_cup.runtime.*;
import IC.Parser.ValuedToken;
import IC.DataTypes;
import IC.ICVoid;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Dec 20 13:32:13 IST 2011
  */
public @SuppressWarnings(value={"all"}) class LibraryParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public LibraryParser() {super();}

  /** Constructor which sets the default scanner. */
  public LibraryParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public LibraryParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\007\000\002\002\004\000\002\003" +
    "\004\000\002\003\002\000\002\004\011\000\002\004\011" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\005\000\002\006\003\000\002\006\005\000\002" +
    "\006\002\000\002\007\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\004\011\004\001\002\000\004\062\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\034\010\001\002\000\006\046\ufffe\051\ufffe\001" +
    "\002\000\006\046\014\051\013\001\002\000\006\046\uffff" +
    "\051\uffff\001\002\000\012\007\017\037\021\052\015\055" +
    "\020\001\002\000\004\002\001\001\002\000\006\035\ufff9" +
    "\061\ufff9\001\002\000\006\035\034\061\036\001\002\000" +
    "\006\035\ufffa\061\ufffa\001\002\000\004\061\022\001\002" +
    "\000\006\035\ufffb\061\ufffb\001\002\000\004\004\023\001" +
    "\002\000\014\005\ufff5\007\017\012\ufff5\037\021\052\015" +
    "\001\002\000\006\005\ufff7\012\ufff7\001\002\000\006\035" +
    "\034\061\033\001\002\000\006\005\030\012\027\001\002" +
    "\000\010\007\017\037\021\052\015\001\002\000\004\050" +
    "\031\001\002\000\006\046\ufffc\051\ufffc\001\002\000\006" +
    "\005\ufff6\012\ufff6\001\002\000\006\005\ufff4\012\ufff4\001" +
    "\002\000\004\045\035\001\002\000\006\035\ufff8\061\ufff8" +
    "\001\002\000\004\004\037\001\002\000\014\005\ufff5\007" +
    "\017\012\ufff5\037\021\052\015\001\002\000\006\005\041" +
    "\012\027\001\002\000\004\050\042\001\002\000\006\046" +
    "\ufffd\051\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\010\001\001\000\004\004\011\001\001\000\002\001" +
    "\001\000\004\005\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\005\024" +
    "\006\025\007\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\024\007\031\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\005\024\006\037\007\023\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$LibraryParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$LibraryParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$LibraryParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	/** Causes the parsr to print every token it reads.
	 * This is useful for debugging.
	 */
	public boolean printAST;
	
	private Lexer lexer;

	public LibraryParser(Lexer lexer) {
		super(lexer);
		this.lexer = lexer;
	}
	
	public int getLine() {
		return lexer.getLineNumber();
	}
	
	public void syntax_error(Symbol s) {
		Token tok = (Token) s;
		System.out.println("Line " + tok.getLine()+": Syntax error; unexpected " + tok);
	}
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$LibraryParser$actions {
  private final LibraryParser parser;

  /** Constructor */
  CUP$LibraryParser$actions(LibraryParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$LibraryParser$do_action(
    int                        CUP$LibraryParser$act_num,
    java_cup.runtime.lr_parser CUP$LibraryParser$parser,
    java.util.Stack            CUP$LibraryParser$stack,
    int                        CUP$LibraryParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$LibraryParser$result;

      /* select the action based on the action number */
      switch (CUP$LibraryParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // formal ::= type ID 
            {
              Formal RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		PrimitiveType t = (PrimitiveType)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 RESULT = new Formal( t, name ); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("formal",5, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // formalLst ::= 
            {
              List<Formal> RESULT =null;
		 RESULT = new LinkedList<Formal>(); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("formalLst",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // formalLst ::= formalLst COMMA formal 
            {
              List<Formal> RESULT =null;
		int flleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		List<Formal> fl = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 fl.add(f); RESULT = fl; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("formalLst",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // formalLst ::= formal 
            {
              List<Formal> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 List<Formal> fl = new LinkedList<>();
	   fl.add(f); RESULT = fl; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("formalLst",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // type ::= type LB RB 
            {
              PrimitiveType RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		PrimitiveType t = (PrimitiveType)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		 t.incrementDimension(); RESULT = t; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // type ::= STRING 
            {
              PrimitiveType RESULT =null;
		 RESULT = new PrimitiveType(parser.getLine(), DataTypes.STRING); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // type ::= BOOLEAN 
            {
              PrimitiveType RESULT =null;
		 RESULT = new PrimitiveType(parser.getLine(), DataTypes.BOOLEAN); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // type ::= INT 
            {
              PrimitiveType RESULT =null;
		 RESULT = new PrimitiveType(parser.getLine(), DataTypes.INT); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= STATIC VOID ID LP formalLst RP SEMI 
            {
              LibraryMethod RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).value;
		int flleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		List<Formal> fl = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		 RESULT = new LibraryMethod(new ICVoid(nameleft), name, fl); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-6)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decl ::= STATIC type ID LP formalLst RP SEMI 
            {
              LibraryMethod RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).right;
		PrimitiveType r = (PrimitiveType)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).value;
		int flleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		List<Formal> fl = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		 RESULT = new LibraryMethod(r, name, fl); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-6)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declList ::= 
            {
              List<LibraryMethod> RESULT =null;
		 RESULT = new LinkedList<LibraryMethod>(); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declList ::= declList decl 
            {
              List<LibraryMethod> RESULT =null;
		int dlleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int dlright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		List<LibraryMethod> dl = (List<LibraryMethod>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		LibraryMethod d = (LibraryMethod)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 dl.add(d); RESULT=dl; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= libic EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		Library start_val = (Library)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		RESULT = start_val;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$LibraryParser$parser.done_parsing();
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // libic ::= CLASS CLASS_ID LCBR declList RCBR 
            {
              Library RESULT =null;
		int libraryleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).left;
		int libraryright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).right;
		String library = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		List<LibraryMethod> d = (List<LibraryMethod>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		 if ( ! library.equals("Library" ) )
			throw new SyntaxError(libraryleft, "Library can only be called Library but is named: "+library);
		RESULT = new Library(libraryleft, d); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("libic",0, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

