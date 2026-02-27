package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.SizeFCompat;
import androidx.exifinterface.media.ExifInterface;
import defpackage.AbstractC1414e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class ImageResizer {
    private final Context context;
    private final ExifDataCopier exifDataCopier;

    public ImageResizer(@NonNull Context context, @NonNull ExifDataCopier exifDataCopier) {
        this.context = context;
        this.exifDataCopier = exifDataCopier;
    }

    private int calculateSampleSize(BitmapFactory.Options options, int i, int i4) {
        int i6 = options.outHeight;
        int i10 = options.outWidth;
        int i11 = 1;
        if (i6 <= i4 && i10 <= i) {
            return 1;
        }
        int i12 = i6 / 2;
        int i13 = i10 / 2;
        while (i12 / i11 >= i4 && i13 / i11 >= i) {
            i11 *= 2;
        }
        return i11;
    }

    private SizeFCompat calculateTargetSize(double d10, double d11, @Nullable Double d12, @Nullable Double d13) {
        double d14 = d10 / d11;
        boolean z4 = false;
        boolean z5 = d12 != null;
        boolean z8 = d13 != null;
        double dMin = z5 ? Math.min(d10, Math.round(d12.doubleValue())) : d10;
        double dMin2 = z8 ? Math.min(d11, Math.round(d13.doubleValue())) : d11;
        boolean z9 = z5 && d12.doubleValue() < d10;
        if (z8 && d13.doubleValue() < d11) {
            z4 = true;
        }
        if (z9 || z4) {
            double d15 = dMin2 * d14;
            double d16 = dMin / d14;
            if (d16 > dMin2) {
                dMin = Math.round(d15);
            } else {
                dMin2 = Math.round(d16);
            }
        }
        return new SizeFCompat((float) dMin, (float) dMin2);
    }

    private void copyExif(String str, String str2) throws Throwable {
        try {
            this.exifDataCopier.copyExif(new ExifInterface(str), new ExifInterface(str2));
        } catch (Exception e) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e);
        }
    }

    private File createFile(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File createImageOnExternalDirectory(String str, Bitmap bitmap, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        File fileCreateFile = createFile(this.context.getCacheDir(), str);
        FileOutputStream fileOutputStreamCreateOutputStream = createOutputStream(fileCreateFile);
        fileOutputStreamCreateOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStreamCreateOutputStream.close();
        return fileCreateFile;
    }

    private FileOutputStream createOutputStream(File file) throws IOException {
        return new FileOutputStream(file);
    }

    private Bitmap createScaledBitmap(Bitmap bitmap, int i, int i4, boolean z4) {
        return Bitmap.createScaledBitmap(bitmap, i, i4, z4);
    }

    private Bitmap decodeFile(String str, @Nullable BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private File resizedImage(Bitmap bitmap, Double d10, Double d11, int i, String str) throws IOException {
        return createImageOnExternalDirectory(AbstractC1414e.h("/scaled_", str), createScaledBitmap(bitmap, d10.intValue(), d11.intValue(), false), i);
    }

    @VisibleForTesting
    public SizeFCompat readFileDimensions(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFile(str, options);
        return new SizeFCompat(options.outWidth, options.outHeight);
    }

    public String resizeImageIfNeeded(String str, @Nullable Double d10, @Nullable Double d11, int i) throws Throwable {
        SizeFCompat fileDimensions = readFileDimensions(str);
        if (fileDimensions.getWidth() == -1.0f || fileDimensions.getHeight() == -1.0f) {
            return str;
        }
        if (d10 == null && d11 == null && i >= 100) {
            return str;
        }
        try {
            String str2 = str.split("/")[r2.length - 1];
            SizeFCompat sizeFCompatCalculateTargetSize = calculateTargetSize(fileDimensions.getWidth(), fileDimensions.getHeight(), d10, d11);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateSampleSize(options, (int) sizeFCompatCalculateTargetSize.getWidth(), (int) sizeFCompatCalculateTargetSize.getHeight());
            Bitmap bitmapDecodeFile = decodeFile(str, options);
            if (bitmapDecodeFile == null) {
                return str;
            }
            File fileResizedImage = resizedImage(bitmapDecodeFile, Double.valueOf(sizeFCompatCalculateTargetSize.getWidth()), Double.valueOf(sizeFCompatCalculateTargetSize.getHeight()), i, str2);
            copyExif(str, fileResizedImage.getPath());
            return fileResizedImage.getPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
