package com.tencent.could.huiyansdk.permission;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f15711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.tencent.could.huiyansdk.permission.a f15712b;
    public WeakReference<Activity> c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15713a = new c();
    }

    public final void a() {
        WeakReference<Activity> weakReference;
        if (this.f15711a == null || (weakReference = this.c) == null || weakReference.get() == null || this.c.get().isFinishing()) {
            return;
        }
        this.f15711a.cancel();
        this.f15711a = null;
    }

    public void b() {
        if (this.f15712b != null) {
            this.f15712b = null;
        }
    }
}
