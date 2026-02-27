package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcds extends zzcau implements zzgy, zzmg {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdc zzc;
    private final zzyd zzd;
    private final zzcbc zze;
    private final WeakReference zzf;
    private final zzvw zzg;

    @Nullable
    private zzik zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcat zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcdf zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcds(android.content.Context r4, com.google.android.gms.internal.ads.zzcbc r5, com.google.android.gms.internal.ads.zzcbd r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcds.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbc, com.google.android.gms.internal.ads.zzcbd, java.lang.Integer):void");
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcau.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdb zzcdbVar = (zzcdb) ((WeakReference) it.next()).get();
            if (zzcdbVar != null) {
                zzcdbVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzC() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzD() {
        return this.zzh.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzE(boolean z4) {
        this.zzh.zzi(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzF(int i) {
        this.zzc.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzH() {
        return this.zzh.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map mapZzj = ((zzgt) arrayList.remove(0)).zzj();
                    long j6 = 0;
                    if (mapZzj != null) {
                        Iterator it = mapZzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzggj.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j6 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j6;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzM(boolean z4) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzD();
            if (i >= 2) {
                return;
            }
            zzyd zzydVar = this.zzd;
            zzxn zzxnVarZzd = zzydVar.zzc().zzd();
            zzxnVarZzd.zzy(i, !z4);
            zzydVar.zzf(zzxnVarZzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzN() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzO() {
        return this.zzl;
    }

    @VisibleForTesting
    public final zzur zzR(Uri uri) {
        zzy zzyVar = new zzy();
        zzyVar.zzb(uri);
        zzaj zzajVarZzc = zzyVar.zzc();
        zzvw zzvwVar = this.zzg;
        zzvwVar.zza(this.zze.zzf);
        return zzvwVar.zzb(zzajVarZzc);
    }

    public final /* synthetic */ zzga zzS(String str, boolean z4) {
        zzcds zzcdsVar = true != z4 ? null : this;
        zzcbc zzcbcVar = this.zze;
        return new zzcdv(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzm, zzcbcVar.zzn);
    }

    public final /* synthetic */ zzga zzT(String str, boolean z4) {
        zzgh zzghVar = new zzgh();
        zzghVar.zzb(str);
        zzghVar.zzf(true != z4 ? null : this);
        zzcbc zzcbcVar = this.zze;
        zzghVar.zzc(zzcbcVar.zzd);
        zzghVar.zzd(zzcbcVar.zze);
        zzghVar.zze(true);
        return zzghVar.zza();
    }

    public final /* synthetic */ zzga zzU(String str, boolean z4) {
        zzcds zzcdsVar = true != z4 ? null : this;
        zzcbc zzcbcVar = this.zze;
        zzcdb zzcdbVar = new zzcdb(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzh);
        this.zzu.add(new WeakReference(zzcdbVar));
        return zzcdbVar;
    }

    public final /* synthetic */ zzga zzV(zzfz zzfzVar) {
        zzga zzgaVarZza = zzfzVar.zza();
        zzcdd zzcddVar = new zzcdd() { // from class: com.google.android.gms.internal.ads.zzcdq
            @Override // com.google.android.gms.internal.ads.zzcdd
            public final /* synthetic */ void zza(boolean z4, long j) {
                this.zza.zzX(z4, j);
            }
        };
        return new zzcdf(this.zzb, zzgaVarZza, this.zzo, this.zzp, this, zzcddVar);
    }

    public final /* synthetic */ zzll[] zzW(Handler handler, zzabm zzabmVar, zzpv zzpvVar, zzwt zzwtVar, zztn zztnVar) {
        zztb zztbVar = zztb.zzb;
        Context context = this.zzb;
        zzrg zzrgVar = new zzrg(context, new zzsi(context, null, null), zztbVar, false, handler, zzpvVar, new zzqk(context).zza());
        zzaac zzaacVar = new zzaac(context);
        zzaacVar.zza(zztbVar);
        zzaacVar.zzb(handler);
        zzaacVar.zzc(zzabmVar);
        return new zzll[]{zzrgVar, zzaacVar.zzd()};
    }

    public final /* synthetic */ void zzX(boolean z4, long j) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzr(z4, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z4) {
        if (zzgaVar instanceof zzgt) {
            synchronized (this.zzq) {
                this.zzs.add((zzgt) zzgaVar);
            }
        } else if (zzgaVar instanceof zzcdf) {
            this.zzt = (zzcdf) zzgaVar;
            final zzcbd zzcbdVar = (zzcbd) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() && zzcbdVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzcds.zza;
                        zzcbdVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z4, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzdj(zzme zzmeVar, zzaz zzazVar, zzaz zzazVar2, int i) {
        H.a(this, zzmeVar, zzazVar, zzazVar2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzdk(zzme zzmeVar, zzul zzulVar) {
        H.b(this, zzmeVar, zzulVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzdl(zzme zzmeVar, int i, long j, long j6) {
        H.c(this, zzmeVar, i, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzdm(zzme zzmeVar, zzhr zzhrVar) {
        H.d(this, zzmeVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final /* synthetic */ void zzdn(zzba zzbaVar, zzmf zzmfVar) {
        H.e(this, zzbaVar, zzmfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zze(zzme zzmeVar, int i) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzu("onPlayerError", zzatVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z4) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            if (this.zze.zzj) {
                zzcatVar.zzv("onLoadException", iOException);
            } else {
                zzcatVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    @Nullable
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzk(zzme zzmeVar, zzu zzuVar, @Nullable zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzuVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzl(zzme zzmeVar, zzu zzuVar, @Nullable zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzuVar.zzz));
        map.put("bitRate", String.valueOf(zzuVar.zzj));
        int i = zzuVar.zzv;
        int i4 = zzuVar.zzw;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i4).length());
        sb2.append(i);
        sb2.append("x");
        sb2.append(i4);
        map.put("resolution", sb2.toString());
        String str = zzuVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzm(zzme zzmeVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzn(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzo(zzme zzmeVar, Object obj, long j) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzt(zzbuVar.zzb, zzbuVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z4) {
        zzur zzvgVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z4;
            int length = uriArr.length;
            if (length == 1) {
                zzvgVar = zzR(uriArr[0]);
            } else {
                zzur[] zzurVarArr = new zzur[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzurVarArr[i] = zzR(uriArr[i]);
                }
                zzvgVar = new zzvg(false, false, new zzua(), zzurVarArr);
            }
            this.zzh.zzE(zzvgVar);
            this.zzh.zzf();
            zzcau.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzs(zzcat zzcatVar) {
        this.zzk = zzcatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzt() {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzC(this);
            this.zzh.zzF();
            this.zzh = null;
            zzcau.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzu(Surface surface, boolean z4) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzA(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzv(float f, boolean z4) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzz(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzw() {
        this.zzh.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzx(long j) {
        this.zzh.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }
}
