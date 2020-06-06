/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsletter;

/**
 *
 * @author Jagdish
 */
public class allFunction {
    public static String intro(){
        String s="<!-- THIS EMAIL WAS BUILT AND TESTED WITH LITMUS http://litmus.com -->\n" +
"<!-- IT WAS RELEASED UNDER THE MIT LICENSE https://opensource.org/licenses/MIT -->\n" +
"<!-- QUESTIONS? TWEET US @LITMUSAPP -->\n" +
"<!doctype html>\n" +
"<html>\n" +
"<head>\n" +
"<title></title>\n" +
"<style type=\"text/css\">\n" +
"/* CLIENT-SPECIFIC STYLES */\n" +
"\n" +
"\n" +
"\n" +
"body, table, td, a { -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%; }\n" +
"table, td { mso-table-lspace: 0pt; mso-table-rspace: 0pt; }\n" +
"img { -ms-interpolation-mode: bicubic; }\n" +
"\n" +
"/* RESET STYLES */\n" +
"img { border: 0; height: auto; line-height: 100%; outline: none; text-decoration: none; }\n" +
"table { border-collapse: collapse !important; }\n" +
"body { height: 100% !important; margin: 0 !important; padding: 0 !important; width: 100% !important; }\n" +
"\n" +
"/* iOS BLUE LINKS */\n" +
"a[x-apple-data-detectors] {\n" +
"    color: inherit !important;\n" +
"    text-decoration: none !important;\n" +
"    font-size: inherit !important;\n" +
"    font-family: inherit !important;\n" +
"    font-weight: inherit !important;\n" +
"    line-height: inherit !important;\n" +
"}\n" +
"\n" +
"/* MOBILE STYLES */\n" +
"@media screen and (max-width: 600px) {\n" +
"  .img-max {\n" +
"    width: 100% !important;\n" +
"    max-width: 100% !important;\n" +
"    height: auto !important;\n" +
"  }\n" +
"\n" +
"  .max-width {\n" +
"    max-width: 100% !important;\n" +
"  }\n" +
"\n" +
"  .mobile-wrapper {\n" +
"    width: 85% !important;\n" +
"    max-width: 85% !important;\n" +
"  }\n" +
"\n" +
"  .mobile-padding {\n" +
"    padding-left: 5% !important;\n" +
"    padding-right: 5% !important;\n" +
"  }\n" +
"}\n" +
"\n" +
"/* ANDROID CENTER FIX */\n" +
"div[style*=\"margin: 16px 0;\"] { margin: 0 !important; }\n" +
"</style>\n" +
"</head>\n" +
"<body style=\"margin: 0 !important; padding: 0; !important background-color: #ffffff;\" bgcolor=\"#ffffff\">\n" +
"\n" +
"<!-- HIDDEN PREHEADER TEXT -->\n" +
"<div style=\"display: none; font-size: 1px; color: #fefefe; line-height: 1px; font-family: Open Sans, Helvetica, Arial, sans-serif; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden;\">Presenting the Weekly Newsletter to make your Sunday better!\n" +
"</div>\n" +
"\n" +
"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
"    <tr>\n" +
"        <td align=\"center\" valign=\"top\" width=\"100%\" background=\"bg.jpg\" bgcolor=\"#3b4a69\" style=\"background: #3b4a69 url('bg.jpg'); background-size: cover; padding: 50px 15px;\" class=\"mobile-padding\">\n" +
"            <!--[if (gte mso 9)|(IE)]>\n" +
"            <table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\">\n" +
"            <tr>\n" +
"            <td align=\"center\" valign=\"top\" width=\"600\">\n" +
"            <![endif]-->\n" +
"            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:600px;\">\n" +
"                <tr>\n" +
"                    <td align=\"center\" valign=\"top\" style=\"padding: 0 0 20px 0;\">\n" +
"                        <img src=\"http://resources.wncc-iitb.org/newsletter_header.png\" width=\"85%\" border=\"0\" style=\"display: block;\">\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td align=\"center\" valign=\"top\" style=\"padding: 0; font-family: Open Sans, Helvetica, Arial, sans-serif;\">\n" +
"                       <h1 style=\"font-size: 40px; color: #F8F272;\">WnCC Newsletter</h1> \n" +
"                        <p style=\"color: #F8F272; font-size: 20px; line-height: 28px; margin: 0;\">\n" +
"                          Presenting the Weekly Newsletter to make your Sunday better!\n" +
"                        </p>\n" +
"                    </td>\n" +
"                </tr>\n" +
"            </table>\n" +
"            <!--[if (gte mso 9)|(IE)]>\n" +
"            </td>\n" +
"            </tr>\n" +
"            </table>\n" +
"            <![endif]-->\n" +
"        </td>\n" +
"    </tr>\n" +
"    <tr>\n" +
"        <td align=\"center\" height=\"100%\" valign=\"top\" width=\"100%\" bgcolor=\"#f6f6f6\" style=\"padding: 50px 15px;\" class=\"mobile-padding\">\n" +
"            <!--[if (gte mso 9)|(IE)]>\n" +
"            <table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"600\">\n" +
"            <tr>\n" +
"            <td align=\"center\" valign=\"top\" width=\"600\">\n" +
"            <![endif]-->\n" +
"            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:600px;\">";
        return s;
    }
    
    
    public static String news(String img_link, String img_alt, String news_head, String news_desc, String news_link, int i, String btnType){
        String s="<tr>\n" +
"                    <td align=\"center\" valign=\"top\" style=\"padding: 0 0 25px 0; font-family: Open Sans, Helvetica, Arial, sans-serif;\">\n" +
"                        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                            <tr>\n" +
"                                <td align=\"center\" bgcolor=\"#ffffff\" style=\"border-radius: 3px 3px 0 0;\">\n" +
                in_other_news(i)+"\n"+
"                                    <img src=\""+img_link+"\" alt=\""+img_alt+"\" width=\"600\" height=\"275\" style=\"display: block; border-radius: 3px 3px 0 0; font-family: sans-serif; font-size: 16px; color: #999999;\" class=\"img-max\"/>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" bgcolor=\"#ffffff\" style=\"border-radius: 0 0 3px 3px; padding: 25px;\">\n" +
"                                    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                                        <tr>\n" +
"                                            <td align=\"center\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif;\">\n" +
"                                                <h2 style=\"font-size: 20px; color: #444444; margin: 0; padding-bottom: 10px;\">"+news_head+" \n" +
"\n" +
"\n" +
"\n" +
"                                            </h2>\n" +
"                                                <hr> </hr>\n" +
"                                                <p style=\"color: #999999; font-size: 16px; line-height: 24px; margin: 0;\">\n" +
"                                                	"+news_desc+"\n" +
"                                                	                               </p> </td>\n" +
"                                        </tr>\n" +
"                                        <tr>\n" +
"                                            <td align=\"center\" style=\"padding: 30px 0 0 0;\">\n" +
"                                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"                                                    <tr>\n" +
"                                                        <td align=\"center\" style=\"border-radius: 26px;\" bgcolor=\"#75b6c9\">\n" +
"                                                            <a href=\""+news_link+"\" style=\"font-size: 16px; font-family: Open Sans, Helvetica, Arial, sans-serif; color: #ffffff; text-decoration: none; border-radius: 26px; background-color: #75b6c9; padding: 14px 26px; border: 1px solid #75b6c9; display: block;\">"+btnType+"  &rarr;</a>\n" +
"                                                        </td>\n" +
"                                                    </tr>\n" +
"                                                </table>\n" +
"                                            </td>\n" +
"                                        </tr>\n" +
"                                        \n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                      </table>\n" +
"                    </td>\n" +
"                </tr>";
        return s;
    }
    
