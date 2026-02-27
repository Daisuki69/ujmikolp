package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.s f9752a;

    public B(Q6.s sVar) {
        this.f9752a = sVar;
    }

    public final void a(C c) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        ((h) this.f9752a.f5293b).b(c.f9753a).addOnCompleteListener(new androidx.arch.core.executor.a(2), new androidx.work.impl.e(c, 14));
    }
}
