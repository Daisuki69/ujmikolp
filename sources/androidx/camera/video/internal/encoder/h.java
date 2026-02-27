package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl.ByteBufferInput f7679b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    public /* synthetic */ h(EncoderImpl.ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer, int i) {
        this.f7678a = i;
        this.f7679b = byteBufferInput;
        this.c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7678a) {
            case 0:
                this.f7679b.lambda$acquireBuffer$4(this.c);
                break;
            default:
                this.f7679b.lambda$fetchData$0(this.c);
                break;
        }
    }
}
