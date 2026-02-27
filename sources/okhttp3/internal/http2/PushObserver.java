package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.j;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes5.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, BufferedSource source, int i4, boolean z4) throws IOException {
                j.g(source, "source");
                source.skip(i4);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, List<Header> responseHeaders, boolean z4) {
                j.g(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, List<Header> requestHeaders) {
                j.g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, ErrorCode errorCode) {
                j.g(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i4, boolean z4) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z4);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
