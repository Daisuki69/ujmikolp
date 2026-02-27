package j5;

import S5.c;
import Y4.d;
import a.AbstractC0617a;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import bj.C1034e;
import bj.InterfaceC1033d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import x5.C2467a;

/* JADX INFO: renamed from: j5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1670b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FragmentActivity f17715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LifecycleOwner f17716b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f17717d;
    public Function1 e;
    public Function2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1033d f17718g;
    public final InterfaceC1033d h;

    public AbstractC1670b() {
        final int i = 0;
        this.f17718g = C1034e.b(new Function0(this) { // from class: j5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1670b f17714b;

            {
                this.f17714b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new d(this.f17714b.b());
                    default:
                        return new X4.a((d) this.f17714b.f17718g.getValue());
                }
            }
        });
        final int i4 = 1;
        this.h = C1034e.b(new Function0(this) { // from class: j5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1670b f17714b;

            {
                this.f17714b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new d(this.f17714b.b());
                    default:
                        return new X4.a((d) this.f17714b.f17718g.getValue());
                }
            }
        });
    }

    public abstract ViewModelProvider.Factory a();

    public final Activity b() {
        FragmentActivity fragmentActivity = this.f17715a;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        j.n("activity");
        throw null;
    }

    public abstract Class c();

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.ViewModelStoreOwner, java.lang.Object] */
    public final void d() {
        boolean zB;
        C2467a c2467a = AbstractC0617a.f6973b;
        if (c2467a != null) {
            zB = c.b(c2467a.c, A5.b.g1);
        } else {
            zB = false;
        }
        if (zB) {
            ViewModelProvider.Factory factoryA = a();
            ?? r22 = this.c;
            if (r22 != 0) {
                e(new ViewModelProvider((ViewModelStoreOwner) r22, factoryA).get(c()));
            } else {
                j.n("viewModelStoreOwner");
                throw null;
            }
        }
    }

    public abstract void e(ViewModel viewModel);
}
