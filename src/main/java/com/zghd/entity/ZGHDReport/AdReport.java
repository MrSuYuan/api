package com.zghd.entity.ZGHDReport;

/**
 * 广告位统计id
 */
public class AdReport {

    /**
     * 广告位id
     */
    private String appName;
    /**
     * 广告位id
     */
    private String appId;
    /**
     * 广告位id
     */
    private String slotId;
    /**
     * 时间
     */
    private String createTime;
    /**
     * 请求
     */
    private int request;
    /**
     * 返回
     */
    private int response;
    /**
     * 曝光
     */
    private int look;
    /**
     * 点击
     */
    private int click;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
