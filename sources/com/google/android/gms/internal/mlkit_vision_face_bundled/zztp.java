package com.google.android.gms.internal.mlkit_vision_face_bundled;

import We.s;
import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes3.dex */
final class zztp extends zztt {
    private final int zzc;

    public zztp(byte[] bArr, int i, int i4) {
        super(bArr);
        zztu.zzh(0, i4, bArr.length);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final byte zza(int i) {
        int i4 = this.zzc;
        if (((i4 - (i + 1)) | i) >= 0) {
            return ((zztt) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.c(i, i4, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final byte zzb(int i) {
        return ((zztt) this).zza[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final int zzd() {
        return this.zzc;
    }
}
