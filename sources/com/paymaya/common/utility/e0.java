package com.paymaya.common.utility;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10905a;

    public e0(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        this.f10905a = context;
    }

    public final String a(int i) {
        String string = this.f10905a.getString(i);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }
}
