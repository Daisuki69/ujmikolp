package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzfes implements zzfer {
    private final ConcurrentHashMap zza;
    private final zzfey zzb;
    private final zzfeu zzc = new zzfeu();

    public zzfes(zzfey zzfeyVar) {
        this.zza = new ConcurrentHashMap(zzfeyVar.zzd);
        this.zzb = zzfeyVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfey> creator = zzfey.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgL)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzfey zzfeyVar = this.zzb;
            sb2.append(zzfeyVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb2.append(i);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzffb) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i4 = 0; i4 < ((zzfeq) entry.getValue()).zzc(); i4++) {
                    sb2.append("[O]");
                }
                for (int iZzc = ((zzfeq) entry.getValue()).zzc(); iZzc < zzfeyVar.zzd; iZzc++) {
                    sb2.append("[ ]");
                }
                sb2.append(Global.NEWLINE);
                sb2.append(((zzfeq) entry.getValue()).zzg());
                sb2.append(Global.NEWLINE);
            }
            while (i < zzfeyVar.zzc) {
                i++;
                sb2.append(i);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    @Nullable
    public final synchronized zzffa zza(zzffb zzffbVar) {
        zzffa zzffaVarZzb;
        try {
            zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
            if (zzfeqVar != null) {
                zzffaVarZzb = zzfeqVar.zzb();
                if (zzffaVarZzb == null) {
                    this.zzc.zzb();
                }
                zzffo zzffoVarZzh = zzfeqVar.zzh();
                if (zzffaVarZzb != null) {
                    zzbbn.zzb.zzc zzcVarZzs = zzbbn.zzb.zzs();
                    zzbbn.zzb.zza.C0029zza c0029zzaZzs = zzbbn.zzb.zza.zzs();
                    c0029zzaZzs.zzc(zzbbn.zzb.zzd.IN_MEMORY);
                    zzbbn.zzb.zze.zza zzaVarZzq = zzbbn.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzffoVarZzh.zza);
                    zzaVarZzq.zzg(zzffoVarZzh.zzb);
                    c0029zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0029zzaZzs);
                    zzffaVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzffaVarZzb = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzffaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzb(zzffb zzffbVar, zzffa zzffaVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfeq zzfeqVar = (zzfeq) concurrentHashMap.get(zzffbVar);
            zzffaVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfeqVar == null) {
                zzfey zzfeyVar = this.zzb;
                zzfeq zzfeqVar2 = new zzfeq(zzfeyVar.zzd, zzfeyVar.zze * 1000);
                if (concurrentHashMap.size() == zzfeyVar.zzc) {
                    int i = zzfeyVar.zzg;
                    int i4 = i - 1;
                    zzffb zzffbVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i4 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfeq) entry.getValue()).zzd();
                                zzffbVar2 = (zzffb) entry.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    } else if (i4 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfeq) entry2.getValue()).zze();
                                zzffbVar2 = (zzffb) entry2.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    } else if (i4 == 2) {
                        int iZzf = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfeq) entry3.getValue()).zzf();
                                zzffbVar2 = (zzffb) entry3.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzffbVar, zzfeqVar2);
                this.zzc.zzc();
                zzfeqVar = zzfeqVar2;
            }
            zZza = zzfeqVar.zza(zzffaVar);
            zzfeu zzfeuVar = this.zzc;
            zzfeuVar.zze();
            zzfet zzfetVarZzf = zzfeuVar.zzf();
            zzffo zzffoVarZzh = zzfeqVar.zzh();
            zzbbn.zzb.zzc zzcVarZzs = zzbbn.zzb.zzs();
            zzbbn.zzb.zza.C0029zza c0029zzaZzs = zzbbn.zzb.zza.zzs();
            c0029zzaZzs.zzc(zzbbn.zzb.zzd.IN_MEMORY);
            zzbbn.zzb.zzg.zza zzaVarZzs = zzbbn.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfetVarZzf.zza);
            zzaVarZzs.zzg(zzfetVarZzf.zzb);
            zzaVarZzs.zzk(zzffoVarZzh.zzb);
            c0029zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0029zzaZzs);
            zzffaVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th2) {
            throw th2;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzc(zzffb zzffbVar) {
        zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
        if (zzfeqVar == null) {
            return true;
        }
        return zzfeqVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    @Deprecated
    public final zzffb zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfey zzfeyVar = this.zzb;
        return new zzffc(zzmVar, str, new zzbuy(zzfeyVar.zza).zza().zzj, zzfeyVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final zzfey zze() {
        return this.zzb;
    }
}
