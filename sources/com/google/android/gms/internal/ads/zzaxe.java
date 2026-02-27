package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxe extends zzaxl {
    public zzaxe(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4) {
        super(zzavxVar, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", zzarwVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzavs zzavsVar = new zzavs((String) this.zze.invoke(null, null));
            zzarwVar.zzF(zzavsVar.zza.longValue());
            zzarwVar.zzG(zzavsVar.zzb.longValue());
        }
    }
}
