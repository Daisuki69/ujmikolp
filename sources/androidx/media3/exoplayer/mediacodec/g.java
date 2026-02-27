package androidx.media3.exoplayer.mediacodec;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements MediaCodecSelector {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public final List getDecoderInfos(String str, boolean z4, boolean z5) {
        return MediaCodecUtil.getDecoderInfos(str, z4, z5);
    }
}
