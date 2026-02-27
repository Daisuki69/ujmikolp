package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqv extends zzhpg {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhpq zzm;
    private long zzn;

    public zzaqv() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhpq.zzj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return We.s.h(this.zzn, "]", sb2);
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzhpe
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhpl.zza(zzaqr.zzd(byteBuffer));
            this.zzh = zzhpl.zza(zzaqr.zzd(byteBuffer));
            this.zzi = zzaqr.zza(byteBuffer);
            this.zzj = zzaqr.zzd(byteBuffer);
        } else {
            this.zzg = zzhpl.zza(zzaqr.zza(byteBuffer));
            this.zzh = zzhpl.zza(zzaqr.zza(byteBuffer));
            this.zzi = zzaqr.zza(byteBuffer);
            this.zzj = zzaqr.zza(byteBuffer);
        }
        this.zzk = zzaqr.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzaqr.zzb(byteBuffer);
        zzaqr.zza(byteBuffer);
        zzaqr.zza(byteBuffer);
        this.zzm = new zzhpq(zzaqr.zze(byteBuffer), zzaqr.zze(byteBuffer), zzaqr.zze(byteBuffer), zzaqr.zze(byteBuffer), zzaqr.zzf(byteBuffer), zzaqr.zzf(byteBuffer), zzaqr.zzf(byteBuffer), zzaqr.zze(byteBuffer), zzaqr.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqr.zza(byteBuffer);
    }
}
