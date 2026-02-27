package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j, long j6, Format format, @Nullable MediaFormat mediaFormat);
}
