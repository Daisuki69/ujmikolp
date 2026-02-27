package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzng;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zznh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzrz;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsa;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzse;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzst;
import java.util.List;
import p3.k;

/* JADX INFO: loaded from: classes3.dex */
final class zzb {
    private final zzd zza;

    public zzb(Context context, boolean z4) {
        zzrz zzrzVarZzd = zzrz.zzd("optional-module-face").zzd();
        this.zza = new zzd(new zzse(context, new k(context), new zzsa(context, zzrzVarZzd), zzrzVarZzd.zzb()), false);
    }

    public final void zza(zzst zzstVar, zzsp zzspVar, List list, long j) throws Throwable {
        this.zza.zza(zzstVar, zznh.OPTIONAL_MODULE_FACE_DETECTION_INFERENCE, zzng.NO_ERROR);
    }

    public final void zzb(zzst zzstVar, @Nullable String str, long j) throws Throwable {
        this.zza.zza(zzstVar, zznh.OPTIONAL_MODULE_FACE_DETECTION_CREATE, str != null ? zzng.OPTIONAL_MODULE_CREATE_ERROR : zzng.NO_ERROR);
    }

    public final void zzc(zzst zzstVar) throws Throwable {
        this.zza.zza(zzstVar, zznh.OPTIONAL_MODULE_FACE_DETECTION_INIT, zzng.NO_ERROR);
    }
}
