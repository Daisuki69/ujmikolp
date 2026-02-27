package ma;

import A5.b;
import B5.i;
import Lh.h;
import S5.c;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.messaging.p;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.domain.store.C0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.T;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import qa.d;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: renamed from: ma.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1859a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0 f18390d;
    public final Y e;
    public final S0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1265j f18391g;
    public final p h;
    public final C0 i;
    public final com.paymaya.data.preference.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f18392k;

    public C1859a(Z0 z02, Y y7, S0 s02, C1265j c1265j, p pVar, C0 c02, com.paymaya.data.preference.a aVar, c cVar) {
        j.g(aVar, numX49.tnTj78("bORP"));
        j.g(cVar, numX49.tnTj78("bORb"));
        this.f18390d = z02;
        this.e = y7;
        this.f = s02;
        this.f18391g = c1265j;
        this.h = pVar;
        this.i = c02;
        this.j = aVar;
        this.f18392k = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0200  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C1859a.j():void");
    }

    public final void k(String str) {
        if (str == null || C2576A.H(str)) {
            return;
        }
        if (C.Y(str)) {
            BaseMayaProfileFragment baseMayaProfileFragment = (BaseMayaProfileFragment) ((pa.a) this.c.get());
            baseMayaProfileFragment.getClass();
            d dVar = baseMayaProfileFragment.f13505L0;
            if (dVar != null) {
                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                mayaProfileActivity.n1();
                i.l(mayaProfileActivity, str, AttributionSource.f10368d);
                return;
            }
            return;
        }
        BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) this.c.get());
        baseMayaProfileFragment2.getClass();
        d dVar2 = baseMayaProfileFragment2.f13505L0;
        if (dVar2 != null) {
            MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
            mayaProfileActivity2.n1();
            i.f(mayaProfileActivity2, str);
            mayaProfileActivity2.finish();
        }
    }

    public final void l() {
        int i = 0;
        if (c.b(this.f18392k, b.f102e1)) {
            C0 c02 = this.i;
            c02.getClass();
            e(new Lh.d(new Lh.d(new h(c02.f11341b.getReferralEligibility(numX49.tnTj78("bORN")).d(Z.m), zh.b.a(), 0), new C1258f0(this, 25), 2), new T(this, 27), i).e());
        } else {
            Group group = ((BaseMayaProfileFragment) ((pa.a) this.c.get())).f13529r0;
            if (group != null) {
                group.setVisibility(8);
            } else {
                j.n(numX49.tnTj78("bORM"));
                throw null;
            }
        }
    }

    public final void m() {
        boolean zIsMayaV2SetUsernameEnabled = this.j.e().isMayaV2SetUsernameEnabled();
        String strTnTj78 = numX49.tnTj78("bOR6");
        if (zIsMayaV2SetUsernameEnabled) {
            if (numX49.tnTj78("bORa").equals(this.j.l())) {
                String strB = this.e.b();
                j.f(strB, numX49.tnTj78("bORX"));
                if (strB.length() == 0) {
                    ConstraintLayout constraintLayout = ((BaseMayaProfileFragment) ((pa.a) this.c.get())).f13516d0;
                    if (constraintLayout == null) {
                        j.n(strTnTj78);
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                    ((BaseMayaProfileFragment) ((pa.a) this.c.get())).M1();
                    return;
                }
            }
        }
        ConstraintLayout constraintLayout2 = ((BaseMayaProfileFragment) ((pa.a) this.c.get())).f13516d0;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        } else {
            j.n(strTnTj78);
            throw null;
        }
    }

    public final void n() {
        boolean zIsMayaV2SetUsernameEnabled = this.j.e().isMayaV2SetUsernameEnabled();
        String strTnTj78 = numX49.tnTj78("bORG");
        if (zIsMayaV2SetUsernameEnabled) {
            String strB = this.e.b();
            String strTnTj782 = numX49.tnTj78("bOR3");
            j.f(strB, strTnTj782);
            if (strB.length() > 0) {
                pa.a aVar = (pa.a) this.c.get();
                String strB2 = this.e.b();
                j.f(strB2, strTnTj782);
                BaseMayaProfileFragment baseMayaProfileFragment = (BaseMayaProfileFragment) aVar;
                baseMayaProfileFragment.getClass();
                TextView textView = baseMayaProfileFragment.f13512Z;
                if (textView == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                textView.setText(strB2);
                TextView textView2 = ((BaseMayaProfileFragment) ((pa.a) this.c.get())).f13512Z;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    return;
                } else {
                    j.n(strTnTj78);
                    throw null;
                }
            }
        }
        TextView textView3 = ((BaseMayaProfileFragment) ((pa.a) this.c.get())).f13512Z;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            j.n(strTnTj78);
            throw null;
        }
    }
}
