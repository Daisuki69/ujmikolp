package J2;

import T2.h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends FragmentManager.FragmentLifecycleCallbacks {
    public static final M2.a f = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f2404a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.b f2405b;
    public final S2.f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2406d;
    public final f e;

    public e(M2.b bVar, S2.f fVar, c cVar, f fVar2) {
        this.f2405b = bVar;
        this.c = fVar;
        this.f2406d = cVar;
        this.e = fVar2;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        T2.d dVar;
        super.onFragmentPaused(fragmentManager, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        M2.a aVar = f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f2404a;
        if (!weakHashMap.containsKey(fragment)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        f fVar = this.e;
        boolean z4 = fVar.f2409d;
        M2.a aVar2 = f.e;
        if (z4) {
            HashMap map = fVar.c;
            if (map.containsKey(fragment)) {
                N2.c cVar = (N2.c) map.remove(fragment);
                T2.d dVarA = fVar.a();
                if (dVarA.b()) {
                    N2.c cVar2 = (N2.c) dVarA.a();
                    cVar2.getClass();
                    dVar = new T2.d(new N2.c(cVar2.f3514a - cVar.f3514a, cVar2.f3515b - cVar.f3515b, cVar2.c - cVar.c));
                } else {
                    aVar2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    dVar = new T2.d();
                }
            } else {
                aVar2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                dVar = new T2.d();
            }
        } else {
            aVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            dVar = new T2.d();
        }
        if (!dVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            h.a(trace, (N2.c) dVar.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.f2405b, this.f2406d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f2404a.put(fragment, trace);
        f fVar = this.e;
        boolean z4 = fVar.f2409d;
        M2.a aVar = f.e;
        if (!z4) {
            aVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        HashMap map = fVar.c;
        if (map.containsKey(fragment)) {
            aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        T2.d dVarA = fVar.a();
        if (dVarA.b()) {
            map.put(fragment, (N2.c) dVarA.a());
        } else {
            aVar.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
