package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeap extends zzbui {
    private final Context zza;
    private final zzgpd zzb;
    private final zzeax zzc;
    private final zzckv zzd;
    private final ArrayDeque zze;
    private final zzfie zzf;
    private final zzbvd zzg;

    public zzeap(Context context, zzgpd zzgpdVar, zzbvd zzbvdVar, zzckv zzckvVar, zzeax zzeaxVar, ArrayDeque arrayDeque, zzeau zzeauVar, zzfie zzfieVar) {
        zzbci.zza(context);
        this.zza = context;
        this.zzb = zzgpdVar;
        this.zzg = zzbvdVar;
        this.zzc = zzeaxVar;
        this.zzd = zzckvVar;
        this.zze = arrayDeque;
        this.zzf = zzfieVar;
    }

    private static S1.y zzl(final zzbuv zzbuvVar, zzfhh zzfhhVar, final zzevr zzevrVar) {
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return zzevrVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbuvVar.zzm, false);
            }
        };
        return zzfhhVar.zza(zzfhb.GMS_SIGNALS, zzgot.zza(zzbuvVar.zza)).zzc(zzgobVar).zzb(zzeae.zza).zzi();
    }

    private static S1.y zzm(S1.y yVar, zzfhh zzfhhVar, zzbod zzbodVar, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzbnt zzbntVarZza = zzbodVar.zza("AFMA_getAdDictionary", zzboa.zza, zzeaj.zza);
        zzfia.zzb(yVar, zzfhrVar);
        zzfgo zzfgoVarZzi = zzfhhVar.zza(zzfhb.BUILD_URL, yVar).zzc(zzbntVarZza).zzi();
        zzfia.zzf(zzfgoVarZzi, zzfibVar, zzfhrVar);
        return zzfgoVarZzi;
    }

    private final void zzn(S1.y yVar, zzbun zzbunVar, zzbuv zzbuvVar) {
        zzgot.zzq(zzgot.zzj(yVar, new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzeah
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return zzgot.zza(zzfed.zza((InputStream) obj));
            }
        }, zzbzh.zza), new zzeaa(this, zzbuvVar, zzbunVar), zzbzh.zzg);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbep.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzp(zzeak zzeakVar) {
        zzo();
        this.zze.addLast(zzeakVar);
    }

    @Nullable
    private final synchronized zzeak zzq(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeak zzeakVar = (zzeak) it.next();
            if (zzeakVar.zzc.equals(str)) {
                it.remove();
                return zzeakVar;
            }
        }
        return null;
    }

    public final S1.y zzb(final zzbuv zzbuvVar, int i) {
        zzeak zzeakVarZzq;
        zzfgo zzfgoVarZzi;
        zzbnu zzbnuVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbod zzbodVarZza = zzbnuVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevr zzevrVarZzw = this.zzd.zzw(zzbuvVar, i);
        zzbnt zzbntVarZza = zzbodVarZza.zza("google.afma.response.normalize", zzeam.zzd, zzboa.zzb);
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            zzeakVarZzq = zzq(zzbuvVar.zzh);
            if (zzeakVarZzq == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbuvVar.zzj;
            zzeakVarZzq = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfhr zzfhrVarA = zzeakVarZzq == null ? s.a(context, 9) : zzeakVarZzq.zzd;
        zzfib zzfibVarZzf = zzevrVarZzw.zzf();
        zzfibVarZzf.zzb(zzbuvVar.zza.getStringArrayList("ad_types"));
        zzeaw zzeawVar = new zzeaw(zzbuvVar.zzg, zzfibVarZzf, zzfhrVarA);
        zzeat zzeatVar = new zzeat(context, zzbuvVar.zzb.afmaVersion, this.zzg, i);
        zzfhh zzfhhVarZze = zzevrVarZzw.zze();
        zzfhr zzfhrVarA2 = s.a(context, 11);
        if (zzeakVarZzq == null) {
            final S1.y yVarZzl = zzl(zzbuvVar, zzfhhVarZze, zzevrVarZzw);
            final S1.y yVarZzm = zzm(yVarZzl, zzfhhVarZze, zzbodVarZza, zzfibVarZzf, zzfhrVarA);
            zzfhr zzfhrVarA3 = s.a(context, 10);
            final zzfgo zzfgoVarZzi2 = zzfhhVarZze.zzb(zzfhb.HTTP, yVarZzm, yVarZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeai
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbux zzbuxVar = (zzbux) yVarZzm.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
                        bundle.putLong(zzdru.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbuxVar.zzj());
                        bundle.putLong(zzdru.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbuxVar.zzk());
                    }
                    return new zzeav((JSONObject) yVarZzl.get(), zzbuxVar);
                }
            }).zzb(zzeawVar).zzb(zzfia.zzc(zzfhrVarA3)).zzb(zzeatVar).zzi();
            zzfia.zzd(zzfgoVarZzi2, zzfibVarZzf, zzfhrVarA3);
            zzfia.zzb(zzfgoVarZzi2, zzfhrVarA2);
            zzfgoVarZzi = zzfhhVarZze.zzb(zzfhb.PRE_PROCESS, yVarZzl, yVarZzm, zzfgoVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeab
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
                        androidx.media3.datasource.cache.c.v(bundle, zzdru.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzeam((zzeas) zzfgoVarZzi2.get(), (JSONObject) yVarZzl.get(), (zzbux) yVarZzm.get());
                }
            }).zzc(zzbntVarZza).zzi();
        } else {
            zzeav zzeavVar = new zzeav(zzeakVarZzq.zzb, zzeakVarZzq.zza);
            zzfhr zzfhrVarA4 = s.a(context, 10);
            final zzfgo zzfgoVarZzi3 = zzfhhVarZze.zza(zzfhb.HTTP, zzgot.zza(zzeavVar)).zzb(zzeawVar).zzb(zzfia.zzc(zzfhrVarA4)).zzb(zzeatVar).zzi();
            zzfia.zzd(zzfgoVarZzi3, zzfibVarZzf, zzfhrVarA4);
            final S1.y yVarZza = zzgot.zza(zzeakVarZzq);
            zzfia.zzb(zzfgoVarZzi3, zzfhrVarA2);
            zzfgoVarZzi = zzfhhVarZze.zzb(zzfhb.PRE_PROCESS, zzfgoVarZzi3, yVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeac
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeas zzeasVar = (zzeas) zzfgoVarZzi3.get();
                    S1.y yVar = yVarZza;
                    return new zzeam(zzeasVar, ((zzeak) yVar.get()).zzb, ((zzeak) yVar.get()).zza);
                }
            }).zzc(zzbntVarZza).zzi();
        }
        zzfia.zzd(zzfgoVarZzi, zzfibVarZzf, zzfhrVarA2);
        return zzfgoVarZzi;
    }

    public final S1.y zzc(final zzbuv zzbuvVar, int i) {
        if (!((Boolean) zzbep.zza.zze()).booleanValue()) {
            return zzgot.zzc(new Exception("Split request is disabled."));
        }
        zzfey zzfeyVar = zzbuvVar.zzi;
        if (zzfeyVar == null) {
            return zzgot.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfeyVar.zzc == 0 || zzfeyVar.zzd == 0) {
            return zzgot.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbod zzbodVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevr zzevrVarZzw = this.zzd.zzw(zzbuvVar, i);
        zzfhh zzfhhVarZze = zzevrVarZzw.zze();
        final S1.y yVarZzl = zzl(zzbuvVar, zzfhhVarZze, zzevrVarZzw);
        zzfib zzfibVarZzf = zzevrVarZzw.zzf();
        final zzfhr zzfhrVarA = s.a(context, 9);
        final S1.y yVarZzm = zzm(yVarZzl, zzfhhVarZze, zzbodVarZza, zzfibVarZzf, zzfhrVarA);
        return zzfhhVarZze.zzb(zzfhb.GET_URL_AND_CACHE_KEY, yVarZzl, yVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(yVarZzm, yVarZzl, zzbuvVar, zzfhrVarA);
            }
        }).zzi();
    }

    public final S1.y zzd(String str) {
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            return zzq(str) == null ? zzgot.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgot.zza(new zzdzz(this));
        }
        return zzgot.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzbuv zzbuvVar, zzbun zzbunVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
            androidx.media3.datasource.cache.c.v(bundle, zzdru.SERVICE_CONNECTED.zza());
        }
        S1.y yVarZzb = zzb(zzbuvVar, Binder.getCallingUid());
        zzn(yVarZzb, zzbunVar, zzbuvVar);
        if (((Boolean) zzbei.zzg.zze()).booleanValue()) {
            final zzeax zzeaxVar = this.zzc;
            Objects.requireNonNull(zzeaxVar);
            yVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeao
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeaxVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(zzbuv zzbuvVar, zzbun zzbunVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzbuvVar.zzm) != null) {
            androidx.media3.datasource.cache.c.v(bundle, zzdru.SERVICE_CONNECTED.zza());
        }
        zzn(zzj(zzbuvVar, Binder.getCallingUid()), zzbunVar, zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg(zzbuv zzbuvVar, zzbun zzbunVar) {
        zzn(zzc(zzbuvVar, Binder.getCallingUid()), zzbunVar, zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(String str, zzbun zzbunVar) {
        zzn(zzd(str), zzbunVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(zzbuf zzbufVar, zzbuo zzbuoVar) {
        if (((Boolean) zzbex.zza.zze()).booleanValue()) {
            this.zzd.zzD();
            String str = zzbufVar.zza;
            zzgot.zzq(zzgot.zza(null), new zzdzy(this, zzbuoVar, zzbufVar), zzbzh.zzg);
        } else {
            try {
                zzbuoVar.zze("", zzbufVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final S1.y zzj(final zzbuv zzbuvVar, int i) {
        zzbnu zzbnuVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbod zzbodVarZza = zzbnuVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbev.zza.zze()).booleanValue()) {
            return zzgot.zzc(new Exception("Signal collection disabled."));
        }
        zzevr zzevrVarZzw = this.zzd.zzw(zzbuvVar, i);
        final zzeus zzeusVarZzd = zzevrVarZzw.zzd();
        zzbnt zzbntVarZza = zzbodVarZza.zza("google.afma.request.getSignals", zzboa.zza, zzboa.zzb);
        zzfhr zzfhrVarA = s.a(context, 22);
        zzfhh zzfhhVarZze = zzevrVarZzw.zze();
        zzfhb zzfhbVar = zzfhb.GET_SIGNALS;
        Bundle bundle = zzbuvVar.zza;
        zzfgo zzfgoVarZzi = zzfhhVarZze.zza(zzfhbVar, zzgot.zza(bundle)).zzb(zzfia.zzc(zzfhrVarA)).zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzeag
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) throws JSONException {
                return zzeusVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbuvVar.zzm, false);
            }
        }).zzj(zzfhb.JS_SIGNALS).zzc(zzbntVarZza).zzi();
        zzfib zzfibVarZzf = zzevrVarZzw.zzf();
        zzfibVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfibVarZzf.zzd(bundle.getBundle("extras"));
        zzfia.zze(zzfgoVarZzi, zzfibVarZzf, zzfhrVarA);
        if (((Boolean) zzbei.zzh.zze()).booleanValue()) {
            final zzeax zzeaxVar = this.zzc;
            Objects.requireNonNull(zzeaxVar);
            zzfgoVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzean
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeaxVar.zza();
                }
            }, this.zzb);
        }
        return zzfgoVarZzi;
    }

    public final /* synthetic */ InputStream zzk(S1.y yVar, S1.y yVar2, zzbuv zzbuvVar, zzfhr zzfhrVar) {
        String strZzi = ((zzbux) yVar.get()).zzi();
        zzp(new zzeak((zzbux) yVar.get(), (JSONObject) yVar2.get(), zzbuvVar.zzh, strZzi, zzfhrVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
