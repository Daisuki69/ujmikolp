package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.rtsp.RtspMessageChannel;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
interface RtpDataChannel extends DataSource {

    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int i) throws IOException;

        @Nullable
        Factory createFallbackDataChannelFactory();
    }

    @Nullable
    RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener();

    int getLocalPort();

    String getTransport();

    boolean needsClosingOnLoadCompletion();
}
