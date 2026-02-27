package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzge zzgeVar, byte[] bArr) {
        super(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 15), "Response code: ", i), iOException, zzgeVar, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
        this.zzc = i;
    }
}
