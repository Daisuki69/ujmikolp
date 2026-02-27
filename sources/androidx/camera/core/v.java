package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.internal.utils.ImageUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {
    public static Bitmap a(ImageProxy imageProxy) {
        return ImageUtil.createBitmapFromImageProxy(imageProxy);
    }
}
