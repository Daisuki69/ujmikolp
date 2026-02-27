package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetv implements zzeup {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetw zzc = new zzetw(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgpd zzd;
    private final ScheduledExecutorService zze;
    private final zzekd zzf;
    private final Context zzg;
    private final zzfdc zzh;
    private final zzejy zzi;
    private final zzdqc zzj;
    private final zzduz zzk;
    private final int zzl;

    public zzetv(zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, String str, zzekd zzekdVar, Context context, zzfdc zzfdcVar, zzejy zzejyVar, zzdqc zzdqcVar, zzduz zzduzVar, int i) {
        this.zzd = zzgpdVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzekdVar;
        this.zzg = context;
        this.zzh = zzfdcVar;
        this.zzi = zzejyVar;
        this.zzj = zzdqcVar;
        this.zzk = zzduzVar;
        this.zzl = i;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzekh zzekhVar = (zzekh) ((Map.Entry) it.next()).getValue();
            String str = zzekhVar.zza;
            list.add(zzh(str, Collections.singletonList(zzekhVar.zze), zzg(str), zzekhVar.zzb, zzekhVar.zzc));
        }
    }

    @Nullable
    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgol zzh(final String str, final List list, final Bundle bundle, final boolean z4, final boolean z5) {
        zzgoa zzgoaVar = new zzgoa() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ S1.y zza() {
                return this.zza.zzd(str, list, bundle, z4, z5);
            }
        };
        zzgpd zzgpdVar = this.zzd;
        zzgol zzgolVarZzw = zzgol.zzw(zzgot.zzf(zzgoaVar, zzgpdVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbM)).booleanValue()) {
            zzgolVarZzw = (zzgol) zzgot.zzi(zzgolVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbF)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgol) zzgot.zzg(zzgolVarZzw, Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i = zzetv.zzb;
                String str2 = str;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgpdVar);
    }

    private final void zzi(zzbqw zzbqwVar, Bundle bundle, @NonNull List list, zzekg zzekgVar) throws RemoteException {
        zzbqwVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzekgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        if (this.zzl == 2) {
            return zzgot.zza(zzc);
        }
        zzfdc zzfdcVar = this.zzh;
        if (zzfdcVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbS)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfdcVar.zzd)))) {
                return zzgot.zza(zzc);
            }
        }
        return zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ S1.y zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ S1.y zzc() {
        final String str;
        zzetv zzetvVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlJ)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbQ)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeG)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbZ)).booleanValue()) {
            zzetvVar = this;
            zzf(arrayList, zzetvVar.zzf.zzd(zzetvVar.zza, lowerCase));
        } else {
            zzekd zzekdVar = this.zzf;
            for (Map.Entry entry : ((zzgkc) zzekdVar.zzc(this.zza, lowerCase)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzetvVar = this;
            zzf(arrayList, zzekdVar.zzb());
        }
        return zzgot.zzo(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i = zzetv.zzb;
                JSONArray jSONArray = new JSONArray();
                for (S1.y yVar : arrayList) {
                    if (((JSONObject) yVar.get()) != null) {
                        jSONArray.put(yVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzetw(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeG)).booleanValue()) {
                    return new zzetw(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzetvVar.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ S1.y zzd(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbzm r3 = new com.google.android.gms.internal.ads.zzbzm
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbbz r12 = com.google.android.gms.internal.ads.zzbci.zzbR
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzd(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzejy r12 = r7.zzi
            r12.zza(r8)
            com.google.android.gms.internal.ads.zzbqw r12 = r12.zzb(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdqc r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbqw r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.zzbbz r9 = com.google.android.gms.internal.ads.zzbci.zzbH
            com.google.android.gms.internal.ads.zzbcg r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r10.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            com.google.android.gms.internal.ads.zzekg.zzd(r8, r3)
            r1 = r7
            goto Lbb
        L4e:
            throw r1
        L4f:
            com.google.android.gms.internal.ads.zzekg r0 = new com.google.android.gms.internal.ads.zzekg
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzt.zzk()
            long r4 = r12.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbbz r8 = com.google.android.gms.internal.ads.zzbci.zzbM
            com.google.android.gms.internal.ads.zzbcg r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r12.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzetu r12 = new com.google.android.gms.internal.ads.zzetu
            r12.<init>()
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzbF
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8b:
            if (r11 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbbz r8 = com.google.android.gms.internal.ads.zzbci.zzbT
            com.google.android.gms.internal.ads.zzbcg r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r11.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzgpd r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzets r0 = new com.google.android.gms.internal.ads.zzets
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lbb
        Lb0:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.zzi(r2, r8, r4, r0)
            goto Lbb
        Lb7:
            r1 = r7
            r0.zzb()
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetv.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):S1.y");
    }

    public final /* synthetic */ void zze(zzbqw zzbqwVar, Bundle bundle, List list, zzekg zzekgVar, zzbzm zzbzmVar) {
        try {
            zzi(zzbqwVar, bundle, list, zzekgVar);
        } catch (RemoteException e) {
            zzbzmVar.zzd(e);
        }
    }
}
