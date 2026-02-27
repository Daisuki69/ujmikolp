package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import u2.InterfaceC2295c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcz {
    private final Map zza;
    private final Map zzb;
    private final InterfaceC2295c zzc;

    public zzcz(Map map, Map map2, InterfaceC2295c interfaceC2295c) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = interfaceC2295c;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcw(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
