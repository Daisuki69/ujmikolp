package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new g();

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z4, boolean z5) throws MediaCodecUtil.DecoderQueryException;
}
