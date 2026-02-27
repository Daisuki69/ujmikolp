package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class zzgp extends zzgb {
    public final int zzb;

    public zzgp(zzge zzgeVar, int i, int i4) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgp zza(IOException iOException, zzge zzgeVar, int i) {
        String message = iOException.getMessage();
        int i4 = iOException instanceof SocketTimeoutException ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzggj.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i4 == 2007 ? new zzgo(iOException, zzgeVar) : new zzgp(iOException, zzgeVar, i4, i);
    }

    private static int zzb(int i, int i4) {
        if (i != 2000) {
            return i;
        }
        if (i4 != 1) {
            return 2000;
        }
        return PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED;
    }

    public zzgp(IOException iOException, zzge zzgeVar, int i, int i4) {
        super(iOException, zzb(i, i4));
        this.zzb = i4;
    }

    public zzgp(String str, zzge zzgeVar, int i, int i4) {
        super(str, zzb(i, i4));
        this.zzb = i4;
    }

    public zzgp(String str, @Nullable IOException iOException, zzge zzgeVar, int i, int i4) {
        super(str, iOException, zzb(i, i4));
        this.zzb = i4;
    }
}
