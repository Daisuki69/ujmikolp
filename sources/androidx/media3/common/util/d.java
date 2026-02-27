package androidx.media3.common.util;

import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ AudioRouting$OnRoutingChangedListener d(Object obj) {
        return (AudioRouting$OnRoutingChangedListener) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f(int i, int i4) {
        return new MediaCodec.CryptoInfo.Pattern(i, i4);
    }

    public static /* synthetic */ void m() {
    }
}
