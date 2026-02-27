package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzua extends IOException {
    public zzua() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzua(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    public zzua(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
