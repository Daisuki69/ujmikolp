package rc;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.data.api.UpdateProfileApi;
import com.paymaya.data.api.UserProfileUpdateApi;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.ContactReferenceRelationship;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import pc.AbstractC2033b;
import s.AbstractC2217b;
import wc.InterfaceC2393d;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC2033b implements oc.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y.e f19900g;
    public final Z0 h;
    public final C1293x0 i;
    public final com.paymaya.data.preference.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1286u f19901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public UpdateProfileCmsContentData f19902l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f19903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f19906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f19907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f19908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19909t;

    public i(Y.e eVar, Z0 z02, C1293x0 c1293x0, com.paymaya.data.preference.a aVar, C1286u c1286u) {
        super(aVar);
        this.f19900g = eVar;
        this.h = z02;
        this.i = c1293x0;
        this.j = aVar;
        this.f19901k = c1286u;
        this.m = true;
        this.f19903n = true;
        this.f19904o = true;
        this.f19905p = true;
        this.f19906q = true;
        MayaUserProfileUpdateFragment.f14263h0 = this;
    }

    public static final void p(i iVar, ContactModel contactModel) {
        InterfaceC2393d interfaceC2393d = (InterfaceC2393d) iVar.c.get();
        String firstName = contactModel.getFirstName();
        String strTnTj78 = numX49.tnTj78("bFos");
        if (firstName == null) {
            firstName = strTnTj78;
        }
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) interfaceC2393d;
        mayaUserContactReferenceFragment.h2(mayaUserContactReferenceFragment.X1(), firstName);
        ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).b2().setChecked(false);
        InterfaceC2393d interfaceC2393d2 = (InterfaceC2393d) iVar.c.get();
        String middleName = contactModel.getMiddleName();
        if (middleName == null) {
            middleName = strTnTj78;
        }
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment2 = (MayaUserContactReferenceFragment) interfaceC2393d2;
        mayaUserContactReferenceFragment2.h2(mayaUserContactReferenceFragment2.a2(), middleName);
        InterfaceC2393d interfaceC2393d3 = (InterfaceC2393d) iVar.c.get();
        String lastName = contactModel.getLastName();
        if (lastName == null) {
            lastName = strTnTj78;
        }
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment3 = (MayaUserContactReferenceFragment) interfaceC2393d3;
        mayaUserContactReferenceFragment3.h2(mayaUserContactReferenceFragment3.Y1(), lastName);
        InterfaceC2393d interfaceC2393d4 = (InterfaceC2393d) iVar.c.get();
        String number = contactModel.getNumber();
        if (number == null) {
            number = strTnTj78;
        }
        String strM = AbstractC1213b.M(numX49.tnTj78("bFo5"), number, strTnTj78);
        String strTnTj782 = numX49.tnTj78("bFoJ");
        if (z.w(strM, 2, strTnTj782, false)) {
            strM = C2576A.M(strM, strTnTj782);
        } else {
            String strTnTj783 = numX49.tnTj78("bFoI");
            if (z.w(strM, 2, strTnTj783, false)) {
                strM = C2576A.M(strM, strTnTj783);
            } else {
                String strTnTj784 = numX49.tnTj78("bFoq");
                if (z.w(strM, 2, strTnTj784, false)) {
                    strM = C2576A.M(strM, strTnTj784);
                } else {
                    String strTnTj785 = numX49.tnTj78("bFoz");
                    if (z.w(strM, 2, strTnTj785, false)) {
                        strM = C2576A.M(strM, strTnTj785);
                    }
                }
            }
        }
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment4 = (MayaUserContactReferenceFragment) interfaceC2393d4;
        mayaUserContactReferenceFragment4.h2(mayaUserContactReferenceFragment4.c2(), strM);
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment5 = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
        mayaUserContactReferenceFragment5.d2().getDisplayText().setText(strTnTj78);
        mayaUserContactReferenceFragment5.d2().getDisplayText().setHint(mayaUserContactReferenceFragment5.getString(R.string.maya_user_contact_reference_relation));
        mayaUserContactReferenceFragment5.d2().setSelectedData(null);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        super.j();
        k();
        FragmentActivity activity = ((MayaUserContactReferenceFragment) ((InterfaceC2393d) this.c.get())).getActivity();
        String dataString = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString();
        int iW = C.w(dataString);
        if (iW != 0 && AbstractC2197d.f19890a[AbstractC2217b.c(iW)] == 1) {
            HashMap mapA = C.A(dataString);
            this.f19907r = (String) jk.b.m(mapA, numX49.tnTj78("bFol"), null);
            this.f19908s = (String) jk.b.m(mapA, numX49.tnTj78("bFoW"), null);
        }
    }

    @Override // pc.AbstractC2033b
    public final void k() {
        ((MayaBaseFragment) ((InterfaceC2393d) this.c.get())).E1();
        new Lh.d(new Lh.d(new Lh.h(((UserProfileUpdateApi) this.f19900g.f6708b).getProfileCMSData().h(Th.e.c), zh.b.a(), 0), new C2198e(this, 0), 2), new C2199f(this, 0), 0).e();
    }

    @Override // pc.AbstractC2033b
    public final void l() {
        com.paymaya.data.preference.a aVar = this.j;
        if (aVar.v().length() == 0) {
            aVar.m0(UUID.randomUUID().toString());
        }
        new Lh.d(new Lh.d(new Lh.h(((UpdateProfileApi) this.f19900g.c).getUserProfile().h(Th.e.c), zh.b.a(), 0), new g(this, 0), 2), new h(this, 0), 0).e();
    }

    public final boolean q(UpdateProfileFieldType updateProfileFieldType) {
        int i = AbstractC2197d.f19891b[updateProfileFieldType.ordinal()];
        if (i == 1) {
            return this.f19903n;
        }
        if (i == 2) {
            return this.f19905p;
        }
        if (i == 3) {
            return this.f19904o;
        }
        if (i == 4) {
            return this.f19906q;
        }
        if (i != 5) {
            return false;
        }
        return this.m;
    }

    public final void r(int i) {
        MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) this.c.get());
        mayaUserContactReferenceFragment.getClass();
        if (i == 0 || i == 1) {
            mayaUserContactReferenceFragment.b2().setVisibility(0);
        } else if (i > 1) {
            mayaUserContactReferenceFragment.b2().setChecked(false);
            mayaUserContactReferenceFragment.b2().setVisibility(8);
        }
    }

    public final void s(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFoP9"));
        UpdateProfileCmsContentData updateProfileCmsContentData = this.f19902l;
        Object obj = null;
        if (updateProfileCmsContentData == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bFoPb"));
            throw null;
        }
        List<ContactReferenceRelationship> contactReferenceRelationships = updateProfileCmsContentData.getContactReferenceRelationships();
        if (contactReferenceRelationships != null) {
            Iterator<T> it = contactReferenceRelationships.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.j.b(((ContactReferenceRelationship) next).getCode(), str)) {
                    obj = next;
                    break;
                }
            }
            ContactReferenceRelationship contactReferenceRelationship = (ContactReferenceRelationship) obj;
            if (contactReferenceRelationship != null) {
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) this.c.get());
                mayaUserContactReferenceFragment.getClass();
                mayaUserContactReferenceFragment.d2().getDisplayText().setText(contactReferenceRelationship.getName());
                mayaUserContactReferenceFragment.d2().setSelectedData(contactReferenceRelationship);
                mayaUserContactReferenceFragment.d2().getDisplayText().setHint(numX49.tnTj78("bFoPP"));
                mayaUserContactReferenceFragment.d2().b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.UpdateProfileValidationResult t(com.paymaya.domain.model.UpdateProfileFieldType r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.i.t(com.paymaya.domain.model.UpdateProfileFieldType, java.lang.String):com.paymaya.domain.model.UpdateProfileValidationResult");
    }
}
