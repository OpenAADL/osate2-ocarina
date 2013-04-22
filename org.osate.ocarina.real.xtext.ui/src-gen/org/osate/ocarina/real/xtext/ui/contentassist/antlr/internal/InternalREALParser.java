package org.osate.ocarina.real.xtext.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.osate.ocarina.real.xtext.services.REALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalREALParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_54", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_50", "KEYWORD_49", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_45", "KEYWORD_44", "KEYWORD_43", "KEYWORD_41", "KEYWORD_42", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_1", "RULE_PLUS", "RULE_POWER", "RULE_STAR", "RULE_SLASH", "RULE_MINUS", "RULE_NOT_EQUAL", "RULE_LESS_EQUAL", "RULE_GREATER_EQUAL", "RULE_GREATER", "RULE_LESS", "RULE_EQUAL", "RULE_AFFECTATION_OPERATOR", "RULE_PUNC_OPEN_BRACE", "RULE_PUNC_CLOSE_BRACE", "RULE_PUNC_SEMI_COLON", "RULE_PUNC_OPEN_PARENTHESIS", "RULE_PUNC_CLOSE_PARENTHESIS", "RULE_PUNC_COMMA", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_NUMERIC"
    };
    public static final int RULE_ID=76;
    public static final int RULE_AFFECTATION_OPERATOR=69;
    public static final int RULE_PUNC_CLOSE_PARENTHESIS=74;
    public static final int RULE_PUNC_OPEN_PARENTHESIS=73;
    public static final int RULE_NOT_EQUAL=63;
    public static final int RULE_GREATER_EQUAL=65;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_17=35;
    public static final int KEYWORD_54=4;
    public static final int KEYWORD_18=36;
    public static final int KEYWORD_53=7;
    public static final int RULE_PUNC_CLOSE_BRACE=71;
    public static final int KEYWORD_52=6;
    public static final int KEYWORD_15=52;
    public static final int KEYWORD_16=34;
    public static final int KEYWORD_51=5;
    public static final int KEYWORD_13=50;
    public static final int KEYWORD_50=8;
    public static final int KEYWORD_14=51;
    public static final int KEYWORD_11=48;
    public static final int EOF=-1;
    public static final int RULE_PUNC_COMMA=75;
    public static final int KEYWORD_12=49;
    public static final int KEYWORD_10=47;
    public static final int KEYWORD_6=43;
    public static final int KEYWORD_7=44;
    public static final int KEYWORD_8=45;
    public static final int KEYWORD_9=46;
    public static final int RULE_LESS_EQUAL=64;
    public static final int KEYWORD_28=31;
    public static final int KEYWORD_29=32;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_25=28;
    public static final int RULE_POWER=59;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int RULE_GREATER=66;
    public static final int RULE_PLUS=58;
    public static final int KEYWORD_30=33;
    public static final int KEYWORD_1=57;
    public static final int RULE_PUNC_SEMI_COLON=72;
    public static final int KEYWORD_34=21;
    public static final int KEYWORD_5=56;
    public static final int KEYWORD_33=27;
    public static final int KEYWORD_4=55;
    public static final int RULE_EQUAL=68;
    public static final int KEYWORD_32=26;
    public static final int KEYWORD_3=54;
    public static final int KEYWORD_31=25;
    public static final int KEYWORD_2=53;
    public static final int KEYWORD_38=18;
    public static final int KEYWORD_37=24;
    public static final int RULE_SL_COMMENT=78;
    public static final int KEYWORD_36=23;
    public static final int KEYWORD_35=22;
    public static final int KEYWORD_39=19;
    public static final int RULE_MINUS=62;
    public static final int RULE_STRING=77;
    public static final int RULE_PUNC_OPEN_BRACE=70;
    public static final int RULE_NUMERIC=80;
    public static final int RULE_STAR=60;
    public static final int KEYWORD_41=16;
    public static final int KEYWORD_40=20;
    public static final int RULE_LESS=67;
    public static final int KEYWORD_43=15;
    public static final int KEYWORD_42=17;
    public static final int RULE_SLASH=61;
    public static final int KEYWORD_45=13;
    public static final int KEYWORD_44=14;
    public static final int KEYWORD_47=11;
    public static final int RULE_WS=79;
    public static final int KEYWORD_46=10;
    public static final int KEYWORD_49=9;
    public static final int KEYWORD_48=12;

    // delegates
    // delegators


        public InternalREALParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalREALParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalREALParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g"; }


     
     	private REALGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'|'");
    		tokenNameToValue.put("KEYWORD_2", "'do'");
    		tokenNameToValue.put("KEYWORD_3", "'if'");
    		tokenNameToValue.put("KEYWORD_4", "'in'");
    		tokenNameToValue.put("KEYWORD_5", "'or'");
    		tokenNameToValue.put("KEYWORD_6", "'GCD'");
    		tokenNameToValue.put("KEYWORD_7", "'LCM'");
    		tokenNameToValue.put("KEYWORD_8", "'Max'");
    		tokenNameToValue.put("KEYWORD_9", "'Min'");
    		tokenNameToValue.put("KEYWORD_10", "'Sum'");
    		tokenNameToValue.put("KEYWORD_11", "'and'");
    		tokenNameToValue.put("KEYWORD_12", "'end'");
    		tokenNameToValue.put("KEYWORD_13", "'mod'");
    		tokenNameToValue.put("KEYWORD_14", "'not'");
    		tokenNameToValue.put("KEYWORD_15", "'var'");
    		tokenNameToValue.put("KEYWORD_16", "'Head'");
    		tokenNameToValue.put("KEYWORD_17", "'Last'");
    		tokenNameToValue.put("KEYWORD_18", "'List'");
    		tokenNameToValue.put("KEYWORD_19", "'MMax'");
    		tokenNameToValue.put("KEYWORD_20", "'MSum'");
    		tokenNameToValue.put("KEYWORD_21", "'Size'");
    		tokenNameToValue.put("KEYWORD_22", "'else'");
    		tokenNameToValue.put("KEYWORD_23", "'then'");
    		tokenNameToValue.put("KEYWORD_24", "'true'");
    		tokenNameToValue.put("KEYWORD_25", "'First'");
    		tokenNameToValue.put("KEYWORD_26", "'Float'");
    		tokenNameToValue.put("KEYWORD_27", "'Is_In'");
    		tokenNameToValue.put("KEYWORD_28", "'Queue'");
    		tokenNameToValue.put("KEYWORD_29", "'check'");
    		tokenNameToValue.put("KEYWORD_30", "'false'");
    		tokenNameToValue.put("KEYWORD_31", "'Exists'");
    		tokenNameToValue.put("KEYWORD_32", "'System'");
    		tokenNameToValue.put("KEYWORD_33", "'return'");
    		tokenNameToValue.put("KEYWORD_34", "'Product'");
    		tokenNameToValue.put("KEYWORD_35", "'compute'");
    		tokenNameToValue.put("KEYWORD_36", "'foreach'");
    		tokenNameToValue.put("KEYWORD_37", "'theorem'");
    		tokenNameToValue.put("KEYWORD_38", "'Cardinal'");
    		tokenNameToValue.put("KEYWORD_39", "'Property'");
    		tokenNameToValue.put("KEYWORD_40", "'requires'");
    		tokenNameToValue.put("KEYWORD_41", "'All_Equals'");
    		tokenNameToValue.put("KEYWORD_42", "'Is_Calling'");
    		tokenNameToValue.put("KEYWORD_43", "'Is_Bound_To'");
    		tokenNameToValue.put("KEYWORD_44", "'Is_Called_By'");
    		tokenNameToValue.put("KEYWORD_45", "'Is_Accessed_By'");
    		tokenNameToValue.put("KEYWORD_46", "'Is_Accessing_To'");
    		tokenNameToValue.put("KEYWORD_47", "'Is_Connected_To'");
    		tokenNameToValue.put("KEYWORD_48", "'Property_Exists'");
    		tokenNameToValue.put("KEYWORD_49", "'Is_Connecting_To'");
    		tokenNameToValue.put("KEYWORD_50", "'Is_Provided_Class'");
    		tokenNameToValue.put("KEYWORD_51", "'Get_Property_Value'");
    		tokenNameToValue.put("KEYWORD_52", "'Is_Passing_Through'");
    		tokenNameToValue.put("KEYWORD_53", "'Is_Subcomponent_Of'");
    		tokenNameToValue.put("KEYWORD_54", "'Compare_Property_Value'");
     	}
     	
        public void setGrammarAccess(REALGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModel"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:117:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:118:1: ( ruleModel EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:119:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:126:1: ruleModel : ( ( rule__Model__TheoremsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:130:5: ( ( ( rule__Model__TheoremsAssignment )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:131:1: ( ( rule__Model__TheoremsAssignment )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:131:1: ( ( rule__Model__TheoremsAssignment )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:132:1: ( rule__Model__TheoremsAssignment )*
            {
             before(grammarAccess.getModelAccess().getTheoremsAssignment()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:133:1: ( rule__Model__TheoremsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:133:2: rule__Model__TheoremsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TheoremsAssignment_in_ruleModel91);
            	    rule__Model__TheoremsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTheoremsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTheorem"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:145:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:146:1: ( ruleTheorem EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:147:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem119);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem126); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:154:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:158:5: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:159:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:159:1: ( ( rule__Theorem__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:160:1: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:161:1: ( rule__Theorem__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:161:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem156);
            rule__Theorem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleRangeDefinition"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:173:1: entryRuleRangeDefinition : ruleRangeDefinition EOF ;
    public final void entryRuleRangeDefinition() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:174:1: ( ruleRangeDefinition EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:175:1: ruleRangeDefinition EOF
            {
             before(grammarAccess.getRangeDefinitionRule()); 
            pushFollow(FOLLOW_ruleRangeDefinition_in_entryRuleRangeDefinition183);
            ruleRangeDefinition();

            state._fsp--;

             after(grammarAccess.getRangeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeDefinition190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRangeDefinition"


    // $ANTLR start "ruleRangeDefinition"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:182:1: ruleRangeDefinition : ( ( rule__RangeDefinition__Group__0 ) ) ;
    public final void ruleRangeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:186:5: ( ( ( rule__RangeDefinition__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:187:1: ( ( rule__RangeDefinition__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:187:1: ( ( rule__RangeDefinition__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:188:1: ( rule__RangeDefinition__Group__0 )
            {
             before(grammarAccess.getRangeDefinitionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:189:1: ( rule__RangeDefinition__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:189:2: rule__RangeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__0_in_ruleRangeDefinition220);
            rule__RangeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeDefinition"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:201:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:202:1: ( ruleVarDeclaration EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:203:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration247);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:210:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:214:5: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:215:1: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:215:1: ( ( rule__VarDeclaration__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:216:1: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:217:1: ( rule__VarDeclaration__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:217:2: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration284);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleSetDeclaration"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:229:1: entryRuleSetDeclaration : ruleSetDeclaration EOF ;
    public final void entryRuleSetDeclaration() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:230:1: ( ruleSetDeclaration EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:231:1: ruleSetDeclaration EOF
            {
             before(grammarAccess.getSetDeclarationRule()); 
            pushFollow(FOLLOW_ruleSetDeclaration_in_entryRuleSetDeclaration311);
            ruleSetDeclaration();

            state._fsp--;

             after(grammarAccess.getSetDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetDeclaration318); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetDeclaration"


    // $ANTLR start "ruleSetDeclaration"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:238:1: ruleSetDeclaration : ( ( rule__SetDeclaration__Group__0 ) ) ;
    public final void ruleSetDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:242:5: ( ( ( rule__SetDeclaration__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:243:1: ( ( rule__SetDeclaration__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:243:1: ( ( rule__SetDeclaration__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:244:1: ( rule__SetDeclaration__Group__0 )
            {
             before(grammarAccess.getSetDeclarationAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:245:1: ( rule__SetDeclaration__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:245:2: rule__SetDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__0_in_ruleSetDeclaration348);
            rule__SetDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetDeclaration"


    // $ANTLR start "entryRuleElementBinding"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:257:1: entryRuleElementBinding : ruleElementBinding EOF ;
    public final void entryRuleElementBinding() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:258:1: ( ruleElementBinding EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:259:1: ruleElementBinding EOF
            {
             before(grammarAccess.getElementBindingRule()); 
            pushFollow(FOLLOW_ruleElementBinding_in_entryRuleElementBinding375);
            ruleElementBinding();

            state._fsp--;

             after(grammarAccess.getElementBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementBinding382); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementBinding"


    // $ANTLR start "ruleElementBinding"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:266:1: ruleElementBinding : ( ( rule__ElementBinding__Group__0 ) ) ;
    public final void ruleElementBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:270:5: ( ( ( rule__ElementBinding__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:271:1: ( ( rule__ElementBinding__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:271:1: ( ( rule__ElementBinding__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:272:1: ( rule__ElementBinding__Group__0 )
            {
             before(grammarAccess.getElementBindingAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:273:1: ( rule__ElementBinding__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:273:2: rule__ElementBinding__Group__0
            {
            pushFollow(FOLLOW_rule__ElementBinding__Group__0_in_ruleElementBinding412);
            rule__ElementBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementBinding"


    // $ANTLR start "entryRuleSelectionExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:285:1: entryRuleSelectionExpression : ruleSelectionExpression EOF ;
    public final void entryRuleSelectionExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:286:1: ( ruleSelectionExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:287:1: ruleSelectionExpression EOF
            {
             before(grammarAccess.getSelectionExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression439);
            ruleSelectionExpression();

            state._fsp--;

             after(grammarAccess.getSelectionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression446); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:294:1: ruleSelectionExpression : ( ( rule__SelectionExpression__Group__0 ) ) ;
    public final void ruleSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:298:5: ( ( ( rule__SelectionExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:299:1: ( ( rule__SelectionExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:299:1: ( ( rule__SelectionExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:300:1: ( rule__SelectionExpression__Group__0 )
            {
             before(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:301:1: ( rule__SelectionExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:301:2: rule__SelectionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SelectionExpression__Group__0_in_ruleSelectionExpression476);
            rule__SelectionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleComputeExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:313:1: entryRuleComputeExpression : ruleComputeExpression EOF ;
    public final void entryRuleComputeExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:314:1: ( ruleComputeExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:315:1: ruleComputeExpression EOF
            {
             before(grammarAccess.getComputeExpressionRule()); 
            pushFollow(FOLLOW_ruleComputeExpression_in_entryRuleComputeExpression503);
            ruleComputeExpression();

            state._fsp--;

             after(grammarAccess.getComputeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComputeExpression510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComputeExpression"


    // $ANTLR start "ruleComputeExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:322:1: ruleComputeExpression : ( ( rule__ComputeExpression__Group__0 ) ) ;
    public final void ruleComputeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:326:5: ( ( ( rule__ComputeExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:327:1: ( ( rule__ComputeExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:327:1: ( ( rule__ComputeExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:328:1: ( rule__ComputeExpression__Group__0 )
            {
             before(grammarAccess.getComputeExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:329:1: ( rule__ComputeExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:329:2: rule__ComputeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group__0_in_ruleComputeExpression540);
            rule__ComputeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputeExpression"


    // $ANTLR start "entryRuleTerminalSelectionExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:341:1: entryRuleTerminalSelectionExpression : ruleTerminalSelectionExpression EOF ;
    public final void entryRuleTerminalSelectionExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:342:1: ( ruleTerminalSelectionExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:343:1: ruleTerminalSelectionExpression EOF
            {
             before(grammarAccess.getTerminalSelectionExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_entryRuleTerminalSelectionExpression567);
            ruleTerminalSelectionExpression();

            state._fsp--;

             after(grammarAccess.getTerminalSelectionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalSelectionExpression574); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalSelectionExpression"


    // $ANTLR start "ruleTerminalSelectionExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:350:1: ruleTerminalSelectionExpression : ( ( rule__TerminalSelectionExpression__Alternatives ) ) ;
    public final void ruleTerminalSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:354:5: ( ( ( rule__TerminalSelectionExpression__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:355:1: ( ( rule__TerminalSelectionExpression__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:355:1: ( ( rule__TerminalSelectionExpression__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:356:1: ( rule__TerminalSelectionExpression__Alternatives )
            {
             before(grammarAccess.getTerminalSelectionExpressionAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:357:1: ( rule__TerminalSelectionExpression__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:357:2: rule__TerminalSelectionExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalSelectionExpression__Alternatives_in_ruleTerminalSelectionExpression604);
            rule__TerminalSelectionExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalSelectionExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalSelectionExpression"


    // $ANTLR start "entryRuleSelectionRelation"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:369:1: entryRuleSelectionRelation : ruleSelectionRelation EOF ;
    public final void entryRuleSelectionRelation() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:370:1: ( ruleSelectionRelation EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:371:1: ruleSelectionRelation EOF
            {
             before(grammarAccess.getSelectionRelationRule()); 
            pushFollow(FOLLOW_ruleSelectionRelation_in_entryRuleSelectionRelation631);
            ruleSelectionRelation();

            state._fsp--;

             after(grammarAccess.getSelectionRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelation638); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionRelation"


    // $ANTLR start "ruleSelectionRelation"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:378:1: ruleSelectionRelation : ( ( rule__SelectionRelation__Group__0 ) ) ;
    public final void ruleSelectionRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:382:5: ( ( ( rule__SelectionRelation__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:383:1: ( ( rule__SelectionRelation__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:383:1: ( ( rule__SelectionRelation__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:384:1: ( rule__SelectionRelation__Group__0 )
            {
             before(grammarAccess.getSelectionRelationAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:385:1: ( rule__SelectionRelation__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:385:2: rule__SelectionRelation__Group__0
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group__0_in_ruleSelectionRelation668);
            rule__SelectionRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionRelation"


    // $ANTLR start "entryRuleSelectionRelationIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:397:1: entryRuleSelectionRelationIdentifier : ruleSelectionRelationIdentifier EOF ;
    public final void entryRuleSelectionRelationIdentifier() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:398:1: ( ruleSelectionRelationIdentifier EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:399:1: ruleSelectionRelationIdentifier EOF
            {
             before(grammarAccess.getSelectionRelationIdentifierRule()); 
            pushFollow(FOLLOW_ruleSelectionRelationIdentifier_in_entryRuleSelectionRelationIdentifier695);
            ruleSelectionRelationIdentifier();

            state._fsp--;

             after(grammarAccess.getSelectionRelationIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelationIdentifier702); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionRelationIdentifier"


    // $ANTLR start "ruleSelectionRelationIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:406:1: ruleSelectionRelationIdentifier : ( ( rule__SelectionRelationIdentifier__Alternatives ) ) ;
    public final void ruleSelectionRelationIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:410:5: ( ( ( rule__SelectionRelationIdentifier__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:411:1: ( ( rule__SelectionRelationIdentifier__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:411:1: ( ( rule__SelectionRelationIdentifier__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:412:1: ( rule__SelectionRelationIdentifier__Alternatives )
            {
             before(grammarAccess.getSelectionRelationIdentifierAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:413:1: ( rule__SelectionRelationIdentifier__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:413:2: rule__SelectionRelationIdentifier__Alternatives
            {
            pushFollow(FOLLOW_rule__SelectionRelationIdentifier__Alternatives_in_ruleSelectionRelationIdentifier732);
            rule__SelectionRelationIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionRelationIdentifier"


    // $ANTLR start "entryRuleSelectionRelationParameter"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:425:1: entryRuleSelectionRelationParameter : ruleSelectionRelationParameter EOF ;
    public final void entryRuleSelectionRelationParameter() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:426:1: ( ruleSelectionRelationParameter EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:427:1: ruleSelectionRelationParameter EOF
            {
             before(grammarAccess.getSelectionRelationParameterRule()); 
            pushFollow(FOLLOW_ruleSelectionRelationParameter_in_entryRuleSelectionRelationParameter759);
            ruleSelectionRelationParameter();

            state._fsp--;

             after(grammarAccess.getSelectionRelationParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelationParameter766); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionRelationParameter"


    // $ANTLR start "ruleSelectionRelationParameter"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:434:1: ruleSelectionRelationParameter : ( ( rule__SelectionRelationParameter__Alternatives ) ) ;
    public final void ruleSelectionRelationParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:438:5: ( ( ( rule__SelectionRelationParameter__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:439:1: ( ( rule__SelectionRelationParameter__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:439:1: ( ( rule__SelectionRelationParameter__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:440:1: ( rule__SelectionRelationParameter__Alternatives )
            {
             before(grammarAccess.getSelectionRelationParameterAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:441:1: ( rule__SelectionRelationParameter__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:441:2: rule__SelectionRelationParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__SelectionRelationParameter__Alternatives_in_ruleSelectionRelationParameter796);
            rule__SelectionRelationParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionRelationParameter"


    // $ANTLR start "entryRuleRequiredDefinition"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:453:1: entryRuleRequiredDefinition : ruleRequiredDefinition EOF ;
    public final void entryRuleRequiredDefinition() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:454:1: ( ruleRequiredDefinition EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:455:1: ruleRequiredDefinition EOF
            {
             before(grammarAccess.getRequiredDefinitionRule()); 
            pushFollow(FOLLOW_ruleRequiredDefinition_in_entryRuleRequiredDefinition823);
            ruleRequiredDefinition();

            state._fsp--;

             after(grammarAccess.getRequiredDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredDefinition830); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredDefinition"


    // $ANTLR start "ruleRequiredDefinition"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:462:1: ruleRequiredDefinition : ( ( rule__RequiredDefinition__Group__0 ) ) ;
    public final void ruleRequiredDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:466:5: ( ( ( rule__RequiredDefinition__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:467:1: ( ( rule__RequiredDefinition__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:467:1: ( ( rule__RequiredDefinition__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:468:1: ( rule__RequiredDefinition__Group__0 )
            {
             before(grammarAccess.getRequiredDefinitionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:469:1: ( rule__RequiredDefinition__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:469:2: rule__RequiredDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__0_in_ruleRequiredDefinition860);
            rule__RequiredDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredDefinition"


    // $ANTLR start "entryRuleVerificationExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:481:1: entryRuleVerificationExpression : ruleVerificationExpression EOF ;
    public final void entryRuleVerificationExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:482:1: ( ruleVerificationExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:483:1: ruleVerificationExpression EOF
            {
             before(grammarAccess.getVerificationExpressionRule()); 
            pushFollow(FOLLOW_ruleVerificationExpression_in_entryRuleVerificationExpression887);
            ruleVerificationExpression();

            state._fsp--;

             after(grammarAccess.getVerificationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationExpression894); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerificationExpression"


    // $ANTLR start "ruleVerificationExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:490:1: ruleVerificationExpression : ( ( rule__VerificationExpression__Group__0 ) ) ;
    public final void ruleVerificationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:494:5: ( ( ( rule__VerificationExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:495:1: ( ( rule__VerificationExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:495:1: ( ( rule__VerificationExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:496:1: ( rule__VerificationExpression__Group__0 )
            {
             before(grammarAccess.getVerificationExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:497:1: ( rule__VerificationExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:497:2: rule__VerificationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__0_in_ruleVerificationExpression924);
            rule__VerificationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerificationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerificationExpression"


    // $ANTLR start "entryRuleEvaluationExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:509:1: entryRuleEvaluationExpression : ruleEvaluationExpression EOF ;
    public final void entryRuleEvaluationExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:510:1: ( ruleEvaluationExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:511:1: ruleEvaluationExpression EOF
            {
             before(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression951);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression958); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluationExpression"


    // $ANTLR start "ruleEvaluationExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:518:1: ruleEvaluationExpression : ( ( rule__EvaluationExpression__Group__0 ) ) ;
    public final void ruleEvaluationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:522:5: ( ( ( rule__EvaluationExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:523:1: ( ( rule__EvaluationExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:523:1: ( ( rule__EvaluationExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:524:1: ( rule__EvaluationExpression__Group__0 )
            {
             before(grammarAccess.getEvaluationExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:525:1: ( rule__EvaluationExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:525:2: rule__EvaluationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__0_in_ruleEvaluationExpression988);
            rule__EvaluationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationExpression"


    // $ANTLR start "entryRuleGenericExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:537:1: entryRuleGenericExpression : ruleGenericExpression EOF ;
    public final void entryRuleGenericExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:538:1: ( ruleGenericExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:539:1: ruleGenericExpression EOF
            {
             before(grammarAccess.getGenericExpressionRule()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_entryRuleGenericExpression1015);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getGenericExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericExpression1022); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericExpression"


    // $ANTLR start "ruleGenericExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:546:1: ruleGenericExpression : ( ( rule__GenericExpression__Group__0 ) ) ;
    public final void ruleGenericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:550:5: ( ( ( rule__GenericExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:551:1: ( ( rule__GenericExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:551:1: ( ( rule__GenericExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:552:1: ( rule__GenericExpression__Group__0 )
            {
             before(grammarAccess.getGenericExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:553:1: ( rule__GenericExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:553:2: rule__GenericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GenericExpression__Group__0_in_ruleGenericExpression1052);
            rule__GenericExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericExpression"


    // $ANTLR start "entryRuleTerminalGenericExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:565:1: entryRuleTerminalGenericExpression : ruleTerminalGenericExpression EOF ;
    public final void entryRuleTerminalGenericExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:566:1: ( ruleTerminalGenericExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:567:1: ruleTerminalGenericExpression EOF
            {
             before(grammarAccess.getTerminalGenericExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_entryRuleTerminalGenericExpression1079);
            ruleTerminalGenericExpression();

            state._fsp--;

             after(grammarAccess.getTerminalGenericExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalGenericExpression1086); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalGenericExpression"


    // $ANTLR start "ruleTerminalGenericExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:574:1: ruleTerminalGenericExpression : ( ( rule__TerminalGenericExpression__Group__0 ) ) ;
    public final void ruleTerminalGenericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:578:5: ( ( ( rule__TerminalGenericExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:579:1: ( ( rule__TerminalGenericExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:579:1: ( ( rule__TerminalGenericExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:580:1: ( rule__TerminalGenericExpression__Group__0 )
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:581:1: ( rule__TerminalGenericExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:581:2: rule__TerminalGenericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group__0_in_ruleTerminalGenericExpression1116);
            rule__TerminalGenericExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGenericExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalGenericExpression"


    // $ANTLR start "entryRuleSetExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:593:1: entryRuleSetExpression : ruleSetExpression EOF ;
    public final void entryRuleSetExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:594:1: ( ruleSetExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:595:1: ruleSetExpression EOF
            {
             before(grammarAccess.getSetExpressionRule()); 
            pushFollow(FOLLOW_ruleSetExpression_in_entryRuleSetExpression1143);
            ruleSetExpression();

            state._fsp--;

             after(grammarAccess.getSetExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExpression1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:602:1: ruleSetExpression : ( ( rule__SetExpression__Group__0 ) ) ;
    public final void ruleSetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:606:5: ( ( ( rule__SetExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:607:1: ( ( rule__SetExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:607:1: ( ( rule__SetExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:608:1: ( rule__SetExpression__Group__0 )
            {
             before(grammarAccess.getSetExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:609:1: ( rule__SetExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:609:2: rule__SetExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SetExpression__Group__0_in_ruleSetExpression1180);
            rule__SetExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleTerminalSetExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:621:1: entryRuleTerminalSetExpression : ruleTerminalSetExpression EOF ;
    public final void entryRuleTerminalSetExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:622:1: ( ruleTerminalSetExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:623:1: ruleTerminalSetExpression EOF
            {
             before(grammarAccess.getTerminalSetExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalSetExpression_in_entryRuleTerminalSetExpression1207);
            ruleTerminalSetExpression();

            state._fsp--;

             after(grammarAccess.getTerminalSetExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalSetExpression1214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalSetExpression"


    // $ANTLR start "ruleTerminalSetExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:630:1: ruleTerminalSetExpression : ( RULE_ID ) ;
    public final void ruleTerminalSetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:634:5: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:635:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:635:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:636:1: RULE_ID
            {
             before(grammarAccess.getTerminalSetExpressionAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalSetExpression1244); 
             after(grammarAccess.getTerminalSetExpressionAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalSetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:649:1: entryRuleTernaryExpression : ruleTernaryExpression EOF ;
    public final void entryRuleTernaryExpression() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:650:1: ( ruleTernaryExpression EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:651:1: ruleTernaryExpression EOF
            {
             before(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression1270);
            ruleTernaryExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryExpression1277); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:658:1: ruleTernaryExpression : ( ( rule__TernaryExpression__Group__0 ) ) ;
    public final void ruleTernaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:662:5: ( ( ( rule__TernaryExpression__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:663:1: ( ( rule__TernaryExpression__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:663:1: ( ( rule__TernaryExpression__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:664:1: ( rule__TernaryExpression__Group__0 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:665:1: ( rule__TernaryExpression__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:665:2: rule__TernaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__0_in_ruleTernaryExpression1307);
            rule__TernaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleVerificationFunctionCall"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:677:1: entryRuleVerificationFunctionCall : ruleVerificationFunctionCall EOF ;
    public final void entryRuleVerificationFunctionCall() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:678:1: ( ruleVerificationFunctionCall EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:679:1: ruleVerificationFunctionCall EOF
            {
             before(grammarAccess.getVerificationFunctionCallRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionCall_in_entryRuleVerificationFunctionCall1334);
            ruleVerificationFunctionCall();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionCall1341); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerificationFunctionCall"


    // $ANTLR start "ruleVerificationFunctionCall"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:686:1: ruleVerificationFunctionCall : ( ( rule__VerificationFunctionCall__Group__0 ) ) ;
    public final void ruleVerificationFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:690:5: ( ( ( rule__VerificationFunctionCall__Group__0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:691:1: ( ( rule__VerificationFunctionCall__Group__0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:691:1: ( ( rule__VerificationFunctionCall__Group__0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:692:1: ( rule__VerificationFunctionCall__Group__0 )
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getGroup()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:693:1: ( rule__VerificationFunctionCall__Group__0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:693:2: rule__VerificationFunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__0_in_ruleVerificationFunctionCall1371);
            rule__VerificationFunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerificationFunctionCall"


    // $ANTLR start "entryRuleVerificationFunctionParameter"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:705:1: entryRuleVerificationFunctionParameter : ruleVerificationFunctionParameter EOF ;
    public final void entryRuleVerificationFunctionParameter() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:706:1: ( ruleVerificationFunctionParameter EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:707:1: ruleVerificationFunctionParameter EOF
            {
             before(grammarAccess.getVerificationFunctionParameterRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_entryRuleVerificationFunctionParameter1398);
            ruleVerificationFunctionParameter();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionParameter1405); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerificationFunctionParameter"


    // $ANTLR start "ruleVerificationFunctionParameter"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:714:1: ruleVerificationFunctionParameter : ( ( rule__VerificationFunctionParameter__Alternatives ) ) ;
    public final void ruleVerificationFunctionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:718:5: ( ( ( rule__VerificationFunctionParameter__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:719:1: ( ( rule__VerificationFunctionParameter__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:719:1: ( ( rule__VerificationFunctionParameter__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:720:1: ( rule__VerificationFunctionParameter__Alternatives )
            {
             before(grammarAccess.getVerificationFunctionParameterAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:721:1: ( rule__VerificationFunctionParameter__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:721:2: rule__VerificationFunctionParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__VerificationFunctionParameter__Alternatives_in_ruleVerificationFunctionParameter1435);
            rule__VerificationFunctionParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerificationFunctionParameter"


    // $ANTLR start "entryRuleAggregationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:733:1: entryRuleAggregationFunctionIdentifier : ruleAggregationFunctionIdentifier EOF ;
    public final void entryRuleAggregationFunctionIdentifier() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:734:1: ( ruleAggregationFunctionIdentifier EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:735:1: ruleAggregationFunctionIdentifier EOF
            {
             before(grammarAccess.getAggregationFunctionIdentifierRule()); 
            pushFollow(FOLLOW_ruleAggregationFunctionIdentifier_in_entryRuleAggregationFunctionIdentifier1462);
            ruleAggregationFunctionIdentifier();

            state._fsp--;

             after(grammarAccess.getAggregationFunctionIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregationFunctionIdentifier1469); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregationFunctionIdentifier"


    // $ANTLR start "ruleAggregationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:742:1: ruleAggregationFunctionIdentifier : ( ( rule__AggregationFunctionIdentifier__Alternatives ) ) ;
    public final void ruleAggregationFunctionIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:746:5: ( ( ( rule__AggregationFunctionIdentifier__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:747:1: ( ( rule__AggregationFunctionIdentifier__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:747:1: ( ( rule__AggregationFunctionIdentifier__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:748:1: ( rule__AggregationFunctionIdentifier__Alternatives )
            {
             before(grammarAccess.getAggregationFunctionIdentifierAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:749:1: ( rule__AggregationFunctionIdentifier__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:749:2: rule__AggregationFunctionIdentifier__Alternatives
            {
            pushFollow(FOLLOW_rule__AggregationFunctionIdentifier__Alternatives_in_ruleAggregationFunctionIdentifier1499);
            rule__AggregationFunctionIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregationFunctionIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregationFunctionIdentifier"


    // $ANTLR start "entryRuleVerificationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:761:1: entryRuleVerificationFunctionIdentifier : ruleVerificationFunctionIdentifier EOF ;
    public final void entryRuleVerificationFunctionIdentifier() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:762:1: ( ruleVerificationFunctionIdentifier EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:763:1: ruleVerificationFunctionIdentifier EOF
            {
             before(grammarAccess.getVerificationFunctionIdentifierRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionIdentifier_in_entryRuleVerificationFunctionIdentifier1526);
            ruleVerificationFunctionIdentifier();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionIdentifier1533); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerificationFunctionIdentifier"


    // $ANTLR start "ruleVerificationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:770:1: ruleVerificationFunctionIdentifier : ( ( rule__VerificationFunctionIdentifier__Alternatives ) ) ;
    public final void ruleVerificationFunctionIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:774:5: ( ( ( rule__VerificationFunctionIdentifier__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:775:1: ( ( rule__VerificationFunctionIdentifier__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:775:1: ( ( rule__VerificationFunctionIdentifier__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:776:1: ( rule__VerificationFunctionIdentifier__Alternatives )
            {
             before(grammarAccess.getVerificationFunctionIdentifierAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:777:1: ( rule__VerificationFunctionIdentifier__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:777:2: rule__VerificationFunctionIdentifier__Alternatives
            {
            pushFollow(FOLLOW_rule__VerificationFunctionIdentifier__Alternatives_in_ruleVerificationFunctionIdentifier1563);
            rule__VerificationFunctionIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerificationFunctionIdentifier"


    // $ANTLR start "entryRuleGenericOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:789:1: entryRuleGenericOperator : ruleGenericOperator EOF ;
    public final void entryRuleGenericOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:790:1: ( ruleGenericOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:791:1: ruleGenericOperator EOF
            {
             before(grammarAccess.getGenericOperatorRule()); 
            pushFollow(FOLLOW_ruleGenericOperator_in_entryRuleGenericOperator1590);
            ruleGenericOperator();

            state._fsp--;

             after(grammarAccess.getGenericOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericOperator1597); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericOperator"


    // $ANTLR start "ruleGenericOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:798:1: ruleGenericOperator : ( ( rule__GenericOperator__Alternatives ) ) ;
    public final void ruleGenericOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:802:5: ( ( ( rule__GenericOperator__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:803:1: ( ( rule__GenericOperator__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:803:1: ( ( rule__GenericOperator__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:804:1: ( rule__GenericOperator__Alternatives )
            {
             before(grammarAccess.getGenericOperatorAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:805:1: ( rule__GenericOperator__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:805:2: rule__GenericOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GenericOperator__Alternatives_in_ruleGenericOperator1627);
            rule__GenericOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericOperator"


    // $ANTLR start "entryRuleLiteral"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:817:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:818:1: ( ruleLiteral EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:819:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1654);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1661); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:826:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:830:5: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:831:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:831:1: ( ( rule__Literal__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:832:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:833:1: ( rule__Literal__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:833:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1691);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:845:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:846:1: ( ruleBOOLEAN EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:847:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN1718);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN1725); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:854:1: ruleBOOLEAN : ( ( rule__BOOLEAN__ValueAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:858:5: ( ( ( rule__BOOLEAN__ValueAssignment ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:859:1: ( ( rule__BOOLEAN__ValueAssignment ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:859:1: ( ( rule__BOOLEAN__ValueAssignment ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:860:1: ( rule__BOOLEAN__ValueAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getValueAssignment()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:861:1: ( rule__BOOLEAN__ValueAssignment )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:861:2: rule__BOOLEAN__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BOOLEAN__ValueAssignment_in_ruleBOOLEAN1755);
            rule__BOOLEAN__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleSetOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:873:1: entryRuleSetOperator : ruleSetOperator EOF ;
    public final void entryRuleSetOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:874:1: ( ruleSetOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:875:1: ruleSetOperator EOF
            {
             before(grammarAccess.getSetOperatorRule()); 
            pushFollow(FOLLOW_ruleSetOperator_in_entryRuleSetOperator1782);
            ruleSetOperator();

            state._fsp--;

             after(grammarAccess.getSetOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOperator1789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetOperator"


    // $ANTLR start "ruleSetOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:882:1: ruleSetOperator : ( ( rule__SetOperator__Alternatives ) ) ;
    public final void ruleSetOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:886:5: ( ( ( rule__SetOperator__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:887:1: ( ( rule__SetOperator__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:887:1: ( ( rule__SetOperator__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:888:1: ( rule__SetOperator__Alternatives )
            {
             before(grammarAccess.getSetOperatorAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:889:1: ( rule__SetOperator__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:889:2: rule__SetOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__SetOperator__Alternatives_in_ruleSetOperator1819);
            rule__SetOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetOperator"


    // $ANTLR start "entryRuleArithmeticOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:901:1: entryRuleArithmeticOperator : ruleArithmeticOperator EOF ;
    public final void entryRuleArithmeticOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:902:1: ( ruleArithmeticOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:903:1: ruleArithmeticOperator EOF
            {
             before(grammarAccess.getArithmeticOperatorRule()); 
            pushFollow(FOLLOW_ruleArithmeticOperator_in_entryRuleArithmeticOperator1846);
            ruleArithmeticOperator();

            state._fsp--;

             after(grammarAccess.getArithmeticOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOperator1853); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:910:1: ruleArithmeticOperator : ( ( rule__ArithmeticOperator__Alternatives ) ) ;
    public final void ruleArithmeticOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:914:5: ( ( ( rule__ArithmeticOperator__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:915:1: ( ( rule__ArithmeticOperator__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:915:1: ( ( rule__ArithmeticOperator__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:916:1: ( rule__ArithmeticOperator__Alternatives )
            {
             before(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:917:1: ( rule__ArithmeticOperator__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:917:2: rule__ArithmeticOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ArithmeticOperator__Alternatives_in_ruleArithmeticOperator1883);
            rule__ArithmeticOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "entryRuleBooleanOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:929:1: entryRuleBooleanOperator : ruleBooleanOperator EOF ;
    public final void entryRuleBooleanOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:930:1: ( ruleBooleanOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:931:1: ruleBooleanOperator EOF
            {
             before(grammarAccess.getBooleanOperatorRule()); 
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator1910);
            ruleBooleanOperator();

            state._fsp--;

             after(grammarAccess.getBooleanOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator1917); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanOperator"


    // $ANTLR start "ruleBooleanOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:938:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:942:5: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:943:1: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:943:1: ( ( rule__BooleanOperator__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:944:1: ( rule__BooleanOperator__Alternatives )
            {
             before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:945:1: ( rule__BooleanOperator__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:945:2: rule__BooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1947);
            rule__BooleanOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "entryRuleUnaryOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:957:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
    public final void entryRuleUnaryOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:958:1: ( ruleUnaryOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:959:1: ruleUnaryOperator EOF
            {
             before(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator1974);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperator1981); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:966:1: ruleUnaryOperator : ( KEYWORD_14 ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:970:5: ( ( KEYWORD_14 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:971:1: ( KEYWORD_14 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:971:1: ( KEYWORD_14 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:972:1: KEYWORD_14
            {
             before(grammarAccess.getUnaryOperatorAccess().getNotKeyword()); 
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleUnaryOperator2012); 
             after(grammarAccess.getUnaryOperatorAccess().getNotKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:987:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:988:1: ( ruleComparisonOperator EOF )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:989:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2040);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator2047); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:996:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1000:5: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1001:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1001:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1002:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1003:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1003:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator2077);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rule__Theorem__Alternatives_4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1015:1: rule__Theorem__Alternatives_4 : ( ( ( rule__Theorem__VarDeclarationsAssignment_4_0 ) ) | ( ( rule__Theorem__SetDeclarationsAssignment_4_1 ) ) );
    public final void rule__Theorem__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1019:1: ( ( ( rule__Theorem__VarDeclarationsAssignment_4_0 ) ) | ( ( rule__Theorem__SetDeclarationsAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_15) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1020:1: ( ( rule__Theorem__VarDeclarationsAssignment_4_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1020:1: ( ( rule__Theorem__VarDeclarationsAssignment_4_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1021:1: ( rule__Theorem__VarDeclarationsAssignment_4_0 )
                    {
                     before(grammarAccess.getTheoremAccess().getVarDeclarationsAssignment_4_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1022:1: ( rule__Theorem__VarDeclarationsAssignment_4_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1022:2: rule__Theorem__VarDeclarationsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Theorem__VarDeclarationsAssignment_4_0_in_rule__Theorem__Alternatives_42113);
                    rule__Theorem__VarDeclarationsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoremAccess().getVarDeclarationsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1026:6: ( ( rule__Theorem__SetDeclarationsAssignment_4_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1026:6: ( ( rule__Theorem__SetDeclarationsAssignment_4_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1027:1: ( rule__Theorem__SetDeclarationsAssignment_4_1 )
                    {
                     before(grammarAccess.getTheoremAccess().getSetDeclarationsAssignment_4_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1028:1: ( rule__Theorem__SetDeclarationsAssignment_4_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1028:2: rule__Theorem__SetDeclarationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Theorem__SetDeclarationsAssignment_4_1_in_rule__Theorem__Alternatives_42131);
                    rule__Theorem__SetDeclarationsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoremAccess().getSetDeclarationsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Alternatives_4"


    // $ANTLR start "rule__Theorem__Alternatives_5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1037:1: rule__Theorem__Alternatives_5 : ( ( ( rule__Theorem__VerificationExpressionAssignment_5_0 ) ) | ( ( rule__Theorem__EvaluationExpressionAssignment_5_1 ) ) );
    public final void rule__Theorem__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1041:1: ( ( ( rule__Theorem__VerificationExpressionAssignment_5_0 ) ) | ( ( rule__Theorem__EvaluationExpressionAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_29) ) {
                alt3=1;
            }
            else if ( (LA3_0==KEYWORD_33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1042:1: ( ( rule__Theorem__VerificationExpressionAssignment_5_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1042:1: ( ( rule__Theorem__VerificationExpressionAssignment_5_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1043:1: ( rule__Theorem__VerificationExpressionAssignment_5_0 )
                    {
                     before(grammarAccess.getTheoremAccess().getVerificationExpressionAssignment_5_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1044:1: ( rule__Theorem__VerificationExpressionAssignment_5_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1044:2: rule__Theorem__VerificationExpressionAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Theorem__VerificationExpressionAssignment_5_0_in_rule__Theorem__Alternatives_52164);
                    rule__Theorem__VerificationExpressionAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoremAccess().getVerificationExpressionAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1048:6: ( ( rule__Theorem__EvaluationExpressionAssignment_5_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1048:6: ( ( rule__Theorem__EvaluationExpressionAssignment_5_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1049:1: ( rule__Theorem__EvaluationExpressionAssignment_5_1 )
                    {
                     before(grammarAccess.getTheoremAccess().getEvaluationExpressionAssignment_5_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1050:1: ( rule__Theorem__EvaluationExpressionAssignment_5_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1050:2: rule__Theorem__EvaluationExpressionAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Theorem__EvaluationExpressionAssignment_5_1_in_rule__Theorem__Alternatives_52182);
                    rule__Theorem__EvaluationExpressionAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoremAccess().getEvaluationExpressionAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Alternatives_5"


    // $ANTLR start "rule__TerminalSelectionExpression__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1059:1: rule__TerminalSelectionExpression__Alternatives : ( ( ( rule__TerminalSelectionExpression__CAssignment_0 ) ) | ( ( rule__TerminalSelectionExpression__EAssignment_1 ) ) | ( ( rule__TerminalSelectionExpression__RAssignment_2 ) ) );
    public final void rule__TerminalSelectionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1063:1: ( ( ( rule__TerminalSelectionExpression__CAssignment_0 ) ) | ( ( rule__TerminalSelectionExpression__EAssignment_1 ) ) | ( ( rule__TerminalSelectionExpression__RAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case KEYWORD_35:
                {
                alt4=1;
                }
                break;
            case KEYWORD_51:
            case KEYWORD_48:
            case KEYWORD_41:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_34:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_25:
            case KEYWORD_26:
            case KEYWORD_28:
            case KEYWORD_30:
            case KEYWORD_16:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_21:
            case KEYWORD_24:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_14:
            case KEYWORD_3:
            case RULE_PUNC_OPEN_PARENTHESIS:
            case RULE_STRING:
            case RULE_NUMERIC:
                {
                alt4=2;
                }
                break;
            case KEYWORD_54:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_50:
            case KEYWORD_49:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_45:
            case KEYWORD_44:
            case KEYWORD_43:
            case KEYWORD_42:
            case KEYWORD_27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1064:1: ( ( rule__TerminalSelectionExpression__CAssignment_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1064:1: ( ( rule__TerminalSelectionExpression__CAssignment_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1065:1: ( rule__TerminalSelectionExpression__CAssignment_0 )
                    {
                     before(grammarAccess.getTerminalSelectionExpressionAccess().getCAssignment_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1066:1: ( rule__TerminalSelectionExpression__CAssignment_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1066:2: rule__TerminalSelectionExpression__CAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TerminalSelectionExpression__CAssignment_0_in_rule__TerminalSelectionExpression__Alternatives2215);
                    rule__TerminalSelectionExpression__CAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalSelectionExpressionAccess().getCAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1070:6: ( ( rule__TerminalSelectionExpression__EAssignment_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1070:6: ( ( rule__TerminalSelectionExpression__EAssignment_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1071:1: ( rule__TerminalSelectionExpression__EAssignment_1 )
                    {
                     before(grammarAccess.getTerminalSelectionExpressionAccess().getEAssignment_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1072:1: ( rule__TerminalSelectionExpression__EAssignment_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1072:2: rule__TerminalSelectionExpression__EAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TerminalSelectionExpression__EAssignment_1_in_rule__TerminalSelectionExpression__Alternatives2233);
                    rule__TerminalSelectionExpression__EAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalSelectionExpressionAccess().getEAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1076:6: ( ( rule__TerminalSelectionExpression__RAssignment_2 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1076:6: ( ( rule__TerminalSelectionExpression__RAssignment_2 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1077:1: ( rule__TerminalSelectionExpression__RAssignment_2 )
                    {
                     before(grammarAccess.getTerminalSelectionExpressionAccess().getRAssignment_2()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1078:1: ( rule__TerminalSelectionExpression__RAssignment_2 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1078:2: rule__TerminalSelectionExpression__RAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TerminalSelectionExpression__RAssignment_2_in_rule__TerminalSelectionExpression__Alternatives2251);
                    rule__TerminalSelectionExpression__RAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalSelectionExpressionAccess().getRAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalSelectionExpression__Alternatives"


    // $ANTLR start "rule__SelectionRelationIdentifier__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1087:1: rule__SelectionRelationIdentifier__Alternatives : ( ( KEYWORD_53 ) | ( KEYWORD_43 ) | ( KEYWORD_50 ) | ( KEYWORD_47 ) | ( KEYWORD_54 ) | ( KEYWORD_44 ) | ( KEYWORD_42 ) | ( KEYWORD_45 ) | ( KEYWORD_49 ) | ( KEYWORD_46 ) | ( KEYWORD_27 ) | ( KEYWORD_52 ) );
    public final void rule__SelectionRelationIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1091:1: ( ( KEYWORD_53 ) | ( KEYWORD_43 ) | ( KEYWORD_50 ) | ( KEYWORD_47 ) | ( KEYWORD_54 ) | ( KEYWORD_44 ) | ( KEYWORD_42 ) | ( KEYWORD_45 ) | ( KEYWORD_49 ) | ( KEYWORD_46 ) | ( KEYWORD_27 ) | ( KEYWORD_52 ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case KEYWORD_53:
                {
                alt5=1;
                }
                break;
            case KEYWORD_43:
                {
                alt5=2;
                }
                break;
            case KEYWORD_50:
                {
                alt5=3;
                }
                break;
            case KEYWORD_47:
                {
                alt5=4;
                }
                break;
            case KEYWORD_54:
                {
                alt5=5;
                }
                break;
            case KEYWORD_44:
                {
                alt5=6;
                }
                break;
            case KEYWORD_42:
                {
                alt5=7;
                }
                break;
            case KEYWORD_45:
                {
                alt5=8;
                }
                break;
            case KEYWORD_49:
                {
                alt5=9;
                }
                break;
            case KEYWORD_46:
                {
                alt5=10;
                }
                break;
            case KEYWORD_27:
                {
                alt5=11;
                }
                break;
            case KEYWORD_52:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1092:1: ( KEYWORD_53 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1092:1: ( KEYWORD_53 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1093:1: KEYWORD_53
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Subcomponent_OfKeyword_0()); 
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__SelectionRelationIdentifier__Alternatives2285); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Subcomponent_OfKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1100:6: ( KEYWORD_43 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1100:6: ( KEYWORD_43 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1101:1: KEYWORD_43
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Bound_ToKeyword_1()); 
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__SelectionRelationIdentifier__Alternatives2305); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Bound_ToKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1108:6: ( KEYWORD_50 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1108:6: ( KEYWORD_50 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1109:1: KEYWORD_50
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Provided_ClassKeyword_2()); 
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__SelectionRelationIdentifier__Alternatives2325); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Provided_ClassKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1116:6: ( KEYWORD_47 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1116:6: ( KEYWORD_47 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1117:1: KEYWORD_47
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connected_ToKeyword_3()); 
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__SelectionRelationIdentifier__Alternatives2345); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connected_ToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1124:6: ( KEYWORD_54 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1124:6: ( KEYWORD_54 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1125:1: KEYWORD_54
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getCompare_Property_ValueKeyword_4()); 
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__SelectionRelationIdentifier__Alternatives2365); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getCompare_Property_ValueKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1132:6: ( KEYWORD_44 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1132:6: ( KEYWORD_44 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1133:1: KEYWORD_44
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Called_ByKeyword_5()); 
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__SelectionRelationIdentifier__Alternatives2385); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Called_ByKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1140:6: ( KEYWORD_42 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1140:6: ( KEYWORD_42 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1141:1: KEYWORD_42
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_CallingKeyword_6()); 
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__SelectionRelationIdentifier__Alternatives2405); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_CallingKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1148:6: ( KEYWORD_45 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1148:6: ( KEYWORD_45 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1149:1: KEYWORD_45
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessed_ByKeyword_7()); 
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__SelectionRelationIdentifier__Alternatives2425); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessed_ByKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1156:6: ( KEYWORD_49 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1156:6: ( KEYWORD_49 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1157:1: KEYWORD_49
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connecting_ToKeyword_8()); 
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__SelectionRelationIdentifier__Alternatives2445); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connecting_ToKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1164:6: ( KEYWORD_46 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1164:6: ( KEYWORD_46 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1165:1: KEYWORD_46
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessing_ToKeyword_9()); 
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__SelectionRelationIdentifier__Alternatives2465); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessing_ToKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1172:6: ( KEYWORD_27 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1172:6: ( KEYWORD_27 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1173:1: KEYWORD_27
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_InKeyword_10()); 
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__SelectionRelationIdentifier__Alternatives2485); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_InKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1180:6: ( KEYWORD_52 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1180:6: ( KEYWORD_52 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1181:1: KEYWORD_52
                    {
                     before(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Passing_ThroughKeyword_11()); 
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__SelectionRelationIdentifier__Alternatives2505); 
                     after(grammarAccess.getSelectionRelationIdentifierAccess().getIs_Passing_ThroughKeyword_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelationIdentifier__Alternatives"


    // $ANTLR start "rule__SelectionRelationParameter__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1193:1: rule__SelectionRelationParameter__Alternatives : ( ( ( rule__SelectionRelationParameter__LAssignment_0 ) ) | ( ( rule__SelectionRelationParameter__IdentifierAssignment_1 ) ) );
    public final void rule__SelectionRelationParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1197:1: ( ( ( rule__SelectionRelationParameter__LAssignment_0 ) ) | ( ( rule__SelectionRelationParameter__IdentifierAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_30||LA6_0==KEYWORD_24||LA6_0==RULE_STRING||LA6_0==RULE_NUMERIC) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1198:1: ( ( rule__SelectionRelationParameter__LAssignment_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1198:1: ( ( rule__SelectionRelationParameter__LAssignment_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1199:1: ( rule__SelectionRelationParameter__LAssignment_0 )
                    {
                     before(grammarAccess.getSelectionRelationParameterAccess().getLAssignment_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1200:1: ( rule__SelectionRelationParameter__LAssignment_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1200:2: rule__SelectionRelationParameter__LAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SelectionRelationParameter__LAssignment_0_in_rule__SelectionRelationParameter__Alternatives2539);
                    rule__SelectionRelationParameter__LAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionRelationParameterAccess().getLAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1204:6: ( ( rule__SelectionRelationParameter__IdentifierAssignment_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1204:6: ( ( rule__SelectionRelationParameter__IdentifierAssignment_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1205:1: ( rule__SelectionRelationParameter__IdentifierAssignment_1 )
                    {
                     before(grammarAccess.getSelectionRelationParameterAccess().getIdentifierAssignment_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1206:1: ( rule__SelectionRelationParameter__IdentifierAssignment_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1206:2: rule__SelectionRelationParameter__IdentifierAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SelectionRelationParameter__IdentifierAssignment_1_in_rule__SelectionRelationParameter__Alternatives2557);
                    rule__SelectionRelationParameter__IdentifierAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionRelationParameterAccess().getIdentifierAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelationParameter__Alternatives"


    // $ANTLR start "rule__TerminalGenericExpression__Alternatives_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1215:1: rule__TerminalGenericExpression__Alternatives_1 : ( ( ( rule__TerminalGenericExpression__LiteralAssignment_1_0 ) ) | ( ( rule__TerminalGenericExpression__FcAssignment_1_1 ) ) | ( ( rule__TerminalGenericExpression__TeAssignment_1_2 ) ) | ( ( rule__TerminalGenericExpression__Group_1_3__0 ) ) );
    public final void rule__TerminalGenericExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1219:1: ( ( ( rule__TerminalGenericExpression__LiteralAssignment_1_0 ) ) | ( ( rule__TerminalGenericExpression__FcAssignment_1_1 ) ) | ( ( rule__TerminalGenericExpression__TeAssignment_1_2 ) ) | ( ( rule__TerminalGenericExpression__Group_1_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
            case KEYWORD_24:
            case RULE_STRING:
            case RULE_NUMERIC:
                {
                alt7=1;
                }
                break;
            case KEYWORD_51:
            case KEYWORD_48:
            case KEYWORD_41:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_34:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_25:
            case KEYWORD_26:
            case KEYWORD_28:
            case KEYWORD_16:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_21:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
                {
                alt7=2;
                }
                break;
            case KEYWORD_3:
                {
                alt7=3;
                }
                break;
            case RULE_PUNC_OPEN_PARENTHESIS:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1220:1: ( ( rule__TerminalGenericExpression__LiteralAssignment_1_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1220:1: ( ( rule__TerminalGenericExpression__LiteralAssignment_1_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1221:1: ( rule__TerminalGenericExpression__LiteralAssignment_1_0 )
                    {
                     before(grammarAccess.getTerminalGenericExpressionAccess().getLiteralAssignment_1_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1222:1: ( rule__TerminalGenericExpression__LiteralAssignment_1_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1222:2: rule__TerminalGenericExpression__LiteralAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__TerminalGenericExpression__LiteralAssignment_1_0_in_rule__TerminalGenericExpression__Alternatives_12590);
                    rule__TerminalGenericExpression__LiteralAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalGenericExpressionAccess().getLiteralAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1226:6: ( ( rule__TerminalGenericExpression__FcAssignment_1_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1226:6: ( ( rule__TerminalGenericExpression__FcAssignment_1_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1227:1: ( rule__TerminalGenericExpression__FcAssignment_1_1 )
                    {
                     before(grammarAccess.getTerminalGenericExpressionAccess().getFcAssignment_1_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1228:1: ( rule__TerminalGenericExpression__FcAssignment_1_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1228:2: rule__TerminalGenericExpression__FcAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TerminalGenericExpression__FcAssignment_1_1_in_rule__TerminalGenericExpression__Alternatives_12608);
                    rule__TerminalGenericExpression__FcAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalGenericExpressionAccess().getFcAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1232:6: ( ( rule__TerminalGenericExpression__TeAssignment_1_2 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1232:6: ( ( rule__TerminalGenericExpression__TeAssignment_1_2 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1233:1: ( rule__TerminalGenericExpression__TeAssignment_1_2 )
                    {
                     before(grammarAccess.getTerminalGenericExpressionAccess().getTeAssignment_1_2()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1234:1: ( rule__TerminalGenericExpression__TeAssignment_1_2 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1234:2: rule__TerminalGenericExpression__TeAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__TerminalGenericExpression__TeAssignment_1_2_in_rule__TerminalGenericExpression__Alternatives_12626);
                    rule__TerminalGenericExpression__TeAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalGenericExpressionAccess().getTeAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1238:6: ( ( rule__TerminalGenericExpression__Group_1_3__0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1238:6: ( ( rule__TerminalGenericExpression__Group_1_3__0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1239:1: ( rule__TerminalGenericExpression__Group_1_3__0 )
                    {
                     before(grammarAccess.getTerminalGenericExpressionAccess().getGroup_1_3()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1240:1: ( rule__TerminalGenericExpression__Group_1_3__0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1240:2: rule__TerminalGenericExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__0_in_rule__TerminalGenericExpression__Alternatives_12644);
                    rule__TerminalGenericExpression__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalGenericExpressionAccess().getGroup_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Alternatives_1"


    // $ANTLR start "rule__VerificationFunctionParameter__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1249:1: rule__VerificationFunctionParameter__Alternatives : ( ( ( rule__VerificationFunctionParameter__LAssignment_0 ) ) | ( ( rule__VerificationFunctionParameter__IdentifierAssignment_1 ) ) | ( ( rule__VerificationFunctionParameter__VfiAssignment_2 ) ) );
    public final void rule__VerificationFunctionParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1253:1: ( ( ( rule__VerificationFunctionParameter__LAssignment_0 ) ) | ( ( rule__VerificationFunctionParameter__IdentifierAssignment_1 ) ) | ( ( rule__VerificationFunctionParameter__VfiAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
            case KEYWORD_24:
            case RULE_STRING:
            case RULE_NUMERIC:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case KEYWORD_51:
            case KEYWORD_48:
            case KEYWORD_41:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_34:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_25:
            case KEYWORD_26:
            case KEYWORD_28:
            case KEYWORD_16:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_21:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1254:1: ( ( rule__VerificationFunctionParameter__LAssignment_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1254:1: ( ( rule__VerificationFunctionParameter__LAssignment_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1255:1: ( rule__VerificationFunctionParameter__LAssignment_0 )
                    {
                     before(grammarAccess.getVerificationFunctionParameterAccess().getLAssignment_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1256:1: ( rule__VerificationFunctionParameter__LAssignment_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1256:2: rule__VerificationFunctionParameter__LAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VerificationFunctionParameter__LAssignment_0_in_rule__VerificationFunctionParameter__Alternatives2677);
                    rule__VerificationFunctionParameter__LAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerificationFunctionParameterAccess().getLAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1260:6: ( ( rule__VerificationFunctionParameter__IdentifierAssignment_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1260:6: ( ( rule__VerificationFunctionParameter__IdentifierAssignment_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1261:1: ( rule__VerificationFunctionParameter__IdentifierAssignment_1 )
                    {
                     before(grammarAccess.getVerificationFunctionParameterAccess().getIdentifierAssignment_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1262:1: ( rule__VerificationFunctionParameter__IdentifierAssignment_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1262:2: rule__VerificationFunctionParameter__IdentifierAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VerificationFunctionParameter__IdentifierAssignment_1_in_rule__VerificationFunctionParameter__Alternatives2695);
                    rule__VerificationFunctionParameter__IdentifierAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerificationFunctionParameterAccess().getIdentifierAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1266:6: ( ( rule__VerificationFunctionParameter__VfiAssignment_2 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1266:6: ( ( rule__VerificationFunctionParameter__VfiAssignment_2 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1267:1: ( rule__VerificationFunctionParameter__VfiAssignment_2 )
                    {
                     before(grammarAccess.getVerificationFunctionParameterAccess().getVfiAssignment_2()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1268:1: ( rule__VerificationFunctionParameter__VfiAssignment_2 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1268:2: rule__VerificationFunctionParameter__VfiAssignment_2
                    {
                    pushFollow(FOLLOW_rule__VerificationFunctionParameter__VfiAssignment_2_in_rule__VerificationFunctionParameter__Alternatives2713);
                    rule__VerificationFunctionParameter__VfiAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerificationFunctionParameterAccess().getVfiAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionParameter__Alternatives"


    // $ANTLR start "rule__AggregationFunctionIdentifier__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1277:1: rule__AggregationFunctionIdentifier__Alternatives : ( ( KEYWORD_20 ) | ( KEYWORD_19 ) );
    public final void rule__AggregationFunctionIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1281:1: ( ( KEYWORD_20 ) | ( KEYWORD_19 ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_20) ) {
                alt9=1;
            }
            else if ( (LA9_0==KEYWORD_19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1282:1: ( KEYWORD_20 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1282:1: ( KEYWORD_20 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1283:1: KEYWORD_20
                    {
                     before(grammarAccess.getAggregationFunctionIdentifierAccess().getMSumKeyword_0()); 
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__AggregationFunctionIdentifier__Alternatives2747); 
                     after(grammarAccess.getAggregationFunctionIdentifierAccess().getMSumKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1290:6: ( KEYWORD_19 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1290:6: ( KEYWORD_19 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1291:1: KEYWORD_19
                    {
                     before(grammarAccess.getAggregationFunctionIdentifierAccess().getMMaxKeyword_1()); 
                    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__AggregationFunctionIdentifier__Alternatives2767); 
                     after(grammarAccess.getAggregationFunctionIdentifierAccess().getMMaxKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationFunctionIdentifier__Alternatives"


    // $ANTLR start "rule__VerificationFunctionIdentifier__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1303:1: rule__VerificationFunctionIdentifier__Alternatives : ( ( KEYWORD_38 ) | ( KEYWORD_10 ) | ( KEYWORD_8 ) | ( KEYWORD_9 ) | ( KEYWORD_34 ) | ( KEYWORD_6 ) | ( KEYWORD_7 ) | ( KEYWORD_51 ) | ( KEYWORD_39 ) | ( KEYWORD_48 ) | ( KEYWORD_41 ) | ( KEYWORD_31 ) | ( KEYWORD_32 ) | ( KEYWORD_25 ) | ( KEYWORD_17 ) | ( KEYWORD_16 ) | ( KEYWORD_28 ) | ( KEYWORD_18 ) | ( KEYWORD_21 ) | ( KEYWORD_26 ) );
    public final void rule__VerificationFunctionIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1307:1: ( ( KEYWORD_38 ) | ( KEYWORD_10 ) | ( KEYWORD_8 ) | ( KEYWORD_9 ) | ( KEYWORD_34 ) | ( KEYWORD_6 ) | ( KEYWORD_7 ) | ( KEYWORD_51 ) | ( KEYWORD_39 ) | ( KEYWORD_48 ) | ( KEYWORD_41 ) | ( KEYWORD_31 ) | ( KEYWORD_32 ) | ( KEYWORD_25 ) | ( KEYWORD_17 ) | ( KEYWORD_16 ) | ( KEYWORD_28 ) | ( KEYWORD_18 ) | ( KEYWORD_21 ) | ( KEYWORD_26 ) )
            int alt10=20;
            switch ( input.LA(1) ) {
            case KEYWORD_38:
                {
                alt10=1;
                }
                break;
            case KEYWORD_10:
                {
                alt10=2;
                }
                break;
            case KEYWORD_8:
                {
                alt10=3;
                }
                break;
            case KEYWORD_9:
                {
                alt10=4;
                }
                break;
            case KEYWORD_34:
                {
                alt10=5;
                }
                break;
            case KEYWORD_6:
                {
                alt10=6;
                }
                break;
            case KEYWORD_7:
                {
                alt10=7;
                }
                break;
            case KEYWORD_51:
                {
                alt10=8;
                }
                break;
            case KEYWORD_39:
                {
                alt10=9;
                }
                break;
            case KEYWORD_48:
                {
                alt10=10;
                }
                break;
            case KEYWORD_41:
                {
                alt10=11;
                }
                break;
            case KEYWORD_31:
                {
                alt10=12;
                }
                break;
            case KEYWORD_32:
                {
                alt10=13;
                }
                break;
            case KEYWORD_25:
                {
                alt10=14;
                }
                break;
            case KEYWORD_17:
                {
                alt10=15;
                }
                break;
            case KEYWORD_16:
                {
                alt10=16;
                }
                break;
            case KEYWORD_28:
                {
                alt10=17;
                }
                break;
            case KEYWORD_18:
                {
                alt10=18;
                }
                break;
            case KEYWORD_21:
                {
                alt10=19;
                }
                break;
            case KEYWORD_26:
                {
                alt10=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1308:1: ( KEYWORD_38 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1308:1: ( KEYWORD_38 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1309:1: KEYWORD_38
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getCardinalKeyword_0()); 
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__VerificationFunctionIdentifier__Alternatives2802); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getCardinalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1316:6: ( KEYWORD_10 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1316:6: ( KEYWORD_10 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1317:1: KEYWORD_10
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getSumKeyword_1()); 
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__VerificationFunctionIdentifier__Alternatives2822); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getSumKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1324:6: ( KEYWORD_8 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1324:6: ( KEYWORD_8 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1325:1: KEYWORD_8
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getMaxKeyword_2()); 
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__VerificationFunctionIdentifier__Alternatives2842); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getMaxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1332:6: ( KEYWORD_9 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1332:6: ( KEYWORD_9 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1333:1: KEYWORD_9
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getMinKeyword_3()); 
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__VerificationFunctionIdentifier__Alternatives2862); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getMinKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1340:6: ( KEYWORD_34 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1340:6: ( KEYWORD_34 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1341:1: KEYWORD_34
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getProductKeyword_4()); 
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__VerificationFunctionIdentifier__Alternatives2882); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getProductKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1348:6: ( KEYWORD_6 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1348:6: ( KEYWORD_6 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1349:1: KEYWORD_6
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getGCDKeyword_5()); 
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__VerificationFunctionIdentifier__Alternatives2902); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getGCDKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1356:6: ( KEYWORD_7 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1356:6: ( KEYWORD_7 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1357:1: KEYWORD_7
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getLCMKeyword_6()); 
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__VerificationFunctionIdentifier__Alternatives2922); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getLCMKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1364:6: ( KEYWORD_51 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1364:6: ( KEYWORD_51 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1365:1: KEYWORD_51
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getGet_Property_ValueKeyword_7()); 
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__VerificationFunctionIdentifier__Alternatives2942); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getGet_Property_ValueKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1372:6: ( KEYWORD_39 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1372:6: ( KEYWORD_39 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1373:1: KEYWORD_39
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getPropertyKeyword_8()); 
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__VerificationFunctionIdentifier__Alternatives2962); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getPropertyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1380:6: ( KEYWORD_48 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1380:6: ( KEYWORD_48 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1381:1: KEYWORD_48
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getProperty_ExistsKeyword_9()); 
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__VerificationFunctionIdentifier__Alternatives2982); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getProperty_ExistsKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1388:6: ( KEYWORD_41 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1388:6: ( KEYWORD_41 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1389:1: KEYWORD_41
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getAll_EqualsKeyword_10()); 
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__VerificationFunctionIdentifier__Alternatives3002); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getAll_EqualsKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1396:6: ( KEYWORD_31 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1396:6: ( KEYWORD_31 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1397:1: KEYWORD_31
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getExistsKeyword_11()); 
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__VerificationFunctionIdentifier__Alternatives3022); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getExistsKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1404:6: ( KEYWORD_32 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1404:6: ( KEYWORD_32 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1405:1: KEYWORD_32
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getSystemKeyword_12()); 
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__VerificationFunctionIdentifier__Alternatives3042); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getSystemKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1412:6: ( KEYWORD_25 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1412:6: ( KEYWORD_25 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1413:1: KEYWORD_25
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getFirstKeyword_13()); 
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__VerificationFunctionIdentifier__Alternatives3062); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getFirstKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1420:6: ( KEYWORD_17 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1420:6: ( KEYWORD_17 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1421:1: KEYWORD_17
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getLastKeyword_14()); 
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__VerificationFunctionIdentifier__Alternatives3082); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getLastKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1428:6: ( KEYWORD_16 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1428:6: ( KEYWORD_16 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1429:1: KEYWORD_16
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getHeadKeyword_15()); 
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__VerificationFunctionIdentifier__Alternatives3102); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getHeadKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1436:6: ( KEYWORD_28 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1436:6: ( KEYWORD_28 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1437:1: KEYWORD_28
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getQueueKeyword_16()); 
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__VerificationFunctionIdentifier__Alternatives3122); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getQueueKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1444:6: ( KEYWORD_18 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1444:6: ( KEYWORD_18 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1445:1: KEYWORD_18
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getListKeyword_17()); 
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__VerificationFunctionIdentifier__Alternatives3142); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getListKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1452:6: ( KEYWORD_21 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1452:6: ( KEYWORD_21 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1453:1: KEYWORD_21
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getSizeKeyword_18()); 
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__VerificationFunctionIdentifier__Alternatives3162); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getSizeKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1460:6: ( KEYWORD_26 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1460:6: ( KEYWORD_26 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1461:1: KEYWORD_26
                    {
                     before(grammarAccess.getVerificationFunctionIdentifierAccess().getFloatKeyword_19()); 
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__VerificationFunctionIdentifier__Alternatives3182); 
                     after(grammarAccess.getVerificationFunctionIdentifierAccess().getFloatKeyword_19()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionIdentifier__Alternatives"


    // $ANTLR start "rule__GenericOperator__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1473:1: rule__GenericOperator__Alternatives : ( ( ruleComparisonOperator ) | ( ruleBooleanOperator ) | ( ruleArithmeticOperator ) );
    public final void rule__GenericOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1477:1: ( ( ruleComparisonOperator ) | ( ruleBooleanOperator ) | ( ruleArithmeticOperator ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_NOT_EQUAL:
            case RULE_LESS_EQUAL:
            case RULE_GREATER_EQUAL:
            case RULE_GREATER:
            case RULE_LESS:
            case RULE_EQUAL:
                {
                alt11=1;
                }
                break;
            case KEYWORD_11:
            case KEYWORD_14:
            case KEYWORD_5:
                {
                alt11=2;
                }
                break;
            case KEYWORD_13:
            case RULE_PLUS:
            case RULE_POWER:
            case RULE_STAR:
            case RULE_SLASH:
            case RULE_MINUS:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1478:1: ( ruleComparisonOperator )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1478:1: ( ruleComparisonOperator )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1479:1: ruleComparisonOperator
                    {
                     before(grammarAccess.getGenericOperatorAccess().getComparisonOperatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComparisonOperator_in_rule__GenericOperator__Alternatives3216);
                    ruleComparisonOperator();

                    state._fsp--;

                     after(grammarAccess.getGenericOperatorAccess().getComparisonOperatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1484:6: ( ruleBooleanOperator )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1484:6: ( ruleBooleanOperator )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1485:1: ruleBooleanOperator
                    {
                     before(grammarAccess.getGenericOperatorAccess().getBooleanOperatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanOperator_in_rule__GenericOperator__Alternatives3233);
                    ruleBooleanOperator();

                    state._fsp--;

                     after(grammarAccess.getGenericOperatorAccess().getBooleanOperatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1490:6: ( ruleArithmeticOperator )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1490:6: ( ruleArithmeticOperator )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1491:1: ruleArithmeticOperator
                    {
                     before(grammarAccess.getGenericOperatorAccess().getArithmeticOperatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArithmeticOperator_in_rule__GenericOperator__Alternatives3250);
                    ruleArithmeticOperator();

                    state._fsp--;

                     after(grammarAccess.getGenericOperatorAccess().getArithmeticOperatorParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericOperator__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1501:1: rule__Literal__Alternatives : ( ( ( rule__Literal__BAssignment_0 ) ) | ( ( rule__Literal__SAssignment_1 ) ) | ( ( rule__Literal__NAssignment_2 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1505:1: ( ( ( rule__Literal__BAssignment_0 ) ) | ( ( rule__Literal__SAssignment_1 ) ) | ( ( rule__Literal__NAssignment_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
            case KEYWORD_24:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_NUMERIC:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1506:1: ( ( rule__Literal__BAssignment_0 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1506:1: ( ( rule__Literal__BAssignment_0 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1507:1: ( rule__Literal__BAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getBAssignment_0()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1508:1: ( rule__Literal__BAssignment_0 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1508:2: rule__Literal__BAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__BAssignment_0_in_rule__Literal__Alternatives3282);
                    rule__Literal__BAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getBAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1512:6: ( ( rule__Literal__SAssignment_1 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1512:6: ( ( rule__Literal__SAssignment_1 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1513:1: ( rule__Literal__SAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getSAssignment_1()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1514:1: ( rule__Literal__SAssignment_1 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1514:2: rule__Literal__SAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__SAssignment_1_in_rule__Literal__Alternatives3300);
                    rule__Literal__SAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getSAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1518:6: ( ( rule__Literal__NAssignment_2 ) )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1518:6: ( ( rule__Literal__NAssignment_2 ) )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1519:1: ( rule__Literal__NAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getNAssignment_2()); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1520:1: ( rule__Literal__NAssignment_2 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1520:2: rule__Literal__NAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__NAssignment_2_in_rule__Literal__Alternatives3318);
                    rule__Literal__NAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BOOLEAN__ValueAlternatives_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1529:1: rule__BOOLEAN__ValueAlternatives_0 : ( ( KEYWORD_24 ) | ( KEYWORD_30 ) );
    public final void rule__BOOLEAN__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1533:1: ( ( KEYWORD_24 ) | ( KEYWORD_30 ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_24) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1534:1: ( KEYWORD_24 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1534:1: ( KEYWORD_24 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1535:1: KEYWORD_24
                    {
                     before(grammarAccess.getBOOLEANAccess().getValueTrueKeyword_0_0()); 
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__BOOLEAN__ValueAlternatives_03352); 
                     after(grammarAccess.getBOOLEANAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1542:6: ( KEYWORD_30 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1542:6: ( KEYWORD_30 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1543:1: KEYWORD_30
                    {
                     before(grammarAccess.getBOOLEANAccess().getValueFalseKeyword_0_1()); 
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__BOOLEAN__ValueAlternatives_03372); 
                     after(grammarAccess.getBOOLEANAccess().getValueFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__ValueAlternatives_0"


    // $ANTLR start "rule__SetOperator__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1555:1: rule__SetOperator__Alternatives : ( ( RULE_PLUS ) | ( RULE_STAR ) | ( RULE_SLASH ) );
    public final void rule__SetOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1559:1: ( ( RULE_PLUS ) | ( RULE_STAR ) | ( RULE_SLASH ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt14=1;
                }
                break;
            case RULE_STAR:
                {
                alt14=2;
                }
                break;
            case RULE_SLASH:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1560:1: ( RULE_PLUS )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1560:1: ( RULE_PLUS )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1561:1: RULE_PLUS
                    {
                     before(grammarAccess.getSetOperatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__SetOperator__Alternatives3406); 
                     after(grammarAccess.getSetOperatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1566:6: ( RULE_STAR )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1566:6: ( RULE_STAR )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1567:1: RULE_STAR
                    {
                     before(grammarAccess.getSetOperatorAccess().getSTARTerminalRuleCall_1()); 
                    match(input,RULE_STAR,FOLLOW_RULE_STAR_in_rule__SetOperator__Alternatives3423); 
                     after(grammarAccess.getSetOperatorAccess().getSTARTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1572:6: ( RULE_SLASH )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1572:6: ( RULE_SLASH )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1573:1: RULE_SLASH
                    {
                     before(grammarAccess.getSetOperatorAccess().getSLASHTerminalRuleCall_2()); 
                    match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_rule__SetOperator__Alternatives3440); 
                     after(grammarAccess.getSetOperatorAccess().getSLASHTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOperator__Alternatives"


    // $ANTLR start "rule__ArithmeticOperator__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1583:1: rule__ArithmeticOperator__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_POWER ) | ( KEYWORD_13 ) );
    public final void rule__ArithmeticOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1587:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_POWER ) | ( KEYWORD_13 ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt15=1;
                }
                break;
            case RULE_MINUS:
                {
                alt15=2;
                }
                break;
            case RULE_STAR:
                {
                alt15=3;
                }
                break;
            case RULE_SLASH:
                {
                alt15=4;
                }
                break;
            case RULE_POWER:
                {
                alt15=5;
                }
                break;
            case KEYWORD_13:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1588:1: ( RULE_PLUS )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1588:1: ( RULE_PLUS )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1589:1: RULE_PLUS
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__ArithmeticOperator__Alternatives3472); 
                     after(grammarAccess.getArithmeticOperatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1594:6: ( RULE_MINUS )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1594:6: ( RULE_MINUS )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1595:1: RULE_MINUS
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__ArithmeticOperator__Alternatives3489); 
                     after(grammarAccess.getArithmeticOperatorAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1600:6: ( RULE_STAR )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1600:6: ( RULE_STAR )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1601:1: RULE_STAR
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getSTARTerminalRuleCall_2()); 
                    match(input,RULE_STAR,FOLLOW_RULE_STAR_in_rule__ArithmeticOperator__Alternatives3506); 
                     after(grammarAccess.getArithmeticOperatorAccess().getSTARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1606:6: ( RULE_SLASH )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1606:6: ( RULE_SLASH )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1607:1: RULE_SLASH
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getSLASHTerminalRuleCall_3()); 
                    match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_rule__ArithmeticOperator__Alternatives3523); 
                     after(grammarAccess.getArithmeticOperatorAccess().getSLASHTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1612:6: ( RULE_POWER )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1612:6: ( RULE_POWER )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1613:1: RULE_POWER
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getPOWERTerminalRuleCall_4()); 
                    match(input,RULE_POWER,FOLLOW_RULE_POWER_in_rule__ArithmeticOperator__Alternatives3540); 
                     after(grammarAccess.getArithmeticOperatorAccess().getPOWERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1618:6: ( KEYWORD_13 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1618:6: ( KEYWORD_13 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1619:1: KEYWORD_13
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getModKeyword_5()); 
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ArithmeticOperator__Alternatives3558); 
                     after(grammarAccess.getArithmeticOperatorAccess().getModKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticOperator__Alternatives"


    // $ANTLR start "rule__BooleanOperator__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1631:1: rule__BooleanOperator__Alternatives : ( ( KEYWORD_11 ) | ( KEYWORD_14 ) | ( KEYWORD_5 ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1635:1: ( ( KEYWORD_11 ) | ( KEYWORD_14 ) | ( KEYWORD_5 ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt16=1;
                }
                break;
            case KEYWORD_14:
                {
                alt16=2;
                }
                break;
            case KEYWORD_5:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1636:1: ( KEYWORD_11 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1636:1: ( KEYWORD_11 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1637:1: KEYWORD_11
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getAndKeyword_0()); 
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__BooleanOperator__Alternatives3593); 
                     after(grammarAccess.getBooleanOperatorAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1644:6: ( KEYWORD_14 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1644:6: ( KEYWORD_14 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1645:1: KEYWORD_14
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getNotKeyword_1()); 
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__BooleanOperator__Alternatives3613); 
                     after(grammarAccess.getBooleanOperatorAccess().getNotKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1652:6: ( KEYWORD_5 )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1652:6: ( KEYWORD_5 )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1653:1: KEYWORD_5
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getOrKeyword_2()); 
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__BooleanOperator__Alternatives3633); 
                     after(grammarAccess.getBooleanOperatorAccess().getOrKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1665:1: rule__ComparisonOperator__Alternatives : ( ( RULE_LESS ) | ( RULE_LESS_EQUAL ) | ( RULE_EQUAL ) | ( RULE_GREATER_EQUAL ) | ( RULE_GREATER ) | ( RULE_NOT_EQUAL ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1669:1: ( ( RULE_LESS ) | ( RULE_LESS_EQUAL ) | ( RULE_EQUAL ) | ( RULE_GREATER_EQUAL ) | ( RULE_GREATER ) | ( RULE_NOT_EQUAL ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_LESS:
                {
                alt17=1;
                }
                break;
            case RULE_LESS_EQUAL:
                {
                alt17=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt17=3;
                }
                break;
            case RULE_GREATER_EQUAL:
                {
                alt17=4;
                }
                break;
            case RULE_GREATER:
                {
                alt17=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1670:1: ( RULE_LESS )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1670:1: ( RULE_LESS )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1671:1: RULE_LESS
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSTerminalRuleCall_0()); 
                    match(input,RULE_LESS,FOLLOW_RULE_LESS_in_rule__ComparisonOperator__Alternatives3667); 
                     after(grammarAccess.getComparisonOperatorAccess().getLESSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1676:6: ( RULE_LESS_EQUAL )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1676:6: ( RULE_LESS_EQUAL )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1677:1: RULE_LESS_EQUAL
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALTerminalRuleCall_1()); 
                    match(input,RULE_LESS_EQUAL,FOLLOW_RULE_LESS_EQUAL_in_rule__ComparisonOperator__Alternatives3684); 
                     after(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1682:6: ( RULE_EQUAL )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1682:6: ( RULE_EQUAL )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1683:1: RULE_EQUAL
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALTerminalRuleCall_2()); 
                    match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__ComparisonOperator__Alternatives3701); 
                     after(grammarAccess.getComparisonOperatorAccess().getEQUALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1688:6: ( RULE_GREATER_EQUAL )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1688:6: ( RULE_GREATER_EQUAL )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1689:1: RULE_GREATER_EQUAL
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALTerminalRuleCall_3()); 
                    match(input,RULE_GREATER_EQUAL,FOLLOW_RULE_GREATER_EQUAL_in_rule__ComparisonOperator__Alternatives3718); 
                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1694:6: ( RULE_GREATER )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1694:6: ( RULE_GREATER )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1695:1: RULE_GREATER
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATERTerminalRuleCall_4()); 
                    match(input,RULE_GREATER,FOLLOW_RULE_GREATER_in_rule__ComparisonOperator__Alternatives3735); 
                     after(grammarAccess.getComparisonOperatorAccess().getGREATERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1700:6: ( RULE_NOT_EQUAL )
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1700:6: ( RULE_NOT_EQUAL )
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1701:1: RULE_NOT_EQUAL
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALTerminalRuleCall_5()); 
                    match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_rule__ComparisonOperator__Alternatives3752); 
                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALTerminalRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__Theorem__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1713:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1717:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1718:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__03782);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__03785);
            rule__Theorem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0"


    // $ANTLR start "rule__Theorem__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1725:1: rule__Theorem__Group__0__Impl : ( KEYWORD_37 ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1729:1: ( ( KEYWORD_37 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1730:1: ( KEYWORD_37 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1730:1: ( KEYWORD_37 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1731:1: KEYWORD_37
            {
             before(grammarAccess.getTheoremAccess().getTheoremKeyword_0()); 
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__Theorem__Group__0__Impl3813); 
             after(grammarAccess.getTheoremAccess().getTheoremKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0__Impl"


    // $ANTLR start "rule__Theorem__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1744:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1748:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1749:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__13844);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__13847);
            rule__Theorem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1"


    // $ANTLR start "rule__Theorem__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1756:1: rule__Theorem__Group__1__Impl : ( ( rule__Theorem__NameAssignment_1 ) ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1760:1: ( ( ( rule__Theorem__NameAssignment_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1761:1: ( ( rule__Theorem__NameAssignment_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1761:1: ( ( rule__Theorem__NameAssignment_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1762:1: ( rule__Theorem__NameAssignment_1 )
            {
             before(grammarAccess.getTheoremAccess().getNameAssignment_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1763:1: ( rule__Theorem__NameAssignment_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1763:2: rule__Theorem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Theorem__NameAssignment_1_in_rule__Theorem__Group__1__Impl3874);
            rule__Theorem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1__Impl"


    // $ANTLR start "rule__Theorem__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1773:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1777:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1778:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__23904);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__23907);
            rule__Theorem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2"


    // $ANTLR start "rule__Theorem__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1785:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__RangeDefinitionAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1789:1: ( ( ( rule__Theorem__RangeDefinitionAssignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1790:1: ( ( rule__Theorem__RangeDefinitionAssignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1790:1: ( ( rule__Theorem__RangeDefinitionAssignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1791:1: ( rule__Theorem__RangeDefinitionAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getRangeDefinitionAssignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1792:1: ( rule__Theorem__RangeDefinitionAssignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1792:2: rule__Theorem__RangeDefinitionAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__RangeDefinitionAssignment_2_in_rule__Theorem__Group__2__Impl3934);
            rule__Theorem__RangeDefinitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getRangeDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2__Impl"


    // $ANTLR start "rule__Theorem__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1802:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1806:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1807:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__33964);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__33967);
            rule__Theorem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3"


    // $ANTLR start "rule__Theorem__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1814:1: rule__Theorem__Group__3__Impl : ( ( rule__Theorem__RequiredDefinitionAssignment_3 )? ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1818:1: ( ( ( rule__Theorem__RequiredDefinitionAssignment_3 )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1819:1: ( ( rule__Theorem__RequiredDefinitionAssignment_3 )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1819:1: ( ( rule__Theorem__RequiredDefinitionAssignment_3 )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1820:1: ( rule__Theorem__RequiredDefinitionAssignment_3 )?
            {
             before(grammarAccess.getTheoremAccess().getRequiredDefinitionAssignment_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1821:1: ( rule__Theorem__RequiredDefinitionAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1821:2: rule__Theorem__RequiredDefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Theorem__RequiredDefinitionAssignment_3_in_rule__Theorem__Group__3__Impl3994);
                    rule__Theorem__RequiredDefinitionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoremAccess().getRequiredDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3__Impl"


    // $ANTLR start "rule__Theorem__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1831:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1835:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1836:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44025);
            rule__Theorem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44028);
            rule__Theorem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4"


    // $ANTLR start "rule__Theorem__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1843:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__Alternatives_4 )* ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1847:1: ( ( ( rule__Theorem__Alternatives_4 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1848:1: ( ( rule__Theorem__Alternatives_4 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1848:1: ( ( rule__Theorem__Alternatives_4 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1849:1: ( rule__Theorem__Alternatives_4 )*
            {
             before(grammarAccess.getTheoremAccess().getAlternatives_4()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1850:1: ( rule__Theorem__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KEYWORD_15||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1850:2: rule__Theorem__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__Theorem__Alternatives_4_in_rule__Theorem__Group__4__Impl4055);
            	    rule__Theorem__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTheoremAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4__Impl"


    // $ANTLR start "rule__Theorem__Group__5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1860:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1864:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1865:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54086);
            rule__Theorem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54089);
            rule__Theorem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__5"


    // $ANTLR start "rule__Theorem__Group__5__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1872:1: rule__Theorem__Group__5__Impl : ( ( rule__Theorem__Alternatives_5 ) ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1876:1: ( ( ( rule__Theorem__Alternatives_5 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1877:1: ( ( rule__Theorem__Alternatives_5 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1877:1: ( ( rule__Theorem__Alternatives_5 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1878:1: ( rule__Theorem__Alternatives_5 )
            {
             before(grammarAccess.getTheoremAccess().getAlternatives_5()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1879:1: ( rule__Theorem__Alternatives_5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1879:2: rule__Theorem__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Theorem__Alternatives_5_in_rule__Theorem__Group__5__Impl4116);
            rule__Theorem__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__5__Impl"


    // $ANTLR start "rule__Theorem__Group__6"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1889:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1893:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1894:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64146);
            rule__Theorem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64149);
            rule__Theorem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__6"


    // $ANTLR start "rule__Theorem__Group__6__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1901:1: rule__Theorem__Group__6__Impl : ( KEYWORD_12 ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1905:1: ( ( KEYWORD_12 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1906:1: ( KEYWORD_12 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1906:1: ( KEYWORD_12 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1907:1: KEYWORD_12
            {
             before(grammarAccess.getTheoremAccess().getEndKeyword_6()); 
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__Theorem__Group__6__Impl4177); 
             after(grammarAccess.getTheoremAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__6__Impl"


    // $ANTLR start "rule__Theorem__Group__7"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1920:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl rule__Theorem__Group__8 ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1924:1: ( rule__Theorem__Group__7__Impl rule__Theorem__Group__8 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1925:2: rule__Theorem__Group__7__Impl rule__Theorem__Group__8
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74208);
            rule__Theorem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__8_in_rule__Theorem__Group__74211);
            rule__Theorem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__7"


    // $ANTLR start "rule__Theorem__Group__7__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1932:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__EndNameAssignment_7 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1936:1: ( ( ( rule__Theorem__EndNameAssignment_7 )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1937:1: ( ( rule__Theorem__EndNameAssignment_7 )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1937:1: ( ( rule__Theorem__EndNameAssignment_7 )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1938:1: ( rule__Theorem__EndNameAssignment_7 )?
            {
             before(grammarAccess.getTheoremAccess().getEndNameAssignment_7()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1939:1: ( rule__Theorem__EndNameAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1939:2: rule__Theorem__EndNameAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Theorem__EndNameAssignment_7_in_rule__Theorem__Group__7__Impl4238);
                    rule__Theorem__EndNameAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoremAccess().getEndNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__7__Impl"


    // $ANTLR start "rule__Theorem__Group__8"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1949:1: rule__Theorem__Group__8 : rule__Theorem__Group__8__Impl ;
    public final void rule__Theorem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1953:1: ( rule__Theorem__Group__8__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1954:2: rule__Theorem__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__8__Impl_in_rule__Theorem__Group__84269);
            rule__Theorem__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__8"


    // $ANTLR start "rule__Theorem__Group__8__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1960:1: rule__Theorem__Group__8__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__Theorem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1964:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1965:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1965:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1966:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getTheoremAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__Theorem__Group__8__Impl4296); 
             after(grammarAccess.getTheoremAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__8__Impl"


    // $ANTLR start "rule__RangeDefinition__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1995:1: rule__RangeDefinition__Group__0 : rule__RangeDefinition__Group__0__Impl rule__RangeDefinition__Group__1 ;
    public final void rule__RangeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:1999:1: ( rule__RangeDefinition__Group__0__Impl rule__RangeDefinition__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2000:2: rule__RangeDefinition__Group__0__Impl rule__RangeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__0__Impl_in_rule__RangeDefinition__Group__04343);
            rule__RangeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeDefinition__Group__1_in_rule__RangeDefinition__Group__04346);
            rule__RangeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__0"


    // $ANTLR start "rule__RangeDefinition__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2007:1: rule__RangeDefinition__Group__0__Impl : ( KEYWORD_36 ) ;
    public final void rule__RangeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2011:1: ( ( KEYWORD_36 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2012:1: ( KEYWORD_36 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2012:1: ( KEYWORD_36 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2013:1: KEYWORD_36
            {
             before(grammarAccess.getRangeDefinitionAccess().getForeachKeyword_0()); 
            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__RangeDefinition__Group__0__Impl4374); 
             after(grammarAccess.getRangeDefinitionAccess().getForeachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__0__Impl"


    // $ANTLR start "rule__RangeDefinition__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2026:1: rule__RangeDefinition__Group__1 : rule__RangeDefinition__Group__1__Impl rule__RangeDefinition__Group__2 ;
    public final void rule__RangeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2030:1: ( rule__RangeDefinition__Group__1__Impl rule__RangeDefinition__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2031:2: rule__RangeDefinition__Group__1__Impl rule__RangeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__1__Impl_in_rule__RangeDefinition__Group__14405);
            rule__RangeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeDefinition__Group__2_in_rule__RangeDefinition__Group__14408);
            rule__RangeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__1"


    // $ANTLR start "rule__RangeDefinition__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2038:1: rule__RangeDefinition__Group__1__Impl : ( ( rule__RangeDefinition__ElementAssignment_1 ) ) ;
    public final void rule__RangeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2042:1: ( ( ( rule__RangeDefinition__ElementAssignment_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2043:1: ( ( rule__RangeDefinition__ElementAssignment_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2043:1: ( ( rule__RangeDefinition__ElementAssignment_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2044:1: ( rule__RangeDefinition__ElementAssignment_1 )
            {
             before(grammarAccess.getRangeDefinitionAccess().getElementAssignment_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2045:1: ( rule__RangeDefinition__ElementAssignment_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2045:2: rule__RangeDefinition__ElementAssignment_1
            {
            pushFollow(FOLLOW_rule__RangeDefinition__ElementAssignment_1_in_rule__RangeDefinition__Group__1__Impl4435);
            rule__RangeDefinition__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeDefinitionAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__1__Impl"


    // $ANTLR start "rule__RangeDefinition__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2055:1: rule__RangeDefinition__Group__2 : rule__RangeDefinition__Group__2__Impl rule__RangeDefinition__Group__3 ;
    public final void rule__RangeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2059:1: ( rule__RangeDefinition__Group__2__Impl rule__RangeDefinition__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2060:2: rule__RangeDefinition__Group__2__Impl rule__RangeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__2__Impl_in_rule__RangeDefinition__Group__24465);
            rule__RangeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeDefinition__Group__3_in_rule__RangeDefinition__Group__24468);
            rule__RangeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__2"


    // $ANTLR start "rule__RangeDefinition__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2067:1: rule__RangeDefinition__Group__2__Impl : ( KEYWORD_4 ) ;
    public final void rule__RangeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2071:1: ( ( KEYWORD_4 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2072:1: ( KEYWORD_4 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2072:1: ( KEYWORD_4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2073:1: KEYWORD_4
            {
             before(grammarAccess.getRangeDefinitionAccess().getInKeyword_2()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__RangeDefinition__Group__2__Impl4496); 
             after(grammarAccess.getRangeDefinitionAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__2__Impl"


    // $ANTLR start "rule__RangeDefinition__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2086:1: rule__RangeDefinition__Group__3 : rule__RangeDefinition__Group__3__Impl rule__RangeDefinition__Group__4 ;
    public final void rule__RangeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2090:1: ( rule__RangeDefinition__Group__3__Impl rule__RangeDefinition__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2091:2: rule__RangeDefinition__Group__3__Impl rule__RangeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__3__Impl_in_rule__RangeDefinition__Group__34527);
            rule__RangeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeDefinition__Group__4_in_rule__RangeDefinition__Group__34530);
            rule__RangeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__3"


    // $ANTLR start "rule__RangeDefinition__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2098:1: rule__RangeDefinition__Group__3__Impl : ( ( rule__RangeDefinition__SetAssignment_3 ) ) ;
    public final void rule__RangeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2102:1: ( ( ( rule__RangeDefinition__SetAssignment_3 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2103:1: ( ( rule__RangeDefinition__SetAssignment_3 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2103:1: ( ( rule__RangeDefinition__SetAssignment_3 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2104:1: ( rule__RangeDefinition__SetAssignment_3 )
            {
             before(grammarAccess.getRangeDefinitionAccess().getSetAssignment_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2105:1: ( rule__RangeDefinition__SetAssignment_3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2105:2: rule__RangeDefinition__SetAssignment_3
            {
            pushFollow(FOLLOW_rule__RangeDefinition__SetAssignment_3_in_rule__RangeDefinition__Group__3__Impl4557);
            rule__RangeDefinition__SetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeDefinitionAccess().getSetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__3__Impl"


    // $ANTLR start "rule__RangeDefinition__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2115:1: rule__RangeDefinition__Group__4 : rule__RangeDefinition__Group__4__Impl ;
    public final void rule__RangeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2119:1: ( rule__RangeDefinition__Group__4__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2120:2: rule__RangeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RangeDefinition__Group__4__Impl_in_rule__RangeDefinition__Group__44587);
            rule__RangeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__4"


    // $ANTLR start "rule__RangeDefinition__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2126:1: rule__RangeDefinition__Group__4__Impl : ( KEYWORD_2 ) ;
    public final void rule__RangeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2130:1: ( ( KEYWORD_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2131:1: ( KEYWORD_2 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2131:1: ( KEYWORD_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2132:1: KEYWORD_2
            {
             before(grammarAccess.getRangeDefinitionAccess().getDoKeyword_4()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__RangeDefinition__Group__4__Impl4615); 
             after(grammarAccess.getRangeDefinitionAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__Group__4__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2155:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2159:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2160:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__04656);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__04659);
            rule__VarDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2167:1: rule__VarDeclaration__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2171:1: ( ( KEYWORD_15 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2172:1: ( KEYWORD_15 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2172:1: ( KEYWORD_15 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2173:1: KEYWORD_15
            {
             before(grammarAccess.getVarDeclarationAccess().getVarKeyword_0()); 
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__VarDeclaration__Group__0__Impl4687); 
             after(grammarAccess.getVarDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2186:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2190:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2191:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__14718);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDeclaration__Group__2_in_rule__VarDeclaration__Group__14721);
            rule__VarDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2198:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__IdentifierAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2202:1: ( ( ( rule__VarDeclaration__IdentifierAssignment_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2203:1: ( ( rule__VarDeclaration__IdentifierAssignment_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2203:1: ( ( rule__VarDeclaration__IdentifierAssignment_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2204:1: ( rule__VarDeclaration__IdentifierAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getIdentifierAssignment_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2205:1: ( rule__VarDeclaration__IdentifierAssignment_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2205:2: rule__VarDeclaration__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__IdentifierAssignment_1_in_rule__VarDeclaration__Group__1__Impl4748);
            rule__VarDeclaration__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2215:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2219:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2220:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__2__Impl_in_rule__VarDeclaration__Group__24778);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDeclaration__Group__3_in_rule__VarDeclaration__Group__24781);
            rule__VarDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2227:1: rule__VarDeclaration__Group__2__Impl : ( RULE_AFFECTATION_OPERATOR ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2231:1: ( ( RULE_AFFECTATION_OPERATOR ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2232:1: ( RULE_AFFECTATION_OPERATOR )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2232:1: ( RULE_AFFECTATION_OPERATOR )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2233:1: RULE_AFFECTATION_OPERATOR
            {
             before(grammarAccess.getVarDeclarationAccess().getAFFECTATION_OPERATORTerminalRuleCall_2()); 
            match(input,RULE_AFFECTATION_OPERATOR,FOLLOW_RULE_AFFECTATION_OPERATOR_in_rule__VarDeclaration__Group__2__Impl4808); 
             after(grammarAccess.getVarDeclarationAccess().getAFFECTATION_OPERATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2244:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4 ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2248:1: ( rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2249:2: rule__VarDeclaration__Group__3__Impl rule__VarDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__3__Impl_in_rule__VarDeclaration__Group__34837);
            rule__VarDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDeclaration__Group__4_in_rule__VarDeclaration__Group__34840);
            rule__VarDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3"


    // $ANTLR start "rule__VarDeclaration__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2256:1: rule__VarDeclaration__Group__3__Impl : ( ( rule__VarDeclaration__ExprAssignment_3 ) ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2260:1: ( ( ( rule__VarDeclaration__ExprAssignment_3 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2261:1: ( ( rule__VarDeclaration__ExprAssignment_3 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2261:1: ( ( rule__VarDeclaration__ExprAssignment_3 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2262:1: ( rule__VarDeclaration__ExprAssignment_3 )
            {
             before(grammarAccess.getVarDeclarationAccess().getExprAssignment_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2263:1: ( rule__VarDeclaration__ExprAssignment_3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2263:2: rule__VarDeclaration__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__VarDeclaration__ExprAssignment_3_in_rule__VarDeclaration__Group__3__Impl4867);
            rule__VarDeclaration__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2273:1: rule__VarDeclaration__Group__4 : rule__VarDeclaration__Group__4__Impl ;
    public final void rule__VarDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2277:1: ( rule__VarDeclaration__Group__4__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2278:2: rule__VarDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__4__Impl_in_rule__VarDeclaration__Group__44897);
            rule__VarDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__4"


    // $ANTLR start "rule__VarDeclaration__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2284:1: rule__VarDeclaration__Group__4__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__VarDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2288:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2289:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2289:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2290:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getVarDeclarationAccess().getPUNC_SEMI_COLONTerminalRuleCall_4()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__VarDeclaration__Group__4__Impl4924); 
             after(grammarAccess.getVarDeclarationAccess().getPUNC_SEMI_COLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2311:1: rule__SetDeclaration__Group__0 : rule__SetDeclaration__Group__0__Impl rule__SetDeclaration__Group__1 ;
    public final void rule__SetDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2315:1: ( rule__SetDeclaration__Group__0__Impl rule__SetDeclaration__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2316:2: rule__SetDeclaration__Group__0__Impl rule__SetDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__0__Impl_in_rule__SetDeclaration__Group__04963);
            rule__SetDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__1_in_rule__SetDeclaration__Group__04966);
            rule__SetDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__0"


    // $ANTLR start "rule__SetDeclaration__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2323:1: rule__SetDeclaration__Group__0__Impl : ( ( rule__SetDeclaration__SetAssignment_0 ) ) ;
    public final void rule__SetDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2327:1: ( ( ( rule__SetDeclaration__SetAssignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2328:1: ( ( rule__SetDeclaration__SetAssignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2328:1: ( ( rule__SetDeclaration__SetAssignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2329:1: ( rule__SetDeclaration__SetAssignment_0 )
            {
             before(grammarAccess.getSetDeclarationAccess().getSetAssignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2330:1: ( rule__SetDeclaration__SetAssignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2330:2: rule__SetDeclaration__SetAssignment_0
            {
            pushFollow(FOLLOW_rule__SetDeclaration__SetAssignment_0_in_rule__SetDeclaration__Group__0__Impl4993);
            rule__SetDeclaration__SetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetDeclarationAccess().getSetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2340:1: rule__SetDeclaration__Group__1 : rule__SetDeclaration__Group__1__Impl rule__SetDeclaration__Group__2 ;
    public final void rule__SetDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2344:1: ( rule__SetDeclaration__Group__1__Impl rule__SetDeclaration__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2345:2: rule__SetDeclaration__Group__1__Impl rule__SetDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__1__Impl_in_rule__SetDeclaration__Group__15023);
            rule__SetDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__2_in_rule__SetDeclaration__Group__15026);
            rule__SetDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__1"


    // $ANTLR start "rule__SetDeclaration__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2352:1: rule__SetDeclaration__Group__1__Impl : ( ( rule__SetDeclaration__Group_1__0 )? ) ;
    public final void rule__SetDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2356:1: ( ( ( rule__SetDeclaration__Group_1__0 )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2357:1: ( ( rule__SetDeclaration__Group_1__0 )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2357:1: ( ( rule__SetDeclaration__Group_1__0 )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2358:1: ( rule__SetDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getSetDeclarationAccess().getGroup_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2359:1: ( rule__SetDeclaration__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_PUNC_OPEN_PARENTHESIS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2359:2: rule__SetDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SetDeclaration__Group_1__0_in_rule__SetDeclaration__Group__1__Impl5053);
                    rule__SetDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2369:1: rule__SetDeclaration__Group__2 : rule__SetDeclaration__Group__2__Impl rule__SetDeclaration__Group__3 ;
    public final void rule__SetDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2373:1: ( rule__SetDeclaration__Group__2__Impl rule__SetDeclaration__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2374:2: rule__SetDeclaration__Group__2__Impl rule__SetDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__2__Impl_in_rule__SetDeclaration__Group__25084);
            rule__SetDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__3_in_rule__SetDeclaration__Group__25087);
            rule__SetDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__2"


    // $ANTLR start "rule__SetDeclaration__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2381:1: rule__SetDeclaration__Group__2__Impl : ( RULE_AFFECTATION_OPERATOR ) ;
    public final void rule__SetDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2385:1: ( ( RULE_AFFECTATION_OPERATOR ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2386:1: ( RULE_AFFECTATION_OPERATOR )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2386:1: ( RULE_AFFECTATION_OPERATOR )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2387:1: RULE_AFFECTATION_OPERATOR
            {
             before(grammarAccess.getSetDeclarationAccess().getAFFECTATION_OPERATORTerminalRuleCall_2()); 
            match(input,RULE_AFFECTATION_OPERATOR,FOLLOW_RULE_AFFECTATION_OPERATOR_in_rule__SetDeclaration__Group__2__Impl5114); 
             after(grammarAccess.getSetDeclarationAccess().getAFFECTATION_OPERATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2398:1: rule__SetDeclaration__Group__3 : rule__SetDeclaration__Group__3__Impl rule__SetDeclaration__Group__4 ;
    public final void rule__SetDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2402:1: ( rule__SetDeclaration__Group__3__Impl rule__SetDeclaration__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2403:2: rule__SetDeclaration__Group__3__Impl rule__SetDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__3__Impl_in_rule__SetDeclaration__Group__35143);
            rule__SetDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__4_in_rule__SetDeclaration__Group__35146);
            rule__SetDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__3"


    // $ANTLR start "rule__SetDeclaration__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2410:1: rule__SetDeclaration__Group__3__Impl : ( RULE_PUNC_OPEN_BRACE ) ;
    public final void rule__SetDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2414:1: ( ( RULE_PUNC_OPEN_BRACE ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2415:1: ( RULE_PUNC_OPEN_BRACE )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2415:1: ( RULE_PUNC_OPEN_BRACE )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2416:1: RULE_PUNC_OPEN_BRACE
            {
             before(grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_BRACETerminalRuleCall_3()); 
            match(input,RULE_PUNC_OPEN_BRACE,FOLLOW_RULE_PUNC_OPEN_BRACE_in_rule__SetDeclaration__Group__3__Impl5173); 
             after(grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_BRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2427:1: rule__SetDeclaration__Group__4 : rule__SetDeclaration__Group__4__Impl rule__SetDeclaration__Group__5 ;
    public final void rule__SetDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2431:1: ( rule__SetDeclaration__Group__4__Impl rule__SetDeclaration__Group__5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2432:2: rule__SetDeclaration__Group__4__Impl rule__SetDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__4__Impl_in_rule__SetDeclaration__Group__45202);
            rule__SetDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__5_in_rule__SetDeclaration__Group__45205);
            rule__SetDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__4"


    // $ANTLR start "rule__SetDeclaration__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2439:1: rule__SetDeclaration__Group__4__Impl : ( ( rule__SetDeclaration__ElementBindingAssignment_4 ) ) ;
    public final void rule__SetDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2443:1: ( ( ( rule__SetDeclaration__ElementBindingAssignment_4 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2444:1: ( ( rule__SetDeclaration__ElementBindingAssignment_4 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2444:1: ( ( rule__SetDeclaration__ElementBindingAssignment_4 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2445:1: ( rule__SetDeclaration__ElementBindingAssignment_4 )
            {
             before(grammarAccess.getSetDeclarationAccess().getElementBindingAssignment_4()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2446:1: ( rule__SetDeclaration__ElementBindingAssignment_4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2446:2: rule__SetDeclaration__ElementBindingAssignment_4
            {
            pushFollow(FOLLOW_rule__SetDeclaration__ElementBindingAssignment_4_in_rule__SetDeclaration__Group__4__Impl5232);
            rule__SetDeclaration__ElementBindingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetDeclarationAccess().getElementBindingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2456:1: rule__SetDeclaration__Group__5 : rule__SetDeclaration__Group__5__Impl rule__SetDeclaration__Group__6 ;
    public final void rule__SetDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2460:1: ( rule__SetDeclaration__Group__5__Impl rule__SetDeclaration__Group__6 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2461:2: rule__SetDeclaration__Group__5__Impl rule__SetDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__5__Impl_in_rule__SetDeclaration__Group__55262);
            rule__SetDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__6_in_rule__SetDeclaration__Group__55265);
            rule__SetDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__5"


    // $ANTLR start "rule__SetDeclaration__Group__5__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2468:1: rule__SetDeclaration__Group__5__Impl : ( KEYWORD_1 ) ;
    public final void rule__SetDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2472:1: ( ( KEYWORD_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2473:1: ( KEYWORD_1 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2473:1: ( KEYWORD_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2474:1: KEYWORD_1
            {
             before(grammarAccess.getSetDeclarationAccess().getVerticalLineKeyword_5()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__SetDeclaration__Group__5__Impl5293); 
             after(grammarAccess.getSetDeclarationAccess().getVerticalLineKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__5__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__6"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2487:1: rule__SetDeclaration__Group__6 : rule__SetDeclaration__Group__6__Impl rule__SetDeclaration__Group__7 ;
    public final void rule__SetDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2491:1: ( rule__SetDeclaration__Group__6__Impl rule__SetDeclaration__Group__7 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2492:2: rule__SetDeclaration__Group__6__Impl rule__SetDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__6__Impl_in_rule__SetDeclaration__Group__65324);
            rule__SetDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__7_in_rule__SetDeclaration__Group__65327);
            rule__SetDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__6"


    // $ANTLR start "rule__SetDeclaration__Group__6__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2499:1: rule__SetDeclaration__Group__6__Impl : ( ( rule__SetDeclaration__ExprAssignment_6 ) ) ;
    public final void rule__SetDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2503:1: ( ( ( rule__SetDeclaration__ExprAssignment_6 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2504:1: ( ( rule__SetDeclaration__ExprAssignment_6 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2504:1: ( ( rule__SetDeclaration__ExprAssignment_6 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2505:1: ( rule__SetDeclaration__ExprAssignment_6 )
            {
             before(grammarAccess.getSetDeclarationAccess().getExprAssignment_6()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2506:1: ( rule__SetDeclaration__ExprAssignment_6 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2506:2: rule__SetDeclaration__ExprAssignment_6
            {
            pushFollow(FOLLOW_rule__SetDeclaration__ExprAssignment_6_in_rule__SetDeclaration__Group__6__Impl5354);
            rule__SetDeclaration__ExprAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetDeclarationAccess().getExprAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__6__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__7"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2516:1: rule__SetDeclaration__Group__7 : rule__SetDeclaration__Group__7__Impl rule__SetDeclaration__Group__8 ;
    public final void rule__SetDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2520:1: ( rule__SetDeclaration__Group__7__Impl rule__SetDeclaration__Group__8 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2521:2: rule__SetDeclaration__Group__7__Impl rule__SetDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__7__Impl_in_rule__SetDeclaration__Group__75384);
            rule__SetDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group__8_in_rule__SetDeclaration__Group__75387);
            rule__SetDeclaration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__7"


    // $ANTLR start "rule__SetDeclaration__Group__7__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2528:1: rule__SetDeclaration__Group__7__Impl : ( RULE_PUNC_CLOSE_BRACE ) ;
    public final void rule__SetDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2532:1: ( ( RULE_PUNC_CLOSE_BRACE ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2533:1: ( RULE_PUNC_CLOSE_BRACE )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2533:1: ( RULE_PUNC_CLOSE_BRACE )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2534:1: RULE_PUNC_CLOSE_BRACE
            {
             before(grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_BRACETerminalRuleCall_7()); 
            match(input,RULE_PUNC_CLOSE_BRACE,FOLLOW_RULE_PUNC_CLOSE_BRACE_in_rule__SetDeclaration__Group__7__Impl5414); 
             after(grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_BRACETerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__7__Impl"


    // $ANTLR start "rule__SetDeclaration__Group__8"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2545:1: rule__SetDeclaration__Group__8 : rule__SetDeclaration__Group__8__Impl ;
    public final void rule__SetDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2549:1: ( rule__SetDeclaration__Group__8__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2550:2: rule__SetDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group__8__Impl_in_rule__SetDeclaration__Group__85443);
            rule__SetDeclaration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__8"


    // $ANTLR start "rule__SetDeclaration__Group__8__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2556:1: rule__SetDeclaration__Group__8__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__SetDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2560:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2561:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2561:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2562:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getSetDeclarationAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__SetDeclaration__Group__8__Impl5470); 
             after(grammarAccess.getSetDeclarationAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group__8__Impl"


    // $ANTLR start "rule__SetDeclaration__Group_1__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2591:1: rule__SetDeclaration__Group_1__0 : rule__SetDeclaration__Group_1__0__Impl rule__SetDeclaration__Group_1__1 ;
    public final void rule__SetDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2595:1: ( rule__SetDeclaration__Group_1__0__Impl rule__SetDeclaration__Group_1__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2596:2: rule__SetDeclaration__Group_1__0__Impl rule__SetDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group_1__0__Impl_in_rule__SetDeclaration__Group_1__05517);
            rule__SetDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group_1__1_in_rule__SetDeclaration__Group_1__05520);
            rule__SetDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__0"


    // $ANTLR start "rule__SetDeclaration__Group_1__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2603:1: rule__SetDeclaration__Group_1__0__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__SetDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2607:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2608:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2608:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2609:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_0()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__SetDeclaration__Group_1__0__Impl5547); 
             after(grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__SetDeclaration__Group_1__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2620:1: rule__SetDeclaration__Group_1__1 : rule__SetDeclaration__Group_1__1__Impl rule__SetDeclaration__Group_1__2 ;
    public final void rule__SetDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2624:1: ( rule__SetDeclaration__Group_1__1__Impl rule__SetDeclaration__Group_1__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2625:2: rule__SetDeclaration__Group_1__1__Impl rule__SetDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group_1__1__Impl_in_rule__SetDeclaration__Group_1__15576);
            rule__SetDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetDeclaration__Group_1__2_in_rule__SetDeclaration__Group_1__15579);
            rule__SetDeclaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__1"


    // $ANTLR start "rule__SetDeclaration__Group_1__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2632:1: rule__SetDeclaration__Group_1__1__Impl : ( ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 ) ) ;
    public final void rule__SetDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2636:1: ( ( ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2637:1: ( ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2637:1: ( ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2638:1: ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 )
            {
             before(grammarAccess.getSetDeclarationAccess().getParamIdentifierAssignment_1_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2639:1: ( rule__SetDeclaration__ParamIdentifierAssignment_1_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2639:2: rule__SetDeclaration__ParamIdentifierAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SetDeclaration__ParamIdentifierAssignment_1_1_in_rule__SetDeclaration__Group_1__1__Impl5606);
            rule__SetDeclaration__ParamIdentifierAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetDeclarationAccess().getParamIdentifierAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__SetDeclaration__Group_1__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2649:1: rule__SetDeclaration__Group_1__2 : rule__SetDeclaration__Group_1__2__Impl ;
    public final void rule__SetDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2653:1: ( rule__SetDeclaration__Group_1__2__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2654:2: rule__SetDeclaration__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SetDeclaration__Group_1__2__Impl_in_rule__SetDeclaration__Group_1__25636);
            rule__SetDeclaration__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__2"


    // $ANTLR start "rule__SetDeclaration__Group_1__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2660:1: rule__SetDeclaration__Group_1__2__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__SetDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2664:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2665:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2665:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2666:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_2()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__SetDeclaration__Group_1__2__Impl5663); 
             after(grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__ElementBinding__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2683:1: rule__ElementBinding__Group__0 : rule__ElementBinding__Group__0__Impl rule__ElementBinding__Group__1 ;
    public final void rule__ElementBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2687:1: ( rule__ElementBinding__Group__0__Impl rule__ElementBinding__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2688:2: rule__ElementBinding__Group__0__Impl rule__ElementBinding__Group__1
            {
            pushFollow(FOLLOW_rule__ElementBinding__Group__0__Impl_in_rule__ElementBinding__Group__05698);
            rule__ElementBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementBinding__Group__1_in_rule__ElementBinding__Group__05701);
            rule__ElementBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__0"


    // $ANTLR start "rule__ElementBinding__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2695:1: rule__ElementBinding__Group__0__Impl : ( ( rule__ElementBinding__ElementAssignment_0 ) ) ;
    public final void rule__ElementBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2699:1: ( ( ( rule__ElementBinding__ElementAssignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2700:1: ( ( rule__ElementBinding__ElementAssignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2700:1: ( ( rule__ElementBinding__ElementAssignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2701:1: ( rule__ElementBinding__ElementAssignment_0 )
            {
             before(grammarAccess.getElementBindingAccess().getElementAssignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2702:1: ( rule__ElementBinding__ElementAssignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2702:2: rule__ElementBinding__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__ElementBinding__ElementAssignment_0_in_rule__ElementBinding__Group__0__Impl5728);
            rule__ElementBinding__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementBindingAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__0__Impl"


    // $ANTLR start "rule__ElementBinding__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2712:1: rule__ElementBinding__Group__1 : rule__ElementBinding__Group__1__Impl rule__ElementBinding__Group__2 ;
    public final void rule__ElementBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2716:1: ( rule__ElementBinding__Group__1__Impl rule__ElementBinding__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2717:2: rule__ElementBinding__Group__1__Impl rule__ElementBinding__Group__2
            {
            pushFollow(FOLLOW_rule__ElementBinding__Group__1__Impl_in_rule__ElementBinding__Group__15758);
            rule__ElementBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementBinding__Group__2_in_rule__ElementBinding__Group__15761);
            rule__ElementBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__1"


    // $ANTLR start "rule__ElementBinding__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2724:1: rule__ElementBinding__Group__1__Impl : ( KEYWORD_4 ) ;
    public final void rule__ElementBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2728:1: ( ( KEYWORD_4 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2729:1: ( KEYWORD_4 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2729:1: ( KEYWORD_4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2730:1: KEYWORD_4
            {
             before(grammarAccess.getElementBindingAccess().getInKeyword_1()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__ElementBinding__Group__1__Impl5789); 
             after(grammarAccess.getElementBindingAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__1__Impl"


    // $ANTLR start "rule__ElementBinding__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2743:1: rule__ElementBinding__Group__2 : rule__ElementBinding__Group__2__Impl ;
    public final void rule__ElementBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2747:1: ( rule__ElementBinding__Group__2__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2748:2: rule__ElementBinding__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ElementBinding__Group__2__Impl_in_rule__ElementBinding__Group__25820);
            rule__ElementBinding__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__2"


    // $ANTLR start "rule__ElementBinding__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2754:1: rule__ElementBinding__Group__2__Impl : ( ( rule__ElementBinding__SetAssignment_2 ) ) ;
    public final void rule__ElementBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2758:1: ( ( ( rule__ElementBinding__SetAssignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2759:1: ( ( rule__ElementBinding__SetAssignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2759:1: ( ( rule__ElementBinding__SetAssignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2760:1: ( rule__ElementBinding__SetAssignment_2 )
            {
             before(grammarAccess.getElementBindingAccess().getSetAssignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2761:1: ( rule__ElementBinding__SetAssignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2761:2: rule__ElementBinding__SetAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementBinding__SetAssignment_2_in_rule__ElementBinding__Group__2__Impl5847);
            rule__ElementBinding__SetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementBindingAccess().getSetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__Group__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2777:1: rule__SelectionExpression__Group__0 : rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 ;
    public final void rule__SelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2781:1: ( rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2782:2: rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SelectionExpression__Group__0__Impl_in_rule__SelectionExpression__Group__05883);
            rule__SelectionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionExpression__Group__1_in_rule__SelectionExpression__Group__05886);
            rule__SelectionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0"


    // $ANTLR start "rule__SelectionExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2789:1: rule__SelectionExpression__Group__0__Impl : ( ( rule__SelectionExpression__E1Assignment_0 ) ) ;
    public final void rule__SelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2793:1: ( ( ( rule__SelectionExpression__E1Assignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2794:1: ( ( rule__SelectionExpression__E1Assignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2794:1: ( ( rule__SelectionExpression__E1Assignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2795:1: ( rule__SelectionExpression__E1Assignment_0 )
            {
             before(grammarAccess.getSelectionExpressionAccess().getE1Assignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2796:1: ( rule__SelectionExpression__E1Assignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2796:2: rule__SelectionExpression__E1Assignment_0
            {
            pushFollow(FOLLOW_rule__SelectionExpression__E1Assignment_0_in_rule__SelectionExpression__Group__0__Impl5913);
            rule__SelectionExpression__E1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionExpressionAccess().getE1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2806:1: rule__SelectionExpression__Group__1 : rule__SelectionExpression__Group__1__Impl ;
    public final void rule__SelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2810:1: ( rule__SelectionExpression__Group__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2811:2: rule__SelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectionExpression__Group__1__Impl_in_rule__SelectionExpression__Group__15943);
            rule__SelectionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1"


    // $ANTLR start "rule__SelectionExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2817:1: rule__SelectionExpression__Group__1__Impl : ( ( rule__SelectionExpression__Group_1__0 )* ) ;
    public final void rule__SelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2821:1: ( ( ( rule__SelectionExpression__Group_1__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2822:1: ( ( rule__SelectionExpression__Group_1__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2822:1: ( ( rule__SelectionExpression__Group_1__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2823:1: ( rule__SelectionExpression__Group_1__0 )*
            {
             before(grammarAccess.getSelectionExpressionAccess().getGroup_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2824:1: ( rule__SelectionExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_11||LA22_0==KEYWORD_14||LA22_0==KEYWORD_5) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2824:2: rule__SelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SelectionExpression__Group_1__0_in_rule__SelectionExpression__Group__1__Impl5970);
            	    rule__SelectionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSelectionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2838:1: rule__SelectionExpression__Group_1__0 : rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1 ;
    public final void rule__SelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2842:1: ( rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2843:2: rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectionExpression__Group_1__0__Impl_in_rule__SelectionExpression__Group_1__06005);
            rule__SelectionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionExpression__Group_1__1_in_rule__SelectionExpression__Group_1__06008);
            rule__SelectionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2850:1: rule__SelectionExpression__Group_1__0__Impl : ( ( rule__SelectionExpression__OpAssignment_1_0 ) ) ;
    public final void rule__SelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2854:1: ( ( ( rule__SelectionExpression__OpAssignment_1_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2855:1: ( ( rule__SelectionExpression__OpAssignment_1_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2855:1: ( ( rule__SelectionExpression__OpAssignment_1_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2856:1: ( rule__SelectionExpression__OpAssignment_1_0 )
            {
             before(grammarAccess.getSelectionExpressionAccess().getOpAssignment_1_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2857:1: ( rule__SelectionExpression__OpAssignment_1_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2857:2: rule__SelectionExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SelectionExpression__OpAssignment_1_0_in_rule__SelectionExpression__Group_1__0__Impl6035);
            rule__SelectionExpression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2867:1: rule__SelectionExpression__Group_1__1 : rule__SelectionExpression__Group_1__1__Impl ;
    public final void rule__SelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2871:1: ( rule__SelectionExpression__Group_1__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2872:2: rule__SelectionExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectionExpression__Group_1__1__Impl_in_rule__SelectionExpression__Group_1__16065);
            rule__SelectionExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2878:1: rule__SelectionExpression__Group_1__1__Impl : ( ( rule__SelectionExpression__E2Assignment_1_1 ) ) ;
    public final void rule__SelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2882:1: ( ( ( rule__SelectionExpression__E2Assignment_1_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2883:1: ( ( rule__SelectionExpression__E2Assignment_1_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2883:1: ( ( rule__SelectionExpression__E2Assignment_1_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2884:1: ( rule__SelectionExpression__E2Assignment_1_1 )
            {
             before(grammarAccess.getSelectionExpressionAccess().getE2Assignment_1_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2885:1: ( rule__SelectionExpression__E2Assignment_1_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2885:2: rule__SelectionExpression__E2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectionExpression__E2Assignment_1_1_in_rule__SelectionExpression__Group_1__1__Impl6092);
            rule__SelectionExpression__E2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionExpressionAccess().getE2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComputeExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2899:1: rule__ComputeExpression__Group__0 : rule__ComputeExpression__Group__0__Impl rule__ComputeExpression__Group__1 ;
    public final void rule__ComputeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2903:1: ( rule__ComputeExpression__Group__0__Impl rule__ComputeExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2904:2: rule__ComputeExpression__Group__0__Impl rule__ComputeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group__0__Impl_in_rule__ComputeExpression__Group__06126);
            rule__ComputeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group__1_in_rule__ComputeExpression__Group__06129);
            rule__ComputeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__0"


    // $ANTLR start "rule__ComputeExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2911:1: rule__ComputeExpression__Group__0__Impl : ( KEYWORD_35 ) ;
    public final void rule__ComputeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2915:1: ( ( KEYWORD_35 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2916:1: ( KEYWORD_35 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2916:1: ( KEYWORD_35 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2917:1: KEYWORD_35
            {
             before(grammarAccess.getComputeExpressionAccess().getComputeKeyword_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__ComputeExpression__Group__0__Impl6157); 
             after(grammarAccess.getComputeExpressionAccess().getComputeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__0__Impl"


    // $ANTLR start "rule__ComputeExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2930:1: rule__ComputeExpression__Group__1 : rule__ComputeExpression__Group__1__Impl rule__ComputeExpression__Group__2 ;
    public final void rule__ComputeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2934:1: ( rule__ComputeExpression__Group__1__Impl rule__ComputeExpression__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2935:2: rule__ComputeExpression__Group__1__Impl rule__ComputeExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group__1__Impl_in_rule__ComputeExpression__Group__16188);
            rule__ComputeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group__2_in_rule__ComputeExpression__Group__16191);
            rule__ComputeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__1"


    // $ANTLR start "rule__ComputeExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2942:1: rule__ComputeExpression__Group__1__Impl : ( ( rule__ComputeExpression__IdentifierAssignment_1 ) ) ;
    public final void rule__ComputeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2946:1: ( ( ( rule__ComputeExpression__IdentifierAssignment_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2947:1: ( ( rule__ComputeExpression__IdentifierAssignment_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2947:1: ( ( rule__ComputeExpression__IdentifierAssignment_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2948:1: ( rule__ComputeExpression__IdentifierAssignment_1 )
            {
             before(grammarAccess.getComputeExpressionAccess().getIdentifierAssignment_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2949:1: ( rule__ComputeExpression__IdentifierAssignment_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2949:2: rule__ComputeExpression__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__IdentifierAssignment_1_in_rule__ComputeExpression__Group__1__Impl6218);
            rule__ComputeExpression__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeExpressionAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__1__Impl"


    // $ANTLR start "rule__ComputeExpression__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2959:1: rule__ComputeExpression__Group__2 : rule__ComputeExpression__Group__2__Impl ;
    public final void rule__ComputeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2963:1: ( rule__ComputeExpression__Group__2__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2964:2: rule__ComputeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group__2__Impl_in_rule__ComputeExpression__Group__26248);
            rule__ComputeExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__2"


    // $ANTLR start "rule__ComputeExpression__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2970:1: rule__ComputeExpression__Group__2__Impl : ( ( rule__ComputeExpression__Group_2__0 )? ) ;
    public final void rule__ComputeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2974:1: ( ( ( rule__ComputeExpression__Group_2__0 )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2975:1: ( ( rule__ComputeExpression__Group_2__0 )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2975:1: ( ( rule__ComputeExpression__Group_2__0 )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2976:1: ( rule__ComputeExpression__Group_2__0 )?
            {
             before(grammarAccess.getComputeExpressionAccess().getGroup_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2977:1: ( rule__ComputeExpression__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_PUNC_OPEN_PARENTHESIS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2977:2: rule__ComputeExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ComputeExpression__Group_2__0_in_rule__ComputeExpression__Group__2__Impl6275);
                    rule__ComputeExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputeExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group__2__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2993:1: rule__ComputeExpression__Group_2__0 : rule__ComputeExpression__Group_2__0__Impl rule__ComputeExpression__Group_2__1 ;
    public final void rule__ComputeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2997:1: ( rule__ComputeExpression__Group_2__0__Impl rule__ComputeExpression__Group_2__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:2998:2: rule__ComputeExpression__Group_2__0__Impl rule__ComputeExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__0__Impl_in_rule__ComputeExpression__Group_2__06312);
            rule__ComputeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__1_in_rule__ComputeExpression__Group_2__06315);
            rule__ComputeExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__0"


    // $ANTLR start "rule__ComputeExpression__Group_2__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3005:1: rule__ComputeExpression__Group_2__0__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__ComputeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3009:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3010:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3010:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3011:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getComputeExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_2_0()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__ComputeExpression__Group_2__0__Impl6342); 
             after(grammarAccess.getComputeExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3022:1: rule__ComputeExpression__Group_2__1 : rule__ComputeExpression__Group_2__1__Impl rule__ComputeExpression__Group_2__2 ;
    public final void rule__ComputeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3026:1: ( rule__ComputeExpression__Group_2__1__Impl rule__ComputeExpression__Group_2__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3027:2: rule__ComputeExpression__Group_2__1__Impl rule__ComputeExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__1__Impl_in_rule__ComputeExpression__Group_2__16371);
            rule__ComputeExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__2_in_rule__ComputeExpression__Group_2__16374);
            rule__ComputeExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__1"


    // $ANTLR start "rule__ComputeExpression__Group_2__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3034:1: rule__ComputeExpression__Group_2__1__Impl : ( ( rule__ComputeExpression__NameAssignment_2_1 ) ) ;
    public final void rule__ComputeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3038:1: ( ( ( rule__ComputeExpression__NameAssignment_2_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3039:1: ( ( rule__ComputeExpression__NameAssignment_2_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3039:1: ( ( rule__ComputeExpression__NameAssignment_2_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3040:1: ( rule__ComputeExpression__NameAssignment_2_1 )
            {
             before(grammarAccess.getComputeExpressionAccess().getNameAssignment_2_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3041:1: ( rule__ComputeExpression__NameAssignment_2_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3041:2: rule__ComputeExpression__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__NameAssignment_2_1_in_rule__ComputeExpression__Group_2__1__Impl6401);
            rule__ComputeExpression__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeExpressionAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3051:1: rule__ComputeExpression__Group_2__2 : rule__ComputeExpression__Group_2__2__Impl rule__ComputeExpression__Group_2__3 ;
    public final void rule__ComputeExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3055:1: ( rule__ComputeExpression__Group_2__2__Impl rule__ComputeExpression__Group_2__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3056:2: rule__ComputeExpression__Group_2__2__Impl rule__ComputeExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__2__Impl_in_rule__ComputeExpression__Group_2__26431);
            rule__ComputeExpression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__3_in_rule__ComputeExpression__Group_2__26434);
            rule__ComputeExpression__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__2"


    // $ANTLR start "rule__ComputeExpression__Group_2__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3063:1: rule__ComputeExpression__Group_2__2__Impl : ( ( rule__ComputeExpression__Group_2_2__0 )* ) ;
    public final void rule__ComputeExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3067:1: ( ( ( rule__ComputeExpression__Group_2_2__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3068:1: ( ( rule__ComputeExpression__Group_2_2__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3068:1: ( ( rule__ComputeExpression__Group_2_2__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3069:1: ( rule__ComputeExpression__Group_2_2__0 )*
            {
             before(grammarAccess.getComputeExpressionAccess().getGroup_2_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3070:1: ( rule__ComputeExpression__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_PUNC_COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3070:2: rule__ComputeExpression__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComputeExpression__Group_2_2__0_in_rule__ComputeExpression__Group_2__2__Impl6461);
            	    rule__ComputeExpression__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getComputeExpressionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__2__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3080:1: rule__ComputeExpression__Group_2__3 : rule__ComputeExpression__Group_2__3__Impl ;
    public final void rule__ComputeExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3084:1: ( rule__ComputeExpression__Group_2__3__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3085:2: rule__ComputeExpression__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2__3__Impl_in_rule__ComputeExpression__Group_2__36492);
            rule__ComputeExpression__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__3"


    // $ANTLR start "rule__ComputeExpression__Group_2__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3091:1: rule__ComputeExpression__Group_2__3__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__ComputeExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3095:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3096:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3096:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3097:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getComputeExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_2_3()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__ComputeExpression__Group_2__3__Impl6519); 
             after(grammarAccess.getComputeExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2__3__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2_2__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3116:1: rule__ComputeExpression__Group_2_2__0 : rule__ComputeExpression__Group_2_2__0__Impl rule__ComputeExpression__Group_2_2__1 ;
    public final void rule__ComputeExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3120:1: ( rule__ComputeExpression__Group_2_2__0__Impl rule__ComputeExpression__Group_2_2__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3121:2: rule__ComputeExpression__Group_2_2__0__Impl rule__ComputeExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2_2__0__Impl_in_rule__ComputeExpression__Group_2_2__06556);
            rule__ComputeExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComputeExpression__Group_2_2__1_in_rule__ComputeExpression__Group_2_2__06559);
            rule__ComputeExpression__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2_2__0"


    // $ANTLR start "rule__ComputeExpression__Group_2_2__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3128:1: rule__ComputeExpression__Group_2_2__0__Impl : ( RULE_PUNC_COMMA ) ;
    public final void rule__ComputeExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3132:1: ( ( RULE_PUNC_COMMA ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3133:1: ( RULE_PUNC_COMMA )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3133:1: ( RULE_PUNC_COMMA )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3134:1: RULE_PUNC_COMMA
            {
             before(grammarAccess.getComputeExpressionAccess().getPUNC_COMMATerminalRuleCall_2_2_0()); 
            match(input,RULE_PUNC_COMMA,FOLLOW_RULE_PUNC_COMMA_in_rule__ComputeExpression__Group_2_2__0__Impl6586); 
             after(grammarAccess.getComputeExpressionAccess().getPUNC_COMMATerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__ComputeExpression__Group_2_2__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3145:1: rule__ComputeExpression__Group_2_2__1 : rule__ComputeExpression__Group_2_2__1__Impl ;
    public final void rule__ComputeExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3149:1: ( rule__ComputeExpression__Group_2_2__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3150:2: rule__ComputeExpression__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComputeExpression__Group_2_2__1__Impl_in_rule__ComputeExpression__Group_2_2__16615);
            rule__ComputeExpression__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2_2__1"


    // $ANTLR start "rule__ComputeExpression__Group_2_2__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3156:1: rule__ComputeExpression__Group_2_2__1__Impl : ( ( rule__ComputeExpression__NameAssignment_2_2_1 ) ) ;
    public final void rule__ComputeExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3160:1: ( ( ( rule__ComputeExpression__NameAssignment_2_2_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3161:1: ( ( rule__ComputeExpression__NameAssignment_2_2_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3161:1: ( ( rule__ComputeExpression__NameAssignment_2_2_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3162:1: ( rule__ComputeExpression__NameAssignment_2_2_1 )
            {
             before(grammarAccess.getComputeExpressionAccess().getNameAssignment_2_2_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3163:1: ( rule__ComputeExpression__NameAssignment_2_2_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3163:2: rule__ComputeExpression__NameAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ComputeExpression__NameAssignment_2_2_1_in_rule__ComputeExpression__Group_2_2__1__Impl6642);
            rule__ComputeExpression__NameAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeExpressionAccess().getNameAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__SelectionRelation__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3177:1: rule__SelectionRelation__Group__0 : rule__SelectionRelation__Group__0__Impl rule__SelectionRelation__Group__1 ;
    public final void rule__SelectionRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3181:1: ( rule__SelectionRelation__Group__0__Impl rule__SelectionRelation__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3182:2: rule__SelectionRelation__Group__0__Impl rule__SelectionRelation__Group__1
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group__0__Impl_in_rule__SelectionRelation__Group__06676);
            rule__SelectionRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionRelation__Group__1_in_rule__SelectionRelation__Group__06679);
            rule__SelectionRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__0"


    // $ANTLR start "rule__SelectionRelation__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3189:1: rule__SelectionRelation__Group__0__Impl : ( ( rule__SelectionRelation__IdentifierAssignment_0 ) ) ;
    public final void rule__SelectionRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3193:1: ( ( ( rule__SelectionRelation__IdentifierAssignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3194:1: ( ( rule__SelectionRelation__IdentifierAssignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3194:1: ( ( rule__SelectionRelation__IdentifierAssignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3195:1: ( rule__SelectionRelation__IdentifierAssignment_0 )
            {
             before(grammarAccess.getSelectionRelationAccess().getIdentifierAssignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3196:1: ( rule__SelectionRelation__IdentifierAssignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3196:2: rule__SelectionRelation__IdentifierAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectionRelation__IdentifierAssignment_0_in_rule__SelectionRelation__Group__0__Impl6706);
            rule__SelectionRelation__IdentifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationAccess().getIdentifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__0__Impl"


    // $ANTLR start "rule__SelectionRelation__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3206:1: rule__SelectionRelation__Group__1 : rule__SelectionRelation__Group__1__Impl rule__SelectionRelation__Group__2 ;
    public final void rule__SelectionRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3210:1: ( rule__SelectionRelation__Group__1__Impl rule__SelectionRelation__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3211:2: rule__SelectionRelation__Group__1__Impl rule__SelectionRelation__Group__2
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group__1__Impl_in_rule__SelectionRelation__Group__16736);
            rule__SelectionRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionRelation__Group__2_in_rule__SelectionRelation__Group__16739);
            rule__SelectionRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__1"


    // $ANTLR start "rule__SelectionRelation__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3218:1: rule__SelectionRelation__Group__1__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__SelectionRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3222:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3223:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3223:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3224:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getSelectionRelationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__SelectionRelation__Group__1__Impl6766); 
             after(grammarAccess.getSelectionRelationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__1__Impl"


    // $ANTLR start "rule__SelectionRelation__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3235:1: rule__SelectionRelation__Group__2 : rule__SelectionRelation__Group__2__Impl rule__SelectionRelation__Group__3 ;
    public final void rule__SelectionRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3239:1: ( rule__SelectionRelation__Group__2__Impl rule__SelectionRelation__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3240:2: rule__SelectionRelation__Group__2__Impl rule__SelectionRelation__Group__3
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group__2__Impl_in_rule__SelectionRelation__Group__26795);
            rule__SelectionRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionRelation__Group__3_in_rule__SelectionRelation__Group__26798);
            rule__SelectionRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__2"


    // $ANTLR start "rule__SelectionRelation__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3247:1: rule__SelectionRelation__Group__2__Impl : ( ( rule__SelectionRelation__Group_2__0 )? ) ;
    public final void rule__SelectionRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3251:1: ( ( ( rule__SelectionRelation__Group_2__0 )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3252:1: ( ( rule__SelectionRelation__Group_2__0 )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3252:1: ( ( rule__SelectionRelation__Group_2__0 )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3253:1: ( rule__SelectionRelation__Group_2__0 )?
            {
             before(grammarAccess.getSelectionRelationAccess().getGroup_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3254:1: ( rule__SelectionRelation__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_30||LA25_0==KEYWORD_24||(LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==RULE_NUMERIC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3254:2: rule__SelectionRelation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SelectionRelation__Group_2__0_in_rule__SelectionRelation__Group__2__Impl6825);
                    rule__SelectionRelation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionRelationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__2__Impl"


    // $ANTLR start "rule__SelectionRelation__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3264:1: rule__SelectionRelation__Group__3 : rule__SelectionRelation__Group__3__Impl ;
    public final void rule__SelectionRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3268:1: ( rule__SelectionRelation__Group__3__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3269:2: rule__SelectionRelation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group__3__Impl_in_rule__SelectionRelation__Group__36856);
            rule__SelectionRelation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__3"


    // $ANTLR start "rule__SelectionRelation__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3275:1: rule__SelectionRelation__Group__3__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__SelectionRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3279:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3280:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3280:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3281:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getSelectionRelationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__SelectionRelation__Group__3__Impl6883); 
             after(grammarAccess.getSelectionRelationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group__3__Impl"


    // $ANTLR start "rule__SelectionRelation__Group_2__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3300:1: rule__SelectionRelation__Group_2__0 : rule__SelectionRelation__Group_2__0__Impl rule__SelectionRelation__Group_2__1 ;
    public final void rule__SelectionRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3304:1: ( rule__SelectionRelation__Group_2__0__Impl rule__SelectionRelation__Group_2__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3305:2: rule__SelectionRelation__Group_2__0__Impl rule__SelectionRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group_2__0__Impl_in_rule__SelectionRelation__Group_2__06920);
            rule__SelectionRelation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionRelation__Group_2__1_in_rule__SelectionRelation__Group_2__06923);
            rule__SelectionRelation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2__0"


    // $ANTLR start "rule__SelectionRelation__Group_2__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3312:1: rule__SelectionRelation__Group_2__0__Impl : ( ( rule__SelectionRelation__ArgumentsAssignment_2_0 ) ) ;
    public final void rule__SelectionRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3316:1: ( ( ( rule__SelectionRelation__ArgumentsAssignment_2_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3317:1: ( ( rule__SelectionRelation__ArgumentsAssignment_2_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3317:1: ( ( rule__SelectionRelation__ArgumentsAssignment_2_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3318:1: ( rule__SelectionRelation__ArgumentsAssignment_2_0 )
            {
             before(grammarAccess.getSelectionRelationAccess().getArgumentsAssignment_2_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3319:1: ( rule__SelectionRelation__ArgumentsAssignment_2_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3319:2: rule__SelectionRelation__ArgumentsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SelectionRelation__ArgumentsAssignment_2_0_in_rule__SelectionRelation__Group_2__0__Impl6950);
            rule__SelectionRelation__ArgumentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationAccess().getArgumentsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2__0__Impl"


    // $ANTLR start "rule__SelectionRelation__Group_2__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3329:1: rule__SelectionRelation__Group_2__1 : rule__SelectionRelation__Group_2__1__Impl ;
    public final void rule__SelectionRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3333:1: ( rule__SelectionRelation__Group_2__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3334:2: rule__SelectionRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group_2__1__Impl_in_rule__SelectionRelation__Group_2__16980);
            rule__SelectionRelation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2__1"


    // $ANTLR start "rule__SelectionRelation__Group_2__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3340:1: rule__SelectionRelation__Group_2__1__Impl : ( ( rule__SelectionRelation__Group_2_1__0 )* ) ;
    public final void rule__SelectionRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3344:1: ( ( ( rule__SelectionRelation__Group_2_1__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3345:1: ( ( rule__SelectionRelation__Group_2_1__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3345:1: ( ( rule__SelectionRelation__Group_2_1__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3346:1: ( rule__SelectionRelation__Group_2_1__0 )*
            {
             before(grammarAccess.getSelectionRelationAccess().getGroup_2_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3347:1: ( rule__SelectionRelation__Group_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_PUNC_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3347:2: rule__SelectionRelation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SelectionRelation__Group_2_1__0_in_rule__SelectionRelation__Group_2__1__Impl7007);
            	    rule__SelectionRelation__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSelectionRelationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2__1__Impl"


    // $ANTLR start "rule__SelectionRelation__Group_2_1__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3361:1: rule__SelectionRelation__Group_2_1__0 : rule__SelectionRelation__Group_2_1__0__Impl rule__SelectionRelation__Group_2_1__1 ;
    public final void rule__SelectionRelation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3365:1: ( rule__SelectionRelation__Group_2_1__0__Impl rule__SelectionRelation__Group_2_1__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3366:2: rule__SelectionRelation__Group_2_1__0__Impl rule__SelectionRelation__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group_2_1__0__Impl_in_rule__SelectionRelation__Group_2_1__07042);
            rule__SelectionRelation__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectionRelation__Group_2_1__1_in_rule__SelectionRelation__Group_2_1__07045);
            rule__SelectionRelation__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2_1__0"


    // $ANTLR start "rule__SelectionRelation__Group_2_1__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3373:1: rule__SelectionRelation__Group_2_1__0__Impl : ( RULE_PUNC_COMMA ) ;
    public final void rule__SelectionRelation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3377:1: ( ( RULE_PUNC_COMMA ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3378:1: ( RULE_PUNC_COMMA )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3378:1: ( RULE_PUNC_COMMA )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3379:1: RULE_PUNC_COMMA
            {
             before(grammarAccess.getSelectionRelationAccess().getPUNC_COMMATerminalRuleCall_2_1_0()); 
            match(input,RULE_PUNC_COMMA,FOLLOW_RULE_PUNC_COMMA_in_rule__SelectionRelation__Group_2_1__0__Impl7072); 
             after(grammarAccess.getSelectionRelationAccess().getPUNC_COMMATerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2_1__0__Impl"


    // $ANTLR start "rule__SelectionRelation__Group_2_1__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3390:1: rule__SelectionRelation__Group_2_1__1 : rule__SelectionRelation__Group_2_1__1__Impl ;
    public final void rule__SelectionRelation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3394:1: ( rule__SelectionRelation__Group_2_1__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3395:2: rule__SelectionRelation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectionRelation__Group_2_1__1__Impl_in_rule__SelectionRelation__Group_2_1__17101);
            rule__SelectionRelation__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2_1__1"


    // $ANTLR start "rule__SelectionRelation__Group_2_1__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3401:1: rule__SelectionRelation__Group_2_1__1__Impl : ( ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 ) ) ;
    public final void rule__SelectionRelation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3405:1: ( ( ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3406:1: ( ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3406:1: ( ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3407:1: ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 )
            {
             before(grammarAccess.getSelectionRelationAccess().getArgumentsAssignment_2_1_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3408:1: ( rule__SelectionRelation__ArgumentsAssignment_2_1_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3408:2: rule__SelectionRelation__ArgumentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SelectionRelation__ArgumentsAssignment_2_1_1_in_rule__SelectionRelation__Group_2_1__1__Impl7128);
            rule__SelectionRelation__ArgumentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionRelationAccess().getArgumentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__Group_2_1__1__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3422:1: rule__RequiredDefinition__Group__0 : rule__RequiredDefinition__Group__0__Impl rule__RequiredDefinition__Group__1 ;
    public final void rule__RequiredDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3426:1: ( rule__RequiredDefinition__Group__0__Impl rule__RequiredDefinition__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3427:2: rule__RequiredDefinition__Group__0__Impl rule__RequiredDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__0__Impl_in_rule__RequiredDefinition__Group__07162);
            rule__RequiredDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group__1_in_rule__RequiredDefinition__Group__07165);
            rule__RequiredDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__0"


    // $ANTLR start "rule__RequiredDefinition__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3434:1: rule__RequiredDefinition__Group__0__Impl : ( KEYWORD_40 ) ;
    public final void rule__RequiredDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3438:1: ( ( KEYWORD_40 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3439:1: ( KEYWORD_40 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3439:1: ( KEYWORD_40 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3440:1: KEYWORD_40
            {
             before(grammarAccess.getRequiredDefinitionAccess().getRequiresKeyword_0()); 
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__RequiredDefinition__Group__0__Impl7193); 
             after(grammarAccess.getRequiredDefinitionAccess().getRequiresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__0__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3453:1: rule__RequiredDefinition__Group__1 : rule__RequiredDefinition__Group__1__Impl rule__RequiredDefinition__Group__2 ;
    public final void rule__RequiredDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3457:1: ( rule__RequiredDefinition__Group__1__Impl rule__RequiredDefinition__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3458:2: rule__RequiredDefinition__Group__1__Impl rule__RequiredDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__1__Impl_in_rule__RequiredDefinition__Group__17224);
            rule__RequiredDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group__2_in_rule__RequiredDefinition__Group__17227);
            rule__RequiredDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__1"


    // $ANTLR start "rule__RequiredDefinition__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3465:1: rule__RequiredDefinition__Group__1__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__RequiredDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3469:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3470:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3470:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3471:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getRequiredDefinitionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__RequiredDefinition__Group__1__Impl7254); 
             after(grammarAccess.getRequiredDefinitionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__1__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3482:1: rule__RequiredDefinition__Group__2 : rule__RequiredDefinition__Group__2__Impl rule__RequiredDefinition__Group__3 ;
    public final void rule__RequiredDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3486:1: ( rule__RequiredDefinition__Group__2__Impl rule__RequiredDefinition__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3487:2: rule__RequiredDefinition__Group__2__Impl rule__RequiredDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__2__Impl_in_rule__RequiredDefinition__Group__27283);
            rule__RequiredDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group__3_in_rule__RequiredDefinition__Group__27286);
            rule__RequiredDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__2"


    // $ANTLR start "rule__RequiredDefinition__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3494:1: rule__RequiredDefinition__Group__2__Impl : ( ( rule__RequiredDefinition__TheoremsAssignment_2 ) ) ;
    public final void rule__RequiredDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3498:1: ( ( ( rule__RequiredDefinition__TheoremsAssignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3499:1: ( ( rule__RequiredDefinition__TheoremsAssignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3499:1: ( ( rule__RequiredDefinition__TheoremsAssignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3500:1: ( rule__RequiredDefinition__TheoremsAssignment_2 )
            {
             before(grammarAccess.getRequiredDefinitionAccess().getTheoremsAssignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3501:1: ( rule__RequiredDefinition__TheoremsAssignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3501:2: rule__RequiredDefinition__TheoremsAssignment_2
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__TheoremsAssignment_2_in_rule__RequiredDefinition__Group__2__Impl7313);
            rule__RequiredDefinition__TheoremsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDefinitionAccess().getTheoremsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__2__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3511:1: rule__RequiredDefinition__Group__3 : rule__RequiredDefinition__Group__3__Impl rule__RequiredDefinition__Group__4 ;
    public final void rule__RequiredDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3515:1: ( rule__RequiredDefinition__Group__3__Impl rule__RequiredDefinition__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3516:2: rule__RequiredDefinition__Group__3__Impl rule__RequiredDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__3__Impl_in_rule__RequiredDefinition__Group__37343);
            rule__RequiredDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group__4_in_rule__RequiredDefinition__Group__37346);
            rule__RequiredDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__3"


    // $ANTLR start "rule__RequiredDefinition__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3523:1: rule__RequiredDefinition__Group__3__Impl : ( ( rule__RequiredDefinition__Group_3__0 )* ) ;
    public final void rule__RequiredDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3527:1: ( ( ( rule__RequiredDefinition__Group_3__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3528:1: ( ( rule__RequiredDefinition__Group_3__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3528:1: ( ( rule__RequiredDefinition__Group_3__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3529:1: ( rule__RequiredDefinition__Group_3__0 )*
            {
             before(grammarAccess.getRequiredDefinitionAccess().getGroup_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3530:1: ( rule__RequiredDefinition__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_11) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3530:2: rule__RequiredDefinition__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RequiredDefinition__Group_3__0_in_rule__RequiredDefinition__Group__3__Impl7373);
            	    rule__RequiredDefinition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRequiredDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__3__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3540:1: rule__RequiredDefinition__Group__4 : rule__RequiredDefinition__Group__4__Impl rule__RequiredDefinition__Group__5 ;
    public final void rule__RequiredDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3544:1: ( rule__RequiredDefinition__Group__4__Impl rule__RequiredDefinition__Group__5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3545:2: rule__RequiredDefinition__Group__4__Impl rule__RequiredDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__4__Impl_in_rule__RequiredDefinition__Group__47404);
            rule__RequiredDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group__5_in_rule__RequiredDefinition__Group__47407);
            rule__RequiredDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__4"


    // $ANTLR start "rule__RequiredDefinition__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3552:1: rule__RequiredDefinition__Group__4__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__RequiredDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3556:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3557:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3557:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3558:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getRequiredDefinitionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__RequiredDefinition__Group__4__Impl7434); 
             after(grammarAccess.getRequiredDefinitionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__4__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group__5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3569:1: rule__RequiredDefinition__Group__5 : rule__RequiredDefinition__Group__5__Impl ;
    public final void rule__RequiredDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3573:1: ( rule__RequiredDefinition__Group__5__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3574:2: rule__RequiredDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group__5__Impl_in_rule__RequiredDefinition__Group__57463);
            rule__RequiredDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__5"


    // $ANTLR start "rule__RequiredDefinition__Group__5__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3580:1: rule__RequiredDefinition__Group__5__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__RequiredDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3584:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3585:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3585:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3586:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getRequiredDefinitionAccess().getPUNC_SEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__RequiredDefinition__Group__5__Impl7490); 
             after(grammarAccess.getRequiredDefinitionAccess().getPUNC_SEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group__5__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group_3__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3609:1: rule__RequiredDefinition__Group_3__0 : rule__RequiredDefinition__Group_3__0__Impl rule__RequiredDefinition__Group_3__1 ;
    public final void rule__RequiredDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3613:1: ( rule__RequiredDefinition__Group_3__0__Impl rule__RequiredDefinition__Group_3__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3614:2: rule__RequiredDefinition__Group_3__0__Impl rule__RequiredDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group_3__0__Impl_in_rule__RequiredDefinition__Group_3__07531);
            rule__RequiredDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredDefinition__Group_3__1_in_rule__RequiredDefinition__Group_3__07534);
            rule__RequiredDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group_3__0"


    // $ANTLR start "rule__RequiredDefinition__Group_3__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3621:1: rule__RequiredDefinition__Group_3__0__Impl : ( KEYWORD_11 ) ;
    public final void rule__RequiredDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3625:1: ( ( KEYWORD_11 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3626:1: ( KEYWORD_11 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3626:1: ( KEYWORD_11 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3627:1: KEYWORD_11
            {
             before(grammarAccess.getRequiredDefinitionAccess().getAndKeyword_3_0()); 
            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__RequiredDefinition__Group_3__0__Impl7562); 
             after(grammarAccess.getRequiredDefinitionAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__RequiredDefinition__Group_3__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3640:1: rule__RequiredDefinition__Group_3__1 : rule__RequiredDefinition__Group_3__1__Impl ;
    public final void rule__RequiredDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3644:1: ( rule__RequiredDefinition__Group_3__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3645:2: rule__RequiredDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__Group_3__1__Impl_in_rule__RequiredDefinition__Group_3__17593);
            rule__RequiredDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group_3__1"


    // $ANTLR start "rule__RequiredDefinition__Group_3__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3651:1: rule__RequiredDefinition__Group_3__1__Impl : ( ( rule__RequiredDefinition__TheoremsAssignment_3_1 ) ) ;
    public final void rule__RequiredDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3655:1: ( ( ( rule__RequiredDefinition__TheoremsAssignment_3_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3656:1: ( ( rule__RequiredDefinition__TheoremsAssignment_3_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3656:1: ( ( rule__RequiredDefinition__TheoremsAssignment_3_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3657:1: ( rule__RequiredDefinition__TheoremsAssignment_3_1 )
            {
             before(grammarAccess.getRequiredDefinitionAccess().getTheoremsAssignment_3_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3658:1: ( rule__RequiredDefinition__TheoremsAssignment_3_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3658:2: rule__RequiredDefinition__TheoremsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RequiredDefinition__TheoremsAssignment_3_1_in_rule__RequiredDefinition__Group_3__1__Impl7620);
            rule__RequiredDefinition__TheoremsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDefinitionAccess().getTheoremsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__VerificationExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3672:1: rule__VerificationExpression__Group__0 : rule__VerificationExpression__Group__0__Impl rule__VerificationExpression__Group__1 ;
    public final void rule__VerificationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3676:1: ( rule__VerificationExpression__Group__0__Impl rule__VerificationExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3677:2: rule__VerificationExpression__Group__0__Impl rule__VerificationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__0__Impl_in_rule__VerificationExpression__Group__07654);
            rule__VerificationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationExpression__Group__1_in_rule__VerificationExpression__Group__07657);
            rule__VerificationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__0"


    // $ANTLR start "rule__VerificationExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3684:1: rule__VerificationExpression__Group__0__Impl : ( KEYWORD_29 ) ;
    public final void rule__VerificationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3688:1: ( ( KEYWORD_29 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3689:1: ( KEYWORD_29 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3689:1: ( KEYWORD_29 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3690:1: KEYWORD_29
            {
             before(grammarAccess.getVerificationExpressionAccess().getCheckKeyword_0()); 
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__VerificationExpression__Group__0__Impl7685); 
             after(grammarAccess.getVerificationExpressionAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__0__Impl"


    // $ANTLR start "rule__VerificationExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3703:1: rule__VerificationExpression__Group__1 : rule__VerificationExpression__Group__1__Impl rule__VerificationExpression__Group__2 ;
    public final void rule__VerificationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3707:1: ( rule__VerificationExpression__Group__1__Impl rule__VerificationExpression__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3708:2: rule__VerificationExpression__Group__1__Impl rule__VerificationExpression__Group__2
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__1__Impl_in_rule__VerificationExpression__Group__17716);
            rule__VerificationExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationExpression__Group__2_in_rule__VerificationExpression__Group__17719);
            rule__VerificationExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__1"


    // $ANTLR start "rule__VerificationExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3715:1: rule__VerificationExpression__Group__1__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__VerificationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3719:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3720:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3720:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3721:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getVerificationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__VerificationExpression__Group__1__Impl7746); 
             after(grammarAccess.getVerificationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__1__Impl"


    // $ANTLR start "rule__VerificationExpression__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3732:1: rule__VerificationExpression__Group__2 : rule__VerificationExpression__Group__2__Impl rule__VerificationExpression__Group__3 ;
    public final void rule__VerificationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3736:1: ( rule__VerificationExpression__Group__2__Impl rule__VerificationExpression__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3737:2: rule__VerificationExpression__Group__2__Impl rule__VerificationExpression__Group__3
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__2__Impl_in_rule__VerificationExpression__Group__27775);
            rule__VerificationExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationExpression__Group__3_in_rule__VerificationExpression__Group__27778);
            rule__VerificationExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__2"


    // $ANTLR start "rule__VerificationExpression__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3744:1: rule__VerificationExpression__Group__2__Impl : ( ( rule__VerificationExpression__E1Assignment_2 ) ) ;
    public final void rule__VerificationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3748:1: ( ( ( rule__VerificationExpression__E1Assignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3749:1: ( ( rule__VerificationExpression__E1Assignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3749:1: ( ( rule__VerificationExpression__E1Assignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3750:1: ( rule__VerificationExpression__E1Assignment_2 )
            {
             before(grammarAccess.getVerificationExpressionAccess().getE1Assignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3751:1: ( rule__VerificationExpression__E1Assignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3751:2: rule__VerificationExpression__E1Assignment_2
            {
            pushFollow(FOLLOW_rule__VerificationExpression__E1Assignment_2_in_rule__VerificationExpression__Group__2__Impl7805);
            rule__VerificationExpression__E1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerificationExpressionAccess().getE1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__2__Impl"


    // $ANTLR start "rule__VerificationExpression__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3761:1: rule__VerificationExpression__Group__3 : rule__VerificationExpression__Group__3__Impl rule__VerificationExpression__Group__4 ;
    public final void rule__VerificationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3765:1: ( rule__VerificationExpression__Group__3__Impl rule__VerificationExpression__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3766:2: rule__VerificationExpression__Group__3__Impl rule__VerificationExpression__Group__4
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__3__Impl_in_rule__VerificationExpression__Group__37835);
            rule__VerificationExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationExpression__Group__4_in_rule__VerificationExpression__Group__37838);
            rule__VerificationExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__3"


    // $ANTLR start "rule__VerificationExpression__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3773:1: rule__VerificationExpression__Group__3__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__VerificationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3777:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3778:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3778:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3779:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getVerificationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__VerificationExpression__Group__3__Impl7865); 
             after(grammarAccess.getVerificationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__3__Impl"


    // $ANTLR start "rule__VerificationExpression__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3790:1: rule__VerificationExpression__Group__4 : rule__VerificationExpression__Group__4__Impl ;
    public final void rule__VerificationExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3794:1: ( rule__VerificationExpression__Group__4__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3795:2: rule__VerificationExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VerificationExpression__Group__4__Impl_in_rule__VerificationExpression__Group__47894);
            rule__VerificationExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__4"


    // $ANTLR start "rule__VerificationExpression__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3801:1: rule__VerificationExpression__Group__4__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__VerificationExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3805:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3806:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3806:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3807:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getVerificationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_4()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__VerificationExpression__Group__4__Impl7921); 
             after(grammarAccess.getVerificationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__Group__4__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3828:1: rule__EvaluationExpression__Group__0 : rule__EvaluationExpression__Group__0__Impl rule__EvaluationExpression__Group__1 ;
    public final void rule__EvaluationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3832:1: ( rule__EvaluationExpression__Group__0__Impl rule__EvaluationExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3833:2: rule__EvaluationExpression__Group__0__Impl rule__EvaluationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__0__Impl_in_rule__EvaluationExpression__Group__07960);
            rule__EvaluationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__1_in_rule__EvaluationExpression__Group__07963);
            rule__EvaluationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__0"


    // $ANTLR start "rule__EvaluationExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3840:1: rule__EvaluationExpression__Group__0__Impl : ( KEYWORD_33 ) ;
    public final void rule__EvaluationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3844:1: ( ( KEYWORD_33 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3845:1: ( KEYWORD_33 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3845:1: ( KEYWORD_33 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3846:1: KEYWORD_33
            {
             before(grammarAccess.getEvaluationExpressionAccess().getReturnKeyword_0()); 
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__EvaluationExpression__Group__0__Impl7991); 
             after(grammarAccess.getEvaluationExpressionAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__0__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3859:1: rule__EvaluationExpression__Group__1 : rule__EvaluationExpression__Group__1__Impl rule__EvaluationExpression__Group__2 ;
    public final void rule__EvaluationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3863:1: ( rule__EvaluationExpression__Group__1__Impl rule__EvaluationExpression__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3864:2: rule__EvaluationExpression__Group__1__Impl rule__EvaluationExpression__Group__2
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__1__Impl_in_rule__EvaluationExpression__Group__18022);
            rule__EvaluationExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__2_in_rule__EvaluationExpression__Group__18025);
            rule__EvaluationExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__1"


    // $ANTLR start "rule__EvaluationExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3871:1: rule__EvaluationExpression__Group__1__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__EvaluationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3875:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3876:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3876:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3877:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__EvaluationExpression__Group__1__Impl8052); 
             after(grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__1__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3888:1: rule__EvaluationExpression__Group__2 : rule__EvaluationExpression__Group__2__Impl rule__EvaluationExpression__Group__3 ;
    public final void rule__EvaluationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3892:1: ( rule__EvaluationExpression__Group__2__Impl rule__EvaluationExpression__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3893:2: rule__EvaluationExpression__Group__2__Impl rule__EvaluationExpression__Group__3
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__2__Impl_in_rule__EvaluationExpression__Group__28081);
            rule__EvaluationExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__3_in_rule__EvaluationExpression__Group__28084);
            rule__EvaluationExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__2"


    // $ANTLR start "rule__EvaluationExpression__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3900:1: rule__EvaluationExpression__Group__2__Impl : ( ( rule__EvaluationExpression__FAssignment_2 ) ) ;
    public final void rule__EvaluationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3904:1: ( ( ( rule__EvaluationExpression__FAssignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3905:1: ( ( rule__EvaluationExpression__FAssignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3905:1: ( ( rule__EvaluationExpression__FAssignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3906:1: ( rule__EvaluationExpression__FAssignment_2 )
            {
             before(grammarAccess.getEvaluationExpressionAccess().getFAssignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3907:1: ( rule__EvaluationExpression__FAssignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3907:2: rule__EvaluationExpression__FAssignment_2
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__FAssignment_2_in_rule__EvaluationExpression__Group__2__Impl8111);
            rule__EvaluationExpression__FAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationExpressionAccess().getFAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__2__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3917:1: rule__EvaluationExpression__Group__3 : rule__EvaluationExpression__Group__3__Impl rule__EvaluationExpression__Group__4 ;
    public final void rule__EvaluationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3921:1: ( rule__EvaluationExpression__Group__3__Impl rule__EvaluationExpression__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3922:2: rule__EvaluationExpression__Group__3__Impl rule__EvaluationExpression__Group__4
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__3__Impl_in_rule__EvaluationExpression__Group__38141);
            rule__EvaluationExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__4_in_rule__EvaluationExpression__Group__38144);
            rule__EvaluationExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__3"


    // $ANTLR start "rule__EvaluationExpression__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3929:1: rule__EvaluationExpression__Group__3__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__EvaluationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3933:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3934:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3934:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3935:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_3()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__EvaluationExpression__Group__3__Impl8171); 
             after(grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__3__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3946:1: rule__EvaluationExpression__Group__4 : rule__EvaluationExpression__Group__4__Impl rule__EvaluationExpression__Group__5 ;
    public final void rule__EvaluationExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3950:1: ( rule__EvaluationExpression__Group__4__Impl rule__EvaluationExpression__Group__5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3951:2: rule__EvaluationExpression__Group__4__Impl rule__EvaluationExpression__Group__5
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__4__Impl_in_rule__EvaluationExpression__Group__48200);
            rule__EvaluationExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__5_in_rule__EvaluationExpression__Group__48203);
            rule__EvaluationExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__4"


    // $ANTLR start "rule__EvaluationExpression__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3958:1: rule__EvaluationExpression__Group__4__Impl : ( ( rule__EvaluationExpression__EAssignment_4 ) ) ;
    public final void rule__EvaluationExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3962:1: ( ( ( rule__EvaluationExpression__EAssignment_4 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3963:1: ( ( rule__EvaluationExpression__EAssignment_4 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3963:1: ( ( rule__EvaluationExpression__EAssignment_4 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3964:1: ( rule__EvaluationExpression__EAssignment_4 )
            {
             before(grammarAccess.getEvaluationExpressionAccess().getEAssignment_4()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3965:1: ( rule__EvaluationExpression__EAssignment_4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3965:2: rule__EvaluationExpression__EAssignment_4
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__EAssignment_4_in_rule__EvaluationExpression__Group__4__Impl8230);
            rule__EvaluationExpression__EAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationExpressionAccess().getEAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__4__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3975:1: rule__EvaluationExpression__Group__5 : rule__EvaluationExpression__Group__5__Impl rule__EvaluationExpression__Group__6 ;
    public final void rule__EvaluationExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3979:1: ( rule__EvaluationExpression__Group__5__Impl rule__EvaluationExpression__Group__6 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3980:2: rule__EvaluationExpression__Group__5__Impl rule__EvaluationExpression__Group__6
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__5__Impl_in_rule__EvaluationExpression__Group__58260);
            rule__EvaluationExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__6_in_rule__EvaluationExpression__Group__58263);
            rule__EvaluationExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__5"


    // $ANTLR start "rule__EvaluationExpression__Group__5__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3987:1: rule__EvaluationExpression__Group__5__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__EvaluationExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3991:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3992:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3992:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:3993:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_5()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__EvaluationExpression__Group__5__Impl8290); 
             after(grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__5__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__6"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4004:1: rule__EvaluationExpression__Group__6 : rule__EvaluationExpression__Group__6__Impl rule__EvaluationExpression__Group__7 ;
    public final void rule__EvaluationExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4008:1: ( rule__EvaluationExpression__Group__6__Impl rule__EvaluationExpression__Group__7 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4009:2: rule__EvaluationExpression__Group__6__Impl rule__EvaluationExpression__Group__7
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__6__Impl_in_rule__EvaluationExpression__Group__68319);
            rule__EvaluationExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvaluationExpression__Group__7_in_rule__EvaluationExpression__Group__68322);
            rule__EvaluationExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__6"


    // $ANTLR start "rule__EvaluationExpression__Group__6__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4016:1: rule__EvaluationExpression__Group__6__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__EvaluationExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4020:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4021:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4021:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4022:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_6()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__EvaluationExpression__Group__6__Impl8349); 
             after(grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__6__Impl"


    // $ANTLR start "rule__EvaluationExpression__Group__7"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4033:1: rule__EvaluationExpression__Group__7 : rule__EvaluationExpression__Group__7__Impl ;
    public final void rule__EvaluationExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4037:1: ( rule__EvaluationExpression__Group__7__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4038:2: rule__EvaluationExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EvaluationExpression__Group__7__Impl_in_rule__EvaluationExpression__Group__78378);
            rule__EvaluationExpression__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__7"


    // $ANTLR start "rule__EvaluationExpression__Group__7__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4044:1: rule__EvaluationExpression__Group__7__Impl : ( RULE_PUNC_SEMI_COLON ) ;
    public final void rule__EvaluationExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4048:1: ( ( RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4049:1: ( RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4049:1: ( RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4050:1: RULE_PUNC_SEMI_COLON
            {
             before(grammarAccess.getEvaluationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__EvaluationExpression__Group__7__Impl8405); 
             after(grammarAccess.getEvaluationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__Group__7__Impl"


    // $ANTLR start "rule__GenericExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4077:1: rule__GenericExpression__Group__0 : rule__GenericExpression__Group__0__Impl rule__GenericExpression__Group__1 ;
    public final void rule__GenericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4081:1: ( rule__GenericExpression__Group__0__Impl rule__GenericExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4082:2: rule__GenericExpression__Group__0__Impl rule__GenericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GenericExpression__Group__0__Impl_in_rule__GenericExpression__Group__08450);
            rule__GenericExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericExpression__Group__1_in_rule__GenericExpression__Group__08453);
            rule__GenericExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group__0"


    // $ANTLR start "rule__GenericExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4089:1: rule__GenericExpression__Group__0__Impl : ( ( rule__GenericExpression__E1Assignment_0 ) ) ;
    public final void rule__GenericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4093:1: ( ( ( rule__GenericExpression__E1Assignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4094:1: ( ( rule__GenericExpression__E1Assignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4094:1: ( ( rule__GenericExpression__E1Assignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4095:1: ( rule__GenericExpression__E1Assignment_0 )
            {
             before(grammarAccess.getGenericExpressionAccess().getE1Assignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4096:1: ( rule__GenericExpression__E1Assignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4096:2: rule__GenericExpression__E1Assignment_0
            {
            pushFollow(FOLLOW_rule__GenericExpression__E1Assignment_0_in_rule__GenericExpression__Group__0__Impl8480);
            rule__GenericExpression__E1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericExpressionAccess().getE1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group__0__Impl"


    // $ANTLR start "rule__GenericExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4106:1: rule__GenericExpression__Group__1 : rule__GenericExpression__Group__1__Impl ;
    public final void rule__GenericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4110:1: ( rule__GenericExpression__Group__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4111:2: rule__GenericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericExpression__Group__1__Impl_in_rule__GenericExpression__Group__18510);
            rule__GenericExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group__1"


    // $ANTLR start "rule__GenericExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4117:1: rule__GenericExpression__Group__1__Impl : ( ( rule__GenericExpression__Group_1__0 )* ) ;
    public final void rule__GenericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4121:1: ( ( ( rule__GenericExpression__Group_1__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4122:1: ( ( rule__GenericExpression__Group_1__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4122:1: ( ( rule__GenericExpression__Group_1__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4123:1: ( rule__GenericExpression__Group_1__0 )*
            {
             before(grammarAccess.getGenericExpressionAccess().getGroup_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4124:1: ( rule__GenericExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4124:2: rule__GenericExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GenericExpression__Group_1__0_in_rule__GenericExpression__Group__1__Impl8537);
            	    rule__GenericExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getGenericExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group__1__Impl"


    // $ANTLR start "rule__GenericExpression__Group_1__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4138:1: rule__GenericExpression__Group_1__0 : rule__GenericExpression__Group_1__0__Impl rule__GenericExpression__Group_1__1 ;
    public final void rule__GenericExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4142:1: ( rule__GenericExpression__Group_1__0__Impl rule__GenericExpression__Group_1__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4143:2: rule__GenericExpression__Group_1__0__Impl rule__GenericExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericExpression__Group_1__0__Impl_in_rule__GenericExpression__Group_1__08572);
            rule__GenericExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericExpression__Group_1__1_in_rule__GenericExpression__Group_1__08575);
            rule__GenericExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group_1__0"


    // $ANTLR start "rule__GenericExpression__Group_1__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4150:1: rule__GenericExpression__Group_1__0__Impl : ( ( rule__GenericExpression__OpAssignment_1_0 ) ) ;
    public final void rule__GenericExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4154:1: ( ( ( rule__GenericExpression__OpAssignment_1_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4155:1: ( ( rule__GenericExpression__OpAssignment_1_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4155:1: ( ( rule__GenericExpression__OpAssignment_1_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4156:1: ( rule__GenericExpression__OpAssignment_1_0 )
            {
             before(grammarAccess.getGenericExpressionAccess().getOpAssignment_1_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4157:1: ( rule__GenericExpression__OpAssignment_1_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4157:2: rule__GenericExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__GenericExpression__OpAssignment_1_0_in_rule__GenericExpression__Group_1__0__Impl8602);
            rule__GenericExpression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GenericExpression__Group_1__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4167:1: rule__GenericExpression__Group_1__1 : rule__GenericExpression__Group_1__1__Impl ;
    public final void rule__GenericExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4171:1: ( rule__GenericExpression__Group_1__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4172:2: rule__GenericExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericExpression__Group_1__1__Impl_in_rule__GenericExpression__Group_1__18632);
            rule__GenericExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group_1__1"


    // $ANTLR start "rule__GenericExpression__Group_1__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4178:1: rule__GenericExpression__Group_1__1__Impl : ( ( rule__GenericExpression__E2Assignment_1_1 ) ) ;
    public final void rule__GenericExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4182:1: ( ( ( rule__GenericExpression__E2Assignment_1_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4183:1: ( ( rule__GenericExpression__E2Assignment_1_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4183:1: ( ( rule__GenericExpression__E2Assignment_1_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4184:1: ( rule__GenericExpression__E2Assignment_1_1 )
            {
             before(grammarAccess.getGenericExpressionAccess().getE2Assignment_1_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4185:1: ( rule__GenericExpression__E2Assignment_1_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4185:2: rule__GenericExpression__E2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericExpression__E2Assignment_1_1_in_rule__GenericExpression__Group_1__1__Impl8659);
            rule__GenericExpression__E2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenericExpressionAccess().getE2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalGenericExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4199:1: rule__TerminalGenericExpression__Group__0 : rule__TerminalGenericExpression__Group__0__Impl rule__TerminalGenericExpression__Group__1 ;
    public final void rule__TerminalGenericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4203:1: ( rule__TerminalGenericExpression__Group__0__Impl rule__TerminalGenericExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4204:2: rule__TerminalGenericExpression__Group__0__Impl rule__TerminalGenericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group__0__Impl_in_rule__TerminalGenericExpression__Group__08693);
            rule__TerminalGenericExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group__1_in_rule__TerminalGenericExpression__Group__08696);
            rule__TerminalGenericExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group__0"


    // $ANTLR start "rule__TerminalGenericExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4211:1: rule__TerminalGenericExpression__Group__0__Impl : ( ( ruleUnaryOperator )? ) ;
    public final void rule__TerminalGenericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4215:1: ( ( ( ruleUnaryOperator )? ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4216:1: ( ( ruleUnaryOperator )? )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4216:1: ( ( ruleUnaryOperator )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4217:1: ( ruleUnaryOperator )?
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getUnaryOperatorParserRuleCall_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4218:1: ( ruleUnaryOperator )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4218:3: ruleUnaryOperator
                    {
                    pushFollow(FOLLOW_ruleUnaryOperator_in_rule__TerminalGenericExpression__Group__0__Impl8724);
                    ruleUnaryOperator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalGenericExpressionAccess().getUnaryOperatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group__0__Impl"


    // $ANTLR start "rule__TerminalGenericExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4228:1: rule__TerminalGenericExpression__Group__1 : rule__TerminalGenericExpression__Group__1__Impl ;
    public final void rule__TerminalGenericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4232:1: ( rule__TerminalGenericExpression__Group__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4233:2: rule__TerminalGenericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group__1__Impl_in_rule__TerminalGenericExpression__Group__18755);
            rule__TerminalGenericExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group__1"


    // $ANTLR start "rule__TerminalGenericExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4239:1: rule__TerminalGenericExpression__Group__1__Impl : ( ( rule__TerminalGenericExpression__Alternatives_1 ) ) ;
    public final void rule__TerminalGenericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4243:1: ( ( ( rule__TerminalGenericExpression__Alternatives_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4244:1: ( ( rule__TerminalGenericExpression__Alternatives_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4244:1: ( ( rule__TerminalGenericExpression__Alternatives_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4245:1: ( rule__TerminalGenericExpression__Alternatives_1 )
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getAlternatives_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4246:1: ( rule__TerminalGenericExpression__Alternatives_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4246:2: rule__TerminalGenericExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Alternatives_1_in_rule__TerminalGenericExpression__Group__1__Impl8782);
            rule__TerminalGenericExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGenericExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group__1__Impl"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4260:1: rule__TerminalGenericExpression__Group_1_3__0 : rule__TerminalGenericExpression__Group_1_3__0__Impl rule__TerminalGenericExpression__Group_1_3__1 ;
    public final void rule__TerminalGenericExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4264:1: ( rule__TerminalGenericExpression__Group_1_3__0__Impl rule__TerminalGenericExpression__Group_1_3__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4265:2: rule__TerminalGenericExpression__Group_1_3__0__Impl rule__TerminalGenericExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__0__Impl_in_rule__TerminalGenericExpression__Group_1_3__08816);
            rule__TerminalGenericExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__1_in_rule__TerminalGenericExpression__Group_1_3__08819);
            rule__TerminalGenericExpression__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__0"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4272:1: rule__TerminalGenericExpression__Group_1_3__0__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__TerminalGenericExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4276:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4277:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4277:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4278:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_3_0()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__TerminalGenericExpression__Group_1_3__0__Impl8846); 
             after(grammarAccess.getTerminalGenericExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4289:1: rule__TerminalGenericExpression__Group_1_3__1 : rule__TerminalGenericExpression__Group_1_3__1__Impl rule__TerminalGenericExpression__Group_1_3__2 ;
    public final void rule__TerminalGenericExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4293:1: ( rule__TerminalGenericExpression__Group_1_3__1__Impl rule__TerminalGenericExpression__Group_1_3__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4294:2: rule__TerminalGenericExpression__Group_1_3__1__Impl rule__TerminalGenericExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__1__Impl_in_rule__TerminalGenericExpression__Group_1_3__18875);
            rule__TerminalGenericExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__2_in_rule__TerminalGenericExpression__Group_1_3__18878);
            rule__TerminalGenericExpression__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__1"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4301:1: rule__TerminalGenericExpression__Group_1_3__1__Impl : ( ruleGenericExpression ) ;
    public final void rule__TerminalGenericExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4305:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4306:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4306:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4307:1: ruleGenericExpression
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getGenericExpressionParserRuleCall_1_3_1()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__TerminalGenericExpression__Group_1_3__1__Impl8905);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getTerminalGenericExpressionAccess().getGenericExpressionParserRuleCall_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4318:1: rule__TerminalGenericExpression__Group_1_3__2 : rule__TerminalGenericExpression__Group_1_3__2__Impl ;
    public final void rule__TerminalGenericExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4322:1: ( rule__TerminalGenericExpression__Group_1_3__2__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4323:2: rule__TerminalGenericExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalGenericExpression__Group_1_3__2__Impl_in_rule__TerminalGenericExpression__Group_1_3__28934);
            rule__TerminalGenericExpression__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__2"


    // $ANTLR start "rule__TerminalGenericExpression__Group_1_3__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4329:1: rule__TerminalGenericExpression__Group_1_3__2__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__TerminalGenericExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4333:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4334:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4334:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4335:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_3_2()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__TerminalGenericExpression__Group_1_3__2__Impl8961); 
             after(grammarAccess.getTerminalGenericExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__SetExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4352:1: rule__SetExpression__Group__0 : rule__SetExpression__Group__0__Impl rule__SetExpression__Group__1 ;
    public final void rule__SetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4356:1: ( rule__SetExpression__Group__0__Impl rule__SetExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4357:2: rule__SetExpression__Group__0__Impl rule__SetExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SetExpression__Group__0__Impl_in_rule__SetExpression__Group__08996);
            rule__SetExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetExpression__Group__1_in_rule__SetExpression__Group__08999);
            rule__SetExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group__0"


    // $ANTLR start "rule__SetExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4364:1: rule__SetExpression__Group__0__Impl : ( ( rule__SetExpression__E1Assignment_0 ) ) ;
    public final void rule__SetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4368:1: ( ( ( rule__SetExpression__E1Assignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4369:1: ( ( rule__SetExpression__E1Assignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4369:1: ( ( rule__SetExpression__E1Assignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4370:1: ( rule__SetExpression__E1Assignment_0 )
            {
             before(grammarAccess.getSetExpressionAccess().getE1Assignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4371:1: ( rule__SetExpression__E1Assignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4371:2: rule__SetExpression__E1Assignment_0
            {
            pushFollow(FOLLOW_rule__SetExpression__E1Assignment_0_in_rule__SetExpression__Group__0__Impl9026);
            rule__SetExpression__E1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetExpressionAccess().getE1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group__0__Impl"


    // $ANTLR start "rule__SetExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4381:1: rule__SetExpression__Group__1 : rule__SetExpression__Group__1__Impl ;
    public final void rule__SetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4385:1: ( rule__SetExpression__Group__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4386:2: rule__SetExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SetExpression__Group__1__Impl_in_rule__SetExpression__Group__19056);
            rule__SetExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group__1"


    // $ANTLR start "rule__SetExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4392:1: rule__SetExpression__Group__1__Impl : ( ( rule__SetExpression__Group_1__0 )* ) ;
    public final void rule__SetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4396:1: ( ( ( rule__SetExpression__Group_1__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4397:1: ( ( rule__SetExpression__Group_1__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4397:1: ( ( rule__SetExpression__Group_1__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4398:1: ( rule__SetExpression__Group_1__0 )*
            {
             before(grammarAccess.getSetExpressionAccess().getGroup_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4399:1: ( rule__SetExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_PLUS||(LA30_0>=RULE_STAR && LA30_0<=RULE_SLASH)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4399:2: rule__SetExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SetExpression__Group_1__0_in_rule__SetExpression__Group__1__Impl9083);
            	    rule__SetExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSetExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group__1__Impl"


    // $ANTLR start "rule__SetExpression__Group_1__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4413:1: rule__SetExpression__Group_1__0 : rule__SetExpression__Group_1__0__Impl rule__SetExpression__Group_1__1 ;
    public final void rule__SetExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4417:1: ( rule__SetExpression__Group_1__0__Impl rule__SetExpression__Group_1__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4418:2: rule__SetExpression__Group_1__0__Impl rule__SetExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SetExpression__Group_1__0__Impl_in_rule__SetExpression__Group_1__09118);
            rule__SetExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetExpression__Group_1__1_in_rule__SetExpression__Group_1__09121);
            rule__SetExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group_1__0"


    // $ANTLR start "rule__SetExpression__Group_1__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4425:1: rule__SetExpression__Group_1__0__Impl : ( ( rule__SetExpression__OpAssignment_1_0 ) ) ;
    public final void rule__SetExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4429:1: ( ( ( rule__SetExpression__OpAssignment_1_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4430:1: ( ( rule__SetExpression__OpAssignment_1_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4430:1: ( ( rule__SetExpression__OpAssignment_1_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4431:1: ( rule__SetExpression__OpAssignment_1_0 )
            {
             before(grammarAccess.getSetExpressionAccess().getOpAssignment_1_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4432:1: ( rule__SetExpression__OpAssignment_1_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4432:2: rule__SetExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SetExpression__OpAssignment_1_0_in_rule__SetExpression__Group_1__0__Impl9148);
            rule__SetExpression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSetExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SetExpression__Group_1__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4442:1: rule__SetExpression__Group_1__1 : rule__SetExpression__Group_1__1__Impl ;
    public final void rule__SetExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4446:1: ( rule__SetExpression__Group_1__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4447:2: rule__SetExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SetExpression__Group_1__1__Impl_in_rule__SetExpression__Group_1__19178);
            rule__SetExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group_1__1"


    // $ANTLR start "rule__SetExpression__Group_1__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4453:1: rule__SetExpression__Group_1__1__Impl : ( ( rule__SetExpression__E2Assignment_1_1 ) ) ;
    public final void rule__SetExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4457:1: ( ( ( rule__SetExpression__E2Assignment_1_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4458:1: ( ( rule__SetExpression__E2Assignment_1_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4458:1: ( ( rule__SetExpression__E2Assignment_1_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4459:1: ( rule__SetExpression__E2Assignment_1_1 )
            {
             before(grammarAccess.getSetExpressionAccess().getE2Assignment_1_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4460:1: ( rule__SetExpression__E2Assignment_1_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4460:2: rule__SetExpression__E2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__SetExpression__E2Assignment_1_1_in_rule__SetExpression__Group_1__1__Impl9205);
            rule__SetExpression__E2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetExpressionAccess().getE2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4474:1: rule__TernaryExpression__Group__0 : rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 ;
    public final void rule__TernaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4478:1: ( rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4479:2: rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__0__Impl_in_rule__TernaryExpression__Group__09239);
            rule__TernaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__1_in_rule__TernaryExpression__Group__09242);
            rule__TernaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0"


    // $ANTLR start "rule__TernaryExpression__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4486:1: rule__TernaryExpression__Group__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__TernaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4490:1: ( ( KEYWORD_3 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4491:1: ( KEYWORD_3 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4491:1: ( KEYWORD_3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4492:1: KEYWORD_3
            {
             before(grammarAccess.getTernaryExpressionAccess().getIfKeyword_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__TernaryExpression__Group__0__Impl9270); 
             after(grammarAccess.getTernaryExpressionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4505:1: rule__TernaryExpression__Group__1 : rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 ;
    public final void rule__TernaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4509:1: ( rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4510:2: rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__1__Impl_in_rule__TernaryExpression__Group__19301);
            rule__TernaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__2_in_rule__TernaryExpression__Group__19304);
            rule__TernaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1"


    // $ANTLR start "rule__TernaryExpression__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4517:1: rule__TernaryExpression__Group__1__Impl : ( ( rule__TernaryExpression__ConditionalAssignment_1 ) ) ;
    public final void rule__TernaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4521:1: ( ( ( rule__TernaryExpression__ConditionalAssignment_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4522:1: ( ( rule__TernaryExpression__ConditionalAssignment_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4522:1: ( ( rule__TernaryExpression__ConditionalAssignment_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4523:1: ( rule__TernaryExpression__ConditionalAssignment_1 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getConditionalAssignment_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4524:1: ( rule__TernaryExpression__ConditionalAssignment_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4524:2: rule__TernaryExpression__ConditionalAssignment_1
            {
            pushFollow(FOLLOW_rule__TernaryExpression__ConditionalAssignment_1_in_rule__TernaryExpression__Group__1__Impl9331);
            rule__TernaryExpression__ConditionalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getConditionalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4534:1: rule__TernaryExpression__Group__2 : rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 ;
    public final void rule__TernaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4538:1: ( rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4539:2: rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__2__Impl_in_rule__TernaryExpression__Group__29361);
            rule__TernaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__3_in_rule__TernaryExpression__Group__29364);
            rule__TernaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2"


    // $ANTLR start "rule__TernaryExpression__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4546:1: rule__TernaryExpression__Group__2__Impl : ( KEYWORD_23 ) ;
    public final void rule__TernaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4550:1: ( ( KEYWORD_23 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4551:1: ( KEYWORD_23 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4551:1: ( KEYWORD_23 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4552:1: KEYWORD_23
            {
             before(grammarAccess.getTernaryExpressionAccess().getThenKeyword_2()); 
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__TernaryExpression__Group__2__Impl9392); 
             after(grammarAccess.getTernaryExpressionAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4565:1: rule__TernaryExpression__Group__3 : rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 ;
    public final void rule__TernaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4569:1: ( rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4570:2: rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__3__Impl_in_rule__TernaryExpression__Group__39423);
            rule__TernaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__4_in_rule__TernaryExpression__Group__39426);
            rule__TernaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3"


    // $ANTLR start "rule__TernaryExpression__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4577:1: rule__TernaryExpression__Group__3__Impl : ( ( rule__TernaryExpression__TrueValueAssignment_3 ) ) ;
    public final void rule__TernaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4581:1: ( ( ( rule__TernaryExpression__TrueValueAssignment_3 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4582:1: ( ( rule__TernaryExpression__TrueValueAssignment_3 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4582:1: ( ( rule__TernaryExpression__TrueValueAssignment_3 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4583:1: ( rule__TernaryExpression__TrueValueAssignment_3 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getTrueValueAssignment_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4584:1: ( rule__TernaryExpression__TrueValueAssignment_3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4584:2: rule__TernaryExpression__TrueValueAssignment_3
            {
            pushFollow(FOLLOW_rule__TernaryExpression__TrueValueAssignment_3_in_rule__TernaryExpression__Group__3__Impl9453);
            rule__TernaryExpression__TrueValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getTrueValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4594:1: rule__TernaryExpression__Group__4 : rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 ;
    public final void rule__TernaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4598:1: ( rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4599:2: rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__4__Impl_in_rule__TernaryExpression__Group__49483);
            rule__TernaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__5_in_rule__TernaryExpression__Group__49486);
            rule__TernaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4"


    // $ANTLR start "rule__TernaryExpression__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4606:1: rule__TernaryExpression__Group__4__Impl : ( KEYWORD_22 ) ;
    public final void rule__TernaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4610:1: ( ( KEYWORD_22 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4611:1: ( KEYWORD_22 )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4611:1: ( KEYWORD_22 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4612:1: KEYWORD_22
            {
             before(grammarAccess.getTernaryExpressionAccess().getElseKeyword_4()); 
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__TernaryExpression__Group__4__Impl9514); 
             after(grammarAccess.getTernaryExpressionAccess().getElseKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4625:1: rule__TernaryExpression__Group__5 : rule__TernaryExpression__Group__5__Impl ;
    public final void rule__TernaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4629:1: ( rule__TernaryExpression__Group__5__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4630:2: rule__TernaryExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__5__Impl_in_rule__TernaryExpression__Group__59545);
            rule__TernaryExpression__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5"


    // $ANTLR start "rule__TernaryExpression__Group__5__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4636:1: rule__TernaryExpression__Group__5__Impl : ( ( rule__TernaryExpression__FalseValueAssignment_5 ) ) ;
    public final void rule__TernaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4640:1: ( ( ( rule__TernaryExpression__FalseValueAssignment_5 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4641:1: ( ( rule__TernaryExpression__FalseValueAssignment_5 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4641:1: ( ( rule__TernaryExpression__FalseValueAssignment_5 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4642:1: ( rule__TernaryExpression__FalseValueAssignment_5 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getFalseValueAssignment_5()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4643:1: ( rule__TernaryExpression__FalseValueAssignment_5 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4643:2: rule__TernaryExpression__FalseValueAssignment_5
            {
            pushFollow(FOLLOW_rule__TernaryExpression__FalseValueAssignment_5_in_rule__TernaryExpression__Group__5__Impl9572);
            rule__TernaryExpression__FalseValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getFalseValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4665:1: rule__VerificationFunctionCall__Group__0 : rule__VerificationFunctionCall__Group__0__Impl rule__VerificationFunctionCall__Group__1 ;
    public final void rule__VerificationFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4669:1: ( rule__VerificationFunctionCall__Group__0__Impl rule__VerificationFunctionCall__Group__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4670:2: rule__VerificationFunctionCall__Group__0__Impl rule__VerificationFunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__0__Impl_in_rule__VerificationFunctionCall__Group__09614);
            rule__VerificationFunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__1_in_rule__VerificationFunctionCall__Group__09617);
            rule__VerificationFunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__0"


    // $ANTLR start "rule__VerificationFunctionCall__Group__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4677:1: rule__VerificationFunctionCall__Group__0__Impl : ( ( rule__VerificationFunctionCall__FAssignment_0 ) ) ;
    public final void rule__VerificationFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4681:1: ( ( ( rule__VerificationFunctionCall__FAssignment_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4682:1: ( ( rule__VerificationFunctionCall__FAssignment_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4682:1: ( ( rule__VerificationFunctionCall__FAssignment_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4683:1: ( rule__VerificationFunctionCall__FAssignment_0 )
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getFAssignment_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4684:1: ( rule__VerificationFunctionCall__FAssignment_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4684:2: rule__VerificationFunctionCall__FAssignment_0
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__FAssignment_0_in_rule__VerificationFunctionCall__Group__0__Impl9644);
            rule__VerificationFunctionCall__FAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionCallAccess().getFAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4694:1: rule__VerificationFunctionCall__Group__1 : rule__VerificationFunctionCall__Group__1__Impl rule__VerificationFunctionCall__Group__2 ;
    public final void rule__VerificationFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4698:1: ( rule__VerificationFunctionCall__Group__1__Impl rule__VerificationFunctionCall__Group__2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4699:2: rule__VerificationFunctionCall__Group__1__Impl rule__VerificationFunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__1__Impl_in_rule__VerificationFunctionCall__Group__19674);
            rule__VerificationFunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__2_in_rule__VerificationFunctionCall__Group__19677);
            rule__VerificationFunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__1"


    // $ANTLR start "rule__VerificationFunctionCall__Group__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4706:1: rule__VerificationFunctionCall__Group__1__Impl : ( RULE_PUNC_OPEN_PARENTHESIS ) ;
    public final void rule__VerificationFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4710:1: ( ( RULE_PUNC_OPEN_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4711:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4711:1: ( RULE_PUNC_OPEN_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4712:1: RULE_PUNC_OPEN_PARENTHESIS
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
            match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__VerificationFunctionCall__Group__1__Impl9704); 
             after(grammarAccess.getVerificationFunctionCallAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group__2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4723:1: rule__VerificationFunctionCall__Group__2 : rule__VerificationFunctionCall__Group__2__Impl rule__VerificationFunctionCall__Group__3 ;
    public final void rule__VerificationFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4727:1: ( rule__VerificationFunctionCall__Group__2__Impl rule__VerificationFunctionCall__Group__3 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4728:2: rule__VerificationFunctionCall__Group__2__Impl rule__VerificationFunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__2__Impl_in_rule__VerificationFunctionCall__Group__29733);
            rule__VerificationFunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__3_in_rule__VerificationFunctionCall__Group__29736);
            rule__VerificationFunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__2"


    // $ANTLR start "rule__VerificationFunctionCall__Group__2__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4735:1: rule__VerificationFunctionCall__Group__2__Impl : ( ( rule__VerificationFunctionCall__ArgumentsAssignment_2 ) ) ;
    public final void rule__VerificationFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4739:1: ( ( ( rule__VerificationFunctionCall__ArgumentsAssignment_2 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4740:1: ( ( rule__VerificationFunctionCall__ArgumentsAssignment_2 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4740:1: ( ( rule__VerificationFunctionCall__ArgumentsAssignment_2 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4741:1: ( rule__VerificationFunctionCall__ArgumentsAssignment_2 )
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getArgumentsAssignment_2()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4742:1: ( rule__VerificationFunctionCall__ArgumentsAssignment_2 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4742:2: rule__VerificationFunctionCall__ArgumentsAssignment_2
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__ArgumentsAssignment_2_in_rule__VerificationFunctionCall__Group__2__Impl9763);
            rule__VerificationFunctionCall__ArgumentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionCallAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group__3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4752:1: rule__VerificationFunctionCall__Group__3 : rule__VerificationFunctionCall__Group__3__Impl rule__VerificationFunctionCall__Group__4 ;
    public final void rule__VerificationFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4756:1: ( rule__VerificationFunctionCall__Group__3__Impl rule__VerificationFunctionCall__Group__4 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4757:2: rule__VerificationFunctionCall__Group__3__Impl rule__VerificationFunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__3__Impl_in_rule__VerificationFunctionCall__Group__39793);
            rule__VerificationFunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__4_in_rule__VerificationFunctionCall__Group__39796);
            rule__VerificationFunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__3"


    // $ANTLR start "rule__VerificationFunctionCall__Group__3__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4764:1: rule__VerificationFunctionCall__Group__3__Impl : ( ( rule__VerificationFunctionCall__Group_3__0 )* ) ;
    public final void rule__VerificationFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4768:1: ( ( ( rule__VerificationFunctionCall__Group_3__0 )* ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4769:1: ( ( rule__VerificationFunctionCall__Group_3__0 )* )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4769:1: ( ( rule__VerificationFunctionCall__Group_3__0 )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4770:1: ( rule__VerificationFunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getGroup_3()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4771:1: ( rule__VerificationFunctionCall__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_PUNC_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4771:2: rule__VerificationFunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__VerificationFunctionCall__Group_3__0_in_rule__VerificationFunctionCall__Group__3__Impl9823);
            	    rule__VerificationFunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getVerificationFunctionCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group__4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4781:1: rule__VerificationFunctionCall__Group__4 : rule__VerificationFunctionCall__Group__4__Impl ;
    public final void rule__VerificationFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4785:1: ( rule__VerificationFunctionCall__Group__4__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4786:2: rule__VerificationFunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group__4__Impl_in_rule__VerificationFunctionCall__Group__49854);
            rule__VerificationFunctionCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__4"


    // $ANTLR start "rule__VerificationFunctionCall__Group__4__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4792:1: rule__VerificationFunctionCall__Group__4__Impl : ( RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final void rule__VerificationFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4796:1: ( ( RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4797:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4797:1: ( RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4798:1: RULE_PUNC_CLOSE_PARENTHESIS
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 
            match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__VerificationFunctionCall__Group__4__Impl9881); 
             after(grammarAccess.getVerificationFunctionCallAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group_3__0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4819:1: rule__VerificationFunctionCall__Group_3__0 : rule__VerificationFunctionCall__Group_3__0__Impl rule__VerificationFunctionCall__Group_3__1 ;
    public final void rule__VerificationFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4823:1: ( rule__VerificationFunctionCall__Group_3__0__Impl rule__VerificationFunctionCall__Group_3__1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4824:2: rule__VerificationFunctionCall__Group_3__0__Impl rule__VerificationFunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group_3__0__Impl_in_rule__VerificationFunctionCall__Group_3__09920);
            rule__VerificationFunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group_3__1_in_rule__VerificationFunctionCall__Group_3__09923);
            rule__VerificationFunctionCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group_3__0"


    // $ANTLR start "rule__VerificationFunctionCall__Group_3__0__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4831:1: rule__VerificationFunctionCall__Group_3__0__Impl : ( RULE_PUNC_COMMA ) ;
    public final void rule__VerificationFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4835:1: ( ( RULE_PUNC_COMMA ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4836:1: ( RULE_PUNC_COMMA )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4836:1: ( RULE_PUNC_COMMA )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4837:1: RULE_PUNC_COMMA
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getPUNC_COMMATerminalRuleCall_3_0()); 
            match(input,RULE_PUNC_COMMA,FOLLOW_RULE_PUNC_COMMA_in_rule__VerificationFunctionCall__Group_3__0__Impl9950); 
             after(grammarAccess.getVerificationFunctionCallAccess().getPUNC_COMMATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__VerificationFunctionCall__Group_3__1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4848:1: rule__VerificationFunctionCall__Group_3__1 : rule__VerificationFunctionCall__Group_3__1__Impl ;
    public final void rule__VerificationFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4852:1: ( rule__VerificationFunctionCall__Group_3__1__Impl )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4853:2: rule__VerificationFunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__Group_3__1__Impl_in_rule__VerificationFunctionCall__Group_3__19979);
            rule__VerificationFunctionCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group_3__1"


    // $ANTLR start "rule__VerificationFunctionCall__Group_3__1__Impl"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4859:1: rule__VerificationFunctionCall__Group_3__1__Impl : ( ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 ) ) ;
    public final void rule__VerificationFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4863:1: ( ( ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4864:1: ( ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4864:1: ( ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4865:1: ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 )
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getArgumentsAssignment_3_1()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4866:1: ( rule__VerificationFunctionCall__ArgumentsAssignment_3_1 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4866:2: rule__VerificationFunctionCall__ArgumentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VerificationFunctionCall__ArgumentsAssignment_3_1_in_rule__VerificationFunctionCall__Group_3__1__Impl10006);
            rule__VerificationFunctionCall__ArgumentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVerificationFunctionCallAccess().getArgumentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__Model__TheoremsAssignment"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4881:1: rule__Model__TheoremsAssignment : ( ruleTheorem ) ;
    public final void rule__Model__TheoremsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4885:1: ( ( ruleTheorem ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4886:1: ( ruleTheorem )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4886:1: ( ruleTheorem )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4887:1: ruleTheorem
            {
             before(grammarAccess.getModelAccess().getTheoremsTheoremParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Model__TheoremsAssignment10045);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTheoremsTheoremParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TheoremsAssignment"


    // $ANTLR start "rule__Theorem__NameAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4896:1: rule__Theorem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theorem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4900:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4901:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4901:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4902:1: RULE_ID
            {
             before(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Theorem__NameAssignment_110076); 
             after(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__NameAssignment_1"


    // $ANTLR start "rule__Theorem__RangeDefinitionAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4911:1: rule__Theorem__RangeDefinitionAssignment_2 : ( ruleRangeDefinition ) ;
    public final void rule__Theorem__RangeDefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4915:1: ( ( ruleRangeDefinition ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4916:1: ( ruleRangeDefinition )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4916:1: ( ruleRangeDefinition )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4917:1: ruleRangeDefinition
            {
             before(grammarAccess.getTheoremAccess().getRangeDefinitionRangeDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRangeDefinition_in_rule__Theorem__RangeDefinitionAssignment_210107);
            ruleRangeDefinition();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getRangeDefinitionRangeDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__RangeDefinitionAssignment_2"


    // $ANTLR start "rule__Theorem__RequiredDefinitionAssignment_3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4926:1: rule__Theorem__RequiredDefinitionAssignment_3 : ( ruleRequiredDefinition ) ;
    public final void rule__Theorem__RequiredDefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4930:1: ( ( ruleRequiredDefinition ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4931:1: ( ruleRequiredDefinition )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4931:1: ( ruleRequiredDefinition )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4932:1: ruleRequiredDefinition
            {
             before(grammarAccess.getTheoremAccess().getRequiredDefinitionRequiredDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRequiredDefinition_in_rule__Theorem__RequiredDefinitionAssignment_310138);
            ruleRequiredDefinition();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getRequiredDefinitionRequiredDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__RequiredDefinitionAssignment_3"


    // $ANTLR start "rule__Theorem__VarDeclarationsAssignment_4_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4941:1: rule__Theorem__VarDeclarationsAssignment_4_0 : ( ruleVarDeclaration ) ;
    public final void rule__Theorem__VarDeclarationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4945:1: ( ( ruleVarDeclaration ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4946:1: ( ruleVarDeclaration )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4946:1: ( ruleVarDeclaration )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4947:1: ruleVarDeclaration
            {
             before(grammarAccess.getTheoremAccess().getVarDeclarationsVarDeclarationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Theorem__VarDeclarationsAssignment_4_010169);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getVarDeclarationsVarDeclarationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__VarDeclarationsAssignment_4_0"


    // $ANTLR start "rule__Theorem__SetDeclarationsAssignment_4_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4956:1: rule__Theorem__SetDeclarationsAssignment_4_1 : ( ruleSetDeclaration ) ;
    public final void rule__Theorem__SetDeclarationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4960:1: ( ( ruleSetDeclaration ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4961:1: ( ruleSetDeclaration )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4961:1: ( ruleSetDeclaration )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4962:1: ruleSetDeclaration
            {
             before(grammarAccess.getTheoremAccess().getSetDeclarationsSetDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSetDeclaration_in_rule__Theorem__SetDeclarationsAssignment_4_110200);
            ruleSetDeclaration();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getSetDeclarationsSetDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__SetDeclarationsAssignment_4_1"


    // $ANTLR start "rule__Theorem__VerificationExpressionAssignment_5_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4971:1: rule__Theorem__VerificationExpressionAssignment_5_0 : ( ruleVerificationExpression ) ;
    public final void rule__Theorem__VerificationExpressionAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4975:1: ( ( ruleVerificationExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4976:1: ( ruleVerificationExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4976:1: ( ruleVerificationExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4977:1: ruleVerificationExpression
            {
             before(grammarAccess.getTheoremAccess().getVerificationExpressionVerificationExpressionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleVerificationExpression_in_rule__Theorem__VerificationExpressionAssignment_5_010231);
            ruleVerificationExpression();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getVerificationExpressionVerificationExpressionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__VerificationExpressionAssignment_5_0"


    // $ANTLR start "rule__Theorem__EvaluationExpressionAssignment_5_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4986:1: rule__Theorem__EvaluationExpressionAssignment_5_1 : ( ruleEvaluationExpression ) ;
    public final void rule__Theorem__EvaluationExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4990:1: ( ( ruleEvaluationExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4991:1: ( ruleEvaluationExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4991:1: ( ruleEvaluationExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:4992:1: ruleEvaluationExpression
            {
             before(grammarAccess.getTheoremAccess().getEvaluationExpressionEvaluationExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_rule__Theorem__EvaluationExpressionAssignment_5_110262);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getEvaluationExpressionEvaluationExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__EvaluationExpressionAssignment_5_1"


    // $ANTLR start "rule__Theorem__EndNameAssignment_7"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5001:1: rule__Theorem__EndNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__Theorem__EndNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5005:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5006:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5006:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5007:1: RULE_ID
            {
             before(grammarAccess.getTheoremAccess().getEndNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Theorem__EndNameAssignment_710293); 
             after(grammarAccess.getTheoremAccess().getEndNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__EndNameAssignment_7"


    // $ANTLR start "rule__RangeDefinition__ElementAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5016:1: rule__RangeDefinition__ElementAssignment_1 : ( RULE_ID ) ;
    public final void rule__RangeDefinition__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5020:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5021:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5021:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5022:1: RULE_ID
            {
             before(grammarAccess.getRangeDefinitionAccess().getElementIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RangeDefinition__ElementAssignment_110324); 
             after(grammarAccess.getRangeDefinitionAccess().getElementIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__ElementAssignment_1"


    // $ANTLR start "rule__RangeDefinition__SetAssignment_3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5031:1: rule__RangeDefinition__SetAssignment_3 : ( ruleSetExpression ) ;
    public final void rule__RangeDefinition__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5035:1: ( ( ruleSetExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5036:1: ( ruleSetExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5036:1: ( ruleSetExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5037:1: ruleSetExpression
            {
             before(grammarAccess.getRangeDefinitionAccess().getSetSetExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSetExpression_in_rule__RangeDefinition__SetAssignment_310355);
            ruleSetExpression();

            state._fsp--;

             after(grammarAccess.getRangeDefinitionAccess().getSetSetExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDefinition__SetAssignment_3"


    // $ANTLR start "rule__VarDeclaration__IdentifierAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5046:1: rule__VarDeclaration__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5050:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5051:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5051:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5052:1: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclaration__IdentifierAssignment_110386); 
             after(grammarAccess.getVarDeclarationAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__IdentifierAssignment_1"


    // $ANTLR start "rule__VarDeclaration__ExprAssignment_3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5061:1: rule__VarDeclaration__ExprAssignment_3 : ( ruleTerminalSelectionExpression ) ;
    public final void rule__VarDeclaration__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5065:1: ( ( ruleTerminalSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5066:1: ( ruleTerminalSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5066:1: ( ruleTerminalSelectionExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5067:1: ruleTerminalSelectionExpression
            {
             before(grammarAccess.getVarDeclarationAccess().getExprTerminalSelectionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_rule__VarDeclaration__ExprAssignment_310417);
            ruleTerminalSelectionExpression();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getExprTerminalSelectionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__ExprAssignment_3"


    // $ANTLR start "rule__SetDeclaration__SetAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5076:1: rule__SetDeclaration__SetAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetDeclaration__SetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5080:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5081:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5081:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5082:1: RULE_ID
            {
             before(grammarAccess.getSetDeclarationAccess().getSetIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetDeclaration__SetAssignment_010448); 
             after(grammarAccess.getSetDeclarationAccess().getSetIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__SetAssignment_0"


    // $ANTLR start "rule__SetDeclaration__ParamIdentifierAssignment_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5091:1: rule__SetDeclaration__ParamIdentifierAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SetDeclaration__ParamIdentifierAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5095:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5096:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5096:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5097:1: RULE_ID
            {
             before(grammarAccess.getSetDeclarationAccess().getParamIdentifierIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetDeclaration__ParamIdentifierAssignment_1_110479); 
             after(grammarAccess.getSetDeclarationAccess().getParamIdentifierIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__ParamIdentifierAssignment_1_1"


    // $ANTLR start "rule__SetDeclaration__ElementBindingAssignment_4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5106:1: rule__SetDeclaration__ElementBindingAssignment_4 : ( ruleElementBinding ) ;
    public final void rule__SetDeclaration__ElementBindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5110:1: ( ( ruleElementBinding ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5111:1: ( ruleElementBinding )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5111:1: ( ruleElementBinding )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5112:1: ruleElementBinding
            {
             before(grammarAccess.getSetDeclarationAccess().getElementBindingElementBindingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleElementBinding_in_rule__SetDeclaration__ElementBindingAssignment_410510);
            ruleElementBinding();

            state._fsp--;

             after(grammarAccess.getSetDeclarationAccess().getElementBindingElementBindingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__ElementBindingAssignment_4"


    // $ANTLR start "rule__SetDeclaration__ExprAssignment_6"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5121:1: rule__SetDeclaration__ExprAssignment_6 : ( ruleSelectionExpression ) ;
    public final void rule__SetDeclaration__ExprAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5125:1: ( ( ruleSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5126:1: ( ruleSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5126:1: ( ruleSelectionExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5127:1: ruleSelectionExpression
            {
             before(grammarAccess.getSetDeclarationAccess().getExprSelectionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSelectionExpression_in_rule__SetDeclaration__ExprAssignment_610541);
            ruleSelectionExpression();

            state._fsp--;

             after(grammarAccess.getSetDeclarationAccess().getExprSelectionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDeclaration__ExprAssignment_6"


    // $ANTLR start "rule__ElementBinding__ElementAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5136:1: rule__ElementBinding__ElementAssignment_0 : ( RULE_ID ) ;
    public final void rule__ElementBinding__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5140:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5141:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5141:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5142:1: RULE_ID
            {
             before(grammarAccess.getElementBindingAccess().getElementIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ElementBinding__ElementAssignment_010572); 
             after(grammarAccess.getElementBindingAccess().getElementIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__ElementAssignment_0"


    // $ANTLR start "rule__ElementBinding__SetAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5151:1: rule__ElementBinding__SetAssignment_2 : ( ruleSetExpression ) ;
    public final void rule__ElementBinding__SetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5155:1: ( ( ruleSetExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5156:1: ( ruleSetExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5156:1: ( ruleSetExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5157:1: ruleSetExpression
            {
             before(grammarAccess.getElementBindingAccess().getSetSetExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSetExpression_in_rule__ElementBinding__SetAssignment_210603);
            ruleSetExpression();

            state._fsp--;

             after(grammarAccess.getElementBindingAccess().getSetSetExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementBinding__SetAssignment_2"


    // $ANTLR start "rule__SelectionExpression__E1Assignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5166:1: rule__SelectionExpression__E1Assignment_0 : ( ruleTerminalSelectionExpression ) ;
    public final void rule__SelectionExpression__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5170:1: ( ( ruleTerminalSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5171:1: ( ruleTerminalSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5171:1: ( ruleTerminalSelectionExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5172:1: ruleTerminalSelectionExpression
            {
             before(grammarAccess.getSelectionExpressionAccess().getE1TerminalSelectionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_rule__SelectionExpression__E1Assignment_010634);
            ruleTerminalSelectionExpression();

            state._fsp--;

             after(grammarAccess.getSelectionExpressionAccess().getE1TerminalSelectionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__E1Assignment_0"


    // $ANTLR start "rule__SelectionExpression__OpAssignment_1_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5181:1: rule__SelectionExpression__OpAssignment_1_0 : ( ruleBooleanOperator ) ;
    public final void rule__SelectionExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5185:1: ( ( ruleBooleanOperator ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5186:1: ( ruleBooleanOperator )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5186:1: ( ruleBooleanOperator )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5187:1: ruleBooleanOperator
            {
             before(grammarAccess.getSelectionExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBooleanOperator_in_rule__SelectionExpression__OpAssignment_1_010665);
            ruleBooleanOperator();

            state._fsp--;

             after(grammarAccess.getSelectionExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__OpAssignment_1_0"


    // $ANTLR start "rule__SelectionExpression__E2Assignment_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5196:1: rule__SelectionExpression__E2Assignment_1_1 : ( ruleTerminalSelectionExpression ) ;
    public final void rule__SelectionExpression__E2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5200:1: ( ( ruleTerminalSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5201:1: ( ruleTerminalSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5201:1: ( ruleTerminalSelectionExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5202:1: ruleTerminalSelectionExpression
            {
             before(grammarAccess.getSelectionExpressionAccess().getE2TerminalSelectionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_rule__SelectionExpression__E2Assignment_1_110696);
            ruleTerminalSelectionExpression();

            state._fsp--;

             after(grammarAccess.getSelectionExpressionAccess().getE2TerminalSelectionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__E2Assignment_1_1"


    // $ANTLR start "rule__ComputeExpression__IdentifierAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5211:1: rule__ComputeExpression__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComputeExpression__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5215:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5216:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5216:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5217:1: RULE_ID
            {
             before(grammarAccess.getComputeExpressionAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComputeExpression__IdentifierAssignment_110727); 
             after(grammarAccess.getComputeExpressionAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__IdentifierAssignment_1"


    // $ANTLR start "rule__ComputeExpression__NameAssignment_2_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5226:1: rule__ComputeExpression__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__ComputeExpression__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5230:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5231:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5231:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5232:1: RULE_ID
            {
             before(grammarAccess.getComputeExpressionAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComputeExpression__NameAssignment_2_110758); 
             after(grammarAccess.getComputeExpressionAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__NameAssignment_2_1"


    // $ANTLR start "rule__ComputeExpression__NameAssignment_2_2_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5241:1: rule__ComputeExpression__NameAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__ComputeExpression__NameAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5245:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5246:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5246:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5247:1: RULE_ID
            {
             before(grammarAccess.getComputeExpressionAccess().getNameIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComputeExpression__NameAssignment_2_2_110789); 
             after(grammarAccess.getComputeExpressionAccess().getNameIDTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeExpression__NameAssignment_2_2_1"


    // $ANTLR start "rule__TerminalSelectionExpression__CAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5256:1: rule__TerminalSelectionExpression__CAssignment_0 : ( ruleComputeExpression ) ;
    public final void rule__TerminalSelectionExpression__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5260:1: ( ( ruleComputeExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5261:1: ( ruleComputeExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5261:1: ( ruleComputeExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5262:1: ruleComputeExpression
            {
             before(grammarAccess.getTerminalSelectionExpressionAccess().getCComputeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComputeExpression_in_rule__TerminalSelectionExpression__CAssignment_010820);
            ruleComputeExpression();

            state._fsp--;

             after(grammarAccess.getTerminalSelectionExpressionAccess().getCComputeExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalSelectionExpression__CAssignment_0"


    // $ANTLR start "rule__TerminalSelectionExpression__EAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5271:1: rule__TerminalSelectionExpression__EAssignment_1 : ( ruleTerminalGenericExpression ) ;
    public final void rule__TerminalSelectionExpression__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5275:1: ( ( ruleTerminalGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5276:1: ( ruleTerminalGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5276:1: ( ruleTerminalGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5277:1: ruleTerminalGenericExpression
            {
             before(grammarAccess.getTerminalSelectionExpressionAccess().getETerminalGenericExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_rule__TerminalSelectionExpression__EAssignment_110851);
            ruleTerminalGenericExpression();

            state._fsp--;

             after(grammarAccess.getTerminalSelectionExpressionAccess().getETerminalGenericExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalSelectionExpression__EAssignment_1"


    // $ANTLR start "rule__TerminalSelectionExpression__RAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5286:1: rule__TerminalSelectionExpression__RAssignment_2 : ( ruleSelectionRelation ) ;
    public final void rule__TerminalSelectionExpression__RAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5290:1: ( ( ruleSelectionRelation ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5291:1: ( ruleSelectionRelation )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5291:1: ( ruleSelectionRelation )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5292:1: ruleSelectionRelation
            {
             before(grammarAccess.getTerminalSelectionExpressionAccess().getRSelectionRelationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelectionRelation_in_rule__TerminalSelectionExpression__RAssignment_210882);
            ruleSelectionRelation();

            state._fsp--;

             after(grammarAccess.getTerminalSelectionExpressionAccess().getRSelectionRelationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalSelectionExpression__RAssignment_2"


    // $ANTLR start "rule__SelectionRelation__IdentifierAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5301:1: rule__SelectionRelation__IdentifierAssignment_0 : ( ruleSelectionRelationIdentifier ) ;
    public final void rule__SelectionRelation__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5305:1: ( ( ruleSelectionRelationIdentifier ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5306:1: ( ruleSelectionRelationIdentifier )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5306:1: ( ruleSelectionRelationIdentifier )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5307:1: ruleSelectionRelationIdentifier
            {
             before(grammarAccess.getSelectionRelationAccess().getIdentifierSelectionRelationIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelectionRelationIdentifier_in_rule__SelectionRelation__IdentifierAssignment_010913);
            ruleSelectionRelationIdentifier();

            state._fsp--;

             after(grammarAccess.getSelectionRelationAccess().getIdentifierSelectionRelationIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__IdentifierAssignment_0"


    // $ANTLR start "rule__SelectionRelation__ArgumentsAssignment_2_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5316:1: rule__SelectionRelation__ArgumentsAssignment_2_0 : ( ruleSelectionRelationParameter ) ;
    public final void rule__SelectionRelation__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5320:1: ( ( ruleSelectionRelationParameter ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5321:1: ( ruleSelectionRelationParameter )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5321:1: ( ruleSelectionRelationParameter )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5322:1: ruleSelectionRelationParameter
            {
             before(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSelectionRelationParameter_in_rule__SelectionRelation__ArgumentsAssignment_2_010944);
            ruleSelectionRelationParameter();

            state._fsp--;

             after(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__SelectionRelation__ArgumentsAssignment_2_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5331:1: rule__SelectionRelation__ArgumentsAssignment_2_1_1 : ( ruleSelectionRelationParameter ) ;
    public final void rule__SelectionRelation__ArgumentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5335:1: ( ( ruleSelectionRelationParameter ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5336:1: ( ruleSelectionRelationParameter )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5336:1: ( ruleSelectionRelationParameter )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5337:1: ruleSelectionRelationParameter
            {
             before(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSelectionRelationParameter_in_rule__SelectionRelation__ArgumentsAssignment_2_1_110975);
            ruleSelectionRelationParameter();

            state._fsp--;

             after(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelation__ArgumentsAssignment_2_1_1"


    // $ANTLR start "rule__SelectionRelationParameter__LAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5346:1: rule__SelectionRelationParameter__LAssignment_0 : ( ruleLiteral ) ;
    public final void rule__SelectionRelationParameter__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5350:1: ( ( ruleLiteral ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5351:1: ( ruleLiteral )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5351:1: ( ruleLiteral )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5352:1: ruleLiteral
            {
             before(grammarAccess.getSelectionRelationParameterAccess().getLLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__SelectionRelationParameter__LAssignment_011006);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSelectionRelationParameterAccess().getLLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelationParameter__LAssignment_0"


    // $ANTLR start "rule__SelectionRelationParameter__IdentifierAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5361:1: rule__SelectionRelationParameter__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectionRelationParameter__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5365:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5366:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5366:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5367:1: RULE_ID
            {
             before(grammarAccess.getSelectionRelationParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectionRelationParameter__IdentifierAssignment_111037); 
             after(grammarAccess.getSelectionRelationParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionRelationParameter__IdentifierAssignment_1"


    // $ANTLR start "rule__RequiredDefinition__TheoremsAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5376:1: rule__RequiredDefinition__TheoremsAssignment_2 : ( RULE_ID ) ;
    public final void rule__RequiredDefinition__TheoremsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5380:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5381:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5381:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5382:1: RULE_ID
            {
             before(grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredDefinition__TheoremsAssignment_211068); 
             after(grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__TheoremsAssignment_2"


    // $ANTLR start "rule__RequiredDefinition__TheoremsAssignment_3_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5391:1: rule__RequiredDefinition__TheoremsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__RequiredDefinition__TheoremsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5395:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5396:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5396:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5397:1: RULE_ID
            {
             before(grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredDefinition__TheoremsAssignment_3_111099); 
             after(grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredDefinition__TheoremsAssignment_3_1"


    // $ANTLR start "rule__VerificationExpression__E1Assignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5406:1: rule__VerificationExpression__E1Assignment_2 : ( ruleGenericExpression ) ;
    public final void rule__VerificationExpression__E1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5410:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5411:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5411:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5412:1: ruleGenericExpression
            {
             before(grammarAccess.getVerificationExpressionAccess().getE1GenericExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__VerificationExpression__E1Assignment_211130);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getVerificationExpressionAccess().getE1GenericExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationExpression__E1Assignment_2"


    // $ANTLR start "rule__EvaluationExpression__FAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5421:1: rule__EvaluationExpression__FAssignment_2 : ( ruleAggregationFunctionIdentifier ) ;
    public final void rule__EvaluationExpression__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5425:1: ( ( ruleAggregationFunctionIdentifier ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5426:1: ( ruleAggregationFunctionIdentifier )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5426:1: ( ruleAggregationFunctionIdentifier )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5427:1: ruleAggregationFunctionIdentifier
            {
             before(grammarAccess.getEvaluationExpressionAccess().getFAggregationFunctionIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAggregationFunctionIdentifier_in_rule__EvaluationExpression__FAssignment_211161);
            ruleAggregationFunctionIdentifier();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionAccess().getFAggregationFunctionIdentifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__FAssignment_2"


    // $ANTLR start "rule__EvaluationExpression__EAssignment_4"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5436:1: rule__EvaluationExpression__EAssignment_4 : ( ruleGenericExpression ) ;
    public final void rule__EvaluationExpression__EAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5440:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5441:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5441:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5442:1: ruleGenericExpression
            {
             before(grammarAccess.getEvaluationExpressionAccess().getEGenericExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__EvaluationExpression__EAssignment_411192);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionAccess().getEGenericExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationExpression__EAssignment_4"


    // $ANTLR start "rule__GenericExpression__E1Assignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5451:1: rule__GenericExpression__E1Assignment_0 : ( ruleTerminalGenericExpression ) ;
    public final void rule__GenericExpression__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5455:1: ( ( ruleTerminalGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5456:1: ( ruleTerminalGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5456:1: ( ruleTerminalGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5457:1: ruleTerminalGenericExpression
            {
             before(grammarAccess.getGenericExpressionAccess().getE1TerminalGenericExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_rule__GenericExpression__E1Assignment_011223);
            ruleTerminalGenericExpression();

            state._fsp--;

             after(grammarAccess.getGenericExpressionAccess().getE1TerminalGenericExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__E1Assignment_0"


    // $ANTLR start "rule__GenericExpression__OpAssignment_1_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5466:1: rule__GenericExpression__OpAssignment_1_0 : ( ruleGenericOperator ) ;
    public final void rule__GenericExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5470:1: ( ( ruleGenericOperator ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5471:1: ( ruleGenericOperator )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5471:1: ( ruleGenericOperator )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5472:1: ruleGenericOperator
            {
             before(grammarAccess.getGenericExpressionAccess().getOpGenericOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleGenericOperator_in_rule__GenericExpression__OpAssignment_1_011254);
            ruleGenericOperator();

            state._fsp--;

             after(grammarAccess.getGenericExpressionAccess().getOpGenericOperatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__OpAssignment_1_0"


    // $ANTLR start "rule__GenericExpression__E2Assignment_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5481:1: rule__GenericExpression__E2Assignment_1_1 : ( ruleTerminalGenericExpression ) ;
    public final void rule__GenericExpression__E2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5485:1: ( ( ruleTerminalGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5486:1: ( ruleTerminalGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5486:1: ( ruleTerminalGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5487:1: ruleTerminalGenericExpression
            {
             before(grammarAccess.getGenericExpressionAccess().getE2TerminalGenericExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_rule__GenericExpression__E2Assignment_1_111285);
            ruleTerminalGenericExpression();

            state._fsp--;

             after(grammarAccess.getGenericExpressionAccess().getE2TerminalGenericExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericExpression__E2Assignment_1_1"


    // $ANTLR start "rule__TerminalGenericExpression__LiteralAssignment_1_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5496:1: rule__TerminalGenericExpression__LiteralAssignment_1_0 : ( ruleLiteral ) ;
    public final void rule__TerminalGenericExpression__LiteralAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5500:1: ( ( ruleLiteral ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5501:1: ( ruleLiteral )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5501:1: ( ruleLiteral )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5502:1: ruleLiteral
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getLiteralLiteralParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalGenericExpression__LiteralAssignment_1_011316);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTerminalGenericExpressionAccess().getLiteralLiteralParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__LiteralAssignment_1_0"


    // $ANTLR start "rule__TerminalGenericExpression__FcAssignment_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5511:1: rule__TerminalGenericExpression__FcAssignment_1_1 : ( ruleVerificationFunctionCall ) ;
    public final void rule__TerminalGenericExpression__FcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5515:1: ( ( ruleVerificationFunctionCall ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5516:1: ( ruleVerificationFunctionCall )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5516:1: ( ruleVerificationFunctionCall )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5517:1: ruleVerificationFunctionCall
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getFcVerificationFunctionCallParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVerificationFunctionCall_in_rule__TerminalGenericExpression__FcAssignment_1_111347);
            ruleVerificationFunctionCall();

            state._fsp--;

             after(grammarAccess.getTerminalGenericExpressionAccess().getFcVerificationFunctionCallParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__FcAssignment_1_1"


    // $ANTLR start "rule__TerminalGenericExpression__TeAssignment_1_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5526:1: rule__TerminalGenericExpression__TeAssignment_1_2 : ( ruleTernaryExpression ) ;
    public final void rule__TerminalGenericExpression__TeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5530:1: ( ( ruleTernaryExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5531:1: ( ruleTernaryExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5531:1: ( ruleTernaryExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5532:1: ruleTernaryExpression
            {
             before(grammarAccess.getTerminalGenericExpressionAccess().getTeTernaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_rule__TerminalGenericExpression__TeAssignment_1_211378);
            ruleTernaryExpression();

            state._fsp--;

             after(grammarAccess.getTerminalGenericExpressionAccess().getTeTernaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGenericExpression__TeAssignment_1_2"


    // $ANTLR start "rule__SetExpression__E1Assignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5541:1: rule__SetExpression__E1Assignment_0 : ( ruleTerminalSetExpression ) ;
    public final void rule__SetExpression__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5545:1: ( ( ruleTerminalSetExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5546:1: ( ruleTerminalSetExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5546:1: ( ruleTerminalSetExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5547:1: ruleTerminalSetExpression
            {
             before(grammarAccess.getSetExpressionAccess().getE1TerminalSetExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerminalSetExpression_in_rule__SetExpression__E1Assignment_011409);
            ruleTerminalSetExpression();

            state._fsp--;

             after(grammarAccess.getSetExpressionAccess().getE1TerminalSetExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__E1Assignment_0"


    // $ANTLR start "rule__SetExpression__OpAssignment_1_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5556:1: rule__SetExpression__OpAssignment_1_0 : ( ruleSetOperator ) ;
    public final void rule__SetExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5560:1: ( ( ruleSetOperator ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5561:1: ( ruleSetOperator )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5561:1: ( ruleSetOperator )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5562:1: ruleSetOperator
            {
             before(grammarAccess.getSetExpressionAccess().getOpSetOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSetOperator_in_rule__SetExpression__OpAssignment_1_011440);
            ruleSetOperator();

            state._fsp--;

             after(grammarAccess.getSetExpressionAccess().getOpSetOperatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__OpAssignment_1_0"


    // $ANTLR start "rule__SetExpression__E2Assignment_1_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5571:1: rule__SetExpression__E2Assignment_1_1 : ( ruleTerminalSetExpression ) ;
    public final void rule__SetExpression__E2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5575:1: ( ( ruleTerminalSetExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5576:1: ( ruleTerminalSetExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5576:1: ( ruleTerminalSetExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5577:1: ruleTerminalSetExpression
            {
             before(grammarAccess.getSetExpressionAccess().getE2TerminalSetExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerminalSetExpression_in_rule__SetExpression__E2Assignment_1_111471);
            ruleTerminalSetExpression();

            state._fsp--;

             after(grammarAccess.getSetExpressionAccess().getE2TerminalSetExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetExpression__E2Assignment_1_1"


    // $ANTLR start "rule__TernaryExpression__ConditionalAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5586:1: rule__TernaryExpression__ConditionalAssignment_1 : ( ruleGenericExpression ) ;
    public final void rule__TernaryExpression__ConditionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5590:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5591:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5591:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5592:1: ruleGenericExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getConditionalGenericExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__ConditionalAssignment_111502);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getConditionalGenericExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__ConditionalAssignment_1"


    // $ANTLR start "rule__TernaryExpression__TrueValueAssignment_3"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5601:1: rule__TernaryExpression__TrueValueAssignment_3 : ( ruleGenericExpression ) ;
    public final void rule__TernaryExpression__TrueValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5605:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5606:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5606:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5607:1: ruleGenericExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getTrueValueGenericExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__TrueValueAssignment_311533);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getTrueValueGenericExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__TrueValueAssignment_3"


    // $ANTLR start "rule__TernaryExpression__FalseValueAssignment_5"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5616:1: rule__TernaryExpression__FalseValueAssignment_5 : ( ruleGenericExpression ) ;
    public final void rule__TernaryExpression__FalseValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5620:1: ( ( ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5621:1: ( ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5621:1: ( ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5622:1: ruleGenericExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getFalseValueGenericExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__FalseValueAssignment_511564);
            ruleGenericExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getFalseValueGenericExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__FalseValueAssignment_5"


    // $ANTLR start "rule__VerificationFunctionCall__FAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5631:1: rule__VerificationFunctionCall__FAssignment_0 : ( ruleVerificationFunctionIdentifier ) ;
    public final void rule__VerificationFunctionCall__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5635:1: ( ( ruleVerificationFunctionIdentifier ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5636:1: ( ruleVerificationFunctionIdentifier )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5636:1: ( ruleVerificationFunctionIdentifier )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5637:1: ruleVerificationFunctionIdentifier
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getFVerificationFunctionIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVerificationFunctionIdentifier_in_rule__VerificationFunctionCall__FAssignment_011595);
            ruleVerificationFunctionIdentifier();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionCallAccess().getFVerificationFunctionIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__FAssignment_0"


    // $ANTLR start "rule__VerificationFunctionCall__ArgumentsAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5646:1: rule__VerificationFunctionCall__ArgumentsAssignment_2 : ( ruleVerificationFunctionParameter ) ;
    public final void rule__VerificationFunctionCall__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5650:1: ( ( ruleVerificationFunctionParameter ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5651:1: ( ruleVerificationFunctionParameter )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5651:1: ( ruleVerificationFunctionParameter )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5652:1: ruleVerificationFunctionParameter
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_rule__VerificationFunctionCall__ArgumentsAssignment_211626);
            ruleVerificationFunctionParameter();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__ArgumentsAssignment_2"


    // $ANTLR start "rule__VerificationFunctionCall__ArgumentsAssignment_3_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5661:1: rule__VerificationFunctionCall__ArgumentsAssignment_3_1 : ( ruleVerificationFunctionParameter ) ;
    public final void rule__VerificationFunctionCall__ArgumentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5665:1: ( ( ruleVerificationFunctionParameter ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5666:1: ( ruleVerificationFunctionParameter )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5666:1: ( ruleVerificationFunctionParameter )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5667:1: ruleVerificationFunctionParameter
            {
             before(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_rule__VerificationFunctionCall__ArgumentsAssignment_3_111657);
            ruleVerificationFunctionParameter();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionCall__ArgumentsAssignment_3_1"


    // $ANTLR start "rule__VerificationFunctionParameter__LAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5676:1: rule__VerificationFunctionParameter__LAssignment_0 : ( ruleLiteral ) ;
    public final void rule__VerificationFunctionParameter__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5680:1: ( ( ruleLiteral ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5681:1: ( ruleLiteral )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5681:1: ( ruleLiteral )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5682:1: ruleLiteral
            {
             before(grammarAccess.getVerificationFunctionParameterAccess().getLLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__VerificationFunctionParameter__LAssignment_011688);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionParameterAccess().getLLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionParameter__LAssignment_0"


    // $ANTLR start "rule__VerificationFunctionParameter__IdentifierAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5691:1: rule__VerificationFunctionParameter__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__VerificationFunctionParameter__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5695:1: ( ( RULE_ID ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5696:1: ( RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5696:1: ( RULE_ID )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5697:1: RULE_ID
            {
             before(grammarAccess.getVerificationFunctionParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VerificationFunctionParameter__IdentifierAssignment_111719); 
             after(grammarAccess.getVerificationFunctionParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionParameter__IdentifierAssignment_1"


    // $ANTLR start "rule__VerificationFunctionParameter__VfiAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5706:1: rule__VerificationFunctionParameter__VfiAssignment_2 : ( ruleVerificationFunctionCall ) ;
    public final void rule__VerificationFunctionParameter__VfiAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5710:1: ( ( ruleVerificationFunctionCall ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5711:1: ( ruleVerificationFunctionCall )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5711:1: ( ruleVerificationFunctionCall )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5712:1: ruleVerificationFunctionCall
            {
             before(grammarAccess.getVerificationFunctionParameterAccess().getVfiVerificationFunctionCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVerificationFunctionCall_in_rule__VerificationFunctionParameter__VfiAssignment_211750);
            ruleVerificationFunctionCall();

            state._fsp--;

             after(grammarAccess.getVerificationFunctionParameterAccess().getVfiVerificationFunctionCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerificationFunctionParameter__VfiAssignment_2"


    // $ANTLR start "rule__Literal__BAssignment_0"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5721:1: rule__Literal__BAssignment_0 : ( ruleBOOLEAN ) ;
    public final void rule__Literal__BAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5725:1: ( ( ruleBOOLEAN ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5726:1: ( ruleBOOLEAN )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5726:1: ( ruleBOOLEAN )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5727:1: ruleBOOLEAN
            {
             before(grammarAccess.getLiteralAccess().getBBOOLEANParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__Literal__BAssignment_011781);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getBBOOLEANParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__BAssignment_0"


    // $ANTLR start "rule__Literal__SAssignment_1"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5736:1: rule__Literal__SAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Literal__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5740:1: ( ( RULE_STRING ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5741:1: ( RULE_STRING )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5741:1: ( RULE_STRING )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5742:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getSSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__SAssignment_111812); 
             after(grammarAccess.getLiteralAccess().getSSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__SAssignment_1"


    // $ANTLR start "rule__Literal__NAssignment_2"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5751:1: rule__Literal__NAssignment_2 : ( RULE_NUMERIC ) ;
    public final void rule__Literal__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5755:1: ( ( RULE_NUMERIC ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5756:1: ( RULE_NUMERIC )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5756:1: ( RULE_NUMERIC )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5757:1: RULE_NUMERIC
            {
             before(grammarAccess.getLiteralAccess().getNNUMERICTerminalRuleCall_2_0()); 
            match(input,RULE_NUMERIC,FOLLOW_RULE_NUMERIC_in_rule__Literal__NAssignment_211843); 
             after(grammarAccess.getLiteralAccess().getNNUMERICTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NAssignment_2"


    // $ANTLR start "rule__BOOLEAN__ValueAssignment"
    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5766:1: rule__BOOLEAN__ValueAssignment : ( ( rule__BOOLEAN__ValueAlternatives_0 ) ) ;
    public final void rule__BOOLEAN__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5770:1: ( ( ( rule__BOOLEAN__ValueAlternatives_0 ) ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5771:1: ( ( rule__BOOLEAN__ValueAlternatives_0 ) )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5771:1: ( ( rule__BOOLEAN__ValueAlternatives_0 ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5772:1: ( rule__BOOLEAN__ValueAlternatives_0 )
            {
             before(grammarAccess.getBOOLEANAccess().getValueAlternatives_0()); 
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5773:1: ( rule__BOOLEAN__ValueAlternatives_0 )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/internal/InternalREALParser.g:5773:2: rule__BOOLEAN__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BOOLEAN__ValueAlternatives_0_in_rule__BOOLEAN__ValueAssignment11874);
            rule__BOOLEAN__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__ValueAssignment"

    // Delegated rules


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\21\uffff";
    static final String DFA28_eofS =
        "\1\1\20\uffff";
    static final String DFA28_minS =
        "\1\50\20\uffff";
    static final String DFA28_maxS =
        "\1\112\20\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\17\1";
    static final String DFA28_specialS =
        "\21\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\1\6\uffff\1\2\1\uffff\1\20\1\3\4\uffff\1\4\1\uffff\1\13\1"+
            "\17\1\15\1\16\1\14\1\12\1\6\1\10\1\11\1\5\1\7\2\uffff\2\1\1"+
            "\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 4124:1: ( rule__GenericExpression__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TheoremsAssignment_in_ruleModel91 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeDefinition_in_entryRuleRangeDefinition183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeDefinition190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__0_in_ruleRangeDefinition220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetDeclaration_in_entryRuleSetDeclaration311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetDeclaration318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__0_in_ruleSetDeclaration348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementBinding_in_entryRuleElementBinding375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementBinding382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__0_in_ruleElementBinding412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group__0_in_ruleSelectionExpression476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComputeExpression_in_entryRuleComputeExpression503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComputeExpression510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__0_in_ruleComputeExpression540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_entryRuleTerminalSelectionExpression567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalSelectionExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalSelectionExpression__Alternatives_in_ruleTerminalSelectionExpression604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelation_in_entryRuleSelectionRelation631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelation638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__0_in_ruleSelectionRelation668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationIdentifier_in_entryRuleSelectionRelationIdentifier695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelationIdentifier702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelationIdentifier__Alternatives_in_ruleSelectionRelationIdentifier732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_entryRuleSelectionRelationParameter759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelationParameter766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelationParameter__Alternatives_in_ruleSelectionRelationParameter796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredDefinition_in_entryRuleRequiredDefinition823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredDefinition830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__0_in_ruleRequiredDefinition860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationExpression_in_entryRuleVerificationExpression887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationExpression894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__0_in_ruleVerificationExpression924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__0_in_ruleEvaluationExpression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_entryRuleGenericExpression1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericExpression1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group__0_in_ruleGenericExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_entryRuleTerminalGenericExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGenericExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group__0_in_ruleTerminalGenericExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_entryRuleSetExpression1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExpression1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group__0_in_ruleSetExpression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_entryRuleTerminalSetExpression1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalSetExpression1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalSetExpression1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryExpression1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__0_in_ruleTernaryExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_entryRuleVerificationFunctionCall1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionCall1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__0_in_ruleVerificationFunctionCall1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_entryRuleVerificationFunctionParameter1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionParameter1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionParameter__Alternatives_in_ruleVerificationFunctionParameter1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregationFunctionIdentifier_in_entryRuleAggregationFunctionIdentifier1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregationFunctionIdentifier1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationFunctionIdentifier__Alternatives_in_ruleAggregationFunctionIdentifier1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionIdentifier_in_entryRuleVerificationFunctionIdentifier1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionIdentifier1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionIdentifier__Alternatives_in_ruleVerificationFunctionIdentifier1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericOperator_in_entryRuleGenericOperator1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericOperator1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericOperator__Alternatives_in_ruleGenericOperator1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN1718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__ValueAssignment_in_ruleBOOLEAN1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOperator_in_entryRuleSetOperator1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOperator1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetOperator__Alternatives_in_ruleSetOperator1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperator_in_entryRuleArithmeticOperator1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOperator1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithmeticOperator__Alternatives_in_ruleArithmeticOperator1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator1974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperator1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleUnaryOperator2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__VarDeclarationsAssignment_4_0_in_rule__Theorem__Alternatives_42113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__SetDeclarationsAssignment_4_1_in_rule__Theorem__Alternatives_42131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__VerificationExpressionAssignment_5_0_in_rule__Theorem__Alternatives_52164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__EvaluationExpressionAssignment_5_1_in_rule__Theorem__Alternatives_52182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalSelectionExpression__CAssignment_0_in_rule__TerminalSelectionExpression__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalSelectionExpression__EAssignment_1_in_rule__TerminalSelectionExpression__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalSelectionExpression__RAssignment_2_in_rule__TerminalSelectionExpression__Alternatives2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__SelectionRelationIdentifier__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__SelectionRelationIdentifier__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__SelectionRelationIdentifier__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__SelectionRelationIdentifier__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__SelectionRelationIdentifier__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__SelectionRelationIdentifier__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__SelectionRelationIdentifier__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__SelectionRelationIdentifier__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__SelectionRelationIdentifier__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__SelectionRelationIdentifier__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__SelectionRelationIdentifier__Alternatives2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__SelectionRelationIdentifier__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelationParameter__LAssignment_0_in_rule__SelectionRelationParameter__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelationParameter__IdentifierAssignment_1_in_rule__SelectionRelationParameter__Alternatives2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__LiteralAssignment_1_0_in_rule__TerminalGenericExpression__Alternatives_12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__FcAssignment_1_1_in_rule__TerminalGenericExpression__Alternatives_12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__TeAssignment_1_2_in_rule__TerminalGenericExpression__Alternatives_12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__0_in_rule__TerminalGenericExpression__Alternatives_12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionParameter__LAssignment_0_in_rule__VerificationFunctionParameter__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionParameter__IdentifierAssignment_1_in_rule__VerificationFunctionParameter__Alternatives2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionParameter__VfiAssignment_2_in_rule__VerificationFunctionParameter__Alternatives2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__AggregationFunctionIdentifier__Alternatives2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__AggregationFunctionIdentifier__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__VerificationFunctionIdentifier__Alternatives2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__VerificationFunctionIdentifier__Alternatives2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__VerificationFunctionIdentifier__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__VerificationFunctionIdentifier__Alternatives2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__VerificationFunctionIdentifier__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__VerificationFunctionIdentifier__Alternatives2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__VerificationFunctionIdentifier__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__VerificationFunctionIdentifier__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__VerificationFunctionIdentifier__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__VerificationFunctionIdentifier__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__VerificationFunctionIdentifier__Alternatives3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__VerificationFunctionIdentifier__Alternatives3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__VerificationFunctionIdentifier__Alternatives3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__VerificationFunctionIdentifier__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__VerificationFunctionIdentifier__Alternatives3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__VerificationFunctionIdentifier__Alternatives3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__VerificationFunctionIdentifier__Alternatives3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__VerificationFunctionIdentifier__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__VerificationFunctionIdentifier__Alternatives3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__VerificationFunctionIdentifier__Alternatives3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__GenericOperator__Alternatives3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__GenericOperator__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperator_in_rule__GenericOperator__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BAssignment_0_in_rule__Literal__Alternatives3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__SAssignment_1_in_rule__Literal__Alternatives3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NAssignment_2_in_rule__Literal__Alternatives3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__BOOLEAN__ValueAlternatives_03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__BOOLEAN__ValueAlternatives_03372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__SetOperator__Alternatives3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_rule__SetOperator__Alternatives3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_rule__SetOperator__Alternatives3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__ArithmeticOperator__Alternatives3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__ArithmeticOperator__Alternatives3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_rule__ArithmeticOperator__Alternatives3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_rule__ArithmeticOperator__Alternatives3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POWER_in_rule__ArithmeticOperator__Alternatives3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ArithmeticOperator__Alternatives3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__BooleanOperator__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__BooleanOperator__Alternatives3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__BooleanOperator__Alternatives3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_in_rule__ComparisonOperator__Alternatives3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_EQUAL_in_rule__ComparisonOperator__Alternatives3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__ComparisonOperator__Alternatives3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_EQUAL_in_rule__ComparisonOperator__Alternatives3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_in_rule__ComparisonOperator__Alternatives3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_rule__ComparisonOperator__Alternatives3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__03782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__Theorem__Group__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__13844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__NameAssignment_1_in_rule__Theorem__Group__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__23904 = new BitSet(new long[]{0x0010000108100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__23907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RangeDefinitionAssignment_2_in_rule__Theorem__Group__2__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__33964 = new BitSet(new long[]{0x0010000108100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__33967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequiredDefinitionAssignment_3_in_rule__Theorem__Group__3__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44025 = new BitSet(new long[]{0x0010000108100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Alternatives_4_in_rule__Theorem__Group__4__Impl4055 = new BitSet(new long[]{0x0010000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54086 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Alternatives_5_in_rule__Theorem__Group__5__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001100L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__Theorem__Group__6__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001100L});
    public static final BitSet FOLLOW_rule__Theorem__Group__8_in_rule__Theorem__Group__74211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__EndNameAssignment_7_in_rule__Theorem__Group__7__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__8__Impl_in_rule__Theorem__Group__84269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__Theorem__Group__8__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__0__Impl_in_rule__RangeDefinition__Group__04343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__1_in_rule__RangeDefinition__Group__04346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__RangeDefinition__Group__0__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__1__Impl_in_rule__RangeDefinition__Group__14405 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__2_in_rule__RangeDefinition__Group__14408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__ElementAssignment_1_in_rule__RangeDefinition__Group__1__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__2__Impl_in_rule__RangeDefinition__Group__24465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__3_in_rule__RangeDefinition__Group__24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__RangeDefinition__Group__2__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__3__Impl_in_rule__RangeDefinition__Group__34527 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__4_in_rule__RangeDefinition__Group__34530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__SetAssignment_3_in_rule__RangeDefinition__Group__3__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeDefinition__Group__4__Impl_in_rule__RangeDefinition__Group__44587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__RangeDefinition__Group__4__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__04656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__04659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__VarDeclaration__Group__0__Impl4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__14718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__2_in_rule__VarDeclaration__Group__14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__IdentifierAssignment_1_in_rule__VarDeclaration__Group__1__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__2__Impl_in_rule__VarDeclaration__Group__24778 = new BitSet(new long[]{0x0048FC9EF66FFFF0L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__3_in_rule__VarDeclaration__Group__24781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AFFECTATION_OPERATOR_in_rule__VarDeclaration__Group__2__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__3__Impl_in_rule__VarDeclaration__Group__34837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__4_in_rule__VarDeclaration__Group__34840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__ExprAssignment_3_in_rule__VarDeclaration__Group__3__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__4__Impl_in_rule__VarDeclaration__Group__44897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__VarDeclaration__Group__4__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__0__Impl_in_rule__SetDeclaration__Group__04963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__1_in_rule__SetDeclaration__Group__04966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__SetAssignment_0_in_rule__SetDeclaration__Group__0__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__1__Impl_in_rule__SetDeclaration__Group__15023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__2_in_rule__SetDeclaration__Group__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__0_in_rule__SetDeclaration__Group__1__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__2__Impl_in_rule__SetDeclaration__Group__25084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__3_in_rule__SetDeclaration__Group__25087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AFFECTATION_OPERATOR_in_rule__SetDeclaration__Group__2__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__3__Impl_in_rule__SetDeclaration__Group__35143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__4_in_rule__SetDeclaration__Group__35146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_BRACE_in_rule__SetDeclaration__Group__3__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__4__Impl_in_rule__SetDeclaration__Group__45202 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__5_in_rule__SetDeclaration__Group__45205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__ElementBindingAssignment_4_in_rule__SetDeclaration__Group__4__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__5__Impl_in_rule__SetDeclaration__Group__55262 = new BitSet(new long[]{0x0048FC9EF66FFFF0L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__6_in_rule__SetDeclaration__Group__55265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__SetDeclaration__Group__5__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__6__Impl_in_rule__SetDeclaration__Group__65324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__7_in_rule__SetDeclaration__Group__65327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__ExprAssignment_6_in_rule__SetDeclaration__Group__6__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__7__Impl_in_rule__SetDeclaration__Group__75384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__8_in_rule__SetDeclaration__Group__75387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_BRACE_in_rule__SetDeclaration__Group__7__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group__8__Impl_in_rule__SetDeclaration__Group__85443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__SetDeclaration__Group__8__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__0__Impl_in_rule__SetDeclaration__Group_1__05517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__1_in_rule__SetDeclaration__Group_1__05520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__SetDeclaration__Group_1__0__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__1__Impl_in_rule__SetDeclaration__Group_1__15576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__2_in_rule__SetDeclaration__Group_1__15579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__ParamIdentifierAssignment_1_1_in_rule__SetDeclaration__Group_1__1__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetDeclaration__Group_1__2__Impl_in_rule__SetDeclaration__Group_1__25636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__SetDeclaration__Group_1__2__Impl5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__0__Impl_in_rule__ElementBinding__Group__05698 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__1_in_rule__ElementBinding__Group__05701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__ElementAssignment_0_in_rule__ElementBinding__Group__0__Impl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__1__Impl_in_rule__ElementBinding__Group__15758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__2_in_rule__ElementBinding__Group__15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__ElementBinding__Group__1__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__Group__2__Impl_in_rule__ElementBinding__Group__25820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementBinding__SetAssignment_2_in_rule__ElementBinding__Group__2__Impl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group__0__Impl_in_rule__SelectionExpression__Group__05883 = new BitSet(new long[]{0x0109000000000000L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group__1_in_rule__SelectionExpression__Group__05886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__E1Assignment_0_in_rule__SelectionExpression__Group__0__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group__1__Impl_in_rule__SelectionExpression__Group__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group_1__0_in_rule__SelectionExpression__Group__1__Impl5970 = new BitSet(new long[]{0x0109000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group_1__0__Impl_in_rule__SelectionExpression__Group_1__06005 = new BitSet(new long[]{0x0048FC9EF66FFFF0L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group_1__1_in_rule__SelectionExpression__Group_1__06008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__OpAssignment_1_0_in_rule__SelectionExpression__Group_1__0__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__Group_1__1__Impl_in_rule__SelectionExpression__Group_1__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionExpression__E2Assignment_1_1_in_rule__SelectionExpression__Group_1__1__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__0__Impl_in_rule__ComputeExpression__Group__06126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__1_in_rule__ComputeExpression__Group__06129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__ComputeExpression__Group__0__Impl6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__1__Impl_in_rule__ComputeExpression__Group__16188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__2_in_rule__ComputeExpression__Group__16191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__IdentifierAssignment_1_in_rule__ComputeExpression__Group__1__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group__2__Impl_in_rule__ComputeExpression__Group__26248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__0_in_rule__ComputeExpression__Group__2__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__0__Impl_in_rule__ComputeExpression__Group_2__06312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__1_in_rule__ComputeExpression__Group_2__06315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__ComputeExpression__Group_2__0__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__1__Impl_in_rule__ComputeExpression__Group_2__16371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__2_in_rule__ComputeExpression__Group_2__16374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__NameAssignment_2_1_in_rule__ComputeExpression__Group_2__1__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__2__Impl_in_rule__ComputeExpression__Group_2__26431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__3_in_rule__ComputeExpression__Group_2__26434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2_2__0_in_rule__ComputeExpression__Group_2__2__Impl6461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2__3__Impl_in_rule__ComputeExpression__Group_2__36492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__ComputeExpression__Group_2__3__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2_2__0__Impl_in_rule__ComputeExpression__Group_2_2__06556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2_2__1_in_rule__ComputeExpression__Group_2_2__06559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_COMMA_in_rule__ComputeExpression__Group_2_2__0__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__Group_2_2__1__Impl_in_rule__ComputeExpression__Group_2_2__16615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComputeExpression__NameAssignment_2_2_1_in_rule__ComputeExpression__Group_2_2__1__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__0__Impl_in_rule__SelectionRelation__Group__06676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__1_in_rule__SelectionRelation__Group__06679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__IdentifierAssignment_0_in_rule__SelectionRelation__Group__0__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__1__Impl_in_rule__SelectionRelation__Group__16736 = new BitSet(new long[]{0x0000040200000000L,0x0000000000013400L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__2_in_rule__SelectionRelation__Group__16739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__SelectionRelation__Group__1__Impl6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__2__Impl_in_rule__SelectionRelation__Group__26795 = new BitSet(new long[]{0x0000040200000000L,0x0000000000013400L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__3_in_rule__SelectionRelation__Group__26798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2__0_in_rule__SelectionRelation__Group__2__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group__3__Impl_in_rule__SelectionRelation__Group__36856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__SelectionRelation__Group__3__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2__0__Impl_in_rule__SelectionRelation__Group_2__06920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2__1_in_rule__SelectionRelation__Group_2__06923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__ArgumentsAssignment_2_0_in_rule__SelectionRelation__Group_2__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2__1__Impl_in_rule__SelectionRelation__Group_2__16980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2_1__0_in_rule__SelectionRelation__Group_2__1__Impl7007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2_1__0__Impl_in_rule__SelectionRelation__Group_2_1__07042 = new BitSet(new long[]{0x0000040200000000L,0x0000000000013000L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2_1__1_in_rule__SelectionRelation__Group_2_1__07045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_COMMA_in_rule__SelectionRelation__Group_2_1__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__Group_2_1__1__Impl_in_rule__SelectionRelation__Group_2_1__17101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectionRelation__ArgumentsAssignment_2_1_1_in_rule__SelectionRelation__Group_2_1__1__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__0__Impl_in_rule__RequiredDefinition__Group__07162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__1_in_rule__RequiredDefinition__Group__07165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__RequiredDefinition__Group__0__Impl7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__1__Impl_in_rule__RequiredDefinition__Group__17224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__2_in_rule__RequiredDefinition__Group__17227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__RequiredDefinition__Group__1__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__2__Impl_in_rule__RequiredDefinition__Group__27283 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__3_in_rule__RequiredDefinition__Group__27286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__TheoremsAssignment_2_in_rule__RequiredDefinition__Group__2__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__3__Impl_in_rule__RequiredDefinition__Group__37343 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__4_in_rule__RequiredDefinition__Group__37346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group_3__0_in_rule__RequiredDefinition__Group__3__Impl7373 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__4__Impl_in_rule__RequiredDefinition__Group__47404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__5_in_rule__RequiredDefinition__Group__47407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__RequiredDefinition__Group__4__Impl7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group__5__Impl_in_rule__RequiredDefinition__Group__57463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__RequiredDefinition__Group__5__Impl7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group_3__0__Impl_in_rule__RequiredDefinition__Group_3__07531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group_3__1_in_rule__RequiredDefinition__Group_3__07534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__RequiredDefinition__Group_3__0__Impl7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__Group_3__1__Impl_in_rule__RequiredDefinition__Group_3__17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredDefinition__TheoremsAssignment_3_1_in_rule__RequiredDefinition__Group_3__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__0__Impl_in_rule__VerificationExpression__Group__07654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__1_in_rule__VerificationExpression__Group__07657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__VerificationExpression__Group__0__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__1__Impl_in_rule__VerificationExpression__Group__17716 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__2_in_rule__VerificationExpression__Group__17719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__VerificationExpression__Group__1__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__2__Impl_in_rule__VerificationExpression__Group__27775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__3_in_rule__VerificationExpression__Group__27778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__E1Assignment_2_in_rule__VerificationExpression__Group__2__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__3__Impl_in_rule__VerificationExpression__Group__37835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__4_in_rule__VerificationExpression__Group__37838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__VerificationExpression__Group__3__Impl7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationExpression__Group__4__Impl_in_rule__VerificationExpression__Group__47894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__VerificationExpression__Group__4__Impl7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__0__Impl_in_rule__EvaluationExpression__Group__07960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__1_in_rule__EvaluationExpression__Group__07963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__EvaluationExpression__Group__0__Impl7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__1__Impl_in_rule__EvaluationExpression__Group__18022 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__2_in_rule__EvaluationExpression__Group__18025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__EvaluationExpression__Group__1__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__2__Impl_in_rule__EvaluationExpression__Group__28081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__3_in_rule__EvaluationExpression__Group__28084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__FAssignment_2_in_rule__EvaluationExpression__Group__2__Impl8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__3__Impl_in_rule__EvaluationExpression__Group__38141 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__4_in_rule__EvaluationExpression__Group__38144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__EvaluationExpression__Group__3__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__4__Impl_in_rule__EvaluationExpression__Group__48200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__5_in_rule__EvaluationExpression__Group__48203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__EAssignment_4_in_rule__EvaluationExpression__Group__4__Impl8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__5__Impl_in_rule__EvaluationExpression__Group__58260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__6_in_rule__EvaluationExpression__Group__58263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__EvaluationExpression__Group__5__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__6__Impl_in_rule__EvaluationExpression__Group__68319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__7_in_rule__EvaluationExpression__Group__68322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__EvaluationExpression__Group__6__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvaluationExpression__Group__7__Impl_in_rule__EvaluationExpression__Group__78378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_rule__EvaluationExpression__Group__7__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group__0__Impl_in_rule__GenericExpression__Group__08450 = new BitSet(new long[]{0xFD0D000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__GenericExpression__Group__1_in_rule__GenericExpression__Group__08453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__E1Assignment_0_in_rule__GenericExpression__Group__0__Impl8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group__1__Impl_in_rule__GenericExpression__Group__18510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group_1__0_in_rule__GenericExpression__Group__1__Impl8537 = new BitSet(new long[]{0xFD0D000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__GenericExpression__Group_1__0__Impl_in_rule__GenericExpression__Group_1__08572 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group_1__1_in_rule__GenericExpression__Group_1__08575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__OpAssignment_1_0_in_rule__GenericExpression__Group_1__0__Impl8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__Group_1__1__Impl_in_rule__GenericExpression__Group_1__18632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericExpression__E2Assignment_1_1_in_rule__GenericExpression__Group_1__1__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group__0__Impl_in_rule__TerminalGenericExpression__Group__08693 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group__1_in_rule__TerminalGenericExpression__Group__08696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__TerminalGenericExpression__Group__0__Impl8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group__1__Impl_in_rule__TerminalGenericExpression__Group__18755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Alternatives_1_in_rule__TerminalGenericExpression__Group__1__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__0__Impl_in_rule__TerminalGenericExpression__Group_1_3__08816 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__1_in_rule__TerminalGenericExpression__Group_1_3__08819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__TerminalGenericExpression__Group_1_3__0__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__1__Impl_in_rule__TerminalGenericExpression__Group_1_3__18875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__2_in_rule__TerminalGenericExpression__Group_1_3__18878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__TerminalGenericExpression__Group_1_3__1__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalGenericExpression__Group_1_3__2__Impl_in_rule__TerminalGenericExpression__Group_1_3__28934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__TerminalGenericExpression__Group_1_3__2__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group__0__Impl_in_rule__SetExpression__Group__08996 = new BitSet(new long[]{0x3400000000000000L});
    public static final BitSet FOLLOW_rule__SetExpression__Group__1_in_rule__SetExpression__Group__08999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__E1Assignment_0_in_rule__SetExpression__Group__0__Impl9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group__1__Impl_in_rule__SetExpression__Group__19056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group_1__0_in_rule__SetExpression__Group__1__Impl9083 = new BitSet(new long[]{0x3400000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group_1__0__Impl_in_rule__SetExpression__Group_1__09118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SetExpression__Group_1__1_in_rule__SetExpression__Group_1__09121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__OpAssignment_1_0_in_rule__SetExpression__Group_1__0__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__Group_1__1__Impl_in_rule__SetExpression__Group_1__19178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetExpression__E2Assignment_1_1_in_rule__SetExpression__Group_1__1__Impl9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__0__Impl_in_rule__TernaryExpression__Group__09239 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__1_in_rule__TernaryExpression__Group__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__TernaryExpression__Group__0__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__1__Impl_in_rule__TernaryExpression__Group__19301 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__2_in_rule__TernaryExpression__Group__19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__ConditionalAssignment_1_in_rule__TernaryExpression__Group__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__2__Impl_in_rule__TernaryExpression__Group__29361 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__3_in_rule__TernaryExpression__Group__29364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__TernaryExpression__Group__2__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__3__Impl_in_rule__TernaryExpression__Group__39423 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__4_in_rule__TernaryExpression__Group__39426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__TrueValueAssignment_3_in_rule__TernaryExpression__Group__3__Impl9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__4__Impl_in_rule__TernaryExpression__Group__49483 = new BitSet(new long[]{0x0048FC9EB62D1020L,0x0000000000012200L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__5_in_rule__TernaryExpression__Group__49486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__TernaryExpression__Group__4__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__5__Impl_in_rule__TernaryExpression__Group__59545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__FalseValueAssignment_5_in_rule__TernaryExpression__Group__5__Impl9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__0__Impl_in_rule__VerificationFunctionCall__Group__09614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__1_in_rule__VerificationFunctionCall__Group__09617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__FAssignment_0_in_rule__VerificationFunctionCall__Group__0__Impl9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__1__Impl_in_rule__VerificationFunctionCall__Group__19674 = new BitSet(new long[]{0x0000FC9EB62D1020L,0x0000000000013000L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__2_in_rule__VerificationFunctionCall__Group__19677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_rule__VerificationFunctionCall__Group__1__Impl9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__2__Impl_in_rule__VerificationFunctionCall__Group__29733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__3_in_rule__VerificationFunctionCall__Group__29736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__ArgumentsAssignment_2_in_rule__VerificationFunctionCall__Group__2__Impl9763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__3__Impl_in_rule__VerificationFunctionCall__Group__39793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__4_in_rule__VerificationFunctionCall__Group__39796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group_3__0_in_rule__VerificationFunctionCall__Group__3__Impl9823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group__4__Impl_in_rule__VerificationFunctionCall__Group__49854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_rule__VerificationFunctionCall__Group__4__Impl9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group_3__0__Impl_in_rule__VerificationFunctionCall__Group_3__09920 = new BitSet(new long[]{0x0000FC9EB62D1020L,0x0000000000013000L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group_3__1_in_rule__VerificationFunctionCall__Group_3__09923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_COMMA_in_rule__VerificationFunctionCall__Group_3__0__Impl9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__Group_3__1__Impl_in_rule__VerificationFunctionCall__Group_3__19979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerificationFunctionCall__ArgumentsAssignment_3_1_in_rule__VerificationFunctionCall__Group_3__1__Impl10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Model__TheoremsAssignment10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Theorem__NameAssignment_110076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeDefinition_in_rule__Theorem__RangeDefinitionAssignment_210107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredDefinition_in_rule__Theorem__RequiredDefinitionAssignment_310138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Theorem__VarDeclarationsAssignment_4_010169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetDeclaration_in_rule__Theorem__SetDeclarationsAssignment_4_110200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationExpression_in_rule__Theorem__VerificationExpressionAssignment_5_010231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rule__Theorem__EvaluationExpressionAssignment_5_110262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Theorem__EndNameAssignment_710293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RangeDefinition__ElementAssignment_110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_rule__RangeDefinition__SetAssignment_310355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclaration__IdentifierAssignment_110386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_rule__VarDeclaration__ExprAssignment_310417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetDeclaration__SetAssignment_010448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetDeclaration__ParamIdentifierAssignment_1_110479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementBinding_in_rule__SetDeclaration__ElementBindingAssignment_410510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_rule__SetDeclaration__ExprAssignment_610541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ElementBinding__ElementAssignment_010572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_rule__ElementBinding__SetAssignment_210603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_rule__SelectionExpression__E1Assignment_010634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__SelectionExpression__OpAssignment_1_010665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_rule__SelectionExpression__E2Assignment_1_110696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComputeExpression__IdentifierAssignment_110727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComputeExpression__NameAssignment_2_110758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComputeExpression__NameAssignment_2_2_110789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComputeExpression_in_rule__TerminalSelectionExpression__CAssignment_010820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_rule__TerminalSelectionExpression__EAssignment_110851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelation_in_rule__TerminalSelectionExpression__RAssignment_210882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationIdentifier_in_rule__SelectionRelation__IdentifierAssignment_010913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_rule__SelectionRelation__ArgumentsAssignment_2_010944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_rule__SelectionRelation__ArgumentsAssignment_2_1_110975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__SelectionRelationParameter__LAssignment_011006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectionRelationParameter__IdentifierAssignment_111037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredDefinition__TheoremsAssignment_211068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredDefinition__TheoremsAssignment_3_111099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__VerificationExpression__E1Assignment_211130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregationFunctionIdentifier_in_rule__EvaluationExpression__FAssignment_211161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__EvaluationExpression__EAssignment_411192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_rule__GenericExpression__E1Assignment_011223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericOperator_in_rule__GenericExpression__OpAssignment_1_011254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_rule__GenericExpression__E2Assignment_1_111285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalGenericExpression__LiteralAssignment_1_011316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_rule__TerminalGenericExpression__FcAssignment_1_111347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_rule__TerminalGenericExpression__TeAssignment_1_211378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_rule__SetExpression__E1Assignment_011409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOperator_in_rule__SetExpression__OpAssignment_1_011440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_rule__SetExpression__E2Assignment_1_111471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__ConditionalAssignment_111502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__TrueValueAssignment_311533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_rule__TernaryExpression__FalseValueAssignment_511564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionIdentifier_in_rule__VerificationFunctionCall__FAssignment_011595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_rule__VerificationFunctionCall__ArgumentsAssignment_211626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_rule__VerificationFunctionCall__ArgumentsAssignment_3_111657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__VerificationFunctionParameter__LAssignment_011688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VerificationFunctionParameter__IdentifierAssignment_111719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_rule__VerificationFunctionParameter__VfiAssignment_211750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__Literal__BAssignment_011781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__SAssignment_111812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_in_rule__Literal__NAssignment_211843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__ValueAlternatives_0_in_rule__BOOLEAN__ValueAssignment11874 = new BitSet(new long[]{0x0000000000000002L});

}