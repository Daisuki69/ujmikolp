package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;

    public zzae(zzaz zzazVar, Context context, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = zzboxVar;
        Objects.requireNonNull(zzazVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzbb.zza().zzh(this.zza, zzbb.zzd().afmaVersion, "gmob-apps", c.e("action", "no_ads_fallback", "flow", "out_of_context_tester"), true);
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzkh)).booleanValue()) {
            try {
                return ((zzdx) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.zza)).zze(iObjectWrapperWrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzbtt.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzkh)).booleanValue()) {
            return zzcrVar.zzq(iObjectWrapperWrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
