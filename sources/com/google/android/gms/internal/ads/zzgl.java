package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzfs implements zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final zzgs zze;
    private final zzgs zzf;

    @Nullable
    private zzge zzg;

    @Nullable
    private HttpURLConnection zzh;

    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzgl(String str, int i, int i4, boolean z4, boolean z5, zzgs zzgsVar, zzghd zzghdVar, boolean z8, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i4;
        this.zza = z4;
        this.zze = zzgsVar;
        this.zzf = new zzgs();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, @androidx.annotation.Nullable byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.lang.Exception {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            com.dynatrace.android.callback.Callback.openConnection(r3)
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzb
            r3.setConnectTimeout(r4)
            int r4 = r2.zzc
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzgs r5 = r2.zze
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzgs r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L35
        L51:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L60
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5f
            r4 = 0
            goto L75
        L5f:
            r6 = r4
        L60:
            java.lang.String r4 = "bytes="
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = androidx.camera.core.impl.a.s(r6, r4, r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L71
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L71:
            java.lang.String r4 = r4.toString()
        L75:
            if (r4 == 0) goto L7c
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L7c:
            java.lang.String r4 = r2.zzd
            if (r4 == 0) goto L85
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L85:
            r4 = 1
            if (r4 == r10) goto L8b
            java.lang.String r4 = "identity"
            goto L8d
        L8b:
            java.lang.String r4 = "gzip"
        L8d:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzge.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            com.dynatrace.android.callback.Callback.connect(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, @Nullable String str, zzge zzgeVar) throws zzgp {
        if (str == null) {
            throw new zzgp("Null location redirect", zzgeVar, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgeVar, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.c(40, protocol2), 1, protocol));
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new zzgp(sb2.toString(), zzgeVar, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        } catch (MalformedURLException e) {
            throw new zzgp(e, zzgeVar, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzds.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws zzgp {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j6 = j - this.zzm;
                if (j6 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j6);
            }
            InputStream inputStream = this.zzi;
            String str = zzeo.zza;
            int i6 = inputStream.read(bArr, i, i4);
            if (i6 == -1) {
                return -1;
            }
            this.zzm += (long) i6;
            zzh(i6);
            return i6;
        } catch (IOException e) {
            zzge zzgeVar = this.zzg;
            String str2 = zzeo.zza;
            throw zzgp.zza(e, zzgeVar, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzge r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.zzb(com.google.android.gms.internal.ads.zzge):long");
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzge zzgeVar = this.zzg;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzge zzgeVar = this.zzg;
                    String str = zzeo.zza;
                    throw new zzgp(e, zzgeVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs, com.google.android.gms.internal.ads.zzga
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgkc.zza() : new zzgk(Callback.getHeaderFields(httpURLConnection));
    }
}
