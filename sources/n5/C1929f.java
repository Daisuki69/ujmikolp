package n5;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.i;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.j;
import s5.l;

/* JADX INFO: renamed from: n5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1929f implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f18625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4.a f18626b;

    public C1929f(Application application, X4.a adRepository) {
        l lVar = l.f20024a;
        j.g(adRepository, "adRepository");
        this.f18625a = application;
        this.f18626b = adRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return i.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        j.g(modelClass, "modelClass");
        if (!modelClass.isAssignableFrom(C1928e.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        Application application = this.f18625a;
        l lVar = l.f20024a;
        return new C1928e(application, this.f18626b);
    }
}
