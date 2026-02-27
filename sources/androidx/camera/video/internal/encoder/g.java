package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter.Resolver, OutputConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7677b;

    public /* synthetic */ g(Object obj, int i) {
        this.f7676a = i;
        this.f7677b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7676a) {
            case 0:
                return ((EncoderImpl.ByteBufferInput) this.f7677b).lambda$fetchData$1(completer);
            default:
                return ((EncoderImpl.ByteBufferInput) this.f7677b).lambda$acquireBuffer$5(completer);
        }
    }

    @Override // androidx.camera.video.internal.encoder.OutputConfig
    public MediaFormat getMediaFormat() {
        return EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$5((MediaFormat) this.f7677b);
    }
}
