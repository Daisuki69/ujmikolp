package com.tencent.could.component.common.ai.net;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface CallBackListener {
    void cleanListener();

    void onFailed(String str);

    void onSuccess(InputStream inputStream, boolean z4);

    void onSuccess(String str);
}
