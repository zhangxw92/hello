package com.athome.http;

import com.alibaba.fastjson.JSON;
import com.athome.pojo.UUserMemberResponseVO;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.util.Assert;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhangxw03
 * @Dat 2020-11-17 10:33
 * @Describe
 */
public class HttpClientUtil {

    public static void doPostWithObject(Map<String, String> params) {

        String url = "http://localhost:9081/userMember/registerMember2";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);

        List<NameValuePair> list = new ArrayList<NameValuePair>();
        if (params != null && params.size() > 0) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }

        try {
            //使用表单的方式提交参数的时候，后台接口不需要添加@RequestBody
            httpPost.setEntity(new UrlEncodedFormEntity(list));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        CloseableHttpResponse result = null;
        try {
            result = httpClient.execute(httpPost);
            if (result != null) {
                HttpEntity entity = result.getEntity();
                System.out.println("执行结果返回：" + EntityUtils.toString(entity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void doPostWithObject(String json) {
        String url = "http://localhost:9081/userMember/registerMember";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);
        StringEntity stringEntity = null;
        try {
            stringEntity = new StringEntity(json);
            stringEntity.setContentType("application/json;charset=utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(stringEntity);
//        httpPost.addHeader("Content-Type", "application/json"); //设置Headers

//        List<NameValuePair> list = new ArrayList<NameValuePair>();
//        if (params != null && params.size() > 0) {
//            for (Map.Entry<String, String> entry : params.entrySet()) {
//                list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
//            }
//        }

//        try {
//            httpPost.setEntity(new UrlEncodedFormEntity(list));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        CloseableHttpResponse result = null;
        try {
            result = httpClient.execute(httpPost);
            if (result != null) {
                HttpEntity entity = result.getEntity();
                System.out.println("执行结果返回：" + EntityUtils.toString(entity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * public UUserMemberResponseVO registerMember(UUserMemberRequestVO request) {
     * Assert.notNull(request, "注册入参不能为空");
     * Assert.notNull(request.getMobile(), "手机号不能为空");
     * Assert.notNull(request.getPassword(), "密码不能为空");
     * Assert.notNull(request.getVerifyCode(), "手机验证码不能为空");
     * Assert.notNull(request.getOpenId(), "openId不能为空");
     */
    public static void doPostJson(String json) {
        String url = "http://localhost:9081/uUserTemp/updateMobileByAgentCode";
        CloseableHttpClient httpClient = HttpClients.createDefault();


        HttpPost httpPost = new HttpPost(url);
        StringEntity stringEntity = null;
        try {
            stringEntity = new StringEntity(json);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(stringEntity);

        CloseableHttpResponse result = null;
        try {
            result = httpClient.execute(httpPost);
            if (result != null) {
                HttpEntity entity = result.getEntity();
                String content = EntityUtils.toString(entity);
                System.out.println("注册后返回结果：" + content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void doGetWithPrams() {
        //core.cninsure.net/lzgapi/user
        String url = "http://localhost:9081/userMember/getBrowseRecord";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //参数封装
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("id", "0000e94e47b411e9bc64246e965b40f8"));

        URI uri = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameter("agentCode", "730010126");
            uriBuilder.addParameter("saasId", "ff5a67337b6611e89feafa163eb3e537");
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        HttpGet httpGet = new HttpGet(uri);

        CloseableHttpResponse entityResponse = null;
        try {
            entityResponse = httpClient.execute(httpGet);
            if (entityResponse != null) {
                System.out.println("返回状态：" + entityResponse.getStatusLine());

                HttpEntity entity = entityResponse.getEntity();
                System.out.println("返回的报文：" + EntityUtils.toString(entity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (entityResponse != null) {
                    entityResponse.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 不带参数
     */
    public static void doGet() {
        //请求地址
        String url = "http://core.cninsure.net/lzgapi/user/uUser/info/0000e94e47b411e9bc64246e965b40f8";
        //创建http客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get请求
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        //执行请求
        try {
            response = httpClient.execute(httpGet);
            //返回对象
            HttpEntity entity = response.getEntity();
            //返回状态
            StatusLine statusLine = response.getStatusLine();
            System.out.println("返回状态：" + statusLine);
            if (entity != null) {
                System.out.println("相应内容长度：" + entity.getContentLength());
                System.out.println("返回内容：" + EntityUtils.toString(entity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //测试get方法
//        HttpClientUtil.doGet();
//        HttpClientUtil.doGetWithPrams();

        //测试post方法,传json
//        UUserMemberResponseVO request = new UUserMemberResponseVO();
//        request.setMobile("23423423488");
//        request.setAgentCode("700049257");
//        String requestParams = JSON.toJSONString(request);
//        doPostJson(requestParams);
        //测试post方法,传map

//        UUserMemberResponseVO request = new UUserMemberResponseVO();
//        request.setMobile("56756756788");
//        request.setPassword("123456");
//        request.setVerifyCode("888888");
//        request.setOpenId("0000000000001");
//        String requestParams = JSON.toJSONString(request);
//
//        doPostWithObject(requestParams);

        Map<String, String> params = new HashMap<String, String>();
        params.put("mobile", "56756756788");
        params.put("password", "123456");
        params.put("verifyCode", "888888");
        params.put("openId", "0000000000000001");

        doPostWithObject(params);

    }
}
