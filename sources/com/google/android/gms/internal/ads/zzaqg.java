package com.google.android.gms.internal.ads;

import com.dynatrace.android.callback.Callback;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
final class zzaqg extends FilterInputStream implements AutoCloseable {
    private final HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaqg(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream;
        try {
            errorStream = Callback.getInputStream(httpURLConnection);
        } catch (IOException unused) {
            errorStream = Callback.getErrorStream(httpURLConnection);
        }
        super(errorStream);
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.zza.disconnect();
    }
}
