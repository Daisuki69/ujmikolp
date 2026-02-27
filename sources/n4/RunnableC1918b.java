package n4;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ki.AbstractC1780a;
import p3.l;
import ph.A2;
import ph.B2;
import ph.C2085j0;
import ph.l3;
import ph.m3;
import sh.s;
import sh.t;

/* JADX INFO: renamed from: n4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1918b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18596b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC1918b(int i, Object obj, Object obj2) {
        this.f18595a = i;
        this.c = obj;
        this.f18596b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18595a) {
            case 0:
                C1920d c1920d = (C1920d) this.c;
                if (c1920d.f) {
                    c1920d.f18599a.d(new C.h(this, 28));
                    return;
                } else {
                    Log.d(numX49.tnTj78("brER"), numX49.tnTj78("brEp"));
                    return;
                }
            case 1:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f18596b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        l lVar = (l) referenceQueue.remove();
                        if (lVar.f19039a.remove(lVar)) {
                            lVar.clear();
                            lVar.f19040b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 2:
                Callable callable = (Callable) this.f18596b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (MlKitException e) {
                    taskCompletionSource.setException(e);
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(new MlKitException(13, numX49.tnTj78("brET"), e7));
                    return;
                }
            case 3:
                AbstractC1780a abstractC1780a = (AbstractC1780a) this.f18596b;
                int iDecrementAndGet = ((AtomicInteger) abstractC1780a.f18136b).decrementAndGet();
                Preconditions.checkState(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    abstractC1780a.e();
                    ((AtomicBoolean) abstractC1780a.c).set(false);
                }
                zzrr.zza();
                ((TaskCompletionSource) this.c).setResult(null);
                return;
            case 4:
                B1.a aVar = (B1.a) this.f18596b;
                Preconditions.checkState(((Thread) ((AtomicReference) aVar.e).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) aVar.e).set(null);
                    aVar.m();
                    return;
                } catch (Throwable th2) {
                    try {
                        ((AtomicReference) aVar.e).set(null);
                        aVar.m();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 5:
                C2085j0 c2085j0 = (C2085j0) this.c;
                try {
                    c2085j0.f19506a.onError((Throwable) this.f18596b);
                    return;
                } finally {
                    c2085j0.f19508d.dispose();
                }
            case 6:
                ((C2085j0) this.c).f19506a.onNext(this.f18596b);
                return;
            case 7:
                ((B2) this.c).f19404a.subscribe((A2) this.f18596b);
                return;
            case 8:
                m3 m3Var = (m3) this.c;
                m3Var.getClass();
                m3Var.e.offer(new l3((Wh.f) this.f18596b, false));
                if (m3Var.B()) {
                    m3Var.F();
                    return;
                }
                return;
            case 9:
                int measuredWidth = ((View) this.f18596b).getMeasuredWidth();
                int i = (int) (((double) measuredWidth) * 0.749235474d);
                MayaCarousel mayaCarousel = (MayaCarousel) this.c;
                int i4 = MayaCarousel.f11992x0;
                mayaCarousel.h(measuredWidth, i, 0);
                mayaCarousel.j(measuredWidth, i, 0);
                mayaCarousel.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
                mayaCarousel.e();
                mayaCarousel.setBannerCenterConstraint(1);
                return;
            case 10:
                ((s) this.f18596b).f20113d = true;
                ((t) this.c).f20114a.remove((s) this.f18596b);
                return;
            default:
                ((zi.f) this.c).f21463a.getWorkInfosByTagLiveData((String) this.f18596b).observe(ProcessLifecycleOwner.get(), new zi.e(this));
                return;
        }
    }

    public /* synthetic */ RunnableC1918b(int i, Object obj, Object obj2, boolean z4) {
        this.f18595a = i;
        this.f18596b = obj;
        this.c = obj2;
    }
}
