package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7670b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f7669a = i;
        this.f7670b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7669a) {
            case 0:
                EncoderImpl.lambda$addSignalEosTimeoutIfNeeded$9((Executor) this.f7670b, (EncoderImpl.MediaCodecCallback) this.c);
                break;
            case 1:
                ((EncoderImpl) this.f7670b).lambda$matchAcquisitionsAndFreeBufferIndexes$15((InputBufferImpl) this.c);
                break;
            case 2:
                EncoderImpl.ByteBufferInput.lambda$setActive$9((Map.Entry) this.f7670b, (BufferProvider.State) this.c);
                break;
            case 3:
                ((Observable.Observer) this.f7670b).onNewData((BufferProvider.State) this.c);
                break;
            case 4:
                ((EncoderImpl.ByteBufferInput) this.f7670b).lambda$removeObserver$8((Observable.Observer) this.c);
                break;
            case 5:
                ((EncoderImpl.MediaCodecCallback) this.c).lambda$onOutputFormatChanged$7((MediaFormat) this.f7670b);
                break;
            case 6:
                ((EncoderCallback) this.f7670b).onEncodedData((EncodedDataImpl) this.c);
                break;
            case 7:
                EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$6((EncoderCallback) this.f7670b, (MediaFormat) this.c);
                break;
            case 8:
                ((EncoderImpl.MediaCodecCallback) this.c).lambda$onError$4((MediaCodec.CodecException) this.f7670b);
                break;
            case 9:
                ((Encoder.SurfaceInput.OnSurfaceUpdateListener) this.f7670b).onSurfaceUpdate((Surface) this.c);
                break;
            default:
                ((EncoderImpl) this.f7670b).lambda$acquireInputBuffer$14((CallbackToFutureAdapter.Completer) this.c);
                break;
        }
    }

    public /* synthetic */ d(EncoderImpl.MediaCodecCallback mediaCodecCallback, Object obj, int i) {
        this.f7669a = i;
        this.c = mediaCodecCallback;
        this.f7670b = obj;
    }
}
