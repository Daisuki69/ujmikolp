package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzy extends zzss {
    public zzzy(Throwable th2, @Nullable zzst zzstVar, @Nullable Surface surface) {
        super(th2, zzstVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
