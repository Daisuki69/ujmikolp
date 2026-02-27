package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzoy {
    public static final zzoy zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgke zzd;

    static {
        zzoy zzoyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgkd zzgkdVar = new zzgkd();
            for (int i = 1; i <= 10; i++) {
                zzgkdVar.zzf(Integer.valueOf(zzeo.zzB(i)));
            }
            zzoyVar = new zzoy(2, zzgkdVar.zzi());
        } else {
            zzoyVar = new zzoy(2, 10);
        }
        zza = zzoyVar;
    }

    public zzoy(int i, int i4) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoy)) {
            return false;
        }
        zzoy zzoyVar = (zzoy) obj;
        return this.zzb == zzoyVar.zzb && this.zzc == zzoyVar.zzc && Objects.equals(this.zzd, zzoyVar.zzd);
    }

    public final int hashCode() {
        zzgke zzgkeVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgkeVar == null ? 0 : zzgkeVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i4).length() + 15 + strValueOf.length() + 1);
        androidx.media3.datasource.cache.c.y(sb2, "AudioProfile[format=", i, ", maxChannelCount=", i4);
        return We.s.q(sb2, ", channelMasks=", strValueOf, "]");
    }

    public final boolean zza(int i) {
        zzgke zzgkeVar = this.zzd;
        if (zzgkeVar == null) {
            return i <= this.zzc;
        }
        int iZzB = zzeo.zzB(i);
        if (iZzB == 0) {
            return false;
        }
        return zzgkeVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i, zzc zzcVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzoz.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i4 = this.zzb;
        for (int i6 = 10; i6 > 0; i6--) {
            int iZzB = zzeo.zzB(i6);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i).setChannelMask(iZzB).build(), zzcVar.zza())) {
                return i6;
            }
        }
        return 0;
    }

    @RequiresApi(33)
    public zzoy(int i, Set set) {
        this.zzb = i;
        zzgke zzgkeVarZzo = zzgke.zzo(set);
        this.zzd = zzgkeVarZzo;
        zzgmd it = zzgkeVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
