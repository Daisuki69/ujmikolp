package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class zztw extends zzty {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zztw(byte[] bArr, int i, int i4, boolean z4, zztv zztvVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i) throws zzve {
        int i4 = this.zzd;
        this.zzd = 0;
        int i6 = this.zzb + this.zzc;
        this.zzb = i6;
        if (i6 <= 0) {
            this.zzc = 0;
            return i4;
        }
        this.zzc = i6;
        this.zzb = 0;
        return i4;
    }
}
