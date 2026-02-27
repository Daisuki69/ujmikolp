package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdb extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzge zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcdb(String str, zzgy zzgyVar, int i, int i4, int i6) {
        super(true);
        this.zzc = new zzcda(this);
        this.zzr = new HashSet();
        zzcu.zza(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i;
        this.zze = i4;
        this.zzq = i6;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws zzgp {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j6 = this.zzm;
                    if (j == j6) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i6 = this.zzj.read(bArr2, 0, (int) Math.min(j6 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i6;
                    zzh(i6);
                }
            }
            if (i4 == 0) {
                return 0;
            }
            long j7 = this.zzn;
            if (j7 != -1) {
                long j9 = j7 - this.zzp;
                if (j9 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j9);
            }
            int i10 = this.zzj.read(bArr, i, i4);
            if (i10 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i10;
            zzh(i10);
            return i10;
        } catch (IOException e) {
            throw new zzgp(e, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[Catch: IOException -> 0x0047, TryCatch #1 {IOException -> 0x0047, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003e, B:11:0x004b, B:12:0x0063, B:14:0x0069, B:22:0x0097, B:24:0x00b9, B:26:0x00df, B:27:0x00e4, B:29:0x00ed, B:30:0x00f4, B:43:0x011d, B:96:0x027e, B:98:0x028b, B:100:0x029c, B:103:0x02a5, B:104:0x02b2, B:106:0x02bc, B:107:0x02c3, B:108:0x02c4, B:109:0x02e1), top: B:114:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028b A[Catch: IOException -> 0x0047, TryCatch #1 {IOException -> 0x0047, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003e, B:11:0x004b, B:12:0x0063, B:14:0x0069, B:22:0x0097, B:24:0x00b9, B:26:0x00df, B:27:0x00e4, B:29:0x00ed, B:30:0x00f4, B:43:0x011d, B:96:0x027e, B:98:0x028b, B:100:0x029c, B:103:0x02a5, B:104:0x02b2, B:106:0x02bc, B:107:0x02c3, B:108:0x02c4, B:109:0x02e1), top: B:114:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzge r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdb.zzb(com.google.android.gms.internal.ads.zzge):long");
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                String str = zzeo.zza;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs, com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Callback.getHeaderFields(httpURLConnection);
    }

    public final void zzk(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
