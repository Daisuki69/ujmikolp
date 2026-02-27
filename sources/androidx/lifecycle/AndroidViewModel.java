package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        j.g(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t5 = (T) this.application;
        j.e(t5, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t5;
    }
}
