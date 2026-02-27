package l5;

import Bj.B0;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.ads.nativead.NativeAd;
import s5.C2239c;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.a f18243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2239c f18244b;
    public final MutableLiveData c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f18245d;
    public B0 e;
    public NativeAd f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s5.e f18246g;

    public k(Application application, X4.a adRepository) {
        s5.l lVar = s5.l.f20024a;
        C2239c c2239c = new C2239c();
        kotlin.jvm.internal.j.g(adRepository, "adRepository");
        super(application);
        this.f18243a = adRepository;
        this.f18244b = c2239c;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.c = mutableLiveData;
        this.f18245d = mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final l5.k r7, final java.lang.String r8, ij.AbstractC1609c r9) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof l5.i
            if (r0 == 0) goto L17
            r0 = r9
            l5.i r0 = (l5.i) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.e = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            l5.i r0 = new l5.i
            r0.<init>(r7, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r6.f18240b
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.String r8 = r6.f18239a
            bj.AbstractC1039j.b(r9)
            goto L6f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.String r8 = r6.f18239a
            bj.AbstractC1039j.b(r9)
            goto L4d
        L3f:
            bj.AbstractC1039j.b(r9)
            r6.f18239a = r8
            r6.e = r3
            java.lang.Object r9 = s5.l.a(r6)
            if (r9 != r0) goto L4d
            goto L6d
        L4d:
            r3 = r9
            java.util.Map r3 = (java.util.Map) r3
            s5.e r9 = r7.f18246g
            if (r9 == 0) goto Lbc
            l5.a r4 = new l5.a
            r9 = 0
            r4.<init>(r7)
            l5.a r5 = new l5.a
            r9 = 1
            r5.<init>(r7)
            r6.f18239a = r8
            r6.e = r2
            X4.a r1 = r7.f18243a
            r2 = r8
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r8 = r2
        L6f:
            b5.k r9 = (b5.AbstractC0919k) r9
            boolean r0 = r9 instanceof b5.C0918j
            androidx.lifecycle.MutableLiveData r1 = r7.c
            if (r0 == 0) goto L86
            b5.j r9 = (b5.C0918j) r9
            com.google.android.gms.ads.nativead.NativeAd r9 = r9.f8532a
            r7.f = r9
            l5.d r7 = new l5.d
            r7.<init>(r8, r9)
            r1.postValue(r7)
            goto Lbc
        L86:
            boolean r7 = r9 instanceof b5.C0917i
            if (r7 == 0) goto Lb6
            b5.i r9 = (b5.C0917i) r9
            java.lang.String r7 = r9.f8530a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Load Inline Banner Ad failed for ad unit id: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = "!"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MayaAdKit/InlineBannerAdVM"
            android.util.Log.e(r0, r7)
            l5.c r7 = new l5.c
            b5.a r9 = r9.f8531b
            r7.<init>(r8, r9)
            r1.postValue(r7)
            l5.f r7 = l5.f.f18237a
            r1.postValue(r7)
            goto Lbc
        Lb6:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lbc:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.k.a(l5.k, java.lang.String, ij.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        NativeAd nativeAd = this.f;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f = null;
        super.onCleared();
    }
}
