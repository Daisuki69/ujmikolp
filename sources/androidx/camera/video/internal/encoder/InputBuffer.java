package androidx.camera.video.internal.encoder;

import S1.y;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface InputBuffer {
    boolean cancel();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    y getTerminationFuture();

    void setEndOfStream(boolean z4);

    void setPresentationTimeUs(long j);

    boolean submit();
}
