package com.tencent.could.huiyansdk.entity;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public class HuiYanOsAuthResult {
    public String token = "";

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return s.p(new StringBuilder("HuiYanOsAuthResult{, token='"), this.token, "''}");
    }
}
