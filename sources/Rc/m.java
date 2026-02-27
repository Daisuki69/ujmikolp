package rc;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.data.api.UpdateProfileApi;
import com.paymaya.data.api.UserProfileUpdateApi;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.domain.model.ValidationRule;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o6.C1967a;
import pc.AbstractC2033b;
import ph.C2070f1;
import s.AbstractC2217b;
import wc.InterfaceC2394e;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC2033b implements oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y.e f19913g;
    public final Z0 h;
    public final C1293x0 i;
    public final com.paymaya.data.preference.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S5.c f19914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public UpdateProfileCmsContentData f19915l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f19916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f19919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f19921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f19922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f19923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19924v;

    public m(Y.e eVar, Z0 z02, C1293x0 c1293x0, com.paymaya.data.preference.a aVar, S5.c cVar) {
        super(aVar);
        this.f19913g = eVar;
        this.h = z02;
        this.i = c1293x0;
        this.j = aVar;
        this.f19914k = cVar;
        MayaUserProfileUpdateFragment.f14264i0 = this;
        this.m = true;
        this.f19916n = true;
        this.f19917o = true;
        this.f19918p = true;
        this.f19919q = true;
        this.f19920r = true;
        this.f19921s = true;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        super.j();
        FragmentActivity activity = ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) this.c.get())).getActivity();
        String dataString = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString();
        int iW = C.w(dataString);
        if (iW != 0 && l.f19911a[AbstractC2217b.c(iW)] == 1) {
            HashMap mapA = C.A(dataString);
            this.f19922t = (String) jk.b.m(mapA, numX49.tnTj78("bFoPj"), null);
            this.f19923u = (String) jk.b.m(mapA, numX49.tnTj78("bFoPd"), null);
        }
        k();
    }

    @Override // pc.AbstractC2033b
    public final void k() {
        ((MayaBaseFragment) ((InterfaceC2394e) this.c.get())).E1();
        new Lh.d(new Lh.d(new Lh.h(((UserProfileUpdateApi) this.f19913g.f6708b).getProfileCMSData().h(Th.e.c), zh.b.a(), 0), new C1967a(this, 9), 2), new qc.c(this, 2), 0).e();
    }

    @Override // pc.AbstractC2033b
    public final void l() {
        com.paymaya.data.preference.a aVar = this.j;
        if (aVar.v().length() == 0) {
            aVar.m0(UUID.randomUUID().toString());
        }
        new Lh.d(new Lh.d(new Lh.h(((UpdateProfileApi) this.f19913g.c).getUserProfile().h(Th.e.c), zh.b.a(), 0), new C2070f1(this, 4), 2), new p8.a(this, 8), 0).e();
    }

    public final ValidationRule p(UpdateProfileFieldType updateProfileFieldType, String str) {
        UpdateProfileCmsContentData updateProfileCmsContentData = this.f19915l;
        Object obj = null;
        if (updateProfileCmsContentData == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bFoPE"));
            throw null;
        }
        List<ValidationRule> validationRules = updateProfileCmsContentData.getValidationRules();
        if (validationRules == null) {
            return null;
        }
        Iterator it = jk.b.h(validationRules, updateProfileFieldType).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String regex = ((ValidationRule) next).getRegex();
            if (regex == null) {
                regex = numX49.tnTj78("bFoPi");
            }
            if (!AbstractC1213b.U(regex, str)) {
                obj = next;
                break;
            }
        }
        return (ValidationRule) obj;
    }

    public final boolean q(UpdateProfileFieldType updateProfileFieldType) {
        switch (l.f19912b[updateProfileFieldType.ordinal()]) {
            case 1:
                return this.m;
            case 2:
                return this.f19916n;
            case 3:
                return this.f19917o;
            case 4:
                return this.f19918p;
            case 5:
                return this.f19921s;
            case 6:
                return this.f19920r;
            case 7:
                return this.f19919q;
            default:
                return false;
        }
    }

    public final void r(int i) {
        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) this.c.get());
        mayaUserProfileUpdateFragment.getClass();
        if (i == 0 || i == 1) {
            mayaUserProfileUpdateFragment.g2().setVisibility(0);
        } else if (i > 1) {
            mayaUserProfileUpdateFragment.g2().setChecked(false);
            mayaUserProfileUpdateFragment.g2().setVisibility(8);
        }
    }

    public final UpdateProfileValidationResult s(UpdateProfileFieldType updateProfileFieldType, Object obj) {
        kotlin.jvm.internal.j.g(updateProfileFieldType, numX49.tnTj78("bFoPF"));
        return (obj == null && q(updateProfileFieldType)) ? new UpdateProfileValidationResult.RequiredFieldError(updateProfileFieldType) : UpdateProfileValidationResult.Success.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.UpdateProfileValidationResult t(com.paymaya.domain.model.UpdateProfileFieldType r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.m.t(com.paymaya.domain.model.UpdateProfileFieldType, java.lang.String):com.paymaya.domain.model.UpdateProfileValidationResult");
    }
}
