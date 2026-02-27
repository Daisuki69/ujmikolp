package androidx.media3.common.util;

import G5.F;
import Gb.i;
import Q6.n;
import S1.E;
import S1.y;
import ac.C0679c;
import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import b2.k;
import b2.l;
import c2.ScheduledFutureC1065h;
import c2.ThreadFactoryC1058a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.shield.android.context.s;
import e2.C1421c;
import eg.C1440b;
import h2.q;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import j2.C1664c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import n2.C1915b;
import y2.C2499a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7913b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f7912a = i;
        this.f7913b = obj;
        this.c = obj2;
    }

    private final void a() {
        k kVar = (k) this.f7913b;
        B2.b bVar = (B2.b) this.c;
        synchronized (kVar) {
            try {
                if (kVar.f8369b == null) {
                    kVar.f8368a.add(bVar);
                } else {
                    kVar.f8369b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        B2.a aVar;
        int i = 1;
        switch (this.f7912a) {
            case 0:
                Util.lambda$transformFutureAsync$1((E) this.f7913b, (y) this.c);
                return;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.f7913b).lambda$decoderReleased$5((String) this.c);
                return;
            case 2:
                ((AudioSink.Listener) this.f7913b).onAudioTrackReleased((AudioSink.AudioTrackConfig) this.c);
                return;
            case 3:
                ((SphericalGLSurfaceView) this.f7913b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.c);
                return;
            case 4:
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0((MultiInstanceInvalidationClient) this.f7913b, (String[]) this.c);
                return;
            case 5:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) this.f7913b, (TransactionExecutor) this.c);
                return;
            case 6:
                ((WebViewCompat.WebViewStartUpCallback) this.f7913b).onSuccess((WebViewStartUpResult) this.c);
                return;
            case 7:
                ExtensionEmbeddingBackend.SplitListenerWrapper.accept$lambda$1((ExtensionEmbeddingBackend.SplitListenerWrapper) this.f7913b, (ArrayList) this.c);
                return;
            case 8:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.accept$lambda$0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.f7913b, (WindowLayoutInfo) this.c);
                return;
            case 9:
                TimeLimiter.track$lambda$0((TimeLimiter) this.f7913b, (StartStopToken) this.c);
                return;
            case 10:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.f7913b, (ConstraintTracker) this.c);
                return;
            case 11:
                l lVar = (l) this.f7913b;
                B2.b bVar = (B2.b) this.c;
                if (lVar.f8372b != l.f8370d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (lVar) {
                    aVar = lVar.f8371a;
                    lVar.f8371a = null;
                    lVar.f8372b = bVar;
                    break;
                }
                aVar.d(bVar);
                return;
            case 12:
                a();
                return;
            case 13:
                ((y2.b) ((Map.Entry) this.f7913b).getKey()).a((C2499a) this.c);
                return;
            case 14:
                ThreadFactoryC1058a threadFactoryC1058a = (ThreadFactoryC1058a) this.f7913b;
                Process.setThreadPriority(threadFactoryC1058a.c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC1058a.f9253d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 15:
                Callable callable = (Callable) this.f7913b;
                ScheduledFutureC1065h scheduledFutureC1065h = (ScheduledFutureC1065h) ((n) this.c).f5284b;
                try {
                    scheduledFutureC1065h.set(callable.call());
                    return;
                } catch (Exception e) {
                    scheduledFutureC1065h.setException(e);
                    return;
                }
            case 16:
                MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) this.f7913b;
                mayaShopPaymentFragment.W1().setDropDownWidth(mayaShopPaymentFragment.X1().getWidth());
                mayaShopPaymentFragment.W1().setDropDownAnchor(mayaShopPaymentFragment.X1().getDropdownAnchorView().getId());
                mayaShopPaymentFragment.W1().setDropDownBackgroundDrawable((Drawable) this.c);
                ForcedAutoCompleteTextView forcedAutoCompleteTextViewW1 = mayaShopPaymentFragment.W1();
                C0679c c0679c = mayaShopPaymentFragment.f14034q0;
                if (c0679c == null) {
                    j.n("mRecipientAdapter");
                    throw null;
                }
                forcedAutoCompleteTextViewW1.setAdapter(c0679c);
                F f = new F(mayaShopPaymentFragment, 7);
                ForcedAutoCompleteTextView forcedAutoCompleteTextViewW12 = mayaShopPaymentFragment.W1();
                forcedAutoCompleteTextViewW12.addTextChangedListener(f);
                forcedAutoCompleteTextViewW12.setOnItemClickListener(new i(forcedAutoCompleteTextViewW12, mayaShopPaymentFragment, i));
                return;
            case 17:
                ((B5.b) this.f7913b).a((Intent) this.c);
                return;
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                t tVar = FirebaseMessaging.f9758k;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f7913b;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 19:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(((m) this.f7913b).b());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 20:
                ImageView imageView = (ImageView) this.f7913b;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                ((View) this.c).setVisibility(0);
                return;
            case 21:
                ((s) this.f7913b).i((String) this.c);
                return;
            case 22:
                ((com.shield.android.e.i) this.f7913b).g((com.shield.android.e.g) this.c);
                return;
            case 23:
                ((C1440b) this.f7913b).c.success((ArrayList) this.c);
                return;
            case 24:
                ((h2.l) this.f7913b).c((String) this.c, Boolean.FALSE);
                return;
            case 25:
                q qVar = (q) this.f7913b;
                h2.l lVar2 = qVar.h;
                C1421c c1421c = qVar.c;
                lVar2.i("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(((AtomicInteger) c1421c.f16555b).get()));
                qVar.h.i("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(((AtomicInteger) c1421c.c).get()));
                h2.l lVar3 = qVar.h;
                Thread threadCurrentThread = Thread.currentThread();
                b1.t tVar2 = lVar3.f16884o;
                if (tVar2 == null) {
                    android.util.Log.w("FirebaseCrashlytics", "settingsProvider not set", null);
                    return;
                } else {
                    lVar3.g(tVar2, threadCurrentThread, (FlutterError) this.c, true);
                    return;
                }
            case 26:
                h2.l lVar4 = ((q) this.f7913b).h;
                Thread threadCurrentThread2 = Thread.currentThread();
                lVar4.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                h2.s sVar = lVar4.f16883n;
                if (sVar == null || !sVar.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = lVar4.e();
                    if (strE == null) {
                        android.util.Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    C1664c c1664c = new C1664c(strE, j, Collections.EMPTY_MAP);
                    C1915b c1915b = lVar4.m;
                    c1915b.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    c1915b.p((Throwable) this.c, threadCurrentThread2, MediaRouteProviderProtocol.SERVICE_DATA_ERROR, c1664c, false);
                    return;
                }
                return;
            case 27:
                FragmentStrictMode.handlePolicyViolation$lambda$0((FragmentStrictMode.Policy) this.f7913b, (Violation) this.c);
                return;
            case 28:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) this.f7913b, (Violation) this.c);
                return;
            default:
                int i4 = JobInfoSchedulerService.f9610a;
                ((JobInfoSchedulerService) this.f7913b).jobFinished((JobParameters) this.c, false);
                return;
        }
    }

    public /* synthetic */ g(q qVar, Throwable th2) {
        this.f7912a = 26;
        Map map = Collections.EMPTY_MAP;
        this.f7913b = qVar;
        this.c = th2;
    }
}
