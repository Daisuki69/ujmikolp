package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcay implements Runnable {
    public zzcay(zzcba zzcbaVar) {
        Objects.requireNonNull(zzcbaVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
