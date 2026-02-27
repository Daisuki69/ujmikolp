package com.tencent.could.huiyansdk.base;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public interface HuiYanBaseCallBack {
    void a();

    void a(int i, boolean z4, boolean z5);

    void a(String str);

    void a(HashMap<String, Object> map);

    void b();

    void b(String str);

    void c();

    void onFail(int i, String str);

    void onOperateTimeEvent(String str, int i, boolean z4, String str2);

    void updateOperateInfo(String str, int i, long j, String str2);
}
