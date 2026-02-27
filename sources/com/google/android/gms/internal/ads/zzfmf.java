package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmf implements zzfmi {
    private static final zzfmf zza = new zzfmf(new zzfmj());
    private Date zzb;
    private boolean zzc;
    private final zzfmj zzd;
    private boolean zze;

    private zzfmf(zzfmj zzfmjVar) {
        this.zzd = zzfmjVar;
    }

    public static zzfmf zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(@NonNull Context context) {
        if (this.zzc) {
            return;
        }
        zzfmj zzfmjVar = this.zzd;
        zzfmjVar.zzd(context);
        zzfmjVar.zzg(this);
        zzfmjVar.zze();
        this.zze = zzfmjVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final void zzd(boolean z4) {
        if (!this.zze && z4) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfmh.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfln) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z4;
    }
}
