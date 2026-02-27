package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdv extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private zzge zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcdv(String str, zzgy zzgyVar, int i, int i4, long j, long j6) {
        super(true);
        zzcu.zza(str);
        this.zzd = str;
        this.zze = new zzgs();
        this.zzb = i;
        this.zzc = i4;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j6;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws Exception {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j6 = this.zzm;
            if (j - j6 == 0) {
                return -1;
            }
            long j7 = this.zzn + j6;
            long j9 = i4;
            long j10 = j7 + j9 + this.zzr;
            long j11 = this.zzp;
            long j12 = j11 + 1;
            if (j10 > j12) {
                long j13 = this.zzo;
                if (j11 < j13) {
                    long jMin = Math.min(j13, Math.max(((this.zzq + j12) - r4) - 1, (j12 + j9) - 1));
                    zzk(j12, jMin, 2);
                    this.zzp = jMin;
                    j11 = jMin;
                }
            }
            int i6 = this.zzi.read(bArr, i, (int) Math.min(j9, ((j11 + 1) - this.zzn) - this.zzm));
            if (i6 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i6;
            zzh(i6);
            return i6;
        } catch (IOException e) {
            throw new zzgp(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws Exception {
        this.zzf = zzgeVar;
        this.zzm = 0L;
        long j = zzgeVar.zze;
        long j6 = zzgeVar.zzf;
        long jMin = j6 == -1 ? this.zzq : Math.min(this.zzq, j6);
        this.zzn = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = Callback.getHeaderField(httpURLConnectionZzk, "Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j7 = Long.parseLong(matcher.group(2));
                    long j9 = Long.parseLong(matcher.group(3));
                    long j10 = zzgeVar.zzf;
                    if (j10 != -1) {
                        this.zzl = j10;
                        this.zzo = Math.max(j7, (this.zzn + j10) - 1);
                    } else {
                        this.zzl = j9 - this.zzn;
                        this.zzo = j9 - 1;
                    }
                    this.zzp = j7;
                    this.zzj = true;
                    zzg(zzgeVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strQ = We.s.q(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strQ);
                }
            }
        }
        throw new zzcdt(headerField, zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs, com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Callback.getHeaderFields(httpURLConnection);
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j, long j6, int i) throws Exception {
        int i4;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            URLConnection uRLConnectionOpenConnection = new URL(string).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    i4 = i;
                    String strValueOf = String.valueOf(string);
                    throw new zzgp("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i4);
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j6).length());
            sb2.append("bytes=");
            sb2.append(j);
            sb2.append(Global.HYPHEN);
            sb2.append(j6);
            httpURLConnection.setRequestProperty(RtspHeaders.RANGE, sb2.toString());
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            Callback.connect(httpURLConnection);
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = Callback.getResponseCode(httpURLConnection);
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = Callback.getHeaderFields(httpURLConnection);
                    zzl();
                    throw new zzcdu(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStream = Callback.getInputStream(httpURLConnection);
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e7) {
                    zzl();
                    throw new zzgp(e7, this.zzf, 2000, i);
                }
            } catch (IOException e10) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzgp("Unable to connect to ".concat(strValueOf2), e10, this.zzf, 2000, i);
            }
        } catch (IOException e11) {
            i4 = i;
            iOException = e11;
        }
    }
}
