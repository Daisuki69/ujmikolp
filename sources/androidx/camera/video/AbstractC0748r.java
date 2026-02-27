package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;

/* JADX INFO: renamed from: androidx.camera.video.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0748r {
    public static VideoValidatedEncoderProfilesProxy a(VideoCapabilities videoCapabilities, Size size, DynamicRange dynamicRange) {
        return null;
    }

    public static Quality b(VideoCapabilities videoCapabilities, Size size, DynamicRange dynamicRange) {
        return Quality.NONE;
    }

    public static VideoValidatedEncoderProfilesProxy c(VideoCapabilities videoCapabilities, Quality quality, DynamicRange dynamicRange) {
        return null;
    }

    public static boolean d(VideoCapabilities videoCapabilities) {
        return false;
    }
}
