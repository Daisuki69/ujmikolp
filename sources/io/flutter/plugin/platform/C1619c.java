package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* JADX INFO: renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1619c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextureRegistry$ImageTextureEntry f17220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageReader f17221b;
    public int c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17222d = 0;
    public final Handler e = new Handler();
    public final C1618b f = new C1618b(this);

    public C1619c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f17220a = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.n
    public final void a(int i, int i4) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = this.f17221b;
        if (imageReader != null && this.c == i && this.f17222d == i4) {
            return;
        }
        if (imageReader != null) {
            this.f17220a.pushImage(null);
            this.f17221b.close();
            this.f17221b = null;
        }
        this.c = i;
        this.f17222d = i4;
        int i6 = Build.VERSION.SDK_INT;
        Handler handler = this.e;
        C1618b c1618b = this.f;
        if (i6 >= 33) {
            androidx.webkit.internal.e.t();
            ImageReader.Builder builderK = androidx.webkit.internal.e.k(this.c, this.f17222d);
            builderK.setMaxImages(4);
            builderK.setImageFormat(34);
            builderK.setUsage(256L);
            imageReaderNewInstance = builderK.build();
            imageReaderNewInstance.setOnImageAvailableListener(c1618b, handler);
        } else {
            if (i6 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i, i4, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c1618b, handler);
        }
        this.f17221b = imageReaderNewInstance;
    }

    @Override // io.flutter.plugin.platform.n
    public final int getHeight() {
        return this.f17222d;
    }

    @Override // io.flutter.plugin.platform.n
    public final long getId() {
        return this.f17220a.id();
    }

    @Override // io.flutter.plugin.platform.n
    public final Surface getSurface() {
        return this.f17221b.getSurface();
    }

    @Override // io.flutter.plugin.platform.n
    public final int getWidth() {
        return this.c;
    }

    @Override // io.flutter.plugin.platform.n
    public final void release() {
        if (this.f17221b != null) {
            this.f17220a.pushImage(null);
            this.f17221b.close();
            this.f17221b = null;
        }
        this.f17220a = null;
    }

    @Override // io.flutter.plugin.platform.n
    public final /* synthetic */ void scheduleFrame() {
    }
}
