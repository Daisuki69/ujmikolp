package com.shield.android.e;

import com.dynatrace.android.callback.Callback;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
abstract class c implements Closeable, AutoCloseable {
    final HttpURLConnection gU;
    final InputStream gV;
    final OutputStream gW;

    public c(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            com.shield.android.k.a.dL().a(Callback.getContent(httpURLConnection).toString(), new Object[0]);
            com.shield.android.k.a.dL().a(httpURLConnection.getURL().toString(), new Object[0]);
        } catch (Exception unused) {
        }
        if (httpURLConnection == null) {
            throw new IllegalArgumentException(d("얕抔넓壐갺홌正㗢᪪ഌ蚑䍥ꆑ탶\ue805\uf440勇ﵡ"));
        }
        this.gU = httpURLConnection;
        this.gV = inputStream;
        this.gW = outputStream;
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        char c = 35820;
        int i = 0;
        while (i < str.length()) {
            c = (char) ((c >> 1) | (((char) (((((c >> 2) ^ c) ^ (c >> 3)) ^ (c >> 5)) & 1)) << 15));
            char cCharAt = str.charAt(i);
            int i4 = cCharAt + c;
            int i6 = i4 + 1 + ((~cCharAt) | (~c));
            sb2.append((char) (i6 - (i4 - i6)));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.gU.disconnect();
    }
}
