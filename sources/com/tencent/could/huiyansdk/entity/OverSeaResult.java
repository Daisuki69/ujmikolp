package com.tencent.could.huiyansdk.entity;

import We.s;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class OverSeaResult {

    @InterfaceC1498b("validateData")
    public String validateData = "";

    public String getValidateData() {
        return this.validateData;
    }

    public void setValidateData(String str) {
        this.validateData = str;
    }

    public String toString() {
        return s.p(new StringBuilder("OverSeaResult{validateData='"), this.validateData, "'}");
    }
}
