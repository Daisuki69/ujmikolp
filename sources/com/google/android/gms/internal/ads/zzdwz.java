package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzdwz extends Exception {
    private final int zza;

    public zzdwz(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwz(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdwz(int i, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
