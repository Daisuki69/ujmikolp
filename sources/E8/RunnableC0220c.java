package E8;

import android.util.Log;
import android.webkit.WebView;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import j2.C1664c;
import k2.L0;
import kotlin.jvm.functions.Function0;
import n2.C1914a;
import n2.C1915b;

/* JADX INFO: renamed from: E8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0220c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1277b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1278d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0220c(int i, Object obj, Object obj2, Object obj3, boolean z4) {
        this.f1276a = i;
        this.c = obj;
        this.f1278d = obj2;
        this.e = obj3;
        this.f1277b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1276a) {
            case 0:
                S1.y yVar = (S1.y) this.c;
                Function0 function0 = (Function0) this.f1278d;
                Function0 function02 = (Function0) this.e;
                try {
                    FocusMeteringResult focusMeteringResult = (FocusMeteringResult) yVar.get();
                    if (focusMeteringResult != null && (!this.f1277b || !focusMeteringResult.isFocusSuccessful())) {
                        function02.invoke();
                    }
                    function0.invoke();
                } catch (Exception unused) {
                    yk.a.e();
                    function02.invoke();
                    return;
                }
                break;
            case 1:
                Futures.lambda$makeTimeoutFuture$4((CallbackToFutureAdapter.Completer) this.f1278d, this.e, this.f1277b, (S1.y) this.c);
                break;
            case 2:
                C1915b c1915b = (C1915b) this.c;
                c1915b.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((C1914a) c1915b.c).d((L0) this.f1278d, ((C1664c) this.e).f17675a, this.f1277b);
                break;
            case 3:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.c).lambda$doUpdateVisitedHistory$15((WebView) this.f1278d, (String) this.e, this.f1277b);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.c).lambda$doUpdateVisitedHistory$15((WebView) this.f1278d, (String) this.e, this.f1277b);
                break;
        }
    }

    public /* synthetic */ RunnableC0220c(CallbackToFutureAdapter.Completer completer, Object obj, boolean z4, S1.y yVar) {
        this.f1276a = 1;
        this.f1278d = completer;
        this.e = obj;
        this.f1277b = z4;
        this.c = yVar;
    }
}
