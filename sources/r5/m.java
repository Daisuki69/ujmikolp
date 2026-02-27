package r5;

import Bj.B0;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import b5.o;
import cj.C1112C;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import s5.C2239c;
import x5.C2467a;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.a f19869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2467a f19870b;
    public final C2239c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f19871d;
    public final MutableLiveData e;
    public B0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f19872g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public s5.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f19873k;

    public m(Application application, X4.a adRepository, C2467a c2467a) {
        s5.l lVar = s5.l.f20024a;
        C2239c c2239c = new C2239c();
        kotlin.jvm.internal.j.g(adRepository, "adRepository");
        super(application);
        this.f19869a = adRepository;
        this.f19870b = c2467a;
        this.c = c2239c;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f19871d = mutableLiveData;
        this.e = mutableLiveData;
        this.f19872g = C1112C.f9377a;
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.f19873k = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:23:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(r5.m r5, ij.AbstractC1609c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof r5.k
            if (r0 == 0) goto L16
            r0 = r6
            r5.k r0 = (r5.k) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            r5.k r0 = new r5.k
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.f19866b
            int r4 = r0.f19865a
            bj.AbstractC1039j.b(r6)
            goto L5e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            bj.AbstractC1039j.b(r6)
            java.util.List r6 = r5.f19872g
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r2 = 0
            r4 = r2
            r2 = r6
        L44:
            if (r4 >= r2) goto L60
            java.util.ArrayList r6 = r5.f19873k
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L51
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        L51:
            r0.f19865a = r4
            r0.f19866b = r2
            r0.f = r3
            java.lang.Object r6 = r5.e(r4, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            int r4 = r4 + r3
            goto L44
        L60:
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.m.a(r5.m, ij.c):java.lang.Object");
    }

    public final void b() {
        synchronized (this.f19873k) {
            try {
                Iterator it = this.f19873k.iterator();
                while (it.hasNext()) {
                    NativeAd nativeAd = ((o) it.next()).f8536b;
                    if (nativeAd != null) {
                        nativeAd.destroy();
                    }
                }
                this.f19873k.clear();
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.i.clear();
        this.h.clear();
    }

    public final List c() {
        return this.h.size() + d().size() == this.f19872g.size() ? d() : this.f19873k;
    }

    public final ArrayList d() {
        ArrayList arrayList = this.f19873k;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((o) obj).f8536b != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r26, ij.AbstractC1609c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.m.e(int, ij.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        b();
        super.onCleared();
    }
}
