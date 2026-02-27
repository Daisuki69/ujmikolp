package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static boolean a(VideoEncoderInfo videoEncoderInfo, int i, int i4) {
        if (videoEncoderInfo.isSizeSupported(i, i4)) {
            return true;
        }
        return videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.isSizeSupported(i4, i);
    }
}
