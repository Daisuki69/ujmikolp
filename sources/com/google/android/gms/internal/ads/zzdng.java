package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdng extends zzbgp {
    private final Context zza;
    private final zzdiu zzb;
    private zzdjt zzc;
    private zzdip zzd;

    public zzdng(Context context, zzdiu zzdiuVar, zzdjt zzdjtVar, zzdip zzdipVar) {
        this.zza = context;
        this.zzb = zzdiuVar;
        this.zzc = zzdjtVar;
        this.zzd = zzdipVar;
    }

    public final /* synthetic */ zzdip zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzf(String str) {
        return (zzbfw) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzg() {
        try {
            zzdiu zzdiuVar = this.zzb;
            SimpleArrayMap simpleArrayMapZzaa = zzdiuVar.zzaa();
            SimpleArrayMap simpleArrayMapZzad = zzdiuVar.zzad();
            String[] strArr = new String[simpleArrayMapZzaa.size() + simpleArrayMapZzad.size()];
            int i = 0;
            for (int i4 = 0; i4 < simpleArrayMapZzaa.size(); i4++) {
                strArr[i] = (String) simpleArrayMapZzaa.keyAt(i4);
                i++;
            }
            for (int i6 = 0; i6 < simpleArrayMapZzad.size(); i6++) {
                strArr[i] = (String) simpleArrayMapZzad.keyAt(i6);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(String str) {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzj() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjtVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdnf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzo() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null && !zzdipVar.zzM()) {
            return false;
        }
        zzdiu zzdiuVar = this.zzb;
        return zzdiuVar.zzW() != null && zzdiuVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzp() {
        zzdiu zzdiuVar = this.zzb;
        zzedu zzeduVarZzZ = zzdiuVar.zzZ();
        if (zzeduVarZzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzeduVarZzZ.zza());
        if (zzdiuVar.zzW() == null) {
            return true;
        }
        zzdiuVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdip zzdipVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzZ() == null || (zzdipVar = this.zzd) == null) {
            return;
        }
        zzdipVar.zzN((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdip zzdipVar = this.zzd;
                if (zzdipVar != null) {
                    zzdipVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjtVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zze((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdnf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
