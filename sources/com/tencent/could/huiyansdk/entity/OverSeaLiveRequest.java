package com.tencent.could.huiyansdk.entity;

import We.s;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class OverSeaLiveRequest {
    public int platform = 2;

    @InterfaceC1498b("select_data")
    public String selectData = "";

    public int getPlatform() {
        return this.platform;
    }

    public String getSelectData() {
        return this.selectData;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setSelectData(String str) {
        this.selectData = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OverSeaLiveRequest{platform=");
        sb2.append(this.platform);
        sb2.append(", selectData='");
        return s.p(sb2, this.selectData, "'}");
    }
}
