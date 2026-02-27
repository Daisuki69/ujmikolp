package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazn zze;
    private final zzazu zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzayy(int i, int i4, int i6, int i10, int i11, int i12, int i13, boolean z4) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = z4;
        this.zze = new zzazn(i10);
        this.zzf = new zzazu(i11, i12, i13);
    }

    private final void zzm(@Nullable String str, boolean z4, float f, float f3, float f7, float f10) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z4) {
                        this.zzi.add(str);
                        this.zzj.add(new zzazj(f, f3, f7, f10, r10.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            sb2.append((String) arrayList.get(i4));
            sb2.append(' ');
            i4++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzayy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzayy) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i4 = this.zzn;
        int i6 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i6).length();
        int length4 = String.valueOf(strZzn).length();
        int length5 = String.valueOf(strZzn2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        androidx.media3.datasource.cache.c.y(sb2, "ActivityContent fetchId: ", i, " score:", i4);
        sb2.append(" total_length:");
        sb2.append(i6);
        sb2.append("\n text: ");
        sb2.append(strZzn);
        androidx.media3.datasource.cache.c.A(sb2, "\n viewableText", strZzn2, "\n signture: ", str);
        return androidx.camera.core.impl.a.p(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final boolean zza() {
        boolean z4;
        synchronized (this.zzg) {
            z4 = this.zzm == 0;
        }
        return z4;
    }

    public final String zzb() {
        return this.zzo;
    }

    public final String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(String str, boolean z4, float f, float f3, float f7, float f10) {
        zzm(str, z4, f, f3, f7, f10);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("ActivityContent: negative number of WebViews.");
                }
                zzi();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzg(String str, boolean z4, float f, float f3, float f7, float f10) {
        zzm(str, z4, f, f3, f7, f10);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        zzazn zzaznVar = this.zze;
                        this.zzo = zzaznVar.zza(this.zzh);
                        this.zzp = zzaznVar.zza(this.zzi);
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final int zzj(int i, int i4) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i4 * this.zzb) + (i * this.zza);
    }

    public final void zzk(int i) {
        this.zzl = i;
    }

    @VisibleForTesting
    public final int zzl() {
        return this.zzk;
    }
}
