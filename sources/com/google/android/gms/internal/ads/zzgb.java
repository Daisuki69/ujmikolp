package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzgb extends IOException {
    public final int zza;

    public zzgb(int i) {
        this.zza = i;
    }

    public zzgb(@Nullable String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgb(@Nullable String str, @Nullable Throwable th2, int i) {
        super(str, th2);
        this.zza = i;
    }

    public zzgb(@Nullable Throwable th2, int i) {
        super(th2);
        this.zza = i;
    }
}
