package com.javapandeng.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116670448";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDHrB/7zC1lderVBUnxpBqdlWOk+xaygSeM4fNWOhFBc5GkPPk0nx1l9oMSpCJjLbxVT8CuPMyVtph4Z5JiCNqM7saRDq7/DWOKDRIHHovLkW4jqAyjBDmry9Hz2qg1EMJYmcg8bagAZVTmVr6EAeAOrakeuSK/cpNjP6cJd0sB5xEQPCgwE9Ez2T2qtMQJ49FqMqSmJ+YhZrrULC1i1QqwnlEkuLunjSNolsWy8oz72HwflgXB72uSwOdtzSPE96jd+xMgkvH1+FvQ/1vvS2FgnP98bIhepo9q5e33L3J2XSfGpSGAEdrAr1U6d6SZqa8yHkF0RlhB/+1zssMYIVhXAgMBAAECggEAZA6cBGjfgs1hPRgmYsGSWM9InJ76U78m25FKiDYW+Y55OC0Z0EW/zJ2INyoq1TpQ+ws5CdcLyiYzJ3r3PssjAaaRuJT8GnFSJRbBpvGmqf8ZiyKmGnZ+k9lSP3md+uGIEjAVyDpHCtO8hKSJWcs6xQA/FFc/02IN+5klEjhGTQ/jrPXPLB1SvquYCFuKHVIEmgf1XwaLIqzKclW7skCuMoXUG9HSFBqmJWbUwwvZx4Du7dsRqI3F/1DvEw5q/ZZdtvxA/63zkadlm68UL/Q5eZjKxMEaL/oOCpXMO36uIL6H2GsjsiDw5vaD6AlTYJxUcxCPtQYSV3l4dldiNH7TcQKBgQDonMx1UgiFLcNQ4fh1NeIf1pdobbJa1W140PN6Uh63KQFrx4qfKTnXHeNsZ+O7l+EJ6Dexcs9neNlGciK8GSalcgqhObOUVq3FeZvkVdzmfi+5TkKP9SeyYobvZ1BC8evGmtofzXVeruIuhF+YVo+YPYmbK4lgHraHRMUexKs/iQKBgQDbv3tb88PrA2zD2i03fZi1mzXHRy9RBsTfpRIJDbNKXG94AkAcboLcqkLlGZHRB3bGu5btAMvTA7hrIGZ4Uk9YxI/29R9WpA/vRILb9CHtr0/kNPJcPmb0oaHow7fKvRHEhTwHAwtWyUGwgmcQXuLUWcbqEugczUjSo3N+5Q0A3wKBgCO7KkD/R+XFQNJk07iVfVWsrfdRmmsPi9BaMHxirusttlUrAqUuPP9JTQzy7G19iAjwjdWJMEjRrHaAw8snBeO2H+HiLi6kHe9Ond62Pcd+LLCHT/wzCVUCg3203gRaiwAn+0eVVOklbgL9PH33FfmpwkB+sIx+S0V+D9WJGlEZAoGBAKysuJi24hrIJC16QdG65ca+4fFnpGy9LvK2WYe3tk0WeZkJ26r7w+T1/X7dKtHgVZswSRaPa5qy77VuTlb6BtOwEZhzYV7JqKPRaCrCme6VteeTG2cUuf49DGdFdCThkRalw1eXMs/NccrrjWU1ynQm38GLfc00Gqc6PUVXY3JtAoGAOkGGSsxcmbrhe0yaPhxt7GR09PPj5ve7rw8QVHIcFqADlfxelrrIZmDY27ezokkI6+1ok7PZpTNacrpQuJAnnehoqhcy2ON/ms2QynbGCFKDGaw/gBKYxzpcrf62BXalChZV5APagdgNnubrdLeWte/0VYDblv2gb7X/TGdNZto=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAovofA0gnl8s5ZIVewk9BNM1k/WQUkSLS5301iiXRn/CemI9QCXJF7bdrzLimVZ60UzhbGE5Ag3DlCCZM19Uzxw1RhDUMQjrobsElAXpgBnnC3IB+VQQivbmlWxz66REsNuLIv2lhGcj8o9p7vJKdvMoKDArft4DVMllzOFcX00KAOP8Z+GyKUjK5xqffJhMtmqGRVy1IvDVx60SPx9Nc6wfPEReG2owaf1TfCcGlaPKg7t2NBK2Xu18vwOmm7p24kr84kdy62CmP/mNvPuKPDhUa/YR0p4cePdXcdMLrN/muYuw2SSKy1d1IZRa5uXZwp0LM2XSJ1uhvOcGR+HlBJQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "https://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "https://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

