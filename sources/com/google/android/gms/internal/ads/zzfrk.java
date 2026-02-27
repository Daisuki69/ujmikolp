package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrk extends zzfqy {
    private zzght<Integer> zza;
    private zzght<Integer> zzb;

    @Nullable
    private zzfra zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzfrk(zzght<Integer> zzghtVar, zzght<Integer> zzghtVar2, @Nullable zzfra zzfraVar) {
        this.zza = zzghtVar;
        this.zzb = zzghtVar2;
        this.zzc = zzfraVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(@Nullable HttpURLConnection httpURLConnection) {
        zzfqz.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(@NonNull final URL url, final int i) throws IOException {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrc
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfra() { // from class: com.google.android.gms.internal.ads.zzfrd
            @Override // com.google.android.gms.internal.ads.zzfra
            public final /* synthetic */ URLConnection zza() {
                return zzfrk.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(@NonNull final Network network, @NonNull final URL url, final int i, final int i4) throws IOException {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrf
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i4);
            }
        };
        this.zzc = new zzfra() { // from class: com.google.android.gms.internal.ads.zzfrg
            @Override // com.google.android.gms.internal.ads.zzfra
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfra zzfraVar, final int i, final int i4) throws IOException {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrh
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzght() { // from class: com.google.android.gms.internal.ads.zzfri
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i4);
            }
        };
        this.zzc = zzfraVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfqz.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfra zzfraVar = this.zzc;
        zzfraVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfraVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public zzfrk() {
        this(zzfrj.zza, zzfrb.zza, null);
    }
}