    public static String in_other_news(int i){
        if(i==1){
        String s="<br>\n" +
"                                    <h2 style=\"font-size: 20px; color: #444444; margin: 0; padding-bottom: 10px;\">- In Other News -</h2>\n" +
"                                    <hr> </hr>";
        return s;
                }
        else return "";
    }
    
    public static String memesIntro(String links[][], int len){
    
    String s="<tr>\n" +
"\n" +
"                    <td align=\"center\" valign=\"top\" style=\"padding: 25px 0; font-family: Open Sans, Helvetica, Arial, sans-serif;\">\n" +
"                        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                            <tr>\n" +
"                                <td align=\"center\" bgcolor=\"#ffffff\" style=\"border-radius: 3px 3px 0 0;\">\n" +
"                                	<br> <br>\n" +
"                                	<h2 style=\"font-size: 20px; color: #444444; margin: 0; padding-bottom: 10px;\">- Some memes for the week -</h2>\n" +
"                                    <br>";
        for(int i=0; i<len;i++){
            s+=" <hr> \n" +
"                  <img src=\""+links[i][0]+"\"  width=\"600\"  alt =\""+links[i][1]+"\" style=\"display: block; border-radius: 3px 3px 0 0; font-family: sans-serif; font-size: 16px; color: #999999;\" class=\"img-max\"/>";
        }
        s+=" </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" bgcolor=\"#ffffff\" style=\"border-radius: 0 0 3px 3px; padding: 25px;\">\n" +
"                                    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
"                                        <tr>\n" +
"                                            \n" +
"                                        </tr>\n" +
"                                        <tr>\n" +
"                                            \n" +
"                                        </tr>\n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                        </table>\n" +
"                    </td>\n" +
"                </tr>\n" +
"\n" +
"\n" +
"                	\n" +
"\n" +
"                \n" +
"                \n" +
"            </table>\n" +
"            <!--[if (gte mso 9)|(IE)]>\n" +
"            </td>\n" +
"            </tr>\n" +
"            </table>\n" +
"            <![endif]-->\n" +
"        </td>\n" +
"    </tr>\n" +
"</table>\n" +
"   \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"                  \n" +
"              <div style=\"background-color:transparent;\">\n" +
"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid four-up \">\n" +
"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
"\n" +
"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"150\" style=\" width:150px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
"            <div class=\"col num3\" style=\"max-width: 320px;min-width: 150px;display: table-cell;vertical-align: top;\">\n" +
"              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
"\n" +
"                  \n" +
"                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
"<div style=\"color:#555555;line-height:120%;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"> \n" +
"    <div style=\"font-size:12px;line-height:14px;color:#555555;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><a style=\"color:#8F8F8F;text-decoration: underline;\" href=\"http://wncc-iitb.org/\" target=\"_blank\" data-mce-selected=\"1\">Website</a><br data-mce-bogus=\"1\"></p></div>  \n" +
"</div>\n" +
"<!--[if mso]></td></tr></table><![endif]-->\n" +
"\n" +
"                  \n" +
"                  \n" +
"                    <div align=\"center\" class=\"img-container center fixedwidth\" style=\"padding-right: 20px;  padding-left: 20px;\">\n" +
"<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 20px; padding-left: 20px;\" align=\"center\"><![endif]-->\n" +
"<div style=\"line-height:10px;font-size:1px\">&#160;</div>  <a href=\"http://wncc-iitb.org/\" target=\"_blank\">\n" +
"    <img class=\"center fixedwidth\" align=\"center\" border=\"0\" src=\"http://resources.wncc-iitb.org/logo_black_small.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;width: 100%;max-width: 52.5px\" width=\"52.5\">\n" +
"  </a>\n" +
"<div style=\"line-height:10px;font-size:1px\">&#160;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
"</div>\n" +
"\n" +
"                  \n" +
"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
"              </div>\n" +
"            </div>\n" +
"              <!--[if (mso)|(IE)]></td><td align=\"center\" width=\"150\" style=\" width:150px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
"            <div class=\"col num3\" style=\"max-width: 320px;min-width: 150px;display: table-cell;vertical-align: top;\">\n" +
"              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
"\n" +
"                  \n" +
"                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
"<div style=\"color:#555555;line-height:120%;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"> \n" +
"    <div style=\"font-size:12px;line-height:14px;color:#555555;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><a style=\"color:#8F8F8F;text-decoration: underline;\" href=\"https://groups.google.com/forum/#!topic/wncc_iitb/\" target=\"_blank\" data-mce-selected=\"1\">Google Group</a><br></p></div>   \n" +
"</div>\n" +
"<!--[if mso]></td></tr></table><![endif]-->\n" +
"\n" +
"                  \n" +
"                  \n" +
"                    \n" +
"<div align=\"center\" style=\"padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\">\n" +
"  <div style=\"line-height:15px;font-size:1px\">&#160;</div>\n" +
"  <div style=\"display: table; max-width:127px;\">\n" +
"  <!--[if (mso)|(IE)]><table width=\"97\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse; padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\"  align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:97px;\"><tr><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
"        <a href=\"https://groups.google.com/forum/#!topic/wncc_iitb/\" title=\"Google+\" target=\"_blank\">\n" +
"          <img src=\"http://resources.wncc-iitb.org/googlegroups.png\" alt=\"Google+\" title=\"Google+\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
"        </a>\n" +
"      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
"      </td></tr>\n" +
"    </tbody></table>\n" +
"    <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
"  </div>\n" +
"</div>\n" +
"                  \n" +
"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
"              </div>\n" +
"            </div>\n" +
"              <!--[if (mso)|(IE)]></td><td align=\"center\" width=\"150\" style=\" width:150px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
"            <div class=\"col num3\" style=\"max-width: 320px;min-width: 150px;display: table-cell;vertical-align: top;\">\n" +
"              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
"\n" +
"                  \n" +
"                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
"<div style=\"color:#555555;line-height:120%;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"> \n" +
"    <div style=\"font-size:12px;line-height:14px;color:#555555;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><a style=\"color:#8F8F8F;text-decoration: underline;\" href=\"https://www.facebook.com/wncc.iitb/\" target=\"_blank\" data-mce-selected=\"1\">Facebook Page</a><br></p></div> \n" +
"</div>\n" +
"<!--[if mso]></td></tr></table><![endif]-->\n" +
"\n" +
"                  \n" +
"                  \n" +
"                    \n" +
"<div align=\"center\" style=\"padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\">\n" +
"  <div style=\"line-height:15px;font-size:1px\">&#160;</div>\n" +
"  <div style=\"display: table; max-width:127px;\">\n" +
"  <!--[if (mso)|(IE)]><table width=\"97\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse; padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\"  align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:97px;\"><tr><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
"        <a href=\"https://www.facebook.com/wncc.iitb/\" title=\"Facebook\" target=\"_blank\">\n" +
"          <img src=\"http://resources.wncc-iitb.org/facebook@2x.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
"        </a>\n" +
"      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
"      </td></tr>\n" +
"    </tbody></table>\n" +
"    <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
"  </div>\n" +
"</div>\n" +
"                  \n" +
"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
"              </div>\n" +
"            </div>\n" +
"              <!--[if (mso)|(IE)]></td><td align=\"center\" width=\"150\" style=\" width:150px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
"            <div class=\"col num3\" style=\"max-width: 320px;min-width: 150px;display: table-cell;vertical-align: top;\">\n" +
"              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
"\n" +
"                  \n" +
"                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
"<div style=\"color:#555555;line-height:120%;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"> \n" +
"    <div style=\"font-size:12px;line-height:14px;color:#555555;font-family:'Droid Serif', Georgia, Times, 'Times New Roman', serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><a style=\"color:#8F8F8F;text-decoration: underline;\" href=\"https://www.youtube.com/channel/UCs3x_XxwScIAzDUfN1lbbGw\" target=\"_blank\" data-mce-selected=\"1\">YouTube Channel</a><br></p></div>  \n" +
"</div>\n" +
"<!--[if mso]></td></tr></table><![endif]-->\n" +
"\n" +
"                  \n" +
"                  \n" +
"                    \n" +
"<div align=\"center\" style=\"padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\">\n" +
"  <div style=\"line-height:15px;font-size:1px\">&#160;</div>\n" +
"  <div style=\"display: table; max-width:127px;\">\n" +
"  <!--[if (mso)|(IE)]><table width=\"97\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse; padding-right: 15px; padding-left: 15px; padding-bottom: 15px;\"  align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:97px;\"><tr><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
"        <a href=\"https://www.youtube.com/channel/UCs3x_XxwScIAzDUfN1lbbGw\" title=\"YouTube\" target=\"_blank\">\n" +
"          <img src=\"http://resources.wncc-iitb.org/youtube@2x.png\" alt=\"YouTube\" title=\"YouTube\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
"        </a>\n" +
"      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
"      </td></tr>\n" +
"    </tbody></table>\n" +
"    <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
"  </div>\n" +
"</div>\n" +
"                  \n" +
"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
"              </div>\n" +
"            </div>\n" +
"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>    <div style=\"background-color:transparent;\">\n" +
"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
"\n" +
"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
"              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
"\n" +
"                  \n" +
"                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
"\n" +
"<!--[if mso]></td></tr></table><![endif]-->\n" +
"\n" +
"                  \n" +
"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
"              </div>\n" +
"            </div>\n" +
"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>   <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
"        </td>\n" +
"  </tr>\n" +
"  </tbody>\n" +
"  </table>\n" +
"  <!--[if (mso)|(IE)]></div><![endif]-->\n" +
"\n" +
"\n" +
"</body>\n" +
"</html>";
        return s;
}
}
