package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfx extends zzfs {
    private final ContentResolver zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfx(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws zzfw {
        if (i4 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i4 = (int) Math.min(j, i4);
            } catch (IOException e) {
                throw new zzfw(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzeo.zza;
        int i6 = fileInputStream.read(bArr, i, i4);
        if (i6 == -1) {
            return -1;
        }
        long j6 = this.zze;
        if (j6 != -1) {
            this.zze = j6 - ((long) i6);
        }
        zzh(i6);
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzfw {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = zzgeVar.zza.normalizeScheme();
                this.zzb = uriNormalizeScheme;
                zzf(zzgeVar);
                if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.zzc = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    String strValueOf = String.valueOf(uriNormalizeScheme);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                    sb2.append("Could not open file descriptor for: ");
                    sb2.append(strValueOf);
                    IOException iOException = new IOException(sb2.toString());
                    i = 2000;
                    try {
                        throw new zzfw(iOException, 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new zzfw(e, true != (e instanceof FileNotFoundException) ? i : PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgeVar.zze > length) {
                    throw new zzfw(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j = zzgeVar.zze;
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new zzfw(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.zze = jPosition;
                        if (jPosition < 0) {
                            throw new zzfw(null, 2008);
                        }
                    }
                } else {
                    long j6 = length - jSkip;
                    this.zze = j6;
                    if (j6 < 0) {
                        throw new zzfw(null, 2008);
                    }
                    jPosition = j6;
                }
                long j7 = zzgeVar.zzf;
                if (j7 != -1) {
                    this.zze = jPosition == -1 ? j7 : Math.min(jPosition, j7);
                }
                this.zzf = true;
                zzg(zzgeVar);
                return j7 != -1 ? j7 : this.zze;
            } catch (IOException e7) {
                e = e7;
                i = 2000;
            }
        } catch (zzfw e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzfw {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e) {
                        throw new zzfw(e, 2000);
                    }
                } catch (IOException e7) {
                    throw new zzfw(e7, 2000);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th2;
                } catch (IOException e10) {
                    throw new zzfw(e10, 2000);
                }
            }
        } catch (Throwable th3) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th3;
        }
    }
}
