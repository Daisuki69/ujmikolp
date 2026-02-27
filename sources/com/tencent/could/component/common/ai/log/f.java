package com.tencent.could.component.common.ai.log;

import android.content.Context;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f15562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile BufferedWriter f15563b;
    public WeakReference<Context> c;

    public f(Context context) {
        this.c = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        try {
            if (this.f15563b != null) {
                this.f15563b.close();
            }
        } catch (Exception e) {
            Log.e("LogWriter", "close writer fail! e: " + e.getMessage());
        } finally {
            this.f15563b = null;
            this.f15562a = null;
        }
    }
}
