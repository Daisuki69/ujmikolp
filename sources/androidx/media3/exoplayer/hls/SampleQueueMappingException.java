package androidx.media3.exoplayer.hls;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(s.j("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
