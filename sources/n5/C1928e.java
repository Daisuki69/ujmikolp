package n5;

import Bj.B0;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import kotlin.jvm.internal.j;
import s5.C2239c;
import s5.l;

/* JADX INFO: renamed from: n5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1928e extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.a f18621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f18622b;
    public final C2239c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f18623d;
    public final MutableLiveData e;
    public B0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NativeCustomFormatAd f18624g;

    public C1928e(Application application, X4.a adRepository) {
        l lVar = l.f20024a;
        C2239c c2239c = new C2239c();
        j.g(adRepository, "adRepository");
        super(application);
        this.f18621a = adRepository;
        this.f18622b = lVar;
        this.c = c2239c;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f18623d = mutableLiveData;
        this.e = mutableLiveData;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        B0 b02 = this.f;
        if (b02 != null) {
            b02.b(null);
        }
        NativeCustomFormatAd nativeCustomFormatAd = this.f18624g;
        if (nativeCustomFormatAd != null) {
            nativeCustomFormatAd.destroy();
        }
        this.f18624g = null;
    }
}
