package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
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
final class zzas extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;
    final /* synthetic */ zzaz zzc;

    public zzas(zzaz zzazVar, Context context, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = zzboxVar;
        Objects.requireNonNull(zzazVar);
        this.zzc = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzbb.zza().zzh(this.zza, zzbb.zzd().afmaVersion, "gmob-apps", c.e("action", "no_ads_fallback", "flow", "ads_preloader"), true);
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        zzck zzciVar;
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbci.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzlx)).booleanValue()) {
            return this.zzc.zzv().zza(this.zza, this.zzb);
        }
        try {
            zzcl zzclVar = (zzcl) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzar.zza);
            zzbox zzboxVar = this.zzb;
            IBinder iBinderZze = zzclVar.zze(iObjectWrapperWrap, zzboxVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                zzciVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzciVar = iInterfaceQueryLocalInterface instanceof zzck ? (zzck) iInterfaceQueryLocalInterface : new zzci(iBinderZze);
            }
            zzciVar.zzl(zzboxVar);
            return zzciVar;
        } catch (RemoteException e) {
            e = e;
            zzaz zzazVar = this.zzc;
            zzazVar.zzu(zzbtt.zza(this.zza));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            zzaz zzazVar2 = this.zzc;
            zzazVar2.zzu(zzbtt.zza(this.zza));
            zzazVar2.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            zzaz zzazVar22 = this.zzc;
            zzazVar22.zzu(zzbtt.zza(this.zza));
            zzazVar22.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zza);
        zzbox zzboxVar = this.zzb;
        zzck zzckVarZzh = zzcrVar.zzh(iObjectWrapperWrap, zzboxVar, ModuleDescriptor.MODULE_VERSION);
        zzckVarZzh.zzl(zzboxVar);
        return zzckVarZzh;
    }
}
