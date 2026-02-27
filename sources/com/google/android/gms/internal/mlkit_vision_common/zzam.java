package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import u2.InterfaceC2295c;
import u2.InterfaceC2297e;
import v2.InterfaceC2337b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzam implements InterfaceC2337b {
    public static final /* synthetic */ int zza = 0;
    private static final InterfaceC2295c zzb = new InterfaceC2295c() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // u2.InterfaceC2293a
        public final void encode(Object obj, Object obj2) {
            int i = zzam.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final InterfaceC2295c zze = zzb;

    @Override // v2.InterfaceC2337b
    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC2337b registerEncoder(@NonNull Class cls, @NonNull InterfaceC2295c interfaceC2295c) {
        this.zzc.put(cls, interfaceC2295c);
        this.zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC2337b registerEncoder(@NonNull Class cls, @NonNull InterfaceC2297e interfaceC2297e) {
        this.zzd.put(cls, interfaceC2297e);
        this.zzc.remove(cls);
        return this;
    }
}
