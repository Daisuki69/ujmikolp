package com.paymaya.domain.model;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public class FavoriteDynamicField {
    private String mExtraValue;
    private String mKey;
    private String mSubValue;
    private String mValue;

    public FavoriteDynamicField(String str, String str2) {
        this.mKey = str;
        this.mValue = str2;
    }

    public String getExtraValue() {
        return this.mExtraValue;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getSubValue() {
        return this.mSubValue;
    }

    public String getValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteDynamicField{mKey='");
        sb2.append(this.mKey);
        sb2.append("', mValue='");
        sb2.append(this.mValue);
        sb2.append("', mExtraValue='");
        sb2.append(this.mExtraValue);
        sb2.append("', mSubValue='");
        return s.p(sb2, this.mSubValue, "'}");
    }

    public FavoriteDynamicField(String str, String str2, String str3) {
        this.mKey = str;
        this.mValue = str2;
        this.mSubValue = str3;
    }

    public FavoriteDynamicField(String str, String str2, String str3, String str4) {
        this.mKey = str;
        this.mValue = str2;
        this.mExtraValue = str3;
        this.mSubValue = str4;
    }
}
