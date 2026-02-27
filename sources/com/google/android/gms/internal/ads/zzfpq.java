package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpq {
    private final zzaxw zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfpq(@NonNull zzaxw zzaxwVar, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.zza = zzaxwVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzaxw zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzv;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzhhb zzhhbVar = zzhhb.zzb;
                    arrayList = new ArrayList();
                    iMin = 256;
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzv = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i = 0;
                while (i < iMin) {
                    int i4 = fileInputStream.read(bArr, i, iMin - i);
                    if (i4 == -1) {
                        break;
                    }
                    i += i4;
                }
                zzhhb zzhhbVarZzr = i == 0 ? null : zzhhb.zzr(bArr, 0, i);
                if (zzhhbVarZzr == null) {
                    break;
                }
                arrayList.add(zzhhbVarZzr);
                iMin = Math.min(iMin + iMin, 8192);
                this.zze = bArrZzv;
            }
            bArrZzv = zzhhb.zzt(arrayList).zzv();
            IOUtils.closeQuietly(fileInputStream);
            this.zze = bArrZzv;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
