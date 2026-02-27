package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhhk extends IOException {
    public zzhhk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhhk(long j, long j6, int i, Throwable th2) {
        Locale locale = Locale.US;
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "Pos: ", ", limit: ");
        sbS.append(j6);
        sbS.append(", len: ");
        sbS.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), th2);
    }

    public zzhhk(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
