package i5;

import Bj.B0;
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import b5.C0910b;
import b5.C0912d;
import c5.C1075a;
import cj.C1112C;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import s5.C2239c;
import x5.C2467a;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.a f17114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2239c f17115b;
    public final C2467a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2239c f17116d;
    public final MutableLiveData e;
    public final MutableLiveData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B0 f17117g;
    public List h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f17118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17119l;
    public s5.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f17120n;

    public l(Application application, X4.a adRepository, C2467a c2467a) {
        C2239c c2239c = C2239c.f20006a;
        s5.l lVar = s5.l.f20024a;
        C2239c c2239c2 = new C2239c();
        kotlin.jvm.internal.j.g(adRepository, "adRepository");
        super(application);
        this.f17114a = adRepository;
        this.f17115b = c2239c;
        this.c = c2467a;
        this.f17116d = c2239c2;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.e = mutableLiveData;
        this.f = mutableLiveData;
        this.h = C1112C.f9377a;
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f17118k = new LinkedHashSet();
        this.f17120n = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r6.e(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i5.l r6, ij.AbstractC1609c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof i5.i
            if (r0 == 0) goto L16
            r0 = r7
            i5.i r0 = (i5.i) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            i5.i r0 = new i5.i
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f17108a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            bj.AbstractC1039j.b(r7)
            goto L76
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            bj.AbstractC1039j.b(r7)
            goto L5e
        L3c:
            bj.AbstractC1039j.b(r7)
            goto L4d
        L40:
            bj.AbstractC1039j.b(r7)
            r0.c = r5
            r7 = 0
            java.lang.Object r7 = r6.e(r7, r0)
            if (r7 != r1) goto L4d
            goto L75
        L4d:
            java.util.List r7 = r6.h
            int r7 = r7.size()
            if (r7 <= r5) goto L5e
            r0.c = r4
            java.lang.Object r7 = r6.e(r5, r0)
            if (r7 != r1) goto L5e
            goto L75
        L5e:
            java.util.List r7 = r6.h
            int r7 = r7.size()
            if (r7 <= r4) goto L79
            java.util.List r7 = r6.h
            int r7 = r7.size()
            int r7 = r7 - r5
            r0.c = r3
            java.lang.Object r6 = r6.e(r7, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L79:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.l.a(i5.l, ij.c):java.lang.Object");
    }

    public final void b() {
        synchronized (this.f17120n) {
            try {
                Iterator it = this.f17120n.iterator();
                while (it.hasNext()) {
                    NativeCustomFormatAd nativeCustomFormatAd = ((C0912d) it.next()).f8521b;
                    if (nativeCustomFormatAd != null) {
                        nativeCustomFormatAd.destroy();
                    }
                }
                this.f17120n.clear();
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.j.clear();
        this.i.clear();
        this.f17118k.clear();
    }

    public final List c() {
        return this.i.size() + d().size() == this.h.size() ? d() : this.f17120n;
    }

    public final ArrayList d() {
        String str;
        ArrayList arrayList = this.f17120n;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C0910b c0910b = ((C0912d) obj).c;
            if (c0910b != null && (str = c0910b.f8518d) != null && str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e8, code lost:
    
        if (r1 != r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, s5.d] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r30, ij.AbstractC1609c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.l.e(int, ij.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (e(r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r6, ij.AbstractC1609c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i5.k
            if (r0 == 0) goto L13
            r0 = r7
            i5.k r0 = (i5.k) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            i5.k r0 = new i5.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17113b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            bj.AbstractC1039j.b(r7)
            goto L85
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f17112a
            bj.AbstractC1039j.b(r7)
            goto L79
        L38:
            bj.AbstractC1039j.b(r7)
            java.util.List r7 = r5.h
            int r7 = r7.size()
            if (r7 > r3) goto L5d
            java.util.ArrayList r7 = r5.d()
            int r7 = r7.size()
            java.util.LinkedHashSet r2 = r5.i
            int r2 = r2.size()
            int r2 = r2 + r7
            java.util.List r7 = r5.h
            int r7 = r7.size()
            if (r2 != r7) goto L5d
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L5d:
            java.util.List r7 = r5.h
            int r7 = r7.size()
            int r6 = r6 % r7
            int r7 = r6 + 1
            java.util.List r2 = r5.h
            int r2 = r2.size()
            if (r7 >= r2) goto L79
            r0.f17112a = r6
            r0.e = r3
            java.lang.Object r7 = r5.e(r7, r0)
            if (r7 != r1) goto L79
            goto L84
        L79:
            int r6 = r6 - r3
            if (r6 < 0) goto L88
            r0.e = r4
            java.lang.Object r6 = r5.e(r6, r0)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L88:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.l.f(int, ij.c):java.lang.Object");
    }

    public final void g(C0912d c0912d) {
        C0910b c0910b;
        NativeCustomFormatAd nativeCustomFormatAd = c0912d.f8521b;
        if (nativeCustomFormatAd == null || (c0910b = c0912d.c) == null) {
            return;
        }
        kotlin.jvm.internal.j.d(nativeCustomFormatAd);
        nativeCustomFormatAd.recordImpression();
        this.f17118k.add(c0912d.f8520a);
        this.e.postValue(new C1591b(c0910b));
        C2467a c2467a = this.c;
        if (c2467a != null) {
            s5.d dVar = this.m;
            kotlin.jvm.internal.j.d(dVar);
            c2467a.a("BANNER_APPEAR", new C1075a(c0910b.f8516a, dVar, c0910b.f8518d, c0910b.e, c0910b.f, null, null, null, null, null, null, 2016).a());
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        b();
        Log.d("MayaAdKit/NativeAdCarouselVM", "NativeAdCarouselViewModel cleared and ads destroyed.");
        super.onCleared();
    }
}
