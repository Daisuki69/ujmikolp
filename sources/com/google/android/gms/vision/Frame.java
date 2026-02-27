package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private final Metadata zza;
    private ByteBuffer zzb;

    @RequiresApi(19)
    private zza zzc;
    private Bitmap zzd;

    public static class Builder {
        private final Frame zza = new Frame();

        @RecentlyNonNull
        public Frame build() {
            if (this.zza.zzb == null && this.zza.zzd == null && this.zza.zzc == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setBitmap(@RecentlyNonNull Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zza.zzd = bitmap;
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = width;
            metadata.zzb = height;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(int i) {
            this.zza.getMetadata().zzc = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setImageData(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i4, int i6) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i * i4) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if (i6 != 16 && i6 != 17 && i6 != 842094169) {
                throw new IllegalArgumentException(AbstractC1173g.q(37, i6, "Unsupported image format: "));
            }
            this.zza.zzb = byteBuffer;
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = i;
            metadata.zzb = i4;
            metadata.zzf = i6;
            return this;
        }

        @RecentlyNonNull
        @RequiresApi(19)
        @KeepForSdk
        public Builder setPlanes(@RecentlyNonNull Image.Plane[] planeArr, int i, int i4, int i6) {
            if (planeArr == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (planeArr.length != 3) {
                throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            }
            if (planeArr[0].getBuffer().capacity() < i * i4) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            this.zza.zzc = new zza(planeArr);
            Metadata metadata = this.zza.getMetadata();
            metadata.zza = i;
            metadata.zzb = i4;
            metadata.zzf = i6;
            return this;
        }

        @RecentlyNonNull
        public Builder setRotation(int i) {
            this.zza.getMetadata().zze = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimestampMillis(long j) {
            this.zza.getMetadata().zzd = j;
            return this;
        }
    }

    public static class zza {
        private final Image.Plane[] zza;

        public zza(Image.Plane[] planeArr) {
            this.zza = planeArr;
        }

        public final Image.Plane[] zza() {
            return this.zza;
        }
    }

    private Frame() {
        this.zza = new Metadata();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    @RecentlyNullable
    public Bitmap getBitmap() {
        return this.zzd;
    }

    @RecentlyNullable
    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.zzd;
        if (bitmap == null) {
            return this.zzb;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.zzd.getHeight();
        int i = width * height;
        this.zzd.getPixels(new int[i], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = (byte) ((Color.blue(r2[i4]) * 0.114f) + (Color.green(r2[i4]) * 0.587f) + (Color.red(r2[i4]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public Metadata getMetadata() {
        return this.zza;
    }

    @RecentlyNullable
    @RequiresApi(19)
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        zza zzaVar = this.zzc;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.zza();
    }

    public static class Metadata {
        private int zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private int zze;
        private int zzf;

        public Metadata() {
            this.zzf = -1;
        }

        public int getFormat() {
            return this.zzf;
        }

        public int getHeight() {
            return this.zzb;
        }

        public int getId() {
            return this.zzc;
        }

        public int getRotation() {
            return this.zze;
        }

        public long getTimestampMillis() {
            return this.zzd;
        }

        public int getWidth() {
            return this.zza;
        }

        public final void zza() {
            if (this.zze % 2 != 0) {
                int i = this.zza;
                this.zza = this.zzb;
                this.zzb = i;
            }
            this.zze = 0;
        }

        public Metadata(@RecentlyNonNull Metadata metadata) {
            this.zzf = -1;
            this.zza = metadata.getWidth();
            this.zzb = metadata.getHeight();
            this.zzc = metadata.getId();
            this.zzd = metadata.getTimestampMillis();
            this.zze = metadata.getRotation();
            this.zzf = metadata.getFormat();
        }
    }
}
