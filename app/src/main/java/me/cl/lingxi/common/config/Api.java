package me.cl.lingxi.common.config;

import me.cl.lingxi.BuildConfig;

/**
 * api manage
 * Created by bafsj on 17/3/1.
 */
public class Api {

    // 版本设置由gradle接管，通过flavor控制多版本
    public static String baseUrl = BuildConfig.BaseUrl;

    /**
     * 用户注册
     */
    public static String userRegister = baseUrl + "/user/register";
    /**
     * 用户登录
     */
    public static String userLogin = baseUrl + "/user/login";
    /**
     * 重置密码
     */
    public static String resetPassword = baseUrl + "/user/reset";
    /**
     * 更新用户信息
     */
    public static String updateUser = baseUrl + "/user/update";
    /**
     * 获取用户信息
     */
    public static String userInfo = baseUrl + "/user/info";
    /**
     * 融云用户列表
     */
    public static String listRcUser = baseUrl + "/user/rc/list";
    /**
     * 动态列表
     */
    public static String pageFeed = baseUrl + "/feed/page";
    /**
     * 发布动态
     */
    public static String saveFeed = baseUrl + "/feed/save";
    /**
     * 查看动态
     */
    public static String viewFeed = baseUrl + "/feed/view";
    /**
     * 与我相关
     */
    public static String relevant = baseUrl + "/feed/relevant";
    /**
     * 我的回复
     */
    public static String mineReply = baseUrl + "/mine/reply";
    /**
     * 新增动态操作,如点赞
     */
    public static String saveAction = baseUrl + "/feed/action/save";
    /**
     * 移除动态操作,如取消赞
     */
    public static String removeAction = baseUrl + "/feed/action/remove";
    /**
     * 动态评论列表
     */
    public static String pageComment = baseUrl + "/feed/comment/page";
    /**
     * 新增动态评论
     */
    public static String saveComment = baseUrl + "/feed/comment/save";
    /**
     * 获取最新app版本
     */
    public static String latestVersion = baseUrl + "/app/version/latest";
    /**
     * 获取oss token
     */
    public static String ossToken = baseUrl + "/ali/oss/token";

}