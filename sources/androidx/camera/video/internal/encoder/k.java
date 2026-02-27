package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7685b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7686d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f7684a = 0;
        this.c = mediaCodecCallback;
        this.f7686d = bufferInfo;
        this.e = mediaCodec;
        this.f7685b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7684a) {
            case 0:
                ((EncoderImpl.MediaCodecCallback) this.c).lambda$onOutputBufferAvailable$1((MediaCodec.BufferInfo) this.f7686d, (MediaCodec) this.e, this.f7685b);
                break;
            case 1:
                EncoderImpl.lambda$notifyError$11((EncoderCallback) this.c, this.f7685b, (String) this.f7686d, (Throwable) this.e);
                break;
            default:
                ((EncoderImpl) this.c).lambda$handleEncodeError$10(this.f7685b, (String) this.f7686d, (Throwable) this.e);
                break;
        }
    }

    public /* synthetic */ k(Object obj, int i, String str, Throwable th2, int i4) {
        this.f7684a = i4;
        this.c = obj;
        this.f7685b = i;
        this.f7686d = str;
        this.e = th2;
    }
}
