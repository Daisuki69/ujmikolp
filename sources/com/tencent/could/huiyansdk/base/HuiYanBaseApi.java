package com.tencent.could.huiyansdk.base;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class HuiYanBaseApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f15619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HuiYanBaseCallBack f15620b;
    public HuiYanBaseConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f15621d = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HuiYanBaseApi f15622a = new HuiYanBaseApi();
    }

    public void a(int i, int i4) {
        e.a.f15688a.a(1, "HuiYanBaseApi", androidx.camera.core.impl.a.c(i, i4, "updatePreviewSize width:", " height:"));
        b.a.f15659a.getClass();
        YtSDKKitFramework.getInstance().setPreviewRect(new Rect(0, 0, i, i4));
    }

    public HuiYanLiveMode b() {
        HuiYanBaseConfig huiYanBaseConfig = this.c;
        return huiYanBaseConfig == null ? HuiYanLiveMode.ACTION_REFLECT_MODE : huiYanBaseConfig.getHuiYanLiveMode();
    }

    public Context a() {
        WeakReference<Context> weakReference = this.f15619a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void a(String str, int i, long j, String str2) {
        HuiYanBaseCallBack huiYanBaseCallBack = this.f15620b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo(str, i, j, str2);
        }
    }
}
