package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebw implements zzfhi {
    private final zzebk zza;
    private final zzebo zzb;

    public zzebw(zzebk zzebkVar, zzebo zzeboVar) {
        this.zza = zzebkVar;
        this.zzb = zzeboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue()) {
            if (zzfhb.RENDERER == zzfhbVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfhb.PRELOADED_LOADER == zzfhbVar || zzfhb.SERVER_TRANSACTION == zzfhbVar) {
                zzebk zzebkVar = this.zza;
                zzebkVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzebo zzeboVar = this.zzb;
                final long jZzb = zzebkVar.zzb();
                zzeboVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebn
                    @Override // com.google.android.gms.internal.ads.zzfgm
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeboVar.zzf()) {
                            return null;
                        }
                        long j = jZzb;
                        zzbbn.zzaf.zza.C0028zza c0028zzaZzz = zzbbn.zzaf.zza.zzz();
                        c0028zzaZzz.zzad(j);
                        byte[] bArrZzaN = c0028zzaZzz.zzbu().zzaN();
                        zzebv.zzf(sQLiteDatabase, false, false);
                        zzebv.zze(sQLiteDatabase, j, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue() && zzfhb.RENDERER == zzfhbVar) {
            zzebk zzebkVar = this.zza;
            if (zzebkVar.zzh() != 0) {
                zzebkVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebkVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue() && zzfhb.RENDERER == zzfhbVar) {
            zzebk zzebkVar = this.zza;
            if (zzebkVar.zzh() != 0) {
                zzebkVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebkVar.zzh());
            }
        }
    }
}
