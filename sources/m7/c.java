package M7;

import Ah.p;
import Kh.T;
import Lh.d;
import M8.D0;
import N5.M0;
import N5.X0;
import N5.k1;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import com.paymaya.ui.dataprivacy.view.widget.PrivacyPolicyItem;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import de.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import md.InterfaceC1862a;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3130d;
    public final C1284t e;
    public final com.paymaya.data.preference.a f;

    public c(com.paymaya.data.preference.a mPreference, C1284t c1284t, int i) {
        this.f3130d = i;
        switch (i) {
            case 2:
                j.g(mPreference, "mPreference");
                this.f = mPreference;
                this.e = c1284t;
                break;
            default:
                this.f = mPreference;
                this.e = c1284t;
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        switch (this.f3130d) {
            case 2:
                InterfaceC1862a view = (InterfaceC1862a) obj;
                j.g(view, "view");
                super.h(view);
                this.f.U(true);
                break;
            default:
                super.h(obj);
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        switch (this.f3130d) {
            case 0:
                super.j();
                this.f.U(true);
                P7.a aVar = (P7.a) this.c.get();
                String string = svM7M6.getString(this.f.f11330b, "key_privacy_policy_version", "");
                j.f(string, "getPrivacyPolicyVersion(...)");
                MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = (MayaDataPrivacyDialogFragment) aVar;
                mayaDataPrivacyDialogFragment.getClass();
                mayaDataPrivacyDialogFragment.f12267S = mayaDataPrivacyDialogFragment.getString(R.string.maya_label_data_privacy_and_terms_of_service_update_version_header, string);
                break;
            case 1:
                super.j();
                if ("settings".equalsIgnoreCase(((DataAndPersonalizationFragment) ((od.a) this.c.get())).s1())) {
                    DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) ((od.a) this.c.get());
                    k1 k1Var = dataAndPersonalizationFragment.f14484S;
                    j.d(k1Var);
                    ((Button) k1Var.f4139d).setText(dataAndPersonalizationFragment.getString(R.string.pma_label_save));
                }
                DataAndPersonalizationFragment dataAndPersonalizationFragment2 = (DataAndPersonalizationFragment) ((od.a) this.c.get());
                dataAndPersonalizationFragment2.f14487V.clear();
                k1 k1Var2 = dataAndPersonalizationFragment2.f14484S;
                j.d(k1Var2);
                ((LinearLayout) k1Var2.c).removeAllViews();
                pd.c cVar = ((DataAndPersonalizationFragment) ((od.a) this.c.get())).f14486U;
                j.d(cVar);
                ArrayList<Consent> arrayList = ((DataPrivacyActivity) cVar).m;
                j.d(arrayList);
                for (Consent consent : arrayList) {
                    DataAndPersonalizationFragment dataAndPersonalizationFragment3 = (DataAndPersonalizationFragment) ((od.a) this.c.get());
                    dataAndPersonalizationFragment3.getClass();
                    j.g(consent, "consent");
                    PrivacyPolicyItem privacyPolicyItem = new PrivacyPolicyItem(dataAndPersonalizationFragment3.getContext());
                    View.inflate(privacyPolicyItem.getContext(), R.layout.pma_view_consent_item, privacyPolicyItem);
                    ButterKnife.bind(privacyPolicyItem);
                    privacyPolicyItem.setCheckBoxConsent(consent.isEnabled());
                    String strMName = consent.mName();
                    j.f(strMName, "mName(...)");
                    String strMDescription = consent.mDescription();
                    j.f(strMDescription, "mDescription(...)");
                    D0 d02 = new D0(4, dataAndPersonalizationFragment3, consent);
                    privacyPolicyItem.getMTextViewName().setText(strMName);
                    privacyPolicyItem.getMTextViewDescription().setText(strMDescription);
                    privacyPolicyItem.getMCheckBoxConsent().setOnCheckedChangeListener(d02);
                    dataAndPersonalizationFragment3.f14487V.add(privacyPolicyItem);
                    k1 k1Var3 = dataAndPersonalizationFragment3.f14484S;
                    j.d(k1Var3);
                    ((LinearLayout) k1Var3.c).addView(privacyPolicyItem);
                }
                k();
                break;
            case 2:
                super.j();
                InterfaceC1862a interfaceC1862a = (InterfaceC1862a) this.c.get();
                String version = svM7M6.getString(this.f.f11330b, "key_privacy_policy_version", "");
                DataPrivacyDialogFragment dataPrivacyDialogFragment = (DataPrivacyDialogFragment) interfaceC1862a;
                dataPrivacyDialogFragment.getClass();
                j.g(version, "version");
                X0 x02 = dataPrivacyDialogFragment.f14480R;
                j.d(x02);
                x02.c.setText(dataPrivacyDialogFragment.getString(R.string.pma_label_data_privacy_policy_and_terms_of_service_update_version, version));
                break;
            default:
                super.j();
                String version2 = svM7M6.getString(this.f.f11330b, "key_privacy_policy_version", "");
                if (C.e(version2)) {
                    DataPrivacyPolicyFragment dataPrivacyPolicyFragment = (DataPrivacyPolicyFragment) ((od.b) this.c.get());
                    dataPrivacyPolicyFragment.f14491V = false;
                    M0 m0 = dataPrivacyPolicyFragment.f14488S;
                    j.d(m0);
                    ((TextView) m0.h).setVisibility(8);
                } else {
                    DataPrivacyPolicyFragment dataPrivacyPolicyFragment2 = (DataPrivacyPolicyFragment) ((od.b) this.c.get());
                    dataPrivacyPolicyFragment2.getClass();
                    j.g(version2, "version");
                    dataPrivacyPolicyFragment2.f14491V = true;
                    M0 m02 = dataPrivacyPolicyFragment2.f14488S;
                    j.d(m02);
                    ((TextView) m02.h).setText(dataPrivacyPolicyFragment2.getString(R.string.pma_label_version, version2));
                }
                break;
        }
    }

    public void k() {
        pd.c cVar = ((DataAndPersonalizationFragment) ((od.a) this.c.get())).f14486U;
        j.d(cVar);
        ArrayList arrayList = ((DataPrivacyActivity) cVar).m;
        j.d(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((Consent) it.next()).isEnabled()) {
                return;
            }
        }
        k1 k1Var = ((DataAndPersonalizationFragment) ((od.a) this.c.get())).f14484S;
        j.d(k1Var);
        ((CheckBox) k1Var.f).setChecked(true);
    }

    public void l() {
        int i = 0;
        if ("settings".equalsIgnoreCase(((DataAndPersonalizationFragment) ((od.a) this.c.get())).s1())) {
            Object obj = (od.a) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.SAVE);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("source", ((DataAndPersonalizationFragment) ((od.a) this.c.get())).s1());
            ((BaseFragment) obj).o1(c1219hH);
        }
        pd.c cVar = ((DataAndPersonalizationFragment) ((od.a) this.c.get())).f14486U;
        j.d(cVar);
        ArrayList arrayList = ((DataPrivacyActivity) cVar).m;
        j.d(arrayList);
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Consent consent = (Consent) arrayList.get(i4);
            map.put(consent.mID(), Boolean.valueOf(consent.isEnabled()));
        }
        if (!"registration".equalsIgnoreCase(((DataAndPersonalizationFragment) ((od.a) this.c.get())).s1())) {
            ((BaseFragment) ((od.a) this.c.get())).p1();
            p pVarA = this.e.a(map);
            new T(5, new d(new d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new M(this, 13), 2), new com.google.firebase.messaging.p(this, 16), i), new m(this, 24)).e();
            return;
        }
        DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) ((od.a) this.c.get());
        dataAndPersonalizationFragment.getClass();
        pd.c cVar2 = dataAndPersonalizationFragment.f14486U;
        j.d(cVar2);
        DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) cVar2;
        Intent intent = new Intent();
        intent.putExtra("consents", new HashMap(map));
        dataPrivacyActivity.setResult(1, intent);
        dataPrivacyActivity.finish();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1284t c1284t, com.paymaya.data.preference.a mPreference, Uh.d dVar, int i) {
        super(dVar);
        this.f3130d = i;
        switch (i) {
            case 3:
                j.g(mPreference, "mPreference");
                super(dVar);
                this.e = c1284t;
                this.f = mPreference;
                break;
            default:
                j.g(mPreference, "mPreference");
                this.e = c1284t;
                this.f = mPreference;
                break;
        }
    }
}
