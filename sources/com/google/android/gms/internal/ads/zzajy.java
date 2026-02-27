package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzajy implements zzaeb {
    private final zzaeb zza;
    private final zzajt zzb;

    @Nullable
    private zzajv zzg;
    private zzu zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzeo.zzb;
    private final zzef zzc = new zzef();

    public zzajy(zzaeb zzaebVar, zzajt zzajtVar) {
        this.zza = zzaebVar;
        this.zzb = zzajtVar;
    }

    private final void zzc(int i) {
        int length = this.zzf.length;
        int i4 = this.zze;
        if (length - i4 >= i) {
            return;
        }
        int i6 = i4 - this.zzd;
        int iMax = Math.max(i6 + i6, i + i6);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i6);
        this.zzd = 0;
        this.zze = i6;
        this.zzf = bArr2;
    }

    public final void zza(boolean z4) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzb(long j, int i, zzajn zzajnVar) {
        this.zzh.getClass();
        zzgjz zzgjzVar = zzajnVar.zza;
        long j6 = zzajnVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgjzVar.size());
        Iterator<E> it = zzgjzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcl) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j6);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzef zzefVar = this.zzc;
        int length = bArrMarshall.length;
        zzefVar.zzb(bArrMarshall, length);
        zzaeb zzaebVar = this.zza;
        zzaebVar.zzz(zzefVar, length);
        long j7 = zzajnVar.zzb;
        if (j7 == androidx.media3.common.C.TIME_UNSET) {
            zzghc.zzh(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j9 = this.zzh.zzt;
            j = j9 == Long.MAX_VALUE ? j + j7 : j7 + j9;
        }
        zzaebVar.zzx(j, i | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
        String str = zzuVar.zzo;
        str.getClass();
        zzghc.zza(zzar.zzg(str) == 3);
        if (!zzuVar.equals(this.zzh)) {
            this.zzh = zzuVar;
            zzajt zzajtVar = this.zzb;
            this.zzg = zzajtVar.zza(zzuVar) ? zzajtVar.zzc(zzuVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzu(zzuVar);
            return;
        }
        zzaeb zzaebVar = this.zza;
        zzs zzsVarZza = zzuVar.zza();
        zzsVarZza.zzm(MimeTypes.APPLICATION_MEDIA3_CUES);
        zzsVarZza.zzj(str);
        zzsVarZza.zzr(Long.MAX_VALUE);
        zzsVarZza.zzK(this.zzb.zzb(zzuVar));
        zzaebVar.zzu(zzsVarZza.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i, boolean z4, int i4) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzv(zziVar, i, z4, 0);
        }
        zzc(i);
        int iZza = zziVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i, int i4) {
        if (this.zzg == null) {
            this.zza.zzw(zzefVar, i, i4);
            return;
        }
        zzc(i);
        zzefVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(final long j, final int i, int i4, int i6, @Nullable zzaea zzaeaVar) {
        if (this.zzg == null) {
            this.zza.zzx(j, i, i4, i6, zzaeaVar);
            return;
        }
        zzghc.zzb(zzaeaVar == null, "DRM on subtitles is not supported");
        int i10 = (this.zze - i6) - i4;
        try {
            this.zzg.zza(this.zzf, i10, i4, zzaju.zza(), new zzdf() { // from class: com.google.android.gms.internal.ads.zzajx
                @Override // com.google.android.gms.internal.ads.zzdf
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzb(j, i, (zzajn) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzds.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i11 = i10 + i4;
        this.zzd = i11;
        if (i11 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzy(zzi zziVar, int i, boolean z4) {
        return AbstractC1172f.a(this, zziVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzz(zzef zzefVar, int i) {
        AbstractC1172f.b(this, zzefVar, i);
    }
}
