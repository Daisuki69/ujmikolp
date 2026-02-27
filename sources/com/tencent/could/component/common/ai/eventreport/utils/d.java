package com.tencent.could.component.common.ai.eventreport.utils;

import android.util.Log;
import com.tencent.could.component.common.ai.net.IJsonDataListener;

/* JADX INFO: loaded from: classes4.dex */
public class d implements IJsonDataListener {
    @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
    public void onFailed(String str) {
        Log.d("NetReportUtil", "report error info fail! " + str);
    }

    @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
    public void onSuccess(String str) {
        Log.d("NetReportUtil", "report error info success!");
    }
}
