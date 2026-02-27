package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawz extends zzaxl {
    public zzawz(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4) {
        super(zzavxVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", zzarwVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdm);
        bool.booleanValue();
        zzavd zzavdVar = new zzavd((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzc(zzavdVar.zza);
            zzarwVar.zzP(zzavdVar.zzb);
        }
    }
}
