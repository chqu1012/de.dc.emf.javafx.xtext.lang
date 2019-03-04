package de.dc.emf.javafx.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dc.emf.javafx.xtext.services.JavaFXLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaFXLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'packagePath'", "'controls'", "'}'", "'models'", "'bindings'", "'charts'", "'LineChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'yAxisLabel:'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'('", "'width:'", "'attribute:'", "'useFilter:'", "')'", "'true'", "'false'", "'-'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJavaFXLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaFXLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaFXLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJavaFXLang.g"; }



     	private JavaFXLangGrammarAccess grammarAccess;

        public InternalJavaFXLangParser(TokenStream input, JavaFXLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProjectFX";
       	}

       	@Override
       	protected JavaFXLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjectFX"
    // InternalJavaFXLang.g:65:1: entryRuleProjectFX returns [EObject current=null] : iv_ruleProjectFX= ruleProjectFX EOF ;
    public final EObject entryRuleProjectFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectFX = null;


        try {
            // InternalJavaFXLang.g:65:50: (iv_ruleProjectFX= ruleProjectFX EOF )
            // InternalJavaFXLang.g:66:2: iv_ruleProjectFX= ruleProjectFX EOF
            {
             newCompositeNode(grammarAccess.getProjectFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectFX=ruleProjectFX();

            state._fsp--;

             current =iv_ruleProjectFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectFX"


    // $ANTLR start "ruleProjectFX"
    // InternalJavaFXLang.g:72:1: ruleProjectFX returns [EObject current=null] : ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleProjectFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_5_0 = null;

        EObject lv_controls_8_0 = null;

        EObject lv_controls_9_0 = null;

        EObject lv_models_13_0 = null;

        EObject lv_models_14_0 = null;

        EObject lv_bindings_18_0 = null;

        EObject lv_bindings_19_0 = null;

        EObject lv_charts_23_0 = null;

        EObject lv_charts_24_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:78:2: ( ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalJavaFXLang.g:80:3: () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalJavaFXLang.g:80:3: ()
            // InternalJavaFXLang.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectFXAccess().getProjectFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectFXAccess().getProjectFXKeyword_1());
            		
            // InternalJavaFXLang.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:92:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:114:3: (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:115:4: otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:119:4: ( (lv_packagePath_5_0= ruleEString ) )
                    // InternalJavaFXLang.g:120:5: (lv_packagePath_5_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:120:5: (lv_packagePath_5_0= ruleEString )
                    // InternalJavaFXLang.g:121:6: lv_packagePath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getPackagePathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_packagePath_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						set(
                    							current,
                    							"packagePath",
                    							lv_packagePath_5_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:139:3: (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:140:4: otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectFXAccess().getControlsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJavaFXLang.g:148:4: ( (lv_controls_8_0= ruleControlFX ) )
                    // InternalJavaFXLang.g:149:5: (lv_controls_8_0= ruleControlFX )
                    {
                    // InternalJavaFXLang.g:149:5: (lv_controls_8_0= ruleControlFX )
                    // InternalJavaFXLang.g:150:6: lv_controls_8_0= ruleControlFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_controls_8_0=ruleControlFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"controls",
                    							lv_controls_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ControlFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:167:4: ( (lv_controls_9_0= ruleControlFX ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==28||LA2_0==33) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:168:5: (lv_controls_9_0= ruleControlFX )
                    	    {
                    	    // InternalJavaFXLang.g:168:5: (lv_controls_9_0= ruleControlFX )
                    	    // InternalJavaFXLang.g:169:6: lv_controls_9_0= ruleControlFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_controls_9_0=ruleControlFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"controls",
                    	    							lv_controls_9_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.ControlFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalJavaFXLang.g:191:3: (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:192:4: otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectFXAccess().getModelsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJavaFXLang.g:200:4: ( (lv_models_13_0= ruleModelFX ) )
                    // InternalJavaFXLang.g:201:5: (lv_models_13_0= ruleModelFX )
                    {
                    // InternalJavaFXLang.g:201:5: (lv_models_13_0= ruleModelFX )
                    // InternalJavaFXLang.g:202:6: lv_models_13_0= ruleModelFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_models_13_0=ruleModelFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"models",
                    							lv_models_13_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ModelFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:219:4: ( (lv_models_14_0= ruleModelFX ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==31) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:220:5: (lv_models_14_0= ruleModelFX )
                    	    {
                    	    // InternalJavaFXLang.g:220:5: (lv_models_14_0= ruleModelFX )
                    	    // InternalJavaFXLang.g:221:6: lv_models_14_0= ruleModelFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_models_14_0=ruleModelFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"models",
                    	    							lv_models_14_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.ModelFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalJavaFXLang.g:243:3: (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:244:4: otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjectFXAccess().getBindingsKeyword_7_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalJavaFXLang.g:252:4: ( (lv_bindings_18_0= ruleBinding ) )
                    // InternalJavaFXLang.g:253:5: (lv_bindings_18_0= ruleBinding )
                    {
                    // InternalJavaFXLang.g:253:5: (lv_bindings_18_0= ruleBinding )
                    // InternalJavaFXLang.g:254:6: lv_bindings_18_0= ruleBinding
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_bindings_18_0=ruleBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"bindings",
                    							lv_bindings_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Binding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:271:4: ( (lv_bindings_19_0= ruleBinding ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:272:5: (lv_bindings_19_0= ruleBinding )
                    	    {
                    	    // InternalJavaFXLang.g:272:5: (lv_bindings_19_0= ruleBinding )
                    	    // InternalJavaFXLang.g:273:6: lv_bindings_19_0= ruleBinding
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_bindings_19_0=ruleBinding();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bindings",
                    	    							lv_bindings_19_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.Binding");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalJavaFXLang.g:295:3: (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:296:4: otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getProjectFXAccess().getChartsKeyword_8_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalJavaFXLang.g:304:4: ( (lv_charts_23_0= ruleChartFX ) )
                    // InternalJavaFXLang.g:305:5: (lv_charts_23_0= ruleChartFX )
                    {
                    // InternalJavaFXLang.g:305:5: (lv_charts_23_0= ruleChartFX )
                    // InternalJavaFXLang.g:306:6: lv_charts_23_0= ruleChartFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_charts_23_0=ruleChartFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"charts",
                    							lv_charts_23_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ChartFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:323:4: ( (lv_charts_24_0= ruleChartFX ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:324:5: (lv_charts_24_0= ruleChartFX )
                    	    {
                    	    // InternalJavaFXLang.g:324:5: (lv_charts_24_0= ruleChartFX )
                    	    // InternalJavaFXLang.g:325:6: lv_charts_24_0= ruleChartFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_charts_24_0=ruleChartFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"charts",
                    	    							lv_charts_24_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.ChartFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleProjectFX"


    // $ANTLR start "entryRuleChartFX"
    // InternalJavaFXLang.g:355:1: entryRuleChartFX returns [EObject current=null] : iv_ruleChartFX= ruleChartFX EOF ;
    public final EObject entryRuleChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChartFX = null;


        try {
            // InternalJavaFXLang.g:355:48: (iv_ruleChartFX= ruleChartFX EOF )
            // InternalJavaFXLang.g:356:2: iv_ruleChartFX= ruleChartFX EOF
            {
             newCompositeNode(grammarAccess.getChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChartFX=ruleChartFX();

            state._fsp--;

             current =iv_ruleChartFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChartFX"


    // $ANTLR start "ruleChartFX"
    // InternalJavaFXLang.g:362:1: ruleChartFX returns [EObject current=null] : this_LineChartFX_0= ruleLineChartFX ;
    public final EObject ruleChartFX() throws RecognitionException {
        EObject current = null;

        EObject this_LineChartFX_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:368:2: (this_LineChartFX_0= ruleLineChartFX )
            // InternalJavaFXLang.g:369:2: this_LineChartFX_0= ruleLineChartFX
            {

            		newCompositeNode(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_LineChartFX_0=ruleLineChartFX();

            state._fsp--;


            		current = this_LineChartFX_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleChartFX"


    // $ANTLR start "entryRuleLineChartFX"
    // InternalJavaFXLang.g:380:1: entryRuleLineChartFX returns [EObject current=null] : iv_ruleLineChartFX= ruleLineChartFX EOF ;
    public final EObject entryRuleLineChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChartFX = null;


        try {
            // InternalJavaFXLang.g:380:52: (iv_ruleLineChartFX= ruleLineChartFX EOF )
            // InternalJavaFXLang.g:381:2: iv_ruleLineChartFX= ruleLineChartFX EOF
            {
             newCompositeNode(grammarAccess.getLineChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChartFX=ruleLineChartFX();

            state._fsp--;

             current =iv_ruleLineChartFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineChartFX"


    // $ANTLR start "ruleLineChartFX"
    // InternalJavaFXLang.g:387:1: ruleLineChartFX returns [EObject current=null] : ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleLineChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_16_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:393:2: ( ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )? otherlv_17= '}' ) )
            // InternalJavaFXLang.g:394:2: ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )? otherlv_17= '}' )
            {
            // InternalJavaFXLang.g:394:2: ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )? otherlv_17= '}' )
            // InternalJavaFXLang.g:395:3: () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )? otherlv_17= '}'
            {
            // InternalJavaFXLang.g:395:3: ()
            // InternalJavaFXLang.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineChartFXAccess().getLineChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLineChartFXAccess().getLineChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLineChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:414:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:415:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:415:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:416:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLineChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:433:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:434:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getLineChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:438:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:439:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:439:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:440:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:458:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:459:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getLineChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:463:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:464:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:464:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:465:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:483:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:484:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:488:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:489:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:489:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:490:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:508:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:509:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getLineChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:513:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:514:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:514:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:515:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:533:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaFXLang.g:534:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getLineChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:538:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:539:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:539:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:540:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:558:3: (otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaFXLang.g:559:4: otherlv_15= 'yAxisLabel:' ( (lv_yAxisLabel_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:563:4: ( (lv_yAxisLabel_16_0= ruleEString ) )
                    // InternalJavaFXLang.g:564:5: (lv_yAxisLabel_16_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:564:5: (lv_yAxisLabel_16_0= ruleEString )
                    // InternalJavaFXLang.g:565:6: lv_yAxisLabel_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisLabel_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleLineChartFX"


    // $ANTLR start "entryRuleBinding"
    // InternalJavaFXLang.g:591:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalJavaFXLang.g:591:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalJavaFXLang.g:592:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalJavaFXLang.g:598:1: ruleBinding returns [EObject current=null] : ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_property_4_0 = null;

        EObject lv_property_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:604:2: ( ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:605:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:605:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:606:3: () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:606:3: ()
            // InternalJavaFXLang.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingAccess().getBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getBindingKeyword_1());
            		
            // InternalJavaFXLang.g:617:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:618:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:618:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:619:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:640:3: ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=47 && LA17_0<=53)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJavaFXLang.g:641:4: ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )*
                    {
                    // InternalJavaFXLang.g:641:4: ( (lv_property_4_0= ruleBindingProperty ) )
                    // InternalJavaFXLang.g:642:5: (lv_property_4_0= ruleBindingProperty )
                    {
                    // InternalJavaFXLang.g:642:5: (lv_property_4_0= ruleBindingProperty )
                    // InternalJavaFXLang.g:643:6: lv_property_4_0= ruleBindingProperty
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_property_4_0=ruleBindingProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						add(
                    							current,
                    							"property",
                    							lv_property_4_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.BindingProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:660:4: ( (lv_property_5_0= ruleBindingProperty ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=47 && LA16_0<=53)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:661:5: (lv_property_5_0= ruleBindingProperty )
                    	    {
                    	    // InternalJavaFXLang.g:661:5: (lv_property_5_0= ruleBindingProperty )
                    	    // InternalJavaFXLang.g:662:6: lv_property_5_0= ruleBindingProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_property_5_0=ruleBindingProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"property",
                    	    							lv_property_5_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.BindingProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingProperty"
    // InternalJavaFXLang.g:688:1: entryRuleBindingProperty returns [EObject current=null] : iv_ruleBindingProperty= ruleBindingProperty EOF ;
    public final EObject entryRuleBindingProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProperty = null;


        try {
            // InternalJavaFXLang.g:688:56: (iv_ruleBindingProperty= ruleBindingProperty EOF )
            // InternalJavaFXLang.g:689:2: iv_ruleBindingProperty= ruleBindingProperty EOF
            {
             newCompositeNode(grammarAccess.getBindingPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingProperty=ruleBindingProperty();

            state._fsp--;

             current =iv_ruleBindingProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBindingProperty"


    // $ANTLR start "ruleBindingProperty"
    // InternalJavaFXLang.g:695:1: ruleBindingProperty returns [EObject current=null] : ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBindingProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:701:2: ( ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:702:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:702:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:703:3: () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:703:3: ()
            // InternalJavaFXLang.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:710:3: ( (lv_type_1_0= ruleBindinType ) )
            // InternalJavaFXLang.g:711:4: (lv_type_1_0= ruleBindinType )
            {
            // InternalJavaFXLang.g:711:4: (lv_type_1_0= ruleBindinType )
            // InternalJavaFXLang.g:712:5: lv_type_1_0= ruleBindinType
            {

            					newCompositeNode(grammarAccess.getBindingPropertyAccess().getTypeBindinTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleBindinType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.BindinType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:729:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:730:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:730:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:731:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
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
    // $ANTLR end "ruleBindingProperty"


    // $ANTLR start "entryRuleControlFX"
    // InternalJavaFXLang.g:752:1: entryRuleControlFX returns [EObject current=null] : iv_ruleControlFX= ruleControlFX EOF ;
    public final EObject entryRuleControlFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFX = null;


        try {
            // InternalJavaFXLang.g:752:50: (iv_ruleControlFX= ruleControlFX EOF )
            // InternalJavaFXLang.g:753:2: iv_ruleControlFX= ruleControlFX EOF
            {
             newCompositeNode(grammarAccess.getControlFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFX=ruleControlFX();

            state._fsp--;

             current =iv_ruleControlFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlFX"


    // $ANTLR start "ruleControlFX"
    // InternalJavaFXLang.g:759:1: ruleControlFX returns [EObject current=null] : (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX ) ;
    public final EObject ruleControlFX() throws RecognitionException {
        EObject current = null;

        EObject this_TableViewFX_0 = null;

        EObject this_FilteredTableViewFX_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:765:2: ( (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX ) )
            // InternalJavaFXLang.g:766:2: (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX )
            {
            // InternalJavaFXLang.g:766:2: (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:767:3: this_TableViewFX_0= ruleTableViewFX
                    {

                    			newCompositeNode(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableViewFX_0=ruleTableViewFX();

                    state._fsp--;


                    			current = this_TableViewFX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:776:3: this_FilteredTableViewFX_1= ruleFilteredTableViewFX
                    {

                    			newCompositeNode(grammarAccess.getControlFXAccess().getFilteredTableViewFXParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilteredTableViewFX_1=ruleFilteredTableViewFX();

                    state._fsp--;


                    			current = this_FilteredTableViewFX_1;
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
    // $ANTLR end "ruleControlFX"


    // $ANTLR start "entryRuleFilteredTableViewFX"
    // InternalJavaFXLang.g:788:1: entryRuleFilteredTableViewFX returns [EObject current=null] : iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF ;
    public final EObject entryRuleFilteredTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredTableViewFX = null;


        try {
            // InternalJavaFXLang.g:788:60: (iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:789:2: iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF
            {
             newCompositeNode(grammarAccess.getFilteredTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilteredTableViewFX=ruleFilteredTableViewFX();

            state._fsp--;

             current =iv_ruleFilteredTableViewFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilteredTableViewFX"


    // $ANTLR start "ruleFilteredTableViewFX"
    // InternalJavaFXLang.g:795:1: ruleFilteredTableViewFX returns [EObject current=null] : ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleFilteredTableViewFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_useFilter_8_0 = null;

        EObject lv_columns_9_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:801:2: ( ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' ) )
            // InternalJavaFXLang.g:802:2: ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' )
            {
            // InternalJavaFXLang.g:802:2: ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' )
            // InternalJavaFXLang.g:803:3: () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}'
            {
            // InternalJavaFXLang.g:803:3: ()
            // InternalJavaFXLang.g:804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFilteredTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:818:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:819:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getFilteredTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:823:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:824:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:824:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:825:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_29);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:843:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:844:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:848:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:849:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:849:5: ( ruleEString )
                    // InternalJavaFXLang.g:850:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:865:3: (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:866:4: otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:870:4: ( (lv_useFilter_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:871:5: (lv_useFilter_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:871:5: (lv_useFilter_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:872:6: lv_useFilter_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_useFilter_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    						set(
                    							current,
                    							"useFilter",
                    							lv_useFilter_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:890:3: ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:891:4: ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:891:4: ( (lv_columns_9_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:892:5: (lv_columns_9_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:892:5: (lv_columns_9_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:893:6: lv_columns_9_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_columns_9_0=ruleTableColumnFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_9_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:910:4: ( (lv_columns_10_0= ruleTableColumnFX ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==34) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:911:5: (lv_columns_10_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:911:5: (lv_columns_10_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:912:6: lv_columns_10_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_columns_10_0=ruleTableColumnFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"columns",
                    	    							lv_columns_10_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFilteredTableViewFXAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFilteredTableViewFX"


    // $ANTLR start "entryRuleEString"
    // InternalJavaFXLang.g:938:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJavaFXLang.g:938:47: (iv_ruleEString= ruleEString EOF )
            // InternalJavaFXLang.g:939:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJavaFXLang.g:945:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:951:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJavaFXLang.g:952:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJavaFXLang.g:952:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:953:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:961:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleModelFX"
    // InternalJavaFXLang.g:972:1: entryRuleModelFX returns [EObject current=null] : iv_ruleModelFX= ruleModelFX EOF ;
    public final EObject entryRuleModelFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFX = null;


        try {
            // InternalJavaFXLang.g:972:48: (iv_ruleModelFX= ruleModelFX EOF )
            // InternalJavaFXLang.g:973:2: iv_ruleModelFX= ruleModelFX EOF
            {
             newCompositeNode(grammarAccess.getModelFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFX=ruleModelFX();

            state._fsp--;

             current =iv_ruleModelFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelFX"


    // $ANTLR start "ruleModelFX"
    // InternalJavaFXLang.g:979:1: ruleModelFX returns [EObject current=null] : (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) ;
    public final EObject ruleModelFX() throws RecognitionException {
        EObject current = null;

        EObject this_DerivedBean_0 = null;

        EObject this_Bean_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:985:2: ( (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) )
            // InternalJavaFXLang.g:986:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            {
            // InternalJavaFXLang.g:986:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_STRING) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==12) ) {
                        int LA24_4 = input.LA(4);

                        if ( (LA24_4==32) ) {
                            alt24=1;
                        }
                        else if ( ((LA24_4>=RULE_STRING && LA24_4<=RULE_ID)||LA24_4==15) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1==RULE_ID) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==12) ) {
                        int LA24_4 = input.LA(4);

                        if ( (LA24_4==32) ) {
                            alt24=1;
                        }
                        else if ( ((LA24_4>=RULE_STRING && LA24_4<=RULE_ID)||LA24_4==15) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:987:3: this_DerivedBean_0= ruleDerivedBean
                    {

                    			newCompositeNode(grammarAccess.getModelFXAccess().getDerivedBeanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedBean_0=ruleDerivedBean();

                    state._fsp--;


                    			current = this_DerivedBean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:996:3: this_Bean_1= ruleBean
                    {

                    			newCompositeNode(grammarAccess.getModelFXAccess().getBeanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bean_1=ruleBean();

                    state._fsp--;


                    			current = this_Bean_1;
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
    // $ANTLR end "ruleModelFX"


    // $ANTLR start "entryRuleDerivedBean"
    // InternalJavaFXLang.g:1008:1: entryRuleDerivedBean returns [EObject current=null] : iv_ruleDerivedBean= ruleDerivedBean EOF ;
    public final EObject entryRuleDerivedBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedBean = null;


        try {
            // InternalJavaFXLang.g:1008:52: (iv_ruleDerivedBean= ruleDerivedBean EOF )
            // InternalJavaFXLang.g:1009:2: iv_ruleDerivedBean= ruleDerivedBean EOF
            {
             newCompositeNode(grammarAccess.getDerivedBeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedBean=ruleDerivedBean();

            state._fsp--;

             current =iv_ruleDerivedBean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDerivedBean"


    // $ANTLR start "ruleDerivedBean"
    // InternalJavaFXLang.g:1015:1: ruleDerivedBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleDerivedBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceType_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1021:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) )
            // InternalJavaFXLang.g:1022:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            {
            // InternalJavaFXLang.g:1022:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            // InternalJavaFXLang.g:1023:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}'
            {
            // InternalJavaFXLang.g:1023:3: ()
            // InternalJavaFXLang.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:1034:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:1035:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:1035:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:1036:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDerivedBeanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:1057:3: (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) )
            // InternalJavaFXLang.g:1058:4: otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,32,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0());
            			
            // InternalJavaFXLang.g:1062:4: ( (lv_instanceType_5_0= ruleEString ) )
            // InternalJavaFXLang.g:1063:5: (lv_instanceType_5_0= ruleEString )
            {
            // InternalJavaFXLang.g:1063:5: (lv_instanceType_5_0= ruleEString )
            // InternalJavaFXLang.g:1064:6: lv_instanceType_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_33);
            lv_instanceType_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
            						}
            						set(
            							current,
            							"instanceType",
            							lv_instanceType_5_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:1082:3: ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJavaFXLang.g:1083:4: ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:1083:4: ( (lv_attributes_6_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:1084:5: (lv_attributes_6_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:1084:5: (lv_attributes_6_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:1085:6: lv_attributes_6_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_attributes_6_0=ruleAttributeFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:1102:4: ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:1103:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:1103:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:1104:6: lv_attributes_7_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_attributes_7_0=ruleAttributeFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_7_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDerivedBeanAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDerivedBean"


    // $ANTLR start "entryRuleBean"
    // InternalJavaFXLang.g:1130:1: entryRuleBean returns [EObject current=null] : iv_ruleBean= ruleBean EOF ;
    public final EObject entryRuleBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBean = null;


        try {
            // InternalJavaFXLang.g:1130:45: (iv_ruleBean= ruleBean EOF )
            // InternalJavaFXLang.g:1131:2: iv_ruleBean= ruleBean EOF
            {
             newCompositeNode(grammarAccess.getBeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBean=ruleBean();

            state._fsp--;

             current =iv_ruleBean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBean"


    // $ANTLR start "ruleBean"
    // InternalJavaFXLang.g:1137:1: ruleBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1143:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:1144:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:1144:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:1145:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:1145:3: ()
            // InternalJavaFXLang.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeanAccess().getBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:1156:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:1157:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:1157:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:1158:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBeanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:1179:3: ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:1180:4: ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:1180:4: ( (lv_attributes_4_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:1181:5: (lv_attributes_4_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:1181:5: (lv_attributes_4_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:1182:6: lv_attributes_4_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_attributes_4_0=ruleAttributeFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBeanRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:1199:4: ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:1200:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:1200:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:1201:6: lv_attributes_5_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_attributes_5_0=ruleAttributeFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBeanRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_5_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBeanAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBean"


    // $ANTLR start "entryRuleTableViewFX"
    // InternalJavaFXLang.g:1227:1: entryRuleTableViewFX returns [EObject current=null] : iv_ruleTableViewFX= ruleTableViewFX EOF ;
    public final EObject entryRuleTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableViewFX = null;


        try {
            // InternalJavaFXLang.g:1227:52: (iv_ruleTableViewFX= ruleTableViewFX EOF )
            // InternalJavaFXLang.g:1228:2: iv_ruleTableViewFX= ruleTableViewFX EOF
            {
             newCompositeNode(grammarAccess.getTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableViewFX=ruleTableViewFX();

            state._fsp--;

             current =iv_ruleTableViewFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTableViewFX"


    // $ANTLR start "ruleTableViewFX"
    // InternalJavaFXLang.g:1234:1: ruleTableViewFX returns [EObject current=null] : ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleTableViewFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_columns_8_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1240:2: ( ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) )
            // InternalJavaFXLang.g:1241:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            {
            // InternalJavaFXLang.g:1241:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            // InternalJavaFXLang.g:1242:3: () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}'
            {
            // InternalJavaFXLang.g:1242:3: ()
            // InternalJavaFXLang.g:1243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableViewFXAccess().getTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableViewFXAccess().getTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:1257:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:1258:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:1262:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:1263:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:1263:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:1264:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_34);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:1282:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:1283:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:1287:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:1288:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:1288:5: ( ruleEString )
                    // InternalJavaFXLang.g:1289:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1304:3: ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:1305:4: ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:1305:4: ( (lv_columns_7_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:1306:5: (lv_columns_7_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:1306:5: (lv_columns_7_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:1307:6: lv_columns_7_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_columns_7_0=ruleTableColumnFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_7_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:1324:4: ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==34) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:1325:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:1325:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:1326:6: lv_columns_8_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_columns_8_0=ruleTableColumnFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"columns",
                    	    							lv_columns_8_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTableViewFX"


    // $ANTLR start "entryRuleTableColumnFX"
    // InternalJavaFXLang.g:1352:1: entryRuleTableColumnFX returns [EObject current=null] : iv_ruleTableColumnFX= ruleTableColumnFX EOF ;
    public final EObject entryRuleTableColumnFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableColumnFX = null;


        try {
            // InternalJavaFXLang.g:1352:54: (iv_ruleTableColumnFX= ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:1353:2: iv_ruleTableColumnFX= ruleTableColumnFX EOF
            {
             newCompositeNode(grammarAccess.getTableColumnFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableColumnFX=ruleTableColumnFX();

            state._fsp--;

             current =iv_ruleTableColumnFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTableColumnFX"


    // $ANTLR start "ruleTableColumnFX"
    // InternalJavaFXLang.g:1359:1: ruleTableColumnFX returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' ) ;
    public final EObject ruleTableColumnFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_useFilter_10_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1365:2: ( ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' ) )
            // InternalJavaFXLang.g:1366:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' )
            {
            // InternalJavaFXLang.g:1366:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' )
            // InternalJavaFXLang.g:1367:3: () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')'
            {
            // InternalJavaFXLang.g:1367:3: ()
            // InternalJavaFXLang.g:1368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getTableColumnFXAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJavaFXLang.g:1382:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:1383:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:1387:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:1388:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:1388:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:1389:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_36);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:1407:3: (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:1408:4: otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:1412:4: ( (lv_width_6_0= ruleEInt ) )
                    // InternalJavaFXLang.g:1413:5: (lv_width_6_0= ruleEInt )
                    {
                    // InternalJavaFXLang.g:1413:5: (lv_width_6_0= ruleEInt )
                    // InternalJavaFXLang.g:1414:6: lv_width_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_width_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1432:3: (otherlv_7= 'attribute:' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:1433:4: otherlv_7= 'attribute:' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:1437:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:1438:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:1438:5: ( ruleEString )
                    // InternalJavaFXLang.g:1439:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableColumnFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1454:3: (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:1455:4: otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:1459:4: ( (lv_useFilter_10_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:1460:5: (lv_useFilter_10_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:1460:5: (lv_useFilter_10_0= ruleEBoolean )
                    // InternalJavaFXLang.g:1461:6: lv_useFilter_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUseFilterEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_useFilter_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
                    						}
                    						set(
                    							current,
                    							"useFilter",
                    							lv_useFilter_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleTableColumnFX"


    // $ANTLR start "entryRuleEBoolean"
    // InternalJavaFXLang.g:1487:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalJavaFXLang.g:1487:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalJavaFXLang.g:1488:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalJavaFXLang.g:1494:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1500:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJavaFXLang.g:1501:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJavaFXLang.g:1501:2: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            else if ( (LA35_0==41) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:1502:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:1508:3: kw= 'false'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalJavaFXLang.g:1517:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJavaFXLang.g:1517:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJavaFXLang.g:1518:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJavaFXLang.g:1524:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1530:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJavaFXLang.g:1531:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJavaFXLang.g:1531:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJavaFXLang.g:1532:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJavaFXLang.g:1532:3: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:1533:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAttributeFX"
    // InternalJavaFXLang.g:1550:1: entryRuleAttributeFX returns [EObject current=null] : iv_ruleAttributeFX= ruleAttributeFX EOF ;
    public final EObject entryRuleAttributeFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFX = null;


        try {
            // InternalJavaFXLang.g:1550:52: (iv_ruleAttributeFX= ruleAttributeFX EOF )
            // InternalJavaFXLang.g:1551:2: iv_ruleAttributeFX= ruleAttributeFX EOF
            {
             newCompositeNode(grammarAccess.getAttributeFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeFX=ruleAttributeFX();

            state._fsp--;

             current =iv_ruleAttributeFX; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeFX"


    // $ANTLR start "ruleAttributeFX"
    // InternalJavaFXLang.g:1557:1: ruleAttributeFX returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeFX() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1563:2: ( ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:1564:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:1564:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:1565:3: () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:1565:3: ()
            // InternalJavaFXLang.g:1566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeFXAccess().getAttributeFXAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:1572:3: ( (lv_type_1_0= ruleEString ) )
            // InternalJavaFXLang.g:1573:4: (lv_type_1_0= ruleEString )
            {
            // InternalJavaFXLang.g:1573:4: (lv_type_1_0= ruleEString )
            // InternalJavaFXLang.g:1574:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeFXRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:1591:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:1592:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:1592:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:1593:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
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
    // $ANTLR end "ruleAttributeFX"


    // $ANTLR start "ruleOrientation"
    // InternalJavaFXLang.g:1614:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1620:2: ( ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) ) )
            // InternalJavaFXLang.g:1621:2: ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) )
            {
            // InternalJavaFXLang.g:1621:2: ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt37=1;
                }
                break;
            case 44:
                {
                alt37=2;
                }
                break;
            case 45:
                {
                alt37=3;
                }
                break;
            case 46:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalJavaFXLang.g:1622:3: (enumLiteral_0= 'Bottom' )
                    {
                    // InternalJavaFXLang.g:1622:3: (enumLiteral_0= 'Bottom' )
                    // InternalJavaFXLang.g:1623:4: enumLiteral_0= 'Bottom'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:1630:3: (enumLiteral_1= 'Left' )
                    {
                    // InternalJavaFXLang.g:1630:3: (enumLiteral_1= 'Left' )
                    // InternalJavaFXLang.g:1631:4: enumLiteral_1= 'Left'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:1638:3: (enumLiteral_2= 'Right' )
                    {
                    // InternalJavaFXLang.g:1638:3: (enumLiteral_2= 'Right' )
                    // InternalJavaFXLang.g:1639:4: enumLiteral_2= 'Right'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:1646:3: (enumLiteral_3= 'Top' )
                    {
                    // InternalJavaFXLang.g:1646:3: (enumLiteral_3= 'Top' )
                    // InternalJavaFXLang.g:1647:4: enumLiteral_3= 'Top'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "ruleBindinType"
    // InternalJavaFXLang.g:1657:1: ruleBindinType returns [Enumerator current=null] : ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) ;
    public final Enumerator ruleBindinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1663:2: ( ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) )
            // InternalJavaFXLang.g:1664:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            {
            // InternalJavaFXLang.g:1664:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            int alt38=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 48:
                {
                alt38=2;
                }
                break;
            case 49:
                {
                alt38=3;
                }
                break;
            case 50:
                {
                alt38=4;
                }
                break;
            case 51:
                {
                alt38=5;
                }
                break;
            case 52:
                {
                alt38=6;
                }
                break;
            case 53:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:1665:3: (enumLiteral_0= 'BooleanProperty' )
                    {
                    // InternalJavaFXLang.g:1665:3: (enumLiteral_0= 'BooleanProperty' )
                    // InternalJavaFXLang.g:1666:4: enumLiteral_0= 'BooleanProperty'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:1673:3: (enumLiteral_1= 'DoubleProperty' )
                    {
                    // InternalJavaFXLang.g:1673:3: (enumLiteral_1= 'DoubleProperty' )
                    // InternalJavaFXLang.g:1674:4: enumLiteral_1= 'DoubleProperty'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:1681:3: (enumLiteral_2= 'FloatProperty' )
                    {
                    // InternalJavaFXLang.g:1681:3: (enumLiteral_2= 'FloatProperty' )
                    // InternalJavaFXLang.g:1682:4: enumLiteral_2= 'FloatProperty'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:1689:3: (enumLiteral_3= 'IntegerProperty' )
                    {
                    // InternalJavaFXLang.g:1689:3: (enumLiteral_3= 'IntegerProperty' )
                    // InternalJavaFXLang.g:1690:4: enumLiteral_3= 'IntegerProperty'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:1697:3: (enumLiteral_4= 'ObservableList' )
                    {
                    // InternalJavaFXLang.g:1697:3: (enumLiteral_4= 'ObservableList' )
                    // InternalJavaFXLang.g:1698:4: enumLiteral_4= 'ObservableList'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:1705:3: (enumLiteral_5= 'ObjectProperty' )
                    {
                    // InternalJavaFXLang.g:1705:3: (enumLiteral_5= 'ObjectProperty' )
                    // InternalJavaFXLang.g:1706:4: enumLiteral_5= 'ObjectProperty'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:1713:3: (enumLiteral_6= 'StringProperty' )
                    {
                    // InternalJavaFXLang.g:1713:3: (enumLiteral_6= 'StringProperty' )
                    // InternalJavaFXLang.g:1714:4: enumLiteral_6= 'StringProperty'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleBindinType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000210008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007E08000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007C08000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000007808000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000007008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x003F800000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000460008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000440008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000420008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});

}