package androidx.window.area;

import Ej.C0233k;
import Ej.InterfaceC0230h;
import android.app.Activity;
import android.os.Binder;
import androidx.window.core.ExperimentalWindowApi;
import cj.C1112C;
import java.io.Serializable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class EmptyWindowAreaControllerImpl implements WindowAreaController {
    @Override // androidx.window.area.WindowAreaController
    public InterfaceC0230h getWindowAreaInfos() {
        return new C0233k((Serializable) C1112C.f9377a);
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(Binder token, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        j.g(token, "token");
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("There are no WindowAreas"));
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferActivityToWindowArea(Binder token, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        j.g(token, "token");
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(windowAreaSessionCallback, "windowAreaSessionCallback");
        windowAreaSessionCallback.onSessionEnded(new IllegalStateException("There are no WindowAreas"));
    }
}
