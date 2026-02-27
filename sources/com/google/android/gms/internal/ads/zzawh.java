package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawh extends zzaxl {
    private final Activity zzh;
    private final View zzi;

    public zzawh(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4, View view, Activity activity) {
        super(zzavxVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", zzarwVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcU);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzS(((Long) objArr[0]).longValue());
                zzarwVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzarwVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
