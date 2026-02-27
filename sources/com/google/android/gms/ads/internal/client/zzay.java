package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzay extends zzba {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaz zzd;

    public zzay(zzaz zzazVar, View view, HashMap map, HashMap map2) {
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzbb.zza().zzh(this.zza.getContext(), zzbb.zzd().afmaVersion, "gmob-apps", c.e("action", "no_ads_fallback", "flow", "native_ad_view_holder_delegate"), true);
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        View view = this.zza;
        zzbci.zza(view.getContext());
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzlx)).booleanValue()) {
            zzaz zzazVar = this.zzd;
            return zzazVar.zzs().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbgf.zze(((zzbgj) com.google.android.gms.ads.internal.util.client.zzs.zza(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzax.zza)).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzaz zzazVar2 = this.zzd;
            zzazVar2.zzu(zzbtt.zza(this.zza.getContext()));
            zzazVar2.zzt().zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        HashMap map = this.zzc;
        return zzcrVar.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(map));
    }
}
