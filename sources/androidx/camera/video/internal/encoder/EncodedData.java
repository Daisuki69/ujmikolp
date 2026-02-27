package androidx.camera.video.internal.encoder;

import S1.y;
import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface EncodedData extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    MediaCodec.BufferInfo getBufferInfo();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    y getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
