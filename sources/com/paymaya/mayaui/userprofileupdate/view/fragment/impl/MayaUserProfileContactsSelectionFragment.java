package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import Bb.f;
import Lh.c;
import Uh.d;
import W4.a;
import android.os.Bundle;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import kotlin.jvm.internal.j;
import rc.k;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserProfileContactsSelectionFragment extends MayaContactsSelectionFragment {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public k f14260x0;

    @Override // com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment
    public final f P1() {
        k kVar = this.f14260x0;
        if (kVar != null) {
            return kVar;
        }
        j.n("mMayaContactSelectionFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        c cVarA = a.e().a();
        O5.a aVar = (O5.a) cVarA.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        O5.a aVar2 = (O5.a) cVarA.c;
        this.f11909p0 = new f((com.paymaya.data.database.repository.k) aVar2.f4732o0.get(), (d) aVar2.f4748y.get());
        this.f14260x0 = new k((com.paymaya.data.database.repository.k) aVar.f4732o0.get(), (d) aVar.f4748y.get(), aVar.k());
        super.onCreate(bundle);
    }
}
