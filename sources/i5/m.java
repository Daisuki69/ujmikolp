package i5;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import x5.C2467a;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4.a f17122b;
    public final C2467a c;

    public m(Application application, X4.a adRepository, C2467a c2467a) {
        s5.l lVar = s5.l.f20024a;
        kotlin.jvm.internal.j.g(adRepository, "adRepository");
        this.f17121a = application;
        this.f17122b = adRepository;
        this.c = c2467a;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.i.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        kotlin.jvm.internal.j.g(modelClass, "modelClass");
        if (!modelClass.isAssignableFrom(l.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        Application application = this.f17121a;
        s5.l lVar = s5.l.f20024a;
        return new l(application, this.f17122b, this.c);
    }
}
