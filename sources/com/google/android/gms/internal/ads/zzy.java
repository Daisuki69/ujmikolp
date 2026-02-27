package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy {

    @Nullable
    private String zza;

    @Nullable
    private Uri zzb;
    private final zzz zzc = new zzz();
    private final List zzd;
    private final zzgjz zze;
    private final zzad zzf;
    private final zzah zzg;

    public zzy() {
        zzgjz.zzi();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzgjz.zzi();
        this.zzf = new zzad();
        this.zzg = zzah.zza;
    }

    public final zzy zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzy zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzaj zzc() {
        zzaf zzafVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzafVar = new zzaf(uri, null, null, null, this.zzd, null, this.zze, null, androidx.media3.common.C.TIME_UNSET, null);
        } else {
            zzafVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzaj(str, new zzab(this.zzc, null), zzafVar, new zzae(this.zzf, bArr), zzam.zza, this.zzg, null);
    }
}
