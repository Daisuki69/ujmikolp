package androidx.media3.exoplayer;

import androidx.media3.exoplayer.RendererCapabilities;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class K {
    public static void a(RendererCapabilities rendererCapabilities) {
    }

    public static void b(RendererCapabilities rendererCapabilities, RendererCapabilities.Listener listener) {
    }

    public static int c(int i) {
        return e(i, 0, 0, 0);
    }

    public static int d(int i, int i4, int i6) {
        return g(i, i4, i6, 0, 128, 0);
    }

    public static int e(int i, int i4, int i6, int i10) {
        return g(i, i4, i6, 0, 128, i10);
    }

    public static int f(int i, int i4, int i6, int i10, int i11) {
        return g(i, i4, i6, i10, i11, 0);
    }

    public static int g(int i, int i4, int i6, int i10, int i11, int i12) {
        return i | i4 | i6 | i10 | i11 | i12;
    }

    public static int h(int i) {
        return i & 24;
    }

    public static int i(int i) {
        return i & RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    public static int j(int i) {
        return i & RendererCapabilities.DECODER_SUPPORT_MASK;
    }

    public static int k(int i) {
        return i & 7;
    }

    public static int l(int i) {
        return i & 64;
    }

    public static int m(int i) {
        return i & 32;
    }

    public static boolean n(int i, boolean z4) {
        int iK = k(i);
        if (iK != 4) {
            return z4 && iK == 3;
        }
        return true;
    }
}
