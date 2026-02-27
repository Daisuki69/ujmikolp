package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7690b;

    public /* synthetic */ m(AtomicReference atomicReference, int i) {
        this.f7689a = i;
        this.f7690b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7689a) {
            case 0:
                return InputBufferImpl.lambda$new$0(this.f7690b, completer);
            case 1:
                return BufferCopiedEncodedData.lambda$new$0(this.f7690b, completer);
            case 2:
                return EncodedDataImpl.lambda$new$0(this.f7690b, completer);
            case 3:
                return EncoderImpl.lambda$acquireInputBuffer$13(this.f7690b, completer);
            default:
                return EncoderImpl.lambda$new$0(this.f7690b, completer);
        }
    }
}
