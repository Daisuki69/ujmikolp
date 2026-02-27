package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzacn implements zzaco {
    static final /* synthetic */ zzacn zza = new zzacn();

    private /* synthetic */ zzacn() {
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final /* synthetic */ Constructor zza() {
        int i = zzacq.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacu.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
