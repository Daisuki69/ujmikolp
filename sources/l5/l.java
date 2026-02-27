package l5;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f18247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4.a f18248b;

    public l(Application application, X4.a adRepository) {
        s5.l lVar = s5.l.f20024a;
        kotlin.jvm.internal.j.g(adRepository, "adRepository");
        this.f18247a = application;
        this.f18248b = adRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.i.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        kotlin.jvm.internal.j.g(modelClass, "modelClass");
        if (!modelClass.isAssignableFrom(k.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        Application application = this.f18247a;
        s5.l lVar = s5.l.f20024a;
        return new k(application, this.f18248b);
    }
}
