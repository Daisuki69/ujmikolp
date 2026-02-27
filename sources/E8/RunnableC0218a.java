package E8;

import android.media.AudioTrack;
import android.os.Handler;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: E8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0218a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1271b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1272d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0218a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1270a = i;
        this.f1271b = obj;
        this.c = obj2;
        this.f1272d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.f1272d;
        Object obj4 = this.c;
        Object obj5 = this.f1271b;
        switch (this.f1270a) {
            case 0:
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) ((S1.y) obj5).get();
                CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
                kotlin.jvm.internal.j.f(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                try {
                    processCameraProvider.unbindAll();
                    C0221d c0221d = (C0221d) obj4;
                    ImageAnalysis imageAnalysis = (ImageAnalysis) obj3;
                    Preview preview = (Preview) obj2;
                    ImageCapture imageCapture = (ImageCapture) obj;
                    c0221d.c = imageAnalysis != null ? processCameraProvider.bindToLifecycle(c0221d.f1280b, DEFAULT_BACK_CAMERA, preview, imageCapture, imageAnalysis) : processCameraProvider.bindToLifecycle(c0221d.f1280b, DEFAULT_BACK_CAMERA, preview, imageCapture);
                    return;
                } catch (Exception unused) {
                    yk.a.e();
                    return;
                }
            case 1:
                W0.d dVar = (W0.d) obj4;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((ConcurrentHashMap) obj2).put(dVar, ((W0.n) obj5).a(dVar, (Set) obj3, null));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 2:
                DefaultAudioSink.lambda$releaseAudioTrackAsync$1((AudioTrack) obj5, (AudioSink.Listener) obj4, (Handler) obj3, (AudioSink.AudioTrackConfig) obj2, (ConditionVariable) obj);
                return;
            case 3:
                OperationKt.launchOperation$lambda$2$lambda$1((Tracer) obj5, (String) obj4, (Function0) obj3, (MutableLiveData) obj2, (CallbackToFutureAdapter.Completer) obj);
                return;
            case 4:
                ((MayaPayBillsBIRFragment) obj5).g2((ArrayList) obj4, (String) obj3, (String) obj2, (String) obj, false);
                return;
            case 5:
                ((MayaPayBillsBIRFragment) obj5).h2((List) obj4, (String) obj3, (String) obj2, (String) obj, false);
                return;
            case 6:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) obj5).lambda$onReceivedHttpAuthRequest$17((WebView) obj4, (HttpAuthHandler) obj3, (String) obj2, (String) obj);
                return;
            case 7:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) obj5).lambda$onReceivedLoginRequest$27((WebView) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 8:
                ((WebViewClientProxyApi.WebViewClientImpl) obj5).lambda$onReceivedLoginRequest$27((WebView) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) obj5).lambda$onReceivedHttpAuthRequest$17((WebView) obj4, (HttpAuthHandler) obj3, (String) obj2, (String) obj);
                return;
        }
    }
}
