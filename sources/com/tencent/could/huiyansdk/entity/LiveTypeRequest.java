package com.tencent.could.huiyansdk.entity;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class LiveTypeRequest {
    public int platform = 2;

    @InterfaceC1498b("select_data")
    public String selectData = "";
    public String imei = "";
    public String turingFaceData = "";

    public String getImei() {
        return this.imei;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getSelectData() {
        return this.selectData;
    }

    public String getTuringFaceData() {
        return this.turingFaceData;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setSelectData(String str) {
        this.selectData = str;
    }

    public void setTuringFaceData(String str) {
        this.turingFaceData = str;
    }
}
