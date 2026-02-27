package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import u2.C2294b;
import u2.InterfaceC2298f;

/* JADX INFO: loaded from: classes3.dex */
final class zzda implements InterfaceC2298f {
    private boolean zza = false;
    private boolean zzb = false;
    private C2294b zzc;
    private final zzcw zzd;

    public zzda(zzcw zzcwVar) {
        this.zzd = zzcwVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @NonNull
    public final InterfaceC2298f add(double d10) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final void zza(C2294b c2294b, boolean z4) {
        this.zza = false;
        this.zzc = c2294b;
        this.zzb = z4;
    }

    @NonNull
    public final InterfaceC2298f add(float f) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC2298f add(int i) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC2298f add(long j) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // u2.InterfaceC2298f
    @NonNull
    public final InterfaceC2298f add(@Nullable String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // u2.InterfaceC2298f
    @NonNull
    public final InterfaceC2298f add(boolean z4) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z4 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC2298f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
