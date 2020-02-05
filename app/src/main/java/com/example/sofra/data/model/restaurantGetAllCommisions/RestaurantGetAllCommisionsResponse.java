
package com.example.sofra.data.model.restaurantGetAllCommisions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RestaurantGetAllCommisionsResponse {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private RestaurantGetAllCommisionsData data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RestaurantGetAllCommisionsData getData() {
        return data;
    }

    public void setData(RestaurantGetAllCommisionsData data) {
        this.data = data;
    }

}