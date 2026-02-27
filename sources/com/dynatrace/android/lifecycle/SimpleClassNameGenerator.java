package com.dynatrace.android.lifecycle;

import com.dynatrace.android.useraction.ActionNameCustomizer;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleClassNameGenerator implements ActionNameCustomizer {
    @Override // com.dynatrace.android.useraction.ActionNameCustomizer
    public String customize(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }
}
