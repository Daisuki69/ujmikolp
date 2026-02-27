package com.tencent.could.huiyansdk.entity;

import We.s;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class LiveTypeResult {

    @InterfaceC1498b("action_data")
    public String actionData;

    @InterfaceC1498b("colorData")
    public String colorData;

    @InterfaceC1498b("errorcode")
    public int errorCode = 210;

    @InterfaceC1498b("errormsg")
    public String errorMsg;

    @InterfaceC1498b("select_data")
    public String selectData;

    public String getActionData() {
        return this.actionData;
    }

    public String getColorData() {
        return this.colorData;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getSelectData() {
        return this.selectData;
    }

    public void setActionData(String str) {
        this.actionData = str;
    }

    public void setColorData(String str) {
        this.colorData = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setSelectData(String str) {
        this.selectData = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveTypeResult{errorcode=");
        sb2.append(this.errorCode);
        sb2.append(", errormsg='");
        sb2.append(this.errorMsg);
        sb2.append("', colorData='");
        sb2.append(this.colorData);
        sb2.append("', action_data='");
        sb2.append(this.actionData);
        sb2.append("', select_data='");
        return s.p(sb2, this.selectData, "'}");
    }
}
