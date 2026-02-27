package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f17267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f17268b;
    public final Context c;

    public y(Context context, F f, Context context2) {
        super(context);
        this.f17267a = f;
        this.c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length && i < 11; i++) {
            if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                return this.c.getSystemService(str);
            }
        }
        if (this.f17268b == null) {
            this.f17268b = this.f17267a;
        }
        return this.f17268b;
    }
}
