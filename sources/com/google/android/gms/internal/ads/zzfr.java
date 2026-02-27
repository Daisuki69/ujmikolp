package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfr extends zzfs {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfr(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws zzfq {
        if (i4 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i4 = (int) Math.min(j, i4);
            } catch (IOException e) {
                throw new zzfq(e, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzeo.zza;
        int i6 = inputStream.read(bArr, i, i4);
        if (i6 == -1) {
            return -1;
        }
        long j6 = this.zzd;
        if (j6 != -1) {
            this.zzd = j6 - ((long) i6);
        }
        zzh(i6);
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzfq {
        try {
            Uri uri = zzgeVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzgeVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            long j = zzgeVar.zze;
            if (inputStreamOpen.skip(j) < j) {
                throw new zzfq(null, 2008);
            }
            long j6 = zzgeVar.zzf;
            if (j6 != -1) {
                this.zzd = j6;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzgeVar);
            return this.zzd;
        } catch (zzfq e) {
            throw e;
        } catch (IOException e7) {
            throw new zzfq(e7, true != (e7 instanceof FileNotFoundException) ? 2000 : PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzfq {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzfq(e, 2000);
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th2;
        }
    }
}
