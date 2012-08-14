package org.osate.ocarina.real.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.ocarina.real.xtext.services.REALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalREALParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_49", "KEYWORD_47", "KEYWORD_48", "KEYWORD_46", "KEYWORD_45", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_41", "KEYWORD_40", "KEYWORD_39", "KEYWORD_37", "KEYWORD_38", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_1", "RULE_PLUS", "RULE_POWER", "RULE_STAR", "RULE_SLASH", "RULE_MINUS", "RULE_NOT_EQUAL", "RULE_LESS_EQUAL", "RULE_GREATER_EQUAL", "RULE_GREATER", "RULE_LESS", "RULE_EQUAL", "RULE_AFFECTATION_OPERATOR", "RULE_PUNC_OPEN_BRACE", "RULE_PUNC_CLOSE_BRACE", "RULE_PUNC_SEMI_COLON", "RULE_PUNC_OPEN_PARENTHESIS", "RULE_PUNC_CLOSE_PARENTHESIS", "RULE_PUNC_COMMA", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_NUMERIC"
    };
    public static final int RULE_ID=71;
    public static final int RULE_AFFECTATION_OPERATOR=64;
    public static final int RULE_PUNC_CLOSE_PARENTHESIS=69;
    public static final int RULE_PUNC_OPEN_PARENTHESIS=68;
    public static final int RULE_NOT_EQUAL=58;
    public static final int RULE_GREATER_EQUAL=60;
    public static final int KEYWORD_19=36;
    public static final int KEYWORD_17=34;
    public static final int KEYWORD_18=35;
    public static final int RULE_PUNC_CLOSE_BRACE=66;
    public static final int KEYWORD_15=32;
    public static final int KEYWORD_16=33;
    public static final int KEYWORD_13=47;
    public static final int KEYWORD_14=31;
    public static final int KEYWORD_11=45;
    public static final int RULE_PUNC_COMMA=70;
    public static final int EOF=-1;
    public static final int KEYWORD_12=46;
    public static final int KEYWORD_10=44;
    public static final int KEYWORD_6=40;
    public static final int KEYWORD_7=41;
    public static final int KEYWORD_8=42;
    public static final int KEYWORD_9=43;
    public static final int RULE_LESS_EQUAL=59;
    public static final int KEYWORD_28=23;
    public static final int KEYWORD_29=24;
    public static final int KEYWORD_24=27;
    public static final int KEYWORD_25=28;
    public static final int RULE_POWER=54;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_20=37;
    public static final int KEYWORD_21=38;
    public static final int KEYWORD_22=39;
    public static final int KEYWORD_23=26;
    public static final int RULE_GREATER=61;
    public static final int RULE_PLUS=53;
    public static final int KEYWORD_1=52;
    public static final int KEYWORD_30=25;
    public static final int RULE_PUNC_SEMI_COLON=67;
    public static final int KEYWORD_34=17;
    public static final int KEYWORD_5=51;
    public static final int KEYWORD_33=22;
    public static final int KEYWORD_4=50;
    public static final int RULE_EQUAL=63;
    public static final int KEYWORD_32=21;
    public static final int KEYWORD_3=49;
    public static final int KEYWORD_31=20;
    public static final int KEYWORD_2=48;
    public static final int KEYWORD_38=16;
    public static final int KEYWORD_37=15;
    public static final int RULE_SL_COMMENT=73;
    public static final int KEYWORD_36=19;
    public static final int KEYWORD_35=18;
    public static final int KEYWORD_39=14;
    public static final int RULE_MINUS=57;
    public static final int RULE_STRING=72;
    public static final int RULE_PUNC_OPEN_BRACE=65;
    public static final int RULE_NUMERIC=75;
    public static final int RULE_STAR=55;
    public static final int KEYWORD_41=12;
    public static final int KEYWORD_40=13;
    public static final int RULE_LESS=62;
    public static final int KEYWORD_43=10;
    public static final int KEYWORD_42=9;
    public static final int RULE_SLASH=56;
    public static final int KEYWORD_45=8;
    public static final int KEYWORD_44=11;
    public static final int KEYWORD_47=5;
    public static final int RULE_WS=74;
    public static final int KEYWORD_46=7;
    public static final int KEYWORD_49=4;
    public static final int KEYWORD_48=6;

    // delegates
    // delegators


        public InternalREALParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalREALParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalREALParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g"; }




    	private REALGrammarAccess grammarAccess;
    	 	
    	public InternalREALParser(TokenStream input, REALGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected REALGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:70:1: ruleModel returns [EObject current=null] : ( (lv_theorems_0_0= ruleTheorem ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_theorems_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:73:28: ( ( (lv_theorems_0_0= ruleTheorem ) )* )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:74:1: ( (lv_theorems_0_0= ruleTheorem ) )*
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:74:1: ( (lv_theorems_0_0= ruleTheorem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:75:1: (lv_theorems_0_0= ruleTheorem )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:75:1: (lv_theorems_0_0= ruleTheorem )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:76:3: lv_theorems_0_0= ruleTheorem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTheoremsTheoremParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTheorem_in_ruleModel122);
            	    lv_theorems_0_0=ruleTheorem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"theorems",
            	            		lv_theorems_0_0, 
            	            		"Theorem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTheorem"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:100:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:101:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:102:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem157);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem167); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:109:1: ruleTheorem returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) ) ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )* ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )? ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) ) otherlv_7= KEYWORD_12 ( (lv_endName_8_0= RULE_ID ) )? this_PUNC_SEMI_COLON_9= RULE_PUNC_SEMI_COLON ) ;
    public final EObject ruleTheorem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_7=null;
        Token lv_endName_8_0=null;
        Token this_PUNC_SEMI_COLON_9=null;
        EObject lv_rangeDefinition_2_0 = null;

        EObject lv_setDeclarations_3_0 = null;

        EObject lv_requiredDefinition_4_0 = null;

        EObject lv_verificationExpression_5_0 = null;

        EObject lv_evaluationExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:112:28: ( (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) ) ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )* ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )? ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) ) otherlv_7= KEYWORD_12 ( (lv_endName_8_0= RULE_ID ) )? this_PUNC_SEMI_COLON_9= RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:113:1: (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) ) ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )* ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )? ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) ) otherlv_7= KEYWORD_12 ( (lv_endName_8_0= RULE_ID ) )? this_PUNC_SEMI_COLON_9= RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:113:1: (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) ) ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )* ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )? ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) ) otherlv_7= KEYWORD_12 ( (lv_endName_8_0= RULE_ID ) )? this_PUNC_SEMI_COLON_9= RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:114:2: otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) ) ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )* ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )? ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) ) otherlv_7= KEYWORD_12 ( (lv_endName_8_0= RULE_ID ) )? this_PUNC_SEMI_COLON_9= RULE_PUNC_SEMI_COLON
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleTheorem205); 

                	newLeafNode(otherlv_0, grammarAccess.getTheoremAccess().getTheoremKeyword_0());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:118:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:119:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:119:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:120:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTheorem221); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTheoremRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:136:2: ( (lv_rangeDefinition_2_0= ruleRangeDefinition ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:137:1: (lv_rangeDefinition_2_0= ruleRangeDefinition )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:137:1: (lv_rangeDefinition_2_0= ruleRangeDefinition )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:138:3: lv_rangeDefinition_2_0= ruleRangeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getRangeDefinitionRangeDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRangeDefinition_in_ruleTheorem247);
            lv_rangeDefinition_2_0=ruleRangeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTheoremRule());
            	        }
                   		set(
                   			current, 
                   			"rangeDefinition",
                    		lv_rangeDefinition_2_0, 
                    		"RangeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:154:2: ( (lv_setDeclarations_3_0= ruleSetDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:155:1: (lv_setDeclarations_3_0= ruleSetDeclaration )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:155:1: (lv_setDeclarations_3_0= ruleSetDeclaration )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:156:3: lv_setDeclarations_3_0= ruleSetDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTheoremAccess().getSetDeclarationsSetDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSetDeclaration_in_ruleTheorem268);
            	    lv_setDeclarations_3_0=ruleSetDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTheoremRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"setDeclarations",
            	            		lv_setDeclarations_3_0, 
            	            		"SetDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:172:3: ( (lv_requiredDefinition_4_0= ruleRequiredDefinition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_36) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:173:1: (lv_requiredDefinition_4_0= ruleRequiredDefinition )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:173:1: (lv_requiredDefinition_4_0= ruleRequiredDefinition )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:174:3: lv_requiredDefinition_4_0= ruleRequiredDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getTheoremAccess().getRequiredDefinitionRequiredDefinitionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredDefinition_in_ruleTheorem290);
                    lv_requiredDefinition_4_0=ruleRequiredDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTheoremRule());
                    	        }
                           		set(
                           			current, 
                           			"requiredDefinition",
                            		lv_requiredDefinition_4_0, 
                            		"RequiredDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:190:3: ( ( (lv_verificationExpression_5_0= ruleVerificationExpression ) ) | ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_26) ) {
                alt4=1;
            }
            else if ( (LA4_0==KEYWORD_30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:190:4: ( (lv_verificationExpression_5_0= ruleVerificationExpression ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:190:4: ( (lv_verificationExpression_5_0= ruleVerificationExpression ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:191:1: (lv_verificationExpression_5_0= ruleVerificationExpression )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:191:1: (lv_verificationExpression_5_0= ruleVerificationExpression )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:192:3: lv_verificationExpression_5_0= ruleVerificationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTheoremAccess().getVerificationExpressionVerificationExpressionParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationExpression_in_ruleTheorem313);
                    lv_verificationExpression_5_0=ruleVerificationExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTheoremRule());
                    	        }
                           		set(
                           			current, 
                           			"verificationExpression",
                            		lv_verificationExpression_5_0, 
                            		"VerificationExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:209:6: ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:209:6: ( (lv_evaluationExpression_6_0= ruleEvaluationExpression ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:210:1: (lv_evaluationExpression_6_0= ruleEvaluationExpression )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:210:1: (lv_evaluationExpression_6_0= ruleEvaluationExpression )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:211:3: lv_evaluationExpression_6_0= ruleEvaluationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTheoremAccess().getEvaluationExpressionEvaluationExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvaluationExpression_in_ruleTheorem340);
                    lv_evaluationExpression_6_0=ruleEvaluationExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTheoremRule());
                    	        }
                           		set(
                           			current, 
                           			"evaluationExpression",
                            		lv_evaluationExpression_6_0, 
                            		"EvaluationExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleTheorem354); 

                	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getEndKeyword_6());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:232:1: ( (lv_endName_8_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:233:1: (lv_endName_8_0= RULE_ID )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:233:1: (lv_endName_8_0= RULE_ID )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:234:3: lv_endName_8_0= RULE_ID
                    {
                    lv_endName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTheorem370); 

                    			newLeafNode(lv_endName_8_0, grammarAccess.getTheoremAccess().getEndNameIDTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endName",
                            		lv_endName_8_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            this_PUNC_SEMI_COLON_9=(Token)match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleTheorem387); 
             
                newLeafNode(this_PUNC_SEMI_COLON_9, grammarAccess.getTheoremAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleRangeDefinition"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:262:1: entryRuleRangeDefinition returns [EObject current=null] : iv_ruleRangeDefinition= ruleRangeDefinition EOF ;
    public final EObject entryRuleRangeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeDefinition = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:263:2: (iv_ruleRangeDefinition= ruleRangeDefinition EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:264:2: iv_ruleRangeDefinition= ruleRangeDefinition EOF
            {
             newCompositeNode(grammarAccess.getRangeDefinitionRule()); 
            pushFollow(FOLLOW_ruleRangeDefinition_in_entryRuleRangeDefinition421);
            iv_ruleRangeDefinition=ruleRangeDefinition();

            state._fsp--;

             current =iv_ruleRangeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeDefinition431); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeDefinition"


    // $ANTLR start "ruleRangeDefinition"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:271:1: ruleRangeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_32 ( (lv_element_1_0= RULE_ID ) ) otherlv_2= KEYWORD_4 ( (lv_set_3_0= ruleSetExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleRangeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_element_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_set_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:274:28: ( (otherlv_0= KEYWORD_32 ( (lv_element_1_0= RULE_ID ) ) otherlv_2= KEYWORD_4 ( (lv_set_3_0= ruleSetExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:275:1: (otherlv_0= KEYWORD_32 ( (lv_element_1_0= RULE_ID ) ) otherlv_2= KEYWORD_4 ( (lv_set_3_0= ruleSetExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:275:1: (otherlv_0= KEYWORD_32 ( (lv_element_1_0= RULE_ID ) ) otherlv_2= KEYWORD_4 ( (lv_set_3_0= ruleSetExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:276:2: otherlv_0= KEYWORD_32 ( (lv_element_1_0= RULE_ID ) ) otherlv_2= KEYWORD_4 ( (lv_set_3_0= ruleSetExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleRangeDefinition469); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeDefinitionAccess().getForeachKeyword_0());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:280:1: ( (lv_element_1_0= RULE_ID ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:281:1: (lv_element_1_0= RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:281:1: (lv_element_1_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:282:3: lv_element_1_0= RULE_ID
            {
            lv_element_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRangeDefinition485); 

            			newLeafNode(lv_element_1_0, grammarAccess.getRangeDefinitionAccess().getElementIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"element",
                    		lv_element_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleRangeDefinition503); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeDefinitionAccess().getInKeyword_2());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:303:1: ( (lv_set_3_0= ruleSetExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:304:1: (lv_set_3_0= ruleSetExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:304:1: (lv_set_3_0= ruleSetExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:305:3: lv_set_3_0= ruleSetExpression
            {
             
            	        newCompositeNode(grammarAccess.getRangeDefinitionAccess().getSetSetExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSetExpression_in_ruleRangeDefinition523);
            lv_set_3_0=ruleSetExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_3_0, 
                    		"SetExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleRangeDefinition536); 

                	newLeafNode(otherlv_4, grammarAccess.getRangeDefinitionAccess().getDoKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeDefinition"


    // $ANTLR start "entryRuleSetDeclaration"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:334:1: entryRuleSetDeclaration returns [EObject current=null] : iv_ruleSetDeclaration= ruleSetDeclaration EOF ;
    public final EObject entryRuleSetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDeclaration = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:335:2: (iv_ruleSetDeclaration= ruleSetDeclaration EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:336:2: iv_ruleSetDeclaration= ruleSetDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSetDeclarationRule()); 
            pushFollow(FOLLOW_ruleSetDeclaration_in_entryRuleSetDeclaration570);
            iv_ruleSetDeclaration=ruleSetDeclaration();

            state._fsp--;

             current =iv_ruleSetDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetDeclaration580); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetDeclaration"


    // $ANTLR start "ruleSetDeclaration"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:343:1: ruleSetDeclaration returns [EObject current=null] : ( ( (lv_set_0_0= RULE_ID ) ) (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )? this_AFFECTATION_OPERATOR_4= RULE_AFFECTATION_OPERATOR this_PUNC_OPEN_BRACE_5= RULE_PUNC_OPEN_BRACE ( (lv_elementBinding_6_0= ruleElementBinding ) ) otherlv_7= KEYWORD_1 ( (lv_expr_8_0= ruleSelectionExpression ) ) this_PUNC_CLOSE_BRACE_9= RULE_PUNC_CLOSE_BRACE this_PUNC_SEMI_COLON_10= RULE_PUNC_SEMI_COLON ) ;
    public final EObject ruleSetDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_set_0_0=null;
        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token lv_paramIdentifier_2_0=null;
        Token this_PUNC_CLOSE_PARENTHESIS_3=null;
        Token this_AFFECTATION_OPERATOR_4=null;
        Token this_PUNC_OPEN_BRACE_5=null;
        Token otherlv_7=null;
        Token this_PUNC_CLOSE_BRACE_9=null;
        Token this_PUNC_SEMI_COLON_10=null;
        EObject lv_elementBinding_6_0 = null;

        EObject lv_expr_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:346:28: ( ( ( (lv_set_0_0= RULE_ID ) ) (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )? this_AFFECTATION_OPERATOR_4= RULE_AFFECTATION_OPERATOR this_PUNC_OPEN_BRACE_5= RULE_PUNC_OPEN_BRACE ( (lv_elementBinding_6_0= ruleElementBinding ) ) otherlv_7= KEYWORD_1 ( (lv_expr_8_0= ruleSelectionExpression ) ) this_PUNC_CLOSE_BRACE_9= RULE_PUNC_CLOSE_BRACE this_PUNC_SEMI_COLON_10= RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:347:1: ( ( (lv_set_0_0= RULE_ID ) ) (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )? this_AFFECTATION_OPERATOR_4= RULE_AFFECTATION_OPERATOR this_PUNC_OPEN_BRACE_5= RULE_PUNC_OPEN_BRACE ( (lv_elementBinding_6_0= ruleElementBinding ) ) otherlv_7= KEYWORD_1 ( (lv_expr_8_0= ruleSelectionExpression ) ) this_PUNC_CLOSE_BRACE_9= RULE_PUNC_CLOSE_BRACE this_PUNC_SEMI_COLON_10= RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:347:1: ( ( (lv_set_0_0= RULE_ID ) ) (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )? this_AFFECTATION_OPERATOR_4= RULE_AFFECTATION_OPERATOR this_PUNC_OPEN_BRACE_5= RULE_PUNC_OPEN_BRACE ( (lv_elementBinding_6_0= ruleElementBinding ) ) otherlv_7= KEYWORD_1 ( (lv_expr_8_0= ruleSelectionExpression ) ) this_PUNC_CLOSE_BRACE_9= RULE_PUNC_CLOSE_BRACE this_PUNC_SEMI_COLON_10= RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:347:2: ( (lv_set_0_0= RULE_ID ) ) (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )? this_AFFECTATION_OPERATOR_4= RULE_AFFECTATION_OPERATOR this_PUNC_OPEN_BRACE_5= RULE_PUNC_OPEN_BRACE ( (lv_elementBinding_6_0= ruleElementBinding ) ) otherlv_7= KEYWORD_1 ( (lv_expr_8_0= ruleSelectionExpression ) ) this_PUNC_CLOSE_BRACE_9= RULE_PUNC_CLOSE_BRACE this_PUNC_SEMI_COLON_10= RULE_PUNC_SEMI_COLON
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:347:2: ( (lv_set_0_0= RULE_ID ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:348:1: (lv_set_0_0= RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:348:1: (lv_set_0_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:349:3: lv_set_0_0= RULE_ID
            {
            lv_set_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetDeclaration622); 

            			newLeafNode(lv_set_0_0, grammarAccess.getSetDeclarationAccess().getSetIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"set",
                    		lv_set_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:365:2: (this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_PUNC_OPEN_PARENTHESIS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:365:3: this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_paramIdentifier_2_0= RULE_ID ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS
                    {
                    this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleSetDeclaration639); 
                     
                        newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_0()); 
                        
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:369:1: ( (lv_paramIdentifier_2_0= RULE_ID ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:370:1: (lv_paramIdentifier_2_0= RULE_ID )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:370:1: (lv_paramIdentifier_2_0= RULE_ID )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:371:3: lv_paramIdentifier_2_0= RULE_ID
                    {
                    lv_paramIdentifier_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetDeclaration655); 

                    			newLeafNode(lv_paramIdentifier_2_0, grammarAccess.getSetDeclarationAccess().getParamIdentifierIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"paramIdentifier",
                            		lv_paramIdentifier_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_PUNC_CLOSE_PARENTHESIS_3=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleSetDeclaration671); 
                     
                        newLeafNode(this_PUNC_CLOSE_PARENTHESIS_3, grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_2()); 
                        

                    }
                    break;

            }

            this_AFFECTATION_OPERATOR_4=(Token)match(input,RULE_AFFECTATION_OPERATOR,FOLLOW_RULE_AFFECTATION_OPERATOR_in_ruleSetDeclaration683); 
             
                newLeafNode(this_AFFECTATION_OPERATOR_4, grammarAccess.getSetDeclarationAccess().getAFFECTATION_OPERATORTerminalRuleCall_2()); 
                
            this_PUNC_OPEN_BRACE_5=(Token)match(input,RULE_PUNC_OPEN_BRACE,FOLLOW_RULE_PUNC_OPEN_BRACE_in_ruleSetDeclaration693); 
             
                newLeafNode(this_PUNC_OPEN_BRACE_5, grammarAccess.getSetDeclarationAccess().getPUNC_OPEN_BRACETerminalRuleCall_3()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:399:1: ( (lv_elementBinding_6_0= ruleElementBinding ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:400:1: (lv_elementBinding_6_0= ruleElementBinding )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:400:1: (lv_elementBinding_6_0= ruleElementBinding )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:401:3: lv_elementBinding_6_0= ruleElementBinding
            {
             
            	        newCompositeNode(grammarAccess.getSetDeclarationAccess().getElementBindingElementBindingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleElementBinding_in_ruleSetDeclaration713);
            lv_elementBinding_6_0=ruleElementBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"elementBinding",
                    		lv_elementBinding_6_0, 
                    		"ElementBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSetDeclaration726); 

                	newLeafNode(otherlv_7, grammarAccess.getSetDeclarationAccess().getVerticalLineKeyword_5());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:422:1: ( (lv_expr_8_0= ruleSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:423:1: (lv_expr_8_0= ruleSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:423:1: (lv_expr_8_0= ruleSelectionExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:424:3: lv_expr_8_0= ruleSelectionExpression
            {
             
            	        newCompositeNode(grammarAccess.getSetDeclarationAccess().getExprSelectionExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectionExpression_in_ruleSetDeclaration746);
            lv_expr_8_0=ruleSelectionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_8_0, 
                    		"SelectionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_CLOSE_BRACE_9=(Token)match(input,RULE_PUNC_CLOSE_BRACE,FOLLOW_RULE_PUNC_CLOSE_BRACE_in_ruleSetDeclaration757); 
             
                newLeafNode(this_PUNC_CLOSE_BRACE_9, grammarAccess.getSetDeclarationAccess().getPUNC_CLOSE_BRACETerminalRuleCall_7()); 
                
            this_PUNC_SEMI_COLON_10=(Token)match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleSetDeclaration767); 
             
                newLeafNode(this_PUNC_SEMI_COLON_10, grammarAccess.getSetDeclarationAccess().getPUNC_SEMI_COLONTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetDeclaration"


    // $ANTLR start "entryRuleElementBinding"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:456:1: entryRuleElementBinding returns [EObject current=null] : iv_ruleElementBinding= ruleElementBinding EOF ;
    public final EObject entryRuleElementBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementBinding = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:457:2: (iv_ruleElementBinding= ruleElementBinding EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:458:2: iv_ruleElementBinding= ruleElementBinding EOF
            {
             newCompositeNode(grammarAccess.getElementBindingRule()); 
            pushFollow(FOLLOW_ruleElementBinding_in_entryRuleElementBinding801);
            iv_ruleElementBinding=ruleElementBinding();

            state._fsp--;

             current =iv_ruleElementBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementBinding811); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementBinding"


    // $ANTLR start "ruleElementBinding"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:465:1: ruleElementBinding returns [EObject current=null] : ( ( (lv_element_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_set_2_0= ruleSetExpression ) ) ) ;
    public final EObject ruleElementBinding() throws RecognitionException {
        EObject current = null;

        Token lv_element_0_0=null;
        Token otherlv_1=null;
        EObject lv_set_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:468:28: ( ( ( (lv_element_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_set_2_0= ruleSetExpression ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:469:1: ( ( (lv_element_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_set_2_0= ruleSetExpression ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:469:1: ( ( (lv_element_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_set_2_0= ruleSetExpression ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:469:2: ( (lv_element_0_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_set_2_0= ruleSetExpression ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:469:2: ( (lv_element_0_0= RULE_ID ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:470:1: (lv_element_0_0= RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:470:1: (lv_element_0_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:471:3: lv_element_0_0= RULE_ID
            {
            lv_element_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementBinding853); 

            			newLeafNode(lv_element_0_0, grammarAccess.getElementBindingAccess().getElementIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"element",
                    		lv_element_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleElementBinding871); 

                	newLeafNode(otherlv_1, grammarAccess.getElementBindingAccess().getInKeyword_1());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:492:1: ( (lv_set_2_0= ruleSetExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:493:1: (lv_set_2_0= ruleSetExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:493:1: (lv_set_2_0= ruleSetExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:494:3: lv_set_2_0= ruleSetExpression
            {
             
            	        newCompositeNode(grammarAccess.getElementBindingAccess().getSetSetExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSetExpression_in_ruleElementBinding891);
            lv_set_2_0=ruleSetExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementBindingRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_2_0, 
                    		"SetExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementBinding"


    // $ANTLR start "entryRuleSelectionExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:518:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:519:2: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:520:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression926);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;

             current =iv_ruleSelectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionExpression936); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:527:1: ruleSelectionExpression returns [EObject current=null] : ( ( (lv_e1_0_0= ruleTerminalSelectionExpression ) ) ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )* ) ;
    public final EObject ruleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_e1_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_e2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:530:28: ( ( ( (lv_e1_0_0= ruleTerminalSelectionExpression ) ) ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )* ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:531:1: ( ( (lv_e1_0_0= ruleTerminalSelectionExpression ) ) ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )* )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:531:1: ( ( (lv_e1_0_0= ruleTerminalSelectionExpression ) ) ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )* )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:531:2: ( (lv_e1_0_0= ruleTerminalSelectionExpression ) ) ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )*
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:531:2: ( (lv_e1_0_0= ruleTerminalSelectionExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:532:1: (lv_e1_0_0= ruleTerminalSelectionExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:532:1: (lv_e1_0_0= ruleTerminalSelectionExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:533:3: lv_e1_0_0= ruleTerminalSelectionExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getE1TerminalSelectionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_ruleSelectionExpression982);
            lv_e1_0_0=ruleTerminalSelectionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"e1",
                    		lv_e1_0_0, 
                    		"TerminalSelectionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:549:2: ( ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_11||LA7_0==KEYWORD_13||LA7_0==KEYWORD_5) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:549:3: ( (lv_op_1_0= ruleBooleanOperator ) ) ( (lv_e2_2_0= ruleTerminalSelectionExpression ) )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:549:3: ( (lv_op_1_0= ruleBooleanOperator ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:550:1: (lv_op_1_0= ruleBooleanOperator )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:550:1: (lv_op_1_0= ruleBooleanOperator )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:551:3: lv_op_1_0= ruleBooleanOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanOperator_in_ruleSelectionExpression1004);
            	    lv_op_1_0=ruleBooleanOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"op",
            	            		lv_op_1_0, 
            	            		"BooleanOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:567:2: ( (lv_e2_2_0= ruleTerminalSelectionExpression ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:568:1: (lv_e2_2_0= ruleTerminalSelectionExpression )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:568:1: (lv_e2_2_0= ruleTerminalSelectionExpression )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:569:3: lv_e2_2_0= ruleTerminalSelectionExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionExpressionAccess().getE2TerminalSelectionExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_ruleSelectionExpression1025);
            	    lv_e2_2_0=ruleTerminalSelectionExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"e2",
            	            		lv_e2_2_0, 
            	            		"TerminalSelectionExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalSelectionExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:593:1: entryRuleTerminalSelectionExpression returns [EObject current=null] : iv_ruleTerminalSelectionExpression= ruleTerminalSelectionExpression EOF ;
    public final EObject entryRuleTerminalSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalSelectionExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:594:2: (iv_ruleTerminalSelectionExpression= ruleTerminalSelectionExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:595:2: iv_ruleTerminalSelectionExpression= ruleTerminalSelectionExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalSelectionExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalSelectionExpression_in_entryRuleTerminalSelectionExpression1062);
            iv_ruleTerminalSelectionExpression=ruleTerminalSelectionExpression();

            state._fsp--;

             current =iv_ruleTerminalSelectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalSelectionExpression1072); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalSelectionExpression"


    // $ANTLR start "ruleTerminalSelectionExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:602:1: ruleTerminalSelectionExpression returns [EObject current=null] : ( ( (lv_e_0_0= ruleGenericExpression ) ) | ( (lv_r_1_0= ruleSelectionRelation ) ) ) ;
    public final EObject ruleTerminalSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_r_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:605:28: ( ( ( (lv_e_0_0= ruleGenericExpression ) ) | ( (lv_r_1_0= ruleSelectionRelation ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:606:1: ( ( (lv_e_0_0= ruleGenericExpression ) ) | ( (lv_r_1_0= ruleSelectionRelation ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:606:1: ( ( (lv_e_0_0= ruleGenericExpression ) ) | ( (lv_r_1_0= ruleSelectionRelation ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_47||LA8_0==KEYWORD_44||LA8_0==KEYWORD_37||(LA8_0>=KEYWORD_34 && LA8_0<=KEYWORD_35)||LA8_0==KEYWORD_31||(LA8_0>=KEYWORD_28 && LA8_0<=KEYWORD_29)||(LA8_0>=KEYWORD_23 && LA8_0<=KEYWORD_25)||(LA8_0>=KEYWORD_27 && LA8_0<=KEYWORD_16)||LA8_0==KEYWORD_19||(LA8_0>=KEYWORD_22 && LA8_0<=KEYWORD_10)||LA8_0==KEYWORD_13||LA8_0==KEYWORD_3||LA8_0==RULE_PUNC_OPEN_PARENTHESIS||LA8_0==RULE_STRING||LA8_0==RULE_NUMERIC) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_49||(LA8_0>=KEYWORD_48 && LA8_0<=KEYWORD_43)||(LA8_0>=KEYWORD_41 && LA8_0<=KEYWORD_39)||LA8_0==KEYWORD_38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:606:2: ( (lv_e_0_0= ruleGenericExpression ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:606:2: ( (lv_e_0_0= ruleGenericExpression ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:607:1: (lv_e_0_0= ruleGenericExpression )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:607:1: (lv_e_0_0= ruleGenericExpression )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:608:3: lv_e_0_0= ruleGenericExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalSelectionExpressionAccess().getEGenericExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericExpression_in_ruleTerminalSelectionExpression1118);
                    lv_e_0_0=ruleGenericExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalSelectionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"e",
                            		lv_e_0_0, 
                            		"GenericExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:625:6: ( (lv_r_1_0= ruleSelectionRelation ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:625:6: ( (lv_r_1_0= ruleSelectionRelation ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:626:1: (lv_r_1_0= ruleSelectionRelation )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:626:1: (lv_r_1_0= ruleSelectionRelation )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:627:3: lv_r_1_0= ruleSelectionRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalSelectionExpressionAccess().getRSelectionRelationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectionRelation_in_ruleTerminalSelectionExpression1145);
                    lv_r_1_0=ruleSelectionRelation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalSelectionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"r",
                            		lv_r_1_0, 
                            		"SelectionRelation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalSelectionExpression"


    // $ANTLR start "entryRuleSelectionRelation"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:651:1: entryRuleSelectionRelation returns [EObject current=null] : iv_ruleSelectionRelation= ruleSelectionRelation EOF ;
    public final EObject entryRuleSelectionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionRelation = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:652:2: (iv_ruleSelectionRelation= ruleSelectionRelation EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:653:2: iv_ruleSelectionRelation= ruleSelectionRelation EOF
            {
             newCompositeNode(grammarAccess.getSelectionRelationRule()); 
            pushFollow(FOLLOW_ruleSelectionRelation_in_entryRuleSelectionRelation1180);
            iv_ruleSelectionRelation=ruleSelectionRelation();

            state._fsp--;

             current =iv_ruleSelectionRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelation1190); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionRelation"


    // $ANTLR start "ruleSelectionRelation"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:660:1: ruleSelectionRelation returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )? this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final EObject ruleSelectionRelation() throws RecognitionException {
        EObject current = null;

        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token this_PUNC_COMMA_3=null;
        Token this_PUNC_CLOSE_PARENTHESIS_5=null;
        AntlrDatatypeRuleToken lv_identifier_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:663:28: ( ( ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )? this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:664:1: ( ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )? this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:664:1: ( ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )? this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:664:2: ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )? this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:664:2: ( (lv_identifier_0_0= ruleSelectionRelationIdentifier ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:665:1: (lv_identifier_0_0= ruleSelectionRelationIdentifier )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:665:1: (lv_identifier_0_0= ruleSelectionRelationIdentifier )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:666:3: lv_identifier_0_0= ruleSelectionRelationIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getSelectionRelationAccess().getIdentifierSelectionRelationIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectionRelationIdentifier_in_ruleSelectionRelation1236);
            lv_identifier_0_0=ruleSelectionRelationIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionRelationRule());
            	        }
                   		set(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"SelectionRelationIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleSelectionRelation1247); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getSelectionRelationAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:686:1: ( ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_27||LA10_0==KEYWORD_22||(LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==RULE_NUMERIC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:686:2: ( (lv_arguments_2_0= ruleSelectionRelationParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )*
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:686:2: ( (lv_arguments_2_0= ruleSelectionRelationParameter ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:687:1: (lv_arguments_2_0= ruleSelectionRelationParameter )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:687:1: (lv_arguments_2_0= ruleSelectionRelationParameter )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:688:3: lv_arguments_2_0= ruleSelectionRelationParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectionRelationParameter_in_ruleSelectionRelation1268);
                    lv_arguments_2_0=ruleSelectionRelationParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectionRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"SelectionRelationParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:704:2: (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_PUNC_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:704:3: this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleSelectionRelationParameter ) )
                    	    {
                    	    this_PUNC_COMMA_3=(Token)match(input,RULE_PUNC_COMMA,FOLLOW_RULE_PUNC_COMMA_in_ruleSelectionRelation1280); 
                    	     
                    	        newLeafNode(this_PUNC_COMMA_3, grammarAccess.getSelectionRelationAccess().getPUNC_COMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:708:1: ( (lv_arguments_4_0= ruleSelectionRelationParameter ) )
                    	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:709:1: (lv_arguments_4_0= ruleSelectionRelationParameter )
                    	    {
                    	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:709:1: (lv_arguments_4_0= ruleSelectionRelationParameter )
                    	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:710:3: lv_arguments_4_0= ruleSelectionRelationParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionRelationAccess().getArgumentsSelectionRelationParameterParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSelectionRelationParameter_in_ruleSelectionRelation1300);
                    	    lv_arguments_4_0=ruleSelectionRelationParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectionRelationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"SelectionRelationParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            this_PUNC_CLOSE_PARENTHESIS_5=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleSelectionRelation1315); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_5, grammarAccess.getSelectionRelationAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionRelation"


    // $ANTLR start "entryRuleSelectionRelationIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:738:1: entryRuleSelectionRelationIdentifier returns [String current=null] : iv_ruleSelectionRelationIdentifier= ruleSelectionRelationIdentifier EOF ;
    public final String entryRuleSelectionRelationIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectionRelationIdentifier = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:739:1: (iv_ruleSelectionRelationIdentifier= ruleSelectionRelationIdentifier EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:740:2: iv_ruleSelectionRelationIdentifier= ruleSelectionRelationIdentifier EOF
            {
             newCompositeNode(grammarAccess.getSelectionRelationIdentifierRule()); 
            pushFollow(FOLLOW_ruleSelectionRelationIdentifier_in_entryRuleSelectionRelationIdentifier1350);
            iv_ruleSelectionRelationIdentifier=ruleSelectionRelationIdentifier();

            state._fsp--;

             current =iv_ruleSelectionRelationIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelationIdentifier1361); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionRelationIdentifier"


    // $ANTLR start "ruleSelectionRelationIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:747:1: ruleSelectionRelationIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_48 | kw= KEYWORD_39 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_49 | kw= KEYWORD_40 | kw= KEYWORD_38 | kw= KEYWORD_41 | kw= KEYWORD_45 | kw= KEYWORD_42 ) ;
    public final AntlrDatatypeRuleToken ruleSelectionRelationIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:751:6: ( (kw= KEYWORD_48 | kw= KEYWORD_39 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_49 | kw= KEYWORD_40 | kw= KEYWORD_38 | kw= KEYWORD_41 | kw= KEYWORD_45 | kw= KEYWORD_42 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:752:1: (kw= KEYWORD_48 | kw= KEYWORD_39 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_49 | kw= KEYWORD_40 | kw= KEYWORD_38 | kw= KEYWORD_41 | kw= KEYWORD_45 | kw= KEYWORD_42 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:752:1: (kw= KEYWORD_48 | kw= KEYWORD_39 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_49 | kw= KEYWORD_40 | kw= KEYWORD_38 | kw= KEYWORD_41 | kw= KEYWORD_45 | kw= KEYWORD_42 )
            int alt11=10;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
                {
                alt11=1;
                }
                break;
            case KEYWORD_39:
                {
                alt11=2;
                }
                break;
            case KEYWORD_46:
                {
                alt11=3;
                }
                break;
            case KEYWORD_43:
                {
                alt11=4;
                }
                break;
            case KEYWORD_49:
                {
                alt11=5;
                }
                break;
            case KEYWORD_40:
                {
                alt11=6;
                }
                break;
            case KEYWORD_38:
                {
                alt11=7;
                }
                break;
            case KEYWORD_41:
                {
                alt11=8;
                }
                break;
            case KEYWORD_45:
                {
                alt11=9;
                }
                break;
            case KEYWORD_42:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:753:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleSelectionRelationIdentifier1399); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Subcomponent_OfKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:760:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleSelectionRelationIdentifier1418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Bound_ToKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:767:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleSelectionRelationIdentifier1437); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Provided_ClassKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:774:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleSelectionRelationIdentifier1456); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connected_ToKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:781:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleSelectionRelationIdentifier1475); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getCompare_Property_ValueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:788:2: kw= KEYWORD_40
                    {
                    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleSelectionRelationIdentifier1494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Called_ByKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:795:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSelectionRelationIdentifier1513); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_CallingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:802:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleSelectionRelationIdentifier1532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessed_ByKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:809:2: kw= KEYWORD_45
                    {
                    kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleSelectionRelationIdentifier1551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Connecting_ToKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:816:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleSelectionRelationIdentifier1570); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectionRelationIdentifierAccess().getIs_Accessing_ToKeyword_9()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionRelationIdentifier"


    // $ANTLR start "entryRuleSelectionRelationParameter"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:829:1: entryRuleSelectionRelationParameter returns [EObject current=null] : iv_ruleSelectionRelationParameter= ruleSelectionRelationParameter EOF ;
    public final EObject entryRuleSelectionRelationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionRelationParameter = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:830:2: (iv_ruleSelectionRelationParameter= ruleSelectionRelationParameter EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:831:2: iv_ruleSelectionRelationParameter= ruleSelectionRelationParameter EOF
            {
             newCompositeNode(grammarAccess.getSelectionRelationParameterRule()); 
            pushFollow(FOLLOW_ruleSelectionRelationParameter_in_entryRuleSelectionRelationParameter1609);
            iv_ruleSelectionRelationParameter=ruleSelectionRelationParameter();

            state._fsp--;

             current =iv_ruleSelectionRelationParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionRelationParameter1619); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionRelationParameter"


    // $ANTLR start "ruleSelectionRelationParameter"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:838:1: ruleSelectionRelationParameter returns [EObject current=null] : ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSelectionRelationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_l_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:841:28: ( ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:842:1: ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:842:1: ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_27||LA12_0==KEYWORD_22||LA12_0==RULE_STRING||LA12_0==RULE_NUMERIC) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:842:2: ( (lv_l_0_0= ruleLiteral ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:842:2: ( (lv_l_0_0= ruleLiteral ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:843:1: (lv_l_0_0= ruleLiteral )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:843:1: (lv_l_0_0= ruleLiteral )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:844:3: lv_l_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionRelationParameterAccess().getLLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleSelectionRelationParameter1665);
                    lv_l_0_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectionRelationParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"l",
                            		lv_l_0_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:861:6: ( (lv_identifier_1_0= RULE_ID ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:861:6: ( (lv_identifier_1_0= RULE_ID ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:862:1: (lv_identifier_1_0= RULE_ID )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:862:1: (lv_identifier_1_0= RULE_ID )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:863:3: lv_identifier_1_0= RULE_ID
                    {
                    lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionRelationParameter1688); 

                    			newLeafNode(lv_identifier_1_0, grammarAccess.getSelectionRelationParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectionRelationParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"identifier",
                            		lv_identifier_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionRelationParameter"


    // $ANTLR start "entryRuleRequiredDefinition"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:887:1: entryRuleRequiredDefinition returns [EObject current=null] : iv_ruleRequiredDefinition= ruleRequiredDefinition EOF ;
    public final EObject entryRuleRequiredDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDefinition = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:888:2: (iv_ruleRequiredDefinition= ruleRequiredDefinition EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:889:2: iv_ruleRequiredDefinition= ruleRequiredDefinition EOF
            {
             newCompositeNode(grammarAccess.getRequiredDefinitionRule()); 
            pushFollow(FOLLOW_ruleRequiredDefinition_in_entryRuleRequiredDefinition1728);
            iv_ruleRequiredDefinition=ruleRequiredDefinition();

            state._fsp--;

             current =iv_ruleRequiredDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredDefinition1738); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredDefinition"


    // $ANTLR start "ruleRequiredDefinition"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:896:1: ruleRequiredDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_36 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_theorems_2_0= RULE_ID ) ) (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_6= RULE_PUNC_SEMI_COLON ) ;
    public final EObject ruleRequiredDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token lv_theorems_2_0=null;
        Token otherlv_3=null;
        Token lv_theorems_4_0=null;
        Token this_PUNC_CLOSE_PARENTHESIS_5=null;
        Token this_PUNC_SEMI_COLON_6=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:899:28: ( (otherlv_0= KEYWORD_36 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_theorems_2_0= RULE_ID ) ) (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_6= RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:900:1: (otherlv_0= KEYWORD_36 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_theorems_2_0= RULE_ID ) ) (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_6= RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:900:1: (otherlv_0= KEYWORD_36 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_theorems_2_0= RULE_ID ) ) (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_6= RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:901:2: otherlv_0= KEYWORD_36 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_theorems_2_0= RULE_ID ) ) (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_6= RULE_PUNC_SEMI_COLON
            {
            otherlv_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleRequiredDefinition1776); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredDefinitionAccess().getRequiresKeyword_0());
                
            this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleRequiredDefinition1786); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getRequiredDefinitionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:909:1: ( (lv_theorems_2_0= RULE_ID ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:910:1: (lv_theorems_2_0= RULE_ID )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:910:1: (lv_theorems_2_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:911:3: lv_theorems_2_0= RULE_ID
            {
            lv_theorems_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredDefinition1802); 

            			newLeafNode(lv_theorems_2_0, grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredDefinitionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"theorems",
                    		lv_theorems_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:927:2: (otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:928:2: otherlv_3= KEYWORD_11 ( (lv_theorems_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleRequiredDefinition1821); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRequiredDefinitionAccess().getAndKeyword_3_0());
            	        
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:932:1: ( (lv_theorems_4_0= RULE_ID ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:933:1: (lv_theorems_4_0= RULE_ID )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:933:1: (lv_theorems_4_0= RULE_ID )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:934:3: lv_theorems_4_0= RULE_ID
            	    {
            	    lv_theorems_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredDefinition1837); 

            	    			newLeafNode(lv_theorems_4_0, grammarAccess.getRequiredDefinitionAccess().getTheoremsIDTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequiredDefinitionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"theorems",
            	            		lv_theorems_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_PUNC_CLOSE_PARENTHESIS_5=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleRequiredDefinition1855); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_5, grammarAccess.getRequiredDefinitionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 
                
            this_PUNC_SEMI_COLON_6=(Token)match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleRequiredDefinition1865); 
             
                newLeafNode(this_PUNC_SEMI_COLON_6, grammarAccess.getRequiredDefinitionAccess().getPUNC_SEMI_COLONTerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredDefinition"


    // $ANTLR start "entryRuleVerificationExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:966:1: entryRuleVerificationExpression returns [EObject current=null] : iv_ruleVerificationExpression= ruleVerificationExpression EOF ;
    public final EObject entryRuleVerificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:967:2: (iv_ruleVerificationExpression= ruleVerificationExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:968:2: iv_ruleVerificationExpression= ruleVerificationExpression EOF
            {
             newCompositeNode(grammarAccess.getVerificationExpressionRule()); 
            pushFollow(FOLLOW_ruleVerificationExpression_in_entryRuleVerificationExpression1899);
            iv_ruleVerificationExpression=ruleVerificationExpression();

            state._fsp--;

             current =iv_ruleVerificationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationExpression1909); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationExpression"


    // $ANTLR start "ruleVerificationExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:975:1: ruleVerificationExpression returns [EObject current=null] : (otherlv_0= KEYWORD_26 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e1_2_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_4= RULE_PUNC_SEMI_COLON ) ;
    public final EObject ruleVerificationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token this_PUNC_CLOSE_PARENTHESIS_3=null;
        Token this_PUNC_SEMI_COLON_4=null;
        EObject lv_e1_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:978:28: ( (otherlv_0= KEYWORD_26 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e1_2_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_4= RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:979:1: (otherlv_0= KEYWORD_26 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e1_2_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_4= RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:979:1: (otherlv_0= KEYWORD_26 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e1_2_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_4= RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:980:2: otherlv_0= KEYWORD_26 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e1_2_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_3= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_4= RULE_PUNC_SEMI_COLON
            {
            otherlv_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleVerificationExpression1947); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationExpressionAccess().getCheckKeyword_0());
                
            this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleVerificationExpression1957); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getVerificationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:988:1: ( (lv_e1_2_0= ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:989:1: (lv_e1_2_0= ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:989:1: (lv_e1_2_0= ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:990:3: lv_e1_2_0= ruleGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getVerificationExpressionAccess().getE1GenericExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericExpression_in_ruleVerificationExpression1977);
            lv_e1_2_0=ruleGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerificationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"e1",
                    		lv_e1_2_0, 
                    		"GenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_CLOSE_PARENTHESIS_3=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleVerificationExpression1988); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_3, grammarAccess.getVerificationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_3()); 
                
            this_PUNC_SEMI_COLON_4=(Token)match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleVerificationExpression1998); 
             
                newLeafNode(this_PUNC_SEMI_COLON_4, grammarAccess.getVerificationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationExpression"


    // $ANTLR start "entryRuleEvaluationExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1022:1: entryRuleEvaluationExpression returns [EObject current=null] : iv_ruleEvaluationExpression= ruleEvaluationExpression EOF ;
    public final EObject entryRuleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1023:2: (iv_ruleEvaluationExpression= ruleEvaluationExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1024:2: iv_ruleEvaluationExpression= ruleEvaluationExpression EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression2032);
            iv_ruleEvaluationExpression=ruleEvaluationExpression();

            state._fsp--;

             current =iv_ruleEvaluationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression2042); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationExpression"


    // $ANTLR start "ruleEvaluationExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1031:1: ruleEvaluationExpression returns [EObject current=null] : (otherlv_0= KEYWORD_30 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_3= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e_4_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_7= RULE_PUNC_SEMI_COLON ) ;
    public final EObject ruleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token this_PUNC_OPEN_PARENTHESIS_3=null;
        Token this_PUNC_CLOSE_PARENTHESIS_5=null;
        Token this_PUNC_CLOSE_PARENTHESIS_6=null;
        Token this_PUNC_SEMI_COLON_7=null;
        AntlrDatatypeRuleToken lv_f_2_0 = null;

        EObject lv_e_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1034:28: ( (otherlv_0= KEYWORD_30 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_3= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e_4_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_7= RULE_PUNC_SEMI_COLON ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1035:1: (otherlv_0= KEYWORD_30 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_3= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e_4_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_7= RULE_PUNC_SEMI_COLON )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1035:1: (otherlv_0= KEYWORD_30 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_3= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e_4_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_7= RULE_PUNC_SEMI_COLON )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1036:2: otherlv_0= KEYWORD_30 this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_3= RULE_PUNC_OPEN_PARENTHESIS ( (lv_e_4_0= ruleGenericExpression ) ) this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS this_PUNC_SEMI_COLON_7= RULE_PUNC_SEMI_COLON
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleEvaluationExpression2080); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationExpressionAccess().getReturnKeyword_0());
                
            this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleEvaluationExpression2090); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1044:1: ( (lv_f_2_0= ruleAggregationFunctionIdentifier ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1045:1: (lv_f_2_0= ruleAggregationFunctionIdentifier )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1045:1: (lv_f_2_0= ruleAggregationFunctionIdentifier )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1046:3: lv_f_2_0= ruleAggregationFunctionIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionAccess().getFAggregationFunctionIdentifierParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAggregationFunctionIdentifier_in_ruleEvaluationExpression2110);
            lv_f_2_0=ruleAggregationFunctionIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"f",
                    		lv_f_2_0, 
                    		"AggregationFunctionIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_OPEN_PARENTHESIS_3=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleEvaluationExpression2121); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_3, grammarAccess.getEvaluationExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_3()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1066:1: ( (lv_e_4_0= ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1067:1: (lv_e_4_0= ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1067:1: (lv_e_4_0= ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1068:3: lv_e_4_0= ruleGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionAccess().getEGenericExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericExpression_in_ruleEvaluationExpression2141);
            lv_e_4_0=ruleGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"e",
                    		lv_e_4_0, 
                    		"GenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_CLOSE_PARENTHESIS_5=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleEvaluationExpression2152); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_5, grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_5()); 
                
            this_PUNC_CLOSE_PARENTHESIS_6=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleEvaluationExpression2162); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_6, grammarAccess.getEvaluationExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_6()); 
                
            this_PUNC_SEMI_COLON_7=(Token)match(input,RULE_PUNC_SEMI_COLON,FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleEvaluationExpression2172); 
             
                newLeafNode(this_PUNC_SEMI_COLON_7, grammarAccess.getEvaluationExpressionAccess().getPUNC_SEMI_COLONTerminalRuleCall_7()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationExpression"


    // $ANTLR start "entryRuleGenericExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1104:1: entryRuleGenericExpression returns [EObject current=null] : iv_ruleGenericExpression= ruleGenericExpression EOF ;
    public final EObject entryRuleGenericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1105:2: (iv_ruleGenericExpression= ruleGenericExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1106:2: iv_ruleGenericExpression= ruleGenericExpression EOF
            {
             newCompositeNode(grammarAccess.getGenericExpressionRule()); 
            pushFollow(FOLLOW_ruleGenericExpression_in_entryRuleGenericExpression2206);
            iv_ruleGenericExpression=ruleGenericExpression();

            state._fsp--;

             current =iv_ruleGenericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericExpression2216); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericExpression"


    // $ANTLR start "ruleGenericExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1113:1: ruleGenericExpression returns [EObject current=null] : ( ( (lv_e1_0_0= ruleTerminalGenericExpression ) ) ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )* ) ;
    public final EObject ruleGenericExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_e1_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_e2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1116:28: ( ( ( (lv_e1_0_0= ruleTerminalGenericExpression ) ) ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )* ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1117:1: ( ( (lv_e1_0_0= ruleTerminalGenericExpression ) ) ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )* )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1117:1: ( ( (lv_e1_0_0= ruleTerminalGenericExpression ) ) ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )* )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1117:2: ( (lv_e1_0_0= ruleTerminalGenericExpression ) ) ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )*
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1117:2: ( (lv_e1_0_0= ruleTerminalGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1118:1: (lv_e1_0_0= ruleTerminalGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1118:1: (lv_e1_0_0= ruleTerminalGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1119:3: lv_e1_0_0= ruleTerminalGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getGenericExpressionAccess().getE1TerminalGenericExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_ruleGenericExpression2262);
            lv_e1_0_0=ruleTerminalGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGenericExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"e1",
                    		lv_e1_0_0, 
                    		"TerminalGenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1135:2: ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1135:3: ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1135:3: ( (lv_op_1_0= ruleGenericOperator ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1136:1: (lv_op_1_0= ruleGenericOperator )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1136:1: (lv_op_1_0= ruleGenericOperator )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1137:3: lv_op_1_0= ruleGenericOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGenericExpressionAccess().getOpGenericOperatorParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenericOperator_in_ruleGenericExpression2284);
            	    lv_op_1_0=ruleGenericOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGenericExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"op",
            	            		lv_op_1_0, 
            	            		"GenericOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1153:2: ( (lv_e2_2_0= ruleTerminalGenericExpression ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1154:1: (lv_e2_2_0= ruleTerminalGenericExpression )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1154:1: (lv_e2_2_0= ruleTerminalGenericExpression )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1155:3: lv_e2_2_0= ruleTerminalGenericExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGenericExpressionAccess().getE2TerminalGenericExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminalGenericExpression_in_ruleGenericExpression2305);
            	    lv_e2_2_0=ruleTerminalGenericExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGenericExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"e2",
            	            		lv_e2_2_0, 
            	            		"TerminalGenericExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericExpression"


    // $ANTLR start "entryRuleTerminalGenericExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1179:1: entryRuleTerminalGenericExpression returns [EObject current=null] : iv_ruleTerminalGenericExpression= ruleTerminalGenericExpression EOF ;
    public final EObject entryRuleTerminalGenericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalGenericExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1180:2: (iv_ruleTerminalGenericExpression= ruleTerminalGenericExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1181:2: iv_ruleTerminalGenericExpression= ruleTerminalGenericExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalGenericExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalGenericExpression_in_entryRuleTerminalGenericExpression2342);
            iv_ruleTerminalGenericExpression=ruleTerminalGenericExpression();

            state._fsp--;

             current =iv_ruleTerminalGenericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalGenericExpression2352); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalGenericExpression"


    // $ANTLR start "ruleTerminalGenericExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1188:1: ruleTerminalGenericExpression returns [EObject current=null] : ( ( ruleUnaryOperator )? ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) ) ) ;
    public final EObject ruleTerminalGenericExpression() throws RecognitionException {
        EObject current = null;

        Token this_PUNC_OPEN_PARENTHESIS_4=null;
        Token this_PUNC_CLOSE_PARENTHESIS_6=null;
        EObject lv_literal_1_0 = null;

        EObject lv_fc_2_0 = null;

        EObject lv_te_3_0 = null;

        EObject this_GenericExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1191:28: ( ( ( ruleUnaryOperator )? ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1192:1: ( ( ruleUnaryOperator )? ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1192:1: ( ( ruleUnaryOperator )? ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1192:2: ( ruleUnaryOperator )? ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1192:2: ( ruleUnaryOperator )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1193:5: ruleUnaryOperator
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalGenericExpressionAccess().getUnaryOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleTerminalGenericExpression2394);
                    ruleUnaryOperator();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1200:3: ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_fc_2_0= ruleVerificationFunctionCall ) ) | ( (lv_te_3_0= ruleTernaryExpression ) ) | (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_NUMERIC:
                {
                alt16=1;
                }
                break;
            case KEYWORD_47:
            case KEYWORD_44:
            case KEYWORD_37:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_31:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_19:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
                {
                alt16=2;
                }
                break;
            case KEYWORD_3:
                {
                alt16=3;
                }
                break;
            case RULE_PUNC_OPEN_PARENTHESIS:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1200:4: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1200:4: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1201:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1201:1: (lv_literal_1_0= ruleLiteral )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1202:3: lv_literal_1_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalGenericExpressionAccess().getLiteralLiteralParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalGenericExpression2417);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalGenericExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1219:6: ( (lv_fc_2_0= ruleVerificationFunctionCall ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1219:6: ( (lv_fc_2_0= ruleVerificationFunctionCall ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1220:1: (lv_fc_2_0= ruleVerificationFunctionCall )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1220:1: (lv_fc_2_0= ruleVerificationFunctionCall )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1221:3: lv_fc_2_0= ruleVerificationFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalGenericExpressionAccess().getFcVerificationFunctionCallParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationFunctionCall_in_ruleTerminalGenericExpression2444);
                    lv_fc_2_0=ruleVerificationFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalGenericExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"fc",
                            		lv_fc_2_0, 
                            		"VerificationFunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1238:6: ( (lv_te_3_0= ruleTernaryExpression ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1238:6: ( (lv_te_3_0= ruleTernaryExpression ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1239:1: (lv_te_3_0= ruleTernaryExpression )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1239:1: (lv_te_3_0= ruleTernaryExpression )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1240:3: lv_te_3_0= ruleTernaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalGenericExpressionAccess().getTeTernaryExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTernaryExpression_in_ruleTerminalGenericExpression2471);
                    lv_te_3_0=ruleTernaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalGenericExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"te",
                            		lv_te_3_0, 
                            		"TernaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1257:6: (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1257:6: (this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1257:7: this_PUNC_OPEN_PARENTHESIS_4= RULE_PUNC_OPEN_PARENTHESIS this_GenericExpression_5= ruleGenericExpression this_PUNC_CLOSE_PARENTHESIS_6= RULE_PUNC_CLOSE_PARENTHESIS
                    {
                    this_PUNC_OPEN_PARENTHESIS_4=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleTerminalGenericExpression2489); 
                     
                        newLeafNode(this_PUNC_OPEN_PARENTHESIS_4, grammarAccess.getTerminalGenericExpressionAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTerminalGenericExpressionAccess().getGenericExpressionParserRuleCall_1_3_1()); 
                        
                    pushFollow(FOLLOW_ruleGenericExpression_in_ruleTerminalGenericExpression2510);
                    this_GenericExpression_5=ruleGenericExpression();

                    state._fsp--;


                            current = this_GenericExpression_5;
                            afterParserOrEnumRuleCall();
                        
                    this_PUNC_CLOSE_PARENTHESIS_6=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleTerminalGenericExpression2520); 
                     
                        newLeafNode(this_PUNC_CLOSE_PARENTHESIS_6, grammarAccess.getTerminalGenericExpressionAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_1_3_2()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalGenericExpression"


    // $ANTLR start "entryRuleSetExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1282:1: entryRuleSetExpression returns [EObject current=null] : iv_ruleSetExpression= ruleSetExpression EOF ;
    public final EObject entryRuleSetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1283:2: (iv_ruleSetExpression= ruleSetExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1284:2: iv_ruleSetExpression= ruleSetExpression EOF
            {
             newCompositeNode(grammarAccess.getSetExpressionRule()); 
            pushFollow(FOLLOW_ruleSetExpression_in_entryRuleSetExpression2556);
            iv_ruleSetExpression=ruleSetExpression();

            state._fsp--;

             current =iv_ruleSetExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExpression2566); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetExpression"


    // $ANTLR start "ruleSetExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1291:1: ruleSetExpression returns [EObject current=null] : ( ( (lv_e1_0_0= ruleTerminalSetExpression ) ) ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )* ) ;
    public final EObject ruleSetExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_e1_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_e2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1294:28: ( ( ( (lv_e1_0_0= ruleTerminalSetExpression ) ) ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )* ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1295:1: ( ( (lv_e1_0_0= ruleTerminalSetExpression ) ) ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )* )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1295:1: ( ( (lv_e1_0_0= ruleTerminalSetExpression ) ) ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )* )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1295:2: ( (lv_e1_0_0= ruleTerminalSetExpression ) ) ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )*
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1295:2: ( (lv_e1_0_0= ruleTerminalSetExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1296:1: (lv_e1_0_0= ruleTerminalSetExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1296:1: (lv_e1_0_0= ruleTerminalSetExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1297:3: lv_e1_0_0= ruleTerminalSetExpression
            {
             
            	        newCompositeNode(grammarAccess.getSetExpressionAccess().getE1TerminalSetExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalSetExpression_in_ruleSetExpression2612);
            lv_e1_0_0=ruleTerminalSetExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"e1",
                    		lv_e1_0_0, 
                    		"TerminalSetExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1313:2: ( ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_PLUS||(LA17_0>=RULE_STAR && LA17_0<=RULE_SLASH)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1313:3: ( (lv_op_1_0= ruleSetOperator ) ) ( (lv_e2_2_0= ruleTerminalSetExpression ) )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1313:3: ( (lv_op_1_0= ruleSetOperator ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1314:1: (lv_op_1_0= ruleSetOperator )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1314:1: (lv_op_1_0= ruleSetOperator )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1315:3: lv_op_1_0= ruleSetOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetExpressionAccess().getOpSetOperatorParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSetOperator_in_ruleSetExpression2634);
            	    lv_op_1_0=ruleSetOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSetExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"op",
            	            		lv_op_1_0, 
            	            		"SetOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1331:2: ( (lv_e2_2_0= ruleTerminalSetExpression ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1332:1: (lv_e2_2_0= ruleTerminalSetExpression )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1332:1: (lv_e2_2_0= ruleTerminalSetExpression )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1333:3: lv_e2_2_0= ruleTerminalSetExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetExpressionAccess().getE2TerminalSetExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminalSetExpression_in_ruleSetExpression2655);
            	    lv_e2_2_0=ruleTerminalSetExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSetExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"e2",
            	            		lv_e2_2_0, 
            	            		"TerminalSetExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetExpression"


    // $ANTLR start "entryRuleTerminalSetExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1357:1: entryRuleTerminalSetExpression returns [String current=null] : iv_ruleTerminalSetExpression= ruleTerminalSetExpression EOF ;
    public final String entryRuleTerminalSetExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalSetExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1358:1: (iv_ruleTerminalSetExpression= ruleTerminalSetExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1359:2: iv_ruleTerminalSetExpression= ruleTerminalSetExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalSetExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalSetExpression_in_entryRuleTerminalSetExpression2693);
            iv_ruleTerminalSetExpression=ruleTerminalSetExpression();

            state._fsp--;

             current =iv_ruleTerminalSetExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalSetExpression2704); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalSetExpression"


    // $ANTLR start "ruleTerminalSetExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1366:1: ruleTerminalSetExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTerminalSetExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1370:6: (this_ID_0= RULE_ID )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1371:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalSetExpression2743); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getTerminalSetExpressionAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalSetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1386:1: entryRuleTernaryExpression returns [EObject current=null] : iv_ruleTernaryExpression= ruleTernaryExpression EOF ;
    public final EObject entryRuleTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryExpression = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1387:2: (iv_ruleTernaryExpression= ruleTernaryExpression EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1388:2: iv_ruleTernaryExpression= ruleTernaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression2786);
            iv_ruleTernaryExpression=ruleTernaryExpression();

            state._fsp--;

             current =iv_ruleTernaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryExpression2796); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1395:1: ruleTernaryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_3 ( (lv_conditional_1_0= ruleGenericExpression ) ) otherlv_2= KEYWORD_21 ( (lv_trueValue_3_0= ruleGenericExpression ) ) otherlv_4= KEYWORD_20 ( (lv_falseValue_5_0= ruleGenericExpression ) ) ) ;
    public final EObject ruleTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditional_1_0 = null;

        EObject lv_trueValue_3_0 = null;

        EObject lv_falseValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1398:28: ( (otherlv_0= KEYWORD_3 ( (lv_conditional_1_0= ruleGenericExpression ) ) otherlv_2= KEYWORD_21 ( (lv_trueValue_3_0= ruleGenericExpression ) ) otherlv_4= KEYWORD_20 ( (lv_falseValue_5_0= ruleGenericExpression ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1399:1: (otherlv_0= KEYWORD_3 ( (lv_conditional_1_0= ruleGenericExpression ) ) otherlv_2= KEYWORD_21 ( (lv_trueValue_3_0= ruleGenericExpression ) ) otherlv_4= KEYWORD_20 ( (lv_falseValue_5_0= ruleGenericExpression ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1399:1: (otherlv_0= KEYWORD_3 ( (lv_conditional_1_0= ruleGenericExpression ) ) otherlv_2= KEYWORD_21 ( (lv_trueValue_3_0= ruleGenericExpression ) ) otherlv_4= KEYWORD_20 ( (lv_falseValue_5_0= ruleGenericExpression ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1400:2: otherlv_0= KEYWORD_3 ( (lv_conditional_1_0= ruleGenericExpression ) ) otherlv_2= KEYWORD_21 ( (lv_trueValue_3_0= ruleGenericExpression ) ) otherlv_4= KEYWORD_20 ( (lv_falseValue_5_0= ruleGenericExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleTernaryExpression2834); 

                	newLeafNode(otherlv_0, grammarAccess.getTernaryExpressionAccess().getIfKeyword_0());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1404:1: ( (lv_conditional_1_0= ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1405:1: (lv_conditional_1_0= ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1405:1: (lv_conditional_1_0= ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1406:3: lv_conditional_1_0= ruleGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getConditionalGenericExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2854);
            lv_conditional_1_0=ruleGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"conditional",
                    		lv_conditional_1_0, 
                    		"GenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleTernaryExpression2867); 

                	newLeafNode(otherlv_2, grammarAccess.getTernaryExpressionAccess().getThenKeyword_2());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1427:1: ( (lv_trueValue_3_0= ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1428:1: (lv_trueValue_3_0= ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1428:1: (lv_trueValue_3_0= ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1429:3: lv_trueValue_3_0= ruleGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getTrueValueGenericExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2887);
            lv_trueValue_3_0=ruleGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_3_0, 
                    		"GenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleTernaryExpression2900); 

                	newLeafNode(otherlv_4, grammarAccess.getTernaryExpressionAccess().getElseKeyword_4());
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1450:1: ( (lv_falseValue_5_0= ruleGenericExpression ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1451:1: (lv_falseValue_5_0= ruleGenericExpression )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1451:1: (lv_falseValue_5_0= ruleGenericExpression )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1452:3: lv_falseValue_5_0= ruleGenericExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getFalseValueGenericExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2920);
            lv_falseValue_5_0=ruleGenericExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"falseValue",
                    		lv_falseValue_5_0, 
                    		"GenericExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleVerificationFunctionCall"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1476:1: entryRuleVerificationFunctionCall returns [EObject current=null] : iv_ruleVerificationFunctionCall= ruleVerificationFunctionCall EOF ;
    public final EObject entryRuleVerificationFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationFunctionCall = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1477:2: (iv_ruleVerificationFunctionCall= ruleVerificationFunctionCall EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1478:2: iv_ruleVerificationFunctionCall= ruleVerificationFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getVerificationFunctionCallRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionCall_in_entryRuleVerificationFunctionCall2955);
            iv_ruleVerificationFunctionCall=ruleVerificationFunctionCall();

            state._fsp--;

             current =iv_ruleVerificationFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionCall2965); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationFunctionCall"


    // $ANTLR start "ruleVerificationFunctionCall"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1485:1: ruleVerificationFunctionCall returns [EObject current=null] : ( ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS ) ;
    public final EObject ruleVerificationFunctionCall() throws RecognitionException {
        EObject current = null;

        Token this_PUNC_OPEN_PARENTHESIS_1=null;
        Token this_PUNC_COMMA_3=null;
        Token this_PUNC_CLOSE_PARENTHESIS_5=null;
        AntlrDatatypeRuleToken lv_f_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1488:28: ( ( ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1489:1: ( ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1489:1: ( ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1489:2: ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) ) this_PUNC_OPEN_PARENTHESIS_1= RULE_PUNC_OPEN_PARENTHESIS ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) ) (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )* this_PUNC_CLOSE_PARENTHESIS_5= RULE_PUNC_CLOSE_PARENTHESIS
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1489:2: ( (lv_f_0_0= ruleVerificationFunctionIdentifier ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1490:1: (lv_f_0_0= ruleVerificationFunctionIdentifier )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1490:1: (lv_f_0_0= ruleVerificationFunctionIdentifier )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1491:3: lv_f_0_0= ruleVerificationFunctionIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getVerificationFunctionCallAccess().getFVerificationFunctionIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVerificationFunctionIdentifier_in_ruleVerificationFunctionCall3011);
            lv_f_0_0=ruleVerificationFunctionIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerificationFunctionCallRule());
            	        }
                   		set(
                   			current, 
                   			"f",
                    		lv_f_0_0, 
                    		"VerificationFunctionIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_PUNC_OPEN_PARENTHESIS_1=(Token)match(input,RULE_PUNC_OPEN_PARENTHESIS,FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleVerificationFunctionCall3022); 
             
                newLeafNode(this_PUNC_OPEN_PARENTHESIS_1, grammarAccess.getVerificationFunctionCallAccess().getPUNC_OPEN_PARENTHESISTerminalRuleCall_1()); 
                
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1511:1: ( (lv_arguments_2_0= ruleVerificationFunctionParameter ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1512:1: (lv_arguments_2_0= ruleVerificationFunctionParameter )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1512:1: (lv_arguments_2_0= ruleVerificationFunctionParameter )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1513:3: lv_arguments_2_0= ruleVerificationFunctionParameter
            {
             
            	        newCompositeNode(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_ruleVerificationFunctionCall3042);
            lv_arguments_2_0=ruleVerificationFunctionParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerificationFunctionCallRule());
            	        }
                   		add(
                   			current, 
                   			"arguments",
                    		lv_arguments_2_0, 
                    		"VerificationFunctionParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1529:2: (this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_PUNC_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1529:3: this_PUNC_COMMA_3= RULE_PUNC_COMMA ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) )
            	    {
            	    this_PUNC_COMMA_3=(Token)match(input,RULE_PUNC_COMMA,FOLLOW_RULE_PUNC_COMMA_in_ruleVerificationFunctionCall3054); 
            	     
            	        newLeafNode(this_PUNC_COMMA_3, grammarAccess.getVerificationFunctionCallAccess().getPUNC_COMMATerminalRuleCall_3_0()); 
            	        
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1533:1: ( (lv_arguments_4_0= ruleVerificationFunctionParameter ) )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1534:1: (lv_arguments_4_0= ruleVerificationFunctionParameter )
            	    {
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1534:1: (lv_arguments_4_0= ruleVerificationFunctionParameter )
            	    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1535:3: lv_arguments_4_0= ruleVerificationFunctionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVerificationFunctionCallAccess().getArgumentsVerificationFunctionParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_ruleVerificationFunctionCall3074);
            	    lv_arguments_4_0=ruleVerificationFunctionParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVerificationFunctionCallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_4_0, 
            	            		"VerificationFunctionParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            this_PUNC_CLOSE_PARENTHESIS_5=(Token)match(input,RULE_PUNC_CLOSE_PARENTHESIS,FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleVerificationFunctionCall3087); 
             
                newLeafNode(this_PUNC_CLOSE_PARENTHESIS_5, grammarAccess.getVerificationFunctionCallAccess().getPUNC_CLOSE_PARENTHESISTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationFunctionCall"


    // $ANTLR start "entryRuleVerificationFunctionParameter"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1563:1: entryRuleVerificationFunctionParameter returns [EObject current=null] : iv_ruleVerificationFunctionParameter= ruleVerificationFunctionParameter EOF ;
    public final EObject entryRuleVerificationFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationFunctionParameter = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1564:2: (iv_ruleVerificationFunctionParameter= ruleVerificationFunctionParameter EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1565:2: iv_ruleVerificationFunctionParameter= ruleVerificationFunctionParameter EOF
            {
             newCompositeNode(grammarAccess.getVerificationFunctionParameterRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionParameter_in_entryRuleVerificationFunctionParameter3121);
            iv_ruleVerificationFunctionParameter=ruleVerificationFunctionParameter();

            state._fsp--;

             current =iv_ruleVerificationFunctionParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionParameter3131); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationFunctionParameter"


    // $ANTLR start "ruleVerificationFunctionParameter"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1572:1: ruleVerificationFunctionParameter returns [EObject current=null] : ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) | ( (lv_vfi_2_0= ruleVerificationFunctionCall ) ) ) ;
    public final EObject ruleVerificationFunctionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_l_0_0 = null;

        EObject lv_vfi_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1575:28: ( ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) | ( (lv_vfi_2_0= ruleVerificationFunctionCall ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1576:1: ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) | ( (lv_vfi_2_0= ruleVerificationFunctionCall ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1576:1: ( ( (lv_l_0_0= ruleLiteral ) ) | ( (lv_identifier_1_0= RULE_ID ) ) | ( (lv_vfi_2_0= ruleVerificationFunctionCall ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_NUMERIC:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case KEYWORD_47:
            case KEYWORD_44:
            case KEYWORD_37:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_31:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_19:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1576:2: ( (lv_l_0_0= ruleLiteral ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1576:2: ( (lv_l_0_0= ruleLiteral ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1577:1: (lv_l_0_0= ruleLiteral )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1577:1: (lv_l_0_0= ruleLiteral )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1578:3: lv_l_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationFunctionParameterAccess().getLLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleVerificationFunctionParameter3177);
                    lv_l_0_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationFunctionParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"l",
                            		lv_l_0_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1595:6: ( (lv_identifier_1_0= RULE_ID ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1595:6: ( (lv_identifier_1_0= RULE_ID ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1596:1: (lv_identifier_1_0= RULE_ID )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1596:1: (lv_identifier_1_0= RULE_ID )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1597:3: lv_identifier_1_0= RULE_ID
                    {
                    lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationFunctionParameter3200); 

                    			newLeafNode(lv_identifier_1_0, grammarAccess.getVerificationFunctionParameterAccess().getIdentifierIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationFunctionParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"identifier",
                            		lv_identifier_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1614:6: ( (lv_vfi_2_0= ruleVerificationFunctionCall ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1614:6: ( (lv_vfi_2_0= ruleVerificationFunctionCall ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1615:1: (lv_vfi_2_0= ruleVerificationFunctionCall )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1615:1: (lv_vfi_2_0= ruleVerificationFunctionCall )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1616:3: lv_vfi_2_0= ruleVerificationFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationFunctionParameterAccess().getVfiVerificationFunctionCallParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationFunctionCall_in_ruleVerificationFunctionParameter3232);
                    lv_vfi_2_0=ruleVerificationFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationFunctionParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"vfi",
                            		lv_vfi_2_0, 
                            		"VerificationFunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationFunctionParameter"


    // $ANTLR start "entryRuleAggregationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1640:1: entryRuleAggregationFunctionIdentifier returns [String current=null] : iv_ruleAggregationFunctionIdentifier= ruleAggregationFunctionIdentifier EOF ;
    public final String entryRuleAggregationFunctionIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAggregationFunctionIdentifier = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1641:1: (iv_ruleAggregationFunctionIdentifier= ruleAggregationFunctionIdentifier EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1642:2: iv_ruleAggregationFunctionIdentifier= ruleAggregationFunctionIdentifier EOF
            {
             newCompositeNode(grammarAccess.getAggregationFunctionIdentifierRule()); 
            pushFollow(FOLLOW_ruleAggregationFunctionIdentifier_in_entryRuleAggregationFunctionIdentifier3268);
            iv_ruleAggregationFunctionIdentifier=ruleAggregationFunctionIdentifier();

            state._fsp--;

             current =iv_ruleAggregationFunctionIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregationFunctionIdentifier3279); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregationFunctionIdentifier"


    // $ANTLR start "ruleAggregationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1649:1: ruleAggregationFunctionIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_17 ) ;
    public final AntlrDatatypeRuleToken ruleAggregationFunctionIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1653:6: ( (kw= KEYWORD_18 | kw= KEYWORD_17 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1654:1: (kw= KEYWORD_18 | kw= KEYWORD_17 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1654:1: (kw= KEYWORD_18 | kw= KEYWORD_17 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_18) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1655:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleAggregationFunctionIdentifier3317); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAggregationFunctionIdentifierAccess().getMSumKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1662:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleAggregationFunctionIdentifier3336); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAggregationFunctionIdentifierAccess().getMMaxKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregationFunctionIdentifier"


    // $ANTLR start "entryRuleVerificationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1675:1: entryRuleVerificationFunctionIdentifier returns [String current=null] : iv_ruleVerificationFunctionIdentifier= ruleVerificationFunctionIdentifier EOF ;
    public final String entryRuleVerificationFunctionIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationFunctionIdentifier = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1676:1: (iv_ruleVerificationFunctionIdentifier= ruleVerificationFunctionIdentifier EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1677:2: iv_ruleVerificationFunctionIdentifier= ruleVerificationFunctionIdentifier EOF
            {
             newCompositeNode(grammarAccess.getVerificationFunctionIdentifierRule()); 
            pushFollow(FOLLOW_ruleVerificationFunctionIdentifier_in_entryRuleVerificationFunctionIdentifier3376);
            iv_ruleVerificationFunctionIdentifier=ruleVerificationFunctionIdentifier();

            state._fsp--;

             current =iv_ruleVerificationFunctionIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationFunctionIdentifier3387); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationFunctionIdentifier"


    // $ANTLR start "ruleVerificationFunctionIdentifier"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1684:1: ruleVerificationFunctionIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_34 | kw= KEYWORD_10 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_31 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_47 | kw= KEYWORD_35 | kw= KEYWORD_44 | kw= KEYWORD_37 | kw= KEYWORD_28 | kw= KEYWORD_29 | kw= KEYWORD_23 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_25 | kw= KEYWORD_16 | kw= KEYWORD_19 | kw= KEYWORD_24 ) ;
    public final AntlrDatatypeRuleToken ruleVerificationFunctionIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1688:6: ( (kw= KEYWORD_34 | kw= KEYWORD_10 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_31 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_47 | kw= KEYWORD_35 | kw= KEYWORD_44 | kw= KEYWORD_37 | kw= KEYWORD_28 | kw= KEYWORD_29 | kw= KEYWORD_23 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_25 | kw= KEYWORD_16 | kw= KEYWORD_19 | kw= KEYWORD_24 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1689:1: (kw= KEYWORD_34 | kw= KEYWORD_10 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_31 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_47 | kw= KEYWORD_35 | kw= KEYWORD_44 | kw= KEYWORD_37 | kw= KEYWORD_28 | kw= KEYWORD_29 | kw= KEYWORD_23 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_25 | kw= KEYWORD_16 | kw= KEYWORD_19 | kw= KEYWORD_24 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1689:1: (kw= KEYWORD_34 | kw= KEYWORD_10 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_31 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_47 | kw= KEYWORD_35 | kw= KEYWORD_44 | kw= KEYWORD_37 | kw= KEYWORD_28 | kw= KEYWORD_29 | kw= KEYWORD_23 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_25 | kw= KEYWORD_16 | kw= KEYWORD_19 | kw= KEYWORD_24 )
            int alt21=20;
            switch ( input.LA(1) ) {
            case KEYWORD_34:
                {
                alt21=1;
                }
                break;
            case KEYWORD_10:
                {
                alt21=2;
                }
                break;
            case KEYWORD_8:
                {
                alt21=3;
                }
                break;
            case KEYWORD_9:
                {
                alt21=4;
                }
                break;
            case KEYWORD_31:
                {
                alt21=5;
                }
                break;
            case KEYWORD_6:
                {
                alt21=6;
                }
                break;
            case KEYWORD_7:
                {
                alt21=7;
                }
                break;
            case KEYWORD_47:
                {
                alt21=8;
                }
                break;
            case KEYWORD_35:
                {
                alt21=9;
                }
                break;
            case KEYWORD_44:
                {
                alt21=10;
                }
                break;
            case KEYWORD_37:
                {
                alt21=11;
                }
                break;
            case KEYWORD_28:
                {
                alt21=12;
                }
                break;
            case KEYWORD_29:
                {
                alt21=13;
                }
                break;
            case KEYWORD_23:
                {
                alt21=14;
                }
                break;
            case KEYWORD_15:
                {
                alt21=15;
                }
                break;
            case KEYWORD_14:
                {
                alt21=16;
                }
                break;
            case KEYWORD_25:
                {
                alt21=17;
                }
                break;
            case KEYWORD_16:
                {
                alt21=18;
                }
                break;
            case KEYWORD_19:
                {
                alt21=19;
                }
                break;
            case KEYWORD_24:
                {
                alt21=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1690:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleVerificationFunctionIdentifier3425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getCardinalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1697:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleVerificationFunctionIdentifier3444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getSumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1704:2: kw= KEYWORD_8
                    {
                    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleVerificationFunctionIdentifier3463); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getMaxKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1711:2: kw= KEYWORD_9
                    {
                    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleVerificationFunctionIdentifier3482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getMinKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1718:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleVerificationFunctionIdentifier3501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getProductKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1725:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleVerificationFunctionIdentifier3520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getGCDKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1732:2: kw= KEYWORD_7
                    {
                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleVerificationFunctionIdentifier3539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getLCMKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1739:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleVerificationFunctionIdentifier3558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getGet_Property_ValueKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1746:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleVerificationFunctionIdentifier3577); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getPropertyKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1753:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleVerificationFunctionIdentifier3596); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getProperty_ExistsKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1760:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleVerificationFunctionIdentifier3615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getAll_EqualsKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1767:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleVerificationFunctionIdentifier3634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getExistsKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1774:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleVerificationFunctionIdentifier3653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getSystemKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1781:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleVerificationFunctionIdentifier3672); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getFirstKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1788:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleVerificationFunctionIdentifier3691); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getLastKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1795:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleVerificationFunctionIdentifier3710); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getHeadKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1802:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleVerificationFunctionIdentifier3729); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getQueueKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1809:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleVerificationFunctionIdentifier3748); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getListKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1816:2: kw= KEYWORD_19
                    {
                    kw=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleVerificationFunctionIdentifier3767); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getSizeKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1823:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleVerificationFunctionIdentifier3786); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationFunctionIdentifierAccess().getFloatKeyword_19()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationFunctionIdentifier"


    // $ANTLR start "entryRuleGenericOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1836:1: entryRuleGenericOperator returns [String current=null] : iv_ruleGenericOperator= ruleGenericOperator EOF ;
    public final String entryRuleGenericOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1837:1: (iv_ruleGenericOperator= ruleGenericOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1838:2: iv_ruleGenericOperator= ruleGenericOperator EOF
            {
             newCompositeNode(grammarAccess.getGenericOperatorRule()); 
            pushFollow(FOLLOW_ruleGenericOperator_in_entryRuleGenericOperator3826);
            iv_ruleGenericOperator=ruleGenericOperator();

            state._fsp--;

             current =iv_ruleGenericOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericOperator3837); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericOperator"


    // $ANTLR start "ruleGenericOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1845:1: ruleGenericOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ComparisonOperator_0= ruleComparisonOperator | this_BooleanOperator_1= ruleBooleanOperator | this_ArithmeticOperator_2= ruleArithmeticOperator ) ;
    public final AntlrDatatypeRuleToken ruleGenericOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ComparisonOperator_0 = null;

        AntlrDatatypeRuleToken this_BooleanOperator_1 = null;

        AntlrDatatypeRuleToken this_ArithmeticOperator_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1849:6: ( (this_ComparisonOperator_0= ruleComparisonOperator | this_BooleanOperator_1= ruleBooleanOperator | this_ArithmeticOperator_2= ruleArithmeticOperator ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1850:1: (this_ComparisonOperator_0= ruleComparisonOperator | this_BooleanOperator_1= ruleBooleanOperator | this_ArithmeticOperator_2= ruleArithmeticOperator )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1850:1: (this_ComparisonOperator_0= ruleComparisonOperator | this_BooleanOperator_1= ruleBooleanOperator | this_ArithmeticOperator_2= ruleArithmeticOperator )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_NOT_EQUAL:
            case RULE_LESS_EQUAL:
            case RULE_GREATER_EQUAL:
            case RULE_GREATER:
            case RULE_LESS:
            case RULE_EQUAL:
                {
                alt22=1;
                }
                break;
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_5:
                {
                alt22=2;
                }
                break;
            case RULE_PLUS:
            case RULE_POWER:
            case RULE_STAR:
            case RULE_SLASH:
            case RULE_MINUS:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1851:5: this_ComparisonOperator_0= ruleComparisonOperator
                    {
                     
                            newCompositeNode(grammarAccess.getGenericOperatorAccess().getComparisonOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleGenericOperator3884);
                    this_ComparisonOperator_0=ruleComparisonOperator();

                    state._fsp--;


                    		current.merge(this_ComparisonOperator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1863:5: this_BooleanOperator_1= ruleBooleanOperator
                    {
                     
                            newCompositeNode(grammarAccess.getGenericOperatorAccess().getBooleanOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanOperator_in_ruleGenericOperator3917);
                    this_BooleanOperator_1=ruleBooleanOperator();

                    state._fsp--;


                    		current.merge(this_BooleanOperator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1875:5: this_ArithmeticOperator_2= ruleArithmeticOperator
                    {
                     
                            newCompositeNode(grammarAccess.getGenericOperatorAccess().getArithmeticOperatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArithmeticOperator_in_ruleGenericOperator3950);
                    this_ArithmeticOperator_2=ruleArithmeticOperator();

                    state._fsp--;


                    		current.merge(this_ArithmeticOperator_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericOperator"


    // $ANTLR start "entryRuleLiteral"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1893:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1894:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1895:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3994);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4004); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1902:1: ruleLiteral returns [EObject current=null] : ( ( (lv_b_0_0= ruleBOOLEAN ) ) | ( (lv_s_1_0= RULE_STRING ) ) | ( (lv_n_2_0= RULE_NUMERIC ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_s_1_0=null;
        Token lv_n_2_0=null;
        EObject lv_b_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1905:28: ( ( ( (lv_b_0_0= ruleBOOLEAN ) ) | ( (lv_s_1_0= RULE_STRING ) ) | ( (lv_n_2_0= RULE_NUMERIC ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1906:1: ( ( (lv_b_0_0= ruleBOOLEAN ) ) | ( (lv_s_1_0= RULE_STRING ) ) | ( (lv_n_2_0= RULE_NUMERIC ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1906:1: ( ( (lv_b_0_0= ruleBOOLEAN ) ) | ( (lv_s_1_0= RULE_STRING ) ) | ( (lv_n_2_0= RULE_NUMERIC ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
            case KEYWORD_22:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_NUMERIC:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1906:2: ( (lv_b_0_0= ruleBOOLEAN ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1906:2: ( (lv_b_0_0= ruleBOOLEAN ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1907:1: (lv_b_0_0= ruleBOOLEAN )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1907:1: (lv_b_0_0= ruleBOOLEAN )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1908:3: lv_b_0_0= ruleBOOLEAN
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getBBOOLEANParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOLEAN_in_ruleLiteral4050);
                    lv_b_0_0=ruleBOOLEAN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"b",
                            		lv_b_0_0, 
                            		"BOOLEAN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1925:6: ( (lv_s_1_0= RULE_STRING ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1925:6: ( (lv_s_1_0= RULE_STRING ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1926:1: (lv_s_1_0= RULE_STRING )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1926:1: (lv_s_1_0= RULE_STRING )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1927:3: lv_s_1_0= RULE_STRING
                    {
                    lv_s_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral4073); 

                    			newLeafNode(lv_s_1_0, grammarAccess.getLiteralAccess().getSSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"s",
                            		lv_s_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1944:6: ( (lv_n_2_0= RULE_NUMERIC ) )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1944:6: ( (lv_n_2_0= RULE_NUMERIC ) )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1945:1: (lv_n_2_0= RULE_NUMERIC )
                    {
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1945:1: (lv_n_2_0= RULE_NUMERIC )
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1946:3: lv_n_2_0= RULE_NUMERIC
                    {
                    lv_n_2_0=(Token)match(input,RULE_NUMERIC,FOLLOW_RULE_NUMERIC_in_ruleLiteral4101); 

                    			newLeafNode(lv_n_2_0, grammarAccess.getLiteralAccess().getNNUMERICTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"n",
                            		lv_n_2_0, 
                            		"NUMERIC");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1970:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1971:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1972:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN4141);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN4151); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1979:1: ruleBOOLEAN returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1982:28: ( ( ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1983:1: ( ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1983:1: ( ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1984:1: ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1984:1: ( (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1985:1: (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1985:1: (lv_value_0_1= KEYWORD_22 | lv_value_0_2= KEYWORD_27 )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_22) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_27) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1986:3: lv_value_0_1= KEYWORD_22
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleBOOLEAN4196); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBOOLEANAccess().getValueTrueKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBOOLEANRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:1999:8: lv_value_0_2= KEYWORD_27
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleBOOLEAN4224); 

                            newLeafNode(lv_value_0_2, grammarAccess.getBOOLEANAccess().getValueFalseKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBOOLEANRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleSetOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2023:1: entryRuleSetOperator returns [String current=null] : iv_ruleSetOperator= ruleSetOperator EOF ;
    public final String entryRuleSetOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSetOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2024:1: (iv_ruleSetOperator= ruleSetOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2025:2: iv_ruleSetOperator= ruleSetOperator EOF
            {
             newCompositeNode(grammarAccess.getSetOperatorRule()); 
            pushFollow(FOLLOW_ruleSetOperator_in_entryRuleSetOperator4273);
            iv_ruleSetOperator=ruleSetOperator();

            state._fsp--;

             current =iv_ruleSetOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetOperator4284); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetOperator"


    // $ANTLR start "ruleSetOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2032:1: ruleSetOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_STAR_1= RULE_STAR | this_SLASH_2= RULE_SLASH ) ;
    public final AntlrDatatypeRuleToken ruleSetOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_STAR_1=null;
        Token this_SLASH_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2036:6: ( (this_PLUS_0= RULE_PLUS | this_STAR_1= RULE_STAR | this_SLASH_2= RULE_SLASH ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2037:1: (this_PLUS_0= RULE_PLUS | this_STAR_1= RULE_STAR | this_SLASH_2= RULE_SLASH )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2037:1: (this_PLUS_0= RULE_PLUS | this_STAR_1= RULE_STAR | this_SLASH_2= RULE_SLASH )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt25=1;
                }
                break;
            case RULE_STAR:
                {
                alt25=2;
                }
                break;
            case RULE_SLASH:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2037:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSetOperator4324); 

                    		current.merge(this_PLUS_0);
                        
                     
                        newLeafNode(this_PLUS_0, grammarAccess.getSetOperatorAccess().getPLUSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2045:10: this_STAR_1= RULE_STAR
                    {
                    this_STAR_1=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_ruleSetOperator4350); 

                    		current.merge(this_STAR_1);
                        
                     
                        newLeafNode(this_STAR_1, grammarAccess.getSetOperatorAccess().getSTARTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2053:10: this_SLASH_2= RULE_SLASH
                    {
                    this_SLASH_2=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_ruleSetOperator4376); 

                    		current.merge(this_SLASH_2);
                        
                     
                        newLeafNode(this_SLASH_2, grammarAccess.getSetOperatorAccess().getSLASHTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetOperator"


    // $ANTLR start "entryRuleArithmeticOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2068:1: entryRuleArithmeticOperator returns [String current=null] : iv_ruleArithmeticOperator= ruleArithmeticOperator EOF ;
    public final String entryRuleArithmeticOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2069:1: (iv_ruleArithmeticOperator= ruleArithmeticOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2070:2: iv_ruleArithmeticOperator= ruleArithmeticOperator EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOperatorRule()); 
            pushFollow(FOLLOW_ruleArithmeticOperator_in_entryRuleArithmeticOperator4421);
            iv_ruleArithmeticOperator=ruleArithmeticOperator();

            state._fsp--;

             current =iv_ruleArithmeticOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOperator4432); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2077:1: ruleArithmeticOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_STAR_2= RULE_STAR | this_SLASH_3= RULE_SLASH | this_POWER_4= RULE_POWER ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_STAR_2=null;
        Token this_SLASH_3=null;
        Token this_POWER_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2081:6: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_STAR_2= RULE_STAR | this_SLASH_3= RULE_SLASH | this_POWER_4= RULE_POWER ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2082:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_STAR_2= RULE_STAR | this_SLASH_3= RULE_SLASH | this_POWER_4= RULE_POWER )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2082:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_STAR_2= RULE_STAR | this_SLASH_3= RULE_SLASH | this_POWER_4= RULE_POWER )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt26=1;
                }
                break;
            case RULE_MINUS:
                {
                alt26=2;
                }
                break;
            case RULE_STAR:
                {
                alt26=3;
                }
                break;
            case RULE_SLASH:
                {
                alt26=4;
                }
                break;
            case RULE_POWER:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2082:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleArithmeticOperator4472); 

                    		current.merge(this_PLUS_0);
                        
                     
                        newLeafNode(this_PLUS_0, grammarAccess.getArithmeticOperatorAccess().getPLUSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2090:10: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleArithmeticOperator4498); 

                    		current.merge(this_MINUS_1);
                        
                     
                        newLeafNode(this_MINUS_1, grammarAccess.getArithmeticOperatorAccess().getMINUSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2098:10: this_STAR_2= RULE_STAR
                    {
                    this_STAR_2=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_ruleArithmeticOperator4524); 

                    		current.merge(this_STAR_2);
                        
                     
                        newLeafNode(this_STAR_2, grammarAccess.getArithmeticOperatorAccess().getSTARTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2106:10: this_SLASH_3= RULE_SLASH
                    {
                    this_SLASH_3=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_ruleArithmeticOperator4550); 

                    		current.merge(this_SLASH_3);
                        
                     
                        newLeafNode(this_SLASH_3, grammarAccess.getArithmeticOperatorAccess().getSLASHTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2114:10: this_POWER_4= RULE_POWER
                    {
                    this_POWER_4=(Token)match(input,RULE_POWER,FOLLOW_RULE_POWER_in_ruleArithmeticOperator4576); 

                    		current.merge(this_POWER_4);
                        
                     
                        newLeafNode(this_POWER_4, grammarAccess.getArithmeticOperatorAccess().getPOWERTerminalRuleCall_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "entryRuleBooleanOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2129:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2130:1: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2131:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator4621);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;

             current =iv_ruleBooleanOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator4632); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanOperator"


    // $ANTLR start "ruleBooleanOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2138:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2142:6: ( (kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_5 ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2143:1: (kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_5 )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2143:1: (kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_5 )
            int alt27=3;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt27=1;
                }
                break;
            case KEYWORD_13:
                {
                alt27=2;
                }
                break;
            case KEYWORD_5:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2144:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleBooleanOperator4670); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAndKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2151:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleBooleanOperator4689); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getNotKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2158:2: kw= KEYWORD_5
                    {
                    kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBooleanOperator4708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getOrKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "entryRuleUnaryOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2171:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2172:1: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2173:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator4748);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;

             current =iv_ruleUnaryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperator4759); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2180:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_13 ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2184:6: (kw= KEYWORD_13 )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2186:2: kw= KEYWORD_13
            {
            kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleUnaryOperator4796); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getNotKeyword()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2199:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2200:1: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2201:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator4835);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator4846); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2208:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LESS_0= RULE_LESS | this_LESS_EQUAL_1= RULE_LESS_EQUAL | this_EQUAL_2= RULE_EQUAL | this_GREATER_EQUAL_3= RULE_GREATER_EQUAL | this_GREATER_4= RULE_GREATER | this_NOT_EQUAL_5= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LESS_0=null;
        Token this_LESS_EQUAL_1=null;
        Token this_EQUAL_2=null;
        Token this_GREATER_EQUAL_3=null;
        Token this_GREATER_4=null;
        Token this_NOT_EQUAL_5=null;

         enterRule(); 
            
        try {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2212:6: ( (this_LESS_0= RULE_LESS | this_LESS_EQUAL_1= RULE_LESS_EQUAL | this_EQUAL_2= RULE_EQUAL | this_GREATER_EQUAL_3= RULE_GREATER_EQUAL | this_GREATER_4= RULE_GREATER | this_NOT_EQUAL_5= RULE_NOT_EQUAL ) )
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2213:1: (this_LESS_0= RULE_LESS | this_LESS_EQUAL_1= RULE_LESS_EQUAL | this_EQUAL_2= RULE_EQUAL | this_GREATER_EQUAL_3= RULE_GREATER_EQUAL | this_GREATER_4= RULE_GREATER | this_NOT_EQUAL_5= RULE_NOT_EQUAL )
            {
            // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2213:1: (this_LESS_0= RULE_LESS | this_LESS_EQUAL_1= RULE_LESS_EQUAL | this_EQUAL_2= RULE_EQUAL | this_GREATER_EQUAL_3= RULE_GREATER_EQUAL | this_GREATER_4= RULE_GREATER | this_NOT_EQUAL_5= RULE_NOT_EQUAL )
            int alt28=6;
            switch ( input.LA(1) ) {
            case RULE_LESS:
                {
                alt28=1;
                }
                break;
            case RULE_LESS_EQUAL:
                {
                alt28=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt28=3;
                }
                break;
            case RULE_GREATER_EQUAL:
                {
                alt28=4;
                }
                break;
            case RULE_GREATER:
                {
                alt28=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2213:6: this_LESS_0= RULE_LESS
                    {
                    this_LESS_0=(Token)match(input,RULE_LESS,FOLLOW_RULE_LESS_in_ruleComparisonOperator4886); 

                    		current.merge(this_LESS_0);
                        
                     
                        newLeafNode(this_LESS_0, grammarAccess.getComparisonOperatorAccess().getLESSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2221:10: this_LESS_EQUAL_1= RULE_LESS_EQUAL
                    {
                    this_LESS_EQUAL_1=(Token)match(input,RULE_LESS_EQUAL,FOLLOW_RULE_LESS_EQUAL_in_ruleComparisonOperator4912); 

                    		current.merge(this_LESS_EQUAL_1);
                        
                     
                        newLeafNode(this_LESS_EQUAL_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2229:10: this_EQUAL_2= RULE_EQUAL
                    {
                    this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleComparisonOperator4938); 

                    		current.merge(this_EQUAL_2);
                        
                     
                        newLeafNode(this_EQUAL_2, grammarAccess.getComparisonOperatorAccess().getEQUALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2237:10: this_GREATER_EQUAL_3= RULE_GREATER_EQUAL
                    {
                    this_GREATER_EQUAL_3=(Token)match(input,RULE_GREATER_EQUAL,FOLLOW_RULE_GREATER_EQUAL_in_ruleComparisonOperator4964); 

                    		current.merge(this_GREATER_EQUAL_3);
                        
                     
                        newLeafNode(this_GREATER_EQUAL_3, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2245:10: this_GREATER_4= RULE_GREATER
                    {
                    this_GREATER_4=(Token)match(input,RULE_GREATER,FOLLOW_RULE_GREATER_in_ruleComparisonOperator4990); 

                    		current.merge(this_GREATER_4);
                        
                     
                        newLeafNode(this_GREATER_4, grammarAccess.getComparisonOperatorAccess().getGREATERTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.ocarina.real.xtext/src-gen/org/osate/ocarina/real/xtext/parser/antlr/internal/InternalREALParser.g:2253:10: this_NOT_EQUAL_5= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_5=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleComparisonOperator5016); 

                    		current.merge(this_NOT_EQUAL_5);
                        
                     
                        newLeafNode(this_NOT_EQUAL_5, grammarAccess.getComparisonOperatorAccess().getNOT_EQUALTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\20\uffff";
    static final String DFA14_eofS =
        "\1\4\17\uffff";
    static final String DFA14_minS =
        "\1\45\17\uffff";
    static final String DFA14_maxS =
        "\1\105\17\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\3\1\1\2\13\1";
    static final String DFA14_specialS =
        "\20\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\4\6\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\uffff\1\13\1\17\1"+
            "\15\1\16\1\14\1\12\1\6\1\10\1\11\1\5\1\7\2\uffff\1\4\2\uffff"+
            "\1\4",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 1135:2: ( ( (lv_op_1_0= ruleGenericOperator ) ) ( (lv_e2_2_0= ruleTerminalGenericExpression ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleModel122 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleTheorem205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTheorem221 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleRangeDefinition_in_ruleTheorem247 = new BitSet(new long[]{0x0000000022080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSetDeclaration_in_ruleTheorem268 = new BitSet(new long[]{0x0000000022080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleRequiredDefinition_in_ruleTheorem290 = new BitSet(new long[]{0x0000000022080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationExpression_in_ruleTheorem313 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_ruleTheorem340 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleTheorem354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTheorem370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleTheorem387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeDefinition_in_entryRuleRangeDefinition421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeDefinition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleRangeDefinition469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRangeDefinition485 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleRangeDefinition503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSetExpression_in_ruleRangeDefinition523 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleRangeDefinition536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetDeclaration_in_entryRuleSetDeclaration570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetDeclaration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetDeclaration622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleSetDeclaration639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetDeclaration655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleSetDeclaration671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_AFFECTATION_OPERATOR_in_ruleSetDeclaration683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_BRACE_in_ruleSetDeclaration693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleElementBinding_in_ruleSetDeclaration713 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSetDeclaration726 = new BitSet(new long[]{0x00029F93DD97FFF0L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_ruleSetDeclaration746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_BRACE_in_ruleSetDeclaration757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleSetDeclaration767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementBinding_in_entryRuleElementBinding801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementBinding811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementBinding853 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleElementBinding871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSetExpression_in_ruleElementBinding891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionExpression_in_entryRuleSelectionExpression926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionExpression936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_ruleSelectionExpression982 = new BitSet(new long[]{0x0008A00000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleSelectionExpression1004 = new BitSet(new long[]{0x00029F93DD97FFF0L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_ruleSelectionExpression1025 = new BitSet(new long[]{0x0008A00000000002L});
    public static final BitSet FOLLOW_ruleTerminalSelectionExpression_in_entryRuleTerminalSelectionExpression1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalSelectionExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleTerminalSelectionExpression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelation_in_ruleTerminalSelectionExpression1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelation_in_entryRuleSelectionRelation1180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelation1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationIdentifier_in_ruleSelectionRelation1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleSelectionRelation1247 = new BitSet(new long[]{0x0000008040000000L,0x00000000000009A0L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_ruleSelectionRelation1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_PUNC_COMMA_in_ruleSelectionRelation1280 = new BitSet(new long[]{0x0000008040000000L,0x0000000000000980L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_ruleSelectionRelation1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleSelectionRelation1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationIdentifier_in_entryRuleSelectionRelationIdentifier1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelationIdentifier1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleSelectionRelationIdentifier1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleSelectionRelationIdentifier1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleSelectionRelationIdentifier1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleSelectionRelationIdentifier1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleSelectionRelationIdentifier1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleSelectionRelationIdentifier1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSelectionRelationIdentifier1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleSelectionRelationIdentifier1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleSelectionRelationIdentifier1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleSelectionRelationIdentifier1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionRelationParameter_in_entryRuleSelectionRelationParameter1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionRelationParameter1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleSelectionRelationParameter1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionRelationParameter1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredDefinition_in_entryRuleRequiredDefinition1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredDefinition1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleRequiredDefinition1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleRequiredDefinition1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredDefinition1802 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleRequiredDefinition1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredDefinition1837 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleRequiredDefinition1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleRequiredDefinition1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationExpression_in_entryRuleVerificationExpression1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleVerificationExpression1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleVerificationExpression1957 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleVerificationExpression1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleVerificationExpression1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleVerificationExpression1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleEvaluationExpression2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleEvaluationExpression2090 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleAggregationFunctionIdentifier_in_ruleEvaluationExpression2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleEvaluationExpression2121 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleEvaluationExpression2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleEvaluationExpression2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleEvaluationExpression2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_PUNC_SEMI_COLON_in_ruleEvaluationExpression2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_entryRuleGenericExpression2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericExpression2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_ruleGenericExpression2262 = new BitSet(new long[]{0xFFE8A00000000002L});
    public static final BitSet FOLLOW_ruleGenericOperator_in_ruleGenericExpression2284 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_ruleGenericExpression2305 = new BitSet(new long[]{0xFFE8A00000000002L});
    public static final BitSet FOLLOW_ruleTerminalGenericExpression_in_entryRuleTerminalGenericExpression2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGenericExpression2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleTerminalGenericExpression2394 = new BitSet(new long[]{0x00021F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalGenericExpression2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_ruleTerminalGenericExpression2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_ruleTerminalGenericExpression2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleTerminalGenericExpression2489 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleTerminalGenericExpression2510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleTerminalGenericExpression2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExpression_in_entryRuleSetExpression2556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExpression2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_ruleSetExpression2612 = new BitSet(new long[]{0x01A0000000000002L});
    public static final BitSet FOLLOW_ruleSetOperator_in_ruleSetExpression2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_ruleSetExpression2655 = new BitSet(new long[]{0x01A0000000000002L});
    public static final BitSet FOLLOW_ruleTerminalSetExpression_in_entryRuleTerminalSetExpression2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalSetExpression2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalSetExpression2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryExpression2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleTernaryExpression2834 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2854 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleTernaryExpression2867 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2887 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleTernaryExpression2900 = new BitSet(new long[]{0x00029F93DD968820L,0x0000000000000910L});
    public static final BitSet FOLLOW_ruleGenericExpression_in_ruleTernaryExpression2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_entryRuleVerificationFunctionCall2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionCall2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionIdentifier_in_ruleVerificationFunctionCall3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PUNC_OPEN_PARENTHESIS_in_ruleVerificationFunctionCall3022 = new BitSet(new long[]{0x00001F93DD968820L,0x0000000000000980L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_ruleVerificationFunctionCall3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_PUNC_COMMA_in_ruleVerificationFunctionCall3054 = new BitSet(new long[]{0x00001F93DD968820L,0x0000000000000980L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_ruleVerificationFunctionCall3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_PUNC_CLOSE_PARENTHESIS_in_ruleVerificationFunctionCall3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionParameter_in_entryRuleVerificationFunctionParameter3121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionParameter3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleVerificationFunctionParameter3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationFunctionParameter3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionCall_in_ruleVerificationFunctionParameter3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregationFunctionIdentifier_in_entryRuleAggregationFunctionIdentifier3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregationFunctionIdentifier3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleAggregationFunctionIdentifier3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleAggregationFunctionIdentifier3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationFunctionIdentifier_in_entryRuleVerificationFunctionIdentifier3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationFunctionIdentifier3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleVerificationFunctionIdentifier3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleVerificationFunctionIdentifier3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleVerificationFunctionIdentifier3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleVerificationFunctionIdentifier3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleVerificationFunctionIdentifier3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleVerificationFunctionIdentifier3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleVerificationFunctionIdentifier3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleVerificationFunctionIdentifier3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleVerificationFunctionIdentifier3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleVerificationFunctionIdentifier3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleVerificationFunctionIdentifier3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleVerificationFunctionIdentifier3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleVerificationFunctionIdentifier3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleVerificationFunctionIdentifier3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleVerificationFunctionIdentifier3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleVerificationFunctionIdentifier3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleVerificationFunctionIdentifier3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleVerificationFunctionIdentifier3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleVerificationFunctionIdentifier3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleVerificationFunctionIdentifier3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericOperator_in_entryRuleGenericOperator3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericOperator3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleGenericOperator3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleGenericOperator3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperator_in_ruleGenericOperator3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleLiteral4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_in_ruleLiteral4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleBOOLEAN4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleBOOLEAN4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetOperator_in_entryRuleSetOperator4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetOperator4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSetOperator4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_ruleSetOperator4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_ruleSetOperator4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperator_in_entryRuleArithmeticOperator4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOperator4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleArithmeticOperator4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleArithmeticOperator4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_ruleArithmeticOperator4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_ruleArithmeticOperator4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POWER_in_ruleArithmeticOperator4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator4621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleBooleanOperator4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleBooleanOperator4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBooleanOperator4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator4748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperator4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleUnaryOperator4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator4835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_in_ruleComparisonOperator4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LESS_EQUAL_in_ruleComparisonOperator4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleComparisonOperator4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_EQUAL_in_ruleComparisonOperator4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GREATER_in_ruleComparisonOperator4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleComparisonOperator5016 = new BitSet(new long[]{0x0000000000000002L});

}