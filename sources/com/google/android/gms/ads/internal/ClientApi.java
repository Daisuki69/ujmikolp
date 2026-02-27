package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzdjn;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdud;
import com.google.android.gms.internal.ads.zzekk;
import com.google.android.gms.internal.ads.zzexm;
import com.google.android.gms.internal.ads.zzeyz;
import com.google.android.gms.internal.ads.zzfap;
import com.google.android.gms.internal.ads.zzfcc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ClientApi extends zzcq {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyz zzeyzVarZzh = zzcgv.zza(context, zzboxVar, i).zzh();
        zzeyzVarZzh.zzd(context);
        zzeyzVarZzh.zzb(zzrVar);
        zzeyzVarZzh.zzc(str);
        return zzeyzVarZzh.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfap zzfapVarZzl = zzcgv.zza(context, zzboxVar, i).zzl();
        zzfapVarZzl.zzd(context);
        zzfapVarZzl.zzb(zzrVar);
        zzfapVarZzl.zzc(str);
        return zzfapVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzekk(zzcgv.zza(context, zzboxVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbga zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjp((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbvk zzf(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfcc zzfccVarZzo = zzcgv.zza(context, zzboxVar, i).zzo();
        zzfccVarZzo.zzc(context);
        return zzfccVarZzo.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbsw zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzv(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzv(activity) : new zzaf(activity) : new zzab(activity, adOverlayInfoParcelZza) : new zzai(activity) : new zzah(activity) : new zzu(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) {
        return zzcgv.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzboxVar, i).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(IObjectWrapper iObjectWrapper, int i) {
        return zzcgv.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdjn((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbwa zzl(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfcc zzfccVarZzo = zzcgv.zza(context, zzboxVar, i).zzo();
        zzfccVarZzo.zzc(context);
        zzfccVarZzo.zzb(str);
        return zzfccVarZzo.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbox zzboxVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexm zzexmVarZzj = zzcgv.zza(context, zzboxVar, i).zzj();
        zzexmVarZzj.zzb(str);
        zzexmVarZzj.zzc(context);
        return zzexmVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbye zzn(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) {
        return zzcgv.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzboxVar, i).zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbsp zzo(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) {
        return zzcgv.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzboxVar, i).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbko zzp(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i, zzbkl zzbklVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdud zzdudVarZzy = zzcgv.zza(context, zzboxVar, i).zzy();
        zzdudVarZzy.zzc(context);
        zzdudVarZzy.zzb(zzbklVar);
        return zzdudVarZzy.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) {
        return zzcgv.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzboxVar, i).zzA();
    }
}
