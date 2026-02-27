package com.google.android.gms.internal.ads;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfvk implements zzfve {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzfvk(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final /* synthetic */ void zzd(String str, CallbackToFutureAdapter.Completer completer, boolean z4, String str2, byte[] bArr) {
        Throwable th2;
        SocketTimeoutException e;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = URI.create(str).toURL().openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            Objects.requireNonNull(httpURLConnection);
            completer.addCancellationListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    httpURLConnection.disconnect();
                }
            }, this.zza);
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, this.zzb);
            int i = (int) this.zzc;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-protobuf");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.getOutputStream(httpURLConnection));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
                int responseCode = Callback.getResponseCode(httpURLConnection);
                InputStream inputStream = responseCode < 400 ? Callback.getInputStream(httpURLConnection) : Callback.getErrorStream(httpURLConnection);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        if (inputStream == null) {
                            byteArray = new byte[0];
                            byteArrayOutputStream.close();
                        } else {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int i4 = inputStream.read(bArr2);
                                if (i4 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr2, 0, i4);
                                }
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                        }
                        completer.set(new zzfvj(responseCode, byteArray));
                    } finally {
                    }
                } catch (Throwable th4) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (SocketTimeoutException e10) {
            e = e10;
            httpURLConnection2 = httpURLConnection;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 9);
            sb2.append("Timeout: ");
            sb2.append(message);
            completer.setException(new TimeoutException(sb2.toString()));
            httpURLConnection = httpURLConnection2;
        } catch (Throwable th8) {
            th2 = th8;
            httpURLConnection2 = httpURLConnection;
            completer.setException(th2);
            httpURLConnection = httpURLConnection2;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final S1.y zza(final String str, final byte[] bArr, String str2) {
        final boolean z4 = true;
        final String str3 = "application/x-protobuf";
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver(str, z4, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvh
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "application/x-protobuf";
            private final /* synthetic */ byte[] zzd;

            {
                this.zzd = bArr;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.zza.zzb(this.zzb, true, this.zzc, this.zzd, completer);
            }
        });
    }

    public final /* synthetic */ Object zzb(final String str, boolean z4, String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        final boolean z5 = true;
        final String str3 = "application/x-protobuf";
        this.zza.execute(new Runnable(str, completer, z5, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvg
            private final /* synthetic */ String zzb;
            private final /* synthetic */ CallbackToFutureAdapter.Completer zzc;
            private final /* synthetic */ String zzd = "application/x-protobuf";
            private final /* synthetic */ byte[] zze;

            {
                this.zze = bArr;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(this.zzb, this.zzc, true, this.zzd, this.zze);
            }
        });
        return "";
    }

    public final /* synthetic */ void zzc(String str, CallbackToFutureAdapter.Completer completer, boolean z4, String str2, byte[] bArr) {
        zzd(str, completer, true, "application/x-protobuf", bArr);
    }
}
