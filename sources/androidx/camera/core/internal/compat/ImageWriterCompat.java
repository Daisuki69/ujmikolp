package androidx.camera.core.internal.compat;

import We.s;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(@NonNull ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    @NonNull
    public static Image dequeueInputImage(@NonNull ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i, int i4) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i, i4);
        }
        if (i6 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i, i4);
        }
        throw new RuntimeException(s.g(i6, "Unable to call newInstance(Surface, int, int) on API ", ". Version 26 or higher required."));
    }

    public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i);
    }
}
