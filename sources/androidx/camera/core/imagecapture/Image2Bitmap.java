package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Image2Bitmap implements Operation<Packet<ImageProxy>, Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Bitmap apply(@NonNull Packet<ImageProxy> packet) throws Throwable {
        Bitmap bitmapRotateBitmap;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = null;
        try {
            try {
                if (packet.getFormat() == 35) {
                    ImageProxy data = packet.getData();
                    boolean z4 = packet.getRotationDegrees() % 180 != 0;
                    SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(z4 ? data.getHeight() : data.getWidth(), z4 ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        ImageProxy imageProxyConvertYUVToRGB = ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy2, ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (imageProxyConvertYUVToRGB == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapRotateBitmap = ImageUtil.createBitmapFromImageProxy(imageProxyConvertYUVToRGB);
                        imageProxyConvertYUVToRGB.close();
                        safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new ImageCaptureException(0, "Can't convert " + (packet.getFormat() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                        if (safeCloseImageReaderProxy != null) {
                            safeCloseImageReaderProxy.close();
                        }
                        throw th;
                    }
                } else {
                    if (packet.getFormat() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + packet.getFormat());
                    }
                    ImageProxy data2 = packet.getData();
                    Bitmap bitmapCreateBitmapFromImageProxy = ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    bitmapRotateBitmap = ImageUtil.rotateBitmap(bitmapCreateBitmapFromImageProxy, packet.getRotationDegrees());
                }
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.close();
                }
                return bitmapRotateBitmap;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedOperationException e7) {
            e = e7;
        }
    }
}
