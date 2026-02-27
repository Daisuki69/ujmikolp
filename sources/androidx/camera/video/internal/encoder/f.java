package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7674b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7675d;

    public /* synthetic */ f(int i, Object obj, Object obj2, Object obj3) {
        this.f7673a = i;
        this.c = obj;
        this.f7675d = obj2;
        this.f7674b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7673a) {
            case 0:
                ((EncoderImpl.ByteBufferInput) this.c).lambda$addObserver$7((Observable.Observer) this.f7675d, (Executor) this.f7674b);
                break;
            case 1:
                ((EncoderImpl.MediaCodecCallback) this.c).lambda$reachEndData$2((Executor) this.f7674b, (EncoderCallback) this.f7675d);
                break;
            default:
                ((EncoderImpl) this.c).lambda$stopMediaCodec$12((ArrayList) this.f7675d, (Runnable) this.f7674b);
                break;
        }
    }

    public /* synthetic */ f(EncoderImpl.MediaCodecCallback mediaCodecCallback, Executor executor, EncoderCallback encoderCallback) {
        this.f7673a = 1;
        this.c = mediaCodecCallback;
        this.f7674b = executor;
        this.f7675d = encoderCallback;
    }
}
