package ba;

import G5.ViewOnFocusChangeListenerC0253c;
import Kh.C0305j;
import Kh.C0310o;
import Kh.T;
import M8.H0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import cj.C1110A;
import cj.C1112C;
import cj.M;
import com.google.gson.JsonSyntaxException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Billable;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerField;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteContentPreview;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UIValue;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1277p;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.joda.time.format.DateTimeFormat;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends AbstractC2509a implements aa.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f8560d;
    public final C1273n e;
    public final C1277p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1247a f8561g;
    public final Q h;
    public final Dh.c i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(com.paymaya.data.preference.a aVar, C1273n c1273n, C1277p c1277p, C1247a c1247a, Q q9, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucbI"));
        this.f8560d = aVar;
        this.e = c1273n;
        this.f = c1277p;
        this.f8561g = c1247a;
        this.h = q9;
        this.i = new Dh.c(1);
    }

    public final void A(PayMayaError payMayaError) {
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        boolean zIsNetworkError = payMayaError.isNetworkError();
        String strTnTj78 = numX49.tnTj78("bucbq");
        if (zIsNetworkError) {
            ga.e eVar = (ga.e) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            kotlin.jvm.internal.j.f(strMSpiel, strTnTj78);
            MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar;
            mayaPayBillsFormFragment.getClass();
            MayaBaseLoadingFragment.N1(mayaPayBillsFormFragment, 100, strMSpiel, null, new ha.q(mayaPayBillsFormFragment, 3), 28);
            return;
        }
        ga.e eVar2 = (ga.e) this.c.get();
        String strMSpiel2 = payMayaError.mSpiel();
        kotlin.jvm.internal.j.f(strMSpiel2, strTnTj78);
        MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) eVar2;
        mayaPayBillsFormFragment2.getClass();
        MayaBaseLoadingFragment.N1(mayaPayBillsFormFragment2, 200, strMSpiel2, null, new ha.q(mayaPayBillsFormFragment2, 1), 28);
    }

    public final void B() {
        BillerDetails billerDetails = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13428M0;
        boolean zEqualsIgnoreCase = numX49.tnTj78("bucbz").equalsIgnoreCase(billerDetails != null ? billerDetails.mSlug() : null);
        String strTnTj78 = numX49.tnTj78("bucbl");
        if (zEqualsIgnoreCase) {
            MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            MayaInputLayout mayaInputLayout = mayaPayBillsFormFragment.t0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout.getHelperInfoSpielTextView().setText(mayaPayBillsFormFragment.getString(R.string.maya_label_pay_bills_amount_guide_meralco));
        } else {
            MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            MayaInputLayout mayaInputLayout2 = mayaPayBillsFormFragment2.t0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout2.getHelperInfoSpielTextView().setText(mayaPayBillsFormFragment2.getString(R.string.maya_label_pay_bills_admin_fee_may_apply));
        }
        MayaInputLayout mayaInputLayout3 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).t0;
        if (mayaInputLayout3 != null) {
            mayaInputLayout3.q();
        } else {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
    }

    @Override // y5.AbstractC2509a
    public final void i() {
        this.i.d();
        super.i();
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        Map map;
        Intent intent2;
        String strTnTj78;
        int i = 0;
        int i4 = 1;
        super.j();
        y(numX49.tnTj78("bucbW"), false);
        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
        AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.f13436s0;
        String strTnTj782 = numX49.tnTj78("buc29");
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n(strTnTj782);
            throw null;
        }
        appCompatEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(mayaPayBillsFormFragment, 5));
        AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.f13436s0;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n(strTnTj782);
            throw null;
        }
        appCompatEditText2.addTextChangedListener(new ha.x(mayaPayBillsFormFragment, i));
        MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
        AppCompatEditText appCompatEditText3 = mayaPayBillsFormFragment2.f13436s0;
        if (appCompatEditText3 == null) {
            kotlin.jvm.internal.j.n(strTnTj782);
            throw null;
        }
        appCompatEditText3.addTextChangedListener(new G5.A((Function0) null, new ha.s(mayaPayBillsFormFragment2, i4), new ha.s(mayaPayBillsFormFragment2, 2), 9));
        y(numX49.tnTj78("buc2P"), false);
        MayaPayBillsFormFragment mayaPayBillsFormFragment3 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
        AppCompatEditText appCompatEditText4 = mayaPayBillsFormFragment3.u0;
        if (appCompatEditText4 == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("buc2j"));
            throw null;
        }
        appCompatEditText4.addTextChangedListener(new ha.x(mayaPayBillsFormFragment3, i4));
        new C0305j(new C0310o(this.f8561g.c().e(zh.b.a()), new z(this, i4), Eh.d.c, Eh.d.f1365b), new C0929A(this, 1), 1).f();
        BillerDetails billerDetails = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13428M0;
        if (!((MayaBaseLoadingFragment) ((ga.e) this.c.get())).f10359n0 || billerDetails == null) {
            FragmentActivity activity = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).getActivity();
            String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
            if (7 == com.paymaya.common.utility.C.w(dataString)) {
                String strL = com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("buc2r"));
                String strL2 = com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("buc2Z"));
                String strL3 = com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("buc2k"));
                if (strL != null && !C2576A.H(strL)) {
                    MayaPayBillsFormFragment mayaPayBillsFormFragment4 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
                    mayaPayBillsFormFragment4.getClass();
                    mayaPayBillsFormFragment4.f13421E0 = strL;
                }
                if (strL2 != null && !C2576A.H(strL2)) {
                    ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).V1(strL2);
                }
                if (strL3 != null && !C2576A.H(strL3) && com.paymaya.common.utility.C.q0(strL3).doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).W1(strL3);
                }
                if (this.f8560d.e().isBillsPayHandleDeepLinkWithOtherFieldsConfig()) {
                    if (dataString == null) {
                        dataString = numX49.tnTj78("buc2B");
                    }
                    try {
                        map = (Map) com.paymaya.common.utility.A.f10366a.e(Uri.decode(com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("buc2u"))), Map.class);
                    } catch (JsonSyntaxException e) {
                        e.getMessage();
                        yk.a.d();
                        map = null;
                    }
                    ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13427L0 = map;
                }
                MayaPayBillsFormFragment mayaPayBillsFormFragment5 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
                C1219h c1219hM1 = mayaPayBillsFormFragment5.m1();
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hM1.j.put(numX49.tnTj78("buc2V"), numX49.tnTj78("buc2S"));
                FragmentActivity activity2 = mayaPayBillsFormFragment5.getActivity();
                if (activity2 != null && (intent = activity2.getIntent()) != null) {
                    intent.setData(null);
                }
            }
            n();
            return;
        }
        BillerInput billerInputBuild = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().build();
        ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().mSlug(billerDetails.mSlug());
        String strMName = billerDetails.mName();
        if (strMName != null) {
            MayaPayBillsFormFragment mayaPayBillsFormFragment6 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            mayaPayBillsFormFragment6.getClass();
            TextView textView = mayaPayBillsFormFragment6.f13434q0;
            if (textView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("buc2b"));
                throw null;
            }
            textView.setText(strMName);
        }
        ImageUrlUnfiltered imageUrlUnfilteredMIconUrl = billerDetails.mIconUrl();
        x(imageUrlUnfilteredMIconUrl != null ? imageUrlUnfilteredMIconUrl.mAndroidImageUrl() : null);
        this.i.d();
        q(billerDetails.mOtherFields());
        k(billerDetails.mOtherFields());
        p(billerDetails);
        m(billerDetails);
        kotlin.jvm.internal.j.d(billerInputBuild);
        String strMAccountNumber = billerInputBuild.mAccountNumber();
        if (strMAccountNumber != null) {
            ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).V1(strMAccountNumber);
        }
        u(billerInputBuild.mAmount());
        Map<String, BillerField> mapMBillerFields = billerInputBuild.mBillerFields();
        kotlin.jvm.internal.j.f(mapMBillerFields, numX49.tnTj78("buc22"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, BillerField>> it = mapMBillerFields.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strTnTj78 = numX49.tnTj78("buc2L");
            if (!zHasNext) {
                break;
            }
            Map.Entry<String, BillerField> next = it.next();
            if (!next.getValue().mIsHidden() && !kotlin.jvm.internal.j.b(next.getValue().mType(), strTnTj78)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            BillerField billerField = (BillerField) ((Map.Entry) it2.next()).getValue();
            kotlin.jvm.internal.j.d(billerField);
            String strMParameter = billerField.mParameter();
            if (strMParameter != null && !C2576A.H(strMParameter)) {
                String strMDisplayValue = billerField.mDisplayValue();
                String strMValue = billerField.mValue();
                if (strMDisplayValue != null && strMDisplayValue.length() != 0) {
                    ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Y1(strMParameter, strMDisplayValue);
                } else if (strMValue != null && strMValue.length() != 0) {
                    ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Y1(strMParameter, strMValue);
                }
            }
        }
        List<UIComponent> listMOtherFields = billerDetails.mOtherFields();
        Map map2 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13427L0;
        if (this.f8560d.e().isBillsPayHandleDeepLinkWithOtherFieldsConfig() && map2 != null && !map2.isEmpty() && listMOtherFields != null) {
            ArrayList<UIComponent> arrayList = new ArrayList();
            for (Object obj : listMOtherFields) {
                UIComponent uIComponent = (UIComponent) obj;
                if (kotlin.jvm.internal.j.b(uIComponent.type(), strTnTj78) && map2.containsKey(uIComponent.parameter())) {
                    arrayList.add(obj);
                }
            }
            for (UIComponent uIComponent2 : arrayList) {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent2, (String) M.f(map2, uIComponent2.parameter()), true);
            }
        }
        ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).L1();
    }

    public final void k(List list) {
        ArrayList arrayList;
        HashMap map;
        MayaInputLayout mayaInputLayout;
        AppCompatEditText inputEditText;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!kotlin.jvm.internal.j.b(((UIComponent) obj).type(), numX49.tnTj78("buc2d"))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            final MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.u0;
            String strTnTj78 = numX49.tnTj78("buc2F");
            if (appCompatEditText == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            appCompatEditText.setImeOptions(6);
            AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.u0;
            if (appCompatEditText2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            final int i = 0;
            appCompatEditText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ha.r
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                    switch (i) {
                        case 0:
                            if (i4 == 6) {
                                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = mayaPayBillsFormFragment;
                                com.paymaya.common.utility.C.R(mayaPayBillsFormFragment2.getActivity());
                                ((ba.C) mayaPayBillsFormFragment2.S1()).l();
                            }
                            break;
                        default:
                            if (i4 == 6) {
                                MayaPayBillsFormFragment mayaPayBillsFormFragment3 = mayaPayBillsFormFragment;
                                com.paymaya.common.utility.C.R(mayaPayBillsFormFragment3.getActivity());
                                ((ba.C) mayaPayBillsFormFragment3.S1()).l();
                            }
                            break;
                    }
                    return true;
                }
            });
            return;
        }
        UIComponent uIComponent = (UIComponent) C1110A.G(arrayList);
        if (kotlin.jvm.internal.j.b(uIComponent.type(), numX49.tnTj78("buc2i"))) {
            ga.e eVar = (ga.e) this.c.get();
            String strParameter = uIComponent.parameter();
            kotlin.jvm.internal.j.f(strParameter, numX49.tnTj78("buc2E"));
            final MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) eVar;
            mayaPayBillsFormFragment2.getClass();
            Ci.b bVar = mayaPayBillsFormFragment2.f13417A0;
            if (bVar == null || (map = (HashMap) bVar.f) == null || (mayaInputLayout = (MayaInputLayout) map.get(strParameter)) == null || (inputEditText = mayaInputLayout.getInputEditText()) == null) {
                return;
            }
            inputEditText.setImeOptions(6);
            final int i4 = 1;
            inputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ha.r
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i42, KeyEvent keyEvent) {
                    switch (i4) {
                        case 0:
                            if (i42 == 6) {
                                MayaPayBillsFormFragment mayaPayBillsFormFragment22 = mayaPayBillsFormFragment2;
                                com.paymaya.common.utility.C.R(mayaPayBillsFormFragment22.getActivity());
                                ((ba.C) mayaPayBillsFormFragment22.S1()).l();
                            }
                            break;
                        default:
                            if (i42 == 6) {
                                MayaPayBillsFormFragment mayaPayBillsFormFragment3 = mayaPayBillsFormFragment2;
                                com.paymaya.common.utility.C.R(mayaPayBillsFormFragment3.getActivity());
                                ((ba.C) mayaPayBillsFormFragment3.S1()).l();
                            }
                            break;
                    }
                    return true;
                }
            });
        }
    }

    public final void l() {
        boolean z4;
        boolean zT;
        BillerInput billerInputBuild = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().build();
        kotlin.jvm.internal.j.d(billerInputBuild);
        boolean z5 = false;
        if (this.f8560d.e().isBillsPayWalletBalanceValidationSkipped()) {
            boolean zS = s(billerInputBuild.mAccountNumber());
            Amount amountMAmount = billerInputBuild.mAmount();
            if (com.paymaya.common.utility.C.q0(amountMAmount != null ? amountMAmount.mValue() : null).doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Z1();
            } else {
                z5 = true;
            }
            z4 = zS & z5;
            zT = t(billerInputBuild);
        } else {
            boolean zS2 = s(billerInputBuild.mAccountNumber());
            Amount amountMAmount2 = billerInputBuild.mAmount();
            Double dQ0 = com.paymaya.common.utility.C.q0(amountMAmount2 != null ? amountMAmount2.mValue() : null);
            if (dQ0.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE || dQ0.doubleValue() > this.f8561g.b().mAvailableBalance().getValueAsDouble().doubleValue()) {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Z1();
            } else {
                z5 = true;
            }
            z4 = zS2 & z5;
            zT = t(billerInputBuild);
        }
        if (z4 && zT) {
            ((MayaBaseFragment) ((ga.e) this.c.get())).E1();
            Ah.p pVarA = this.f.a(billerInputBuild);
            new Lh.d(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new B(this, 1), 2), new v(this, 2), 0), new androidx.work.impl.e(this, 3)), new x(this, 2), 1).e();
        }
    }

    public final void m(BillerDetails billerDetails) {
        kotlin.jvm.internal.j.g(billerDetails, numX49.tnTj78("buc2H"));
        if (this.f8560d.e().isBillsPayAccountNumberFieldDisabled()) {
            BillerMetadata billerMetadataMMetadata = billerDetails.mMetadata();
            if (billerMetadataMMetadata != null ? kotlin.jvm.internal.j.b(billerMetadataMMetadata.mIsAccountNumberDisabled(), Boolean.TRUE) : false) {
                MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
                AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.f13436s0;
                String strTnTj78 = numX49.tnTj78("buc2O");
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                appCompatEditText.setEnabled(false);
                AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.f13436s0;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.setTextColor(ContextCompat.getColor(mayaPayBillsFormFragment.requireContext(), R.color.bombay_gray));
                } else {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
            }
        }
    }

    public final void n() {
        ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).O1();
        Billable billable = (Billable) ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13423G0.getValue();
        if (billable != null) {
            String accountNumber = billable.getAccountNumber();
            if (accountNumber != null) {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).V1(accountNumber);
            }
            u(billable.getAmount());
            o(billable.getBillerSlug());
            return;
        }
        Favorite favorite = (Favorite) ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13424H0.getValue();
        if (favorite != null) {
            String strMMeta = favorite.mContentPreview().mMeta();
            if (((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13426K0 != null) {
                o(strMMeta);
                return;
            } else {
                new Lh.d(new Lh.d(new Lh.d(new Lh.h(this.h.b(favorite.mId()), zh.b.a(), 0), new w(this, strMMeta, 1), 2), new B(this, 0), 0), new v(this, 1), 1).e();
                return;
            }
        }
        String str = (String) ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).I0.getValue();
        if (str == null) {
            o(((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13421E0);
            return;
        }
        FavoriteDetails favoriteDetails = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13426K0;
        if (!str.equals(favoriteDetails != null ? favoriteDetails.mId() : null)) {
            new Lh.d(new Lh.d(new Lh.d(new Lh.h(this.h.b(str), zh.b.a(), 0), new y(this, 0), 2), new z(this, 0), 0), new C0929A(this, 0), 1).e();
        } else {
            FavoriteContentPreview favoriteContentPreviewMContentPreview = favoriteDetails.mContentPreview();
            o(favoriteContentPreviewMContentPreview != null ? favoriteContentPreviewMContentPreview.mMeta() : null);
        }
    }

    public final void o(String str) {
        if (str != null && !C2576A.H(str)) {
            new Lh.d(new Lh.d(new Lh.d(new Lh.h(this.e.c(str), zh.b.a(), 0), new v(this, 0), 2), new w(this, str, 0), 0), new x(this, 0), 1).e();
            return;
        }
        ha.w wVar = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13419C0;
        if (wVar != null) {
            AbstractC1236z.c((MayaPayBillsActivity) wVar);
        }
    }

    public final void p(BillerDetails billerDetails) {
        List<String> listMNotes;
        kotlin.jvm.internal.j.g(billerDetails, numX49.tnTj78("buc2Q"));
        boolean zEqualsIgnoreCase = numX49.tnTj78("buc2t").equalsIgnoreCase(billerDetails.mSlug());
        String strTnTj78 = numX49.tnTj78("buc2U");
        if (zEqualsIgnoreCase) {
            MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            MayaInputLayout mayaInputLayout = mayaPayBillsFormFragment.f13435r0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout.getHelperInfoSpielTextView().setText(mayaPayBillsFormFragment.getString(R.string.maya_label_pay_bills_account_number_guide_meralco));
            MayaInputLayout mayaInputLayout2 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13435r0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout2.q();
        }
        B();
        BillerMetadata billerMetadataMMetadata = billerDetails.mMetadata();
        String strTnTj782 = numX49.tnTj78("buc2e");
        if (billerMetadataMMetadata == null || (listMNotes = billerMetadataMMetadata.mNotes()) == null) {
            Group group = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).w0;
            if (group == null) {
                kotlin.jvm.internal.j.n(strTnTj782);
                throw null;
            }
            group.setVisibility(8);
        } else {
            List<String> list = listMNotes;
            ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()) + numX49.tnTj78("buc28"));
            }
            ga.e eVar = (ga.e) this.c.get();
            int size = listMNotes.size();
            MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) eVar;
            TextView textView = mayaPayBillsFormFragment2.f13438x0;
            if (textView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("buc24"));
                throw null;
            }
            textView.setText(mayaPayBillsFormFragment2.getResources().getQuantityText(R.plurals.maya_label_pay_bills_reminder, size));
            MayaPayBillsFormFragment mayaPayBillsFormFragment3 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            mayaPayBillsFormFragment3.getClass();
            TextView textView2 = mayaPayBillsFormFragment3.y0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("buc2C"));
                throw null;
            }
            textView2.setText(com.paymaya.common.utility.C.k(arrayList));
            Group group2 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).w0;
            if (group2 == null) {
                kotlin.jvm.internal.j.n(strTnTj782);
                throw null;
            }
            group2.setVisibility(0);
        }
        if (this.f8560d.e().isBillerPlaceHolderEnabled()) {
            BillerMetadata billerMetadataMMetadata2 = billerDetails.mMetadata();
            String strMAccountNumberPlaceHolder = billerMetadataMMetadata2 != null ? billerMetadataMMetadata2.mAccountNumberPlaceHolder() : null;
            if (strMAccountNumberPlaceHolder == null || C2576A.H(strMAccountNumberPlaceHolder)) {
                strMAccountNumberPlaceHolder = numX49.tnTj78("buc2o");
            }
            MayaPayBillsFormFragment mayaPayBillsFormFragment4 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            mayaPayBillsFormFragment4.getClass();
            MayaInputLayout mayaInputLayout3 = mayaPayBillsFormFragment4.f13435r0;
            if (mayaInputLayout3 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout3.setLabel(strMAccountNumberPlaceHolder);
            MayaInputLayout mayaInputLayout4 = mayaPayBillsFormFragment4.f13435r0;
            if (mayaInputLayout4 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            mayaInputLayout4.o(strMAccountNumberPlaceHolder, false);
            BillerMetadata billerMetadataMMetadata3 = billerDetails.mMetadata();
            String strMAmountPlaceHolder = billerMetadataMMetadata3 != null ? billerMetadataMMetadata3.mAmountPlaceHolder() : null;
            if (strMAmountPlaceHolder == null || C2576A.H(strMAmountPlaceHolder)) {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).X1(numX49.tnTj78("buc2K"));
            } else {
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).X1(strMAmountPlaceHolder);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    public final void q(List list) {
        ?? arrayList;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UIComponent uIComponent = (UIComponent) it.next();
                kotlin.jvm.internal.j.g(uIComponent, numX49.tnTj78("buc2w"));
                String strType = uIComponent.type();
                String strTnTj78 = numX49.tnTj78("buc2c");
                if (strType != null) {
                    switch (strType.hashCode()) {
                        case -1655575466:
                            if (strType.equals(numX49.tnTj78("buc2N"))) {
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1().put(uIComponent.parameter(), Boolean.valueOf(true ^ uIComponent.required()));
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, strTnTj78);
                                ga.e eVar = (ga.e) this.c.get();
                                List<UIValue> listValues = uIComponent.values();
                                if (listValues != null) {
                                    List<UIValue> list2 = listValues;
                                    arrayList = new ArrayList(cj.t.l(list2, 10));
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((UIValue) it2.next()).display());
                                    }
                                } else {
                                    arrayList = C1112C.f9377a;
                                }
                                ?? r42 = arrayList;
                                MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar;
                                mayaPayBillsFormFragment.getClass();
                                kotlin.jvm.internal.j.g(r42, numX49.tnTj78("buc26"));
                                String strI = We.s.i(mayaPayBillsFormFragment.getClass().getSimpleName(), uIComponent.parameter());
                                mayaPayBillsFormFragment.getParentFragmentManager().clearFragmentResultListener(strI);
                                mayaPayBillsFormFragment.getParentFragmentManager().setFragmentResultListener(strI, mayaPayBillsFormFragment, new ha.u(0, mayaPayBillsFormFragment, uIComponent));
                                Ci.b bVar = mayaPayBillsFormFragment.f13417A0;
                                if (bVar != null) {
                                    bVar.f(uIComponent, null, new ha.v(mayaPayBillsFormFragment, uIComponent, 0), new E8.p(mayaPayBillsFormFragment, uIComponent, (Object) r42, strI, 8), new ha.t(mayaPayBillsFormFragment, uIComponent, 1));
                                }
                            }
                            break;
                        case -1217487446:
                            if (strType.equals(numX49.tnTj78("buc2M"))) {
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, uIComponent.defaultValue(), true);
                            }
                            break;
                        case -1031434259:
                            if (strType.equals(numX49.tnTj78("buc2h"))) {
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1().put(uIComponent.parameter(), Boolean.valueOf(true ^ uIComponent.required()));
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, strTnTj78);
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).P1(uIComponent);
                            }
                            break;
                        case 3076014:
                            if (strType.equals(numX49.tnTj78("buc2m"))) {
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1().put(uIComponent.parameter(), Boolean.valueOf(true ^ uIComponent.required()));
                                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, strTnTj78);
                                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
                                mayaPayBillsFormFragment2.getClass();
                                Ci.b bVar2 = mayaPayBillsFormFragment2.f13417A0;
                                if (bVar2 != null) {
                                    String string = mayaPayBillsFormFragment2.getString(R.string.maya_content_description_pay_bills_date);
                                    kotlin.jvm.internal.j.f(string, numX49.tnTj78("buc2D"));
                                    int i = 0;
                                    bVar2.d(uIComponent, string, null, new H0(2, mayaPayBillsFormFragment2, uIComponent), null, new ha.s(mayaPayBillsFormFragment2, i), new ha.t(mayaPayBillsFormFragment2, uIComponent, i));
                                }
                            }
                            break;
                    }
                }
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1().put(uIComponent.parameter(), Boolean.valueOf(true ^ uIComponent.required()));
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, strTnTj78);
                ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).P1(uIComponent);
            }
        }
    }

    public final void r(UIComponent uIComponent) {
        HashMap map;
        MayaInputLayout mayaInputLayout;
        HashMap map2;
        MayaInputLayout mayaInputLayout2;
        String strParameter = uIComponent.parameter();
        if (!uIComponent.required()) {
            ga.e eVar = (ga.e) this.c.get();
            kotlin.jvm.internal.j.d(strParameter);
            ((MayaPayBillsFormFragment) eVar).T1(strParameter);
            y(strParameter, true);
            return;
        }
        ga.e eVar2 = (ga.e) this.c.get();
        kotlin.jvm.internal.j.d(strParameter);
        String strPlaceholder = uIComponent.placeholder();
        String strTnTj78 = numX49.tnTj78("buc2a");
        kotlin.jvm.internal.j.f(strPlaceholder, strTnTj78);
        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar2;
        mayaPayBillsFormFragment.getClass();
        Ci.b bVar = mayaPayBillsFormFragment.f13417A0;
        if (bVar != null && (map2 = (HashMap) bVar.f) != null && (mayaInputLayout2 = (MayaInputLayout) map2.get(strParameter)) != null) {
            mayaInputLayout2.setHelperErrorText(mayaPayBillsFormFragment.getString(R.string.maya_error_pay_bills_missing_field, strPlaceholder));
            mayaInputLayout2.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
        }
        Ci.b bVar2 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13417A0;
        if (bVar2 != null && (map = (HashMap) bVar2.f) != null && (mayaInputLayout = (MayaInputLayout) map.get(strParameter)) != null) {
            mayaInputLayout.p();
            mayaInputLayout.s();
        }
        y(strParameter, false);
        ga.e eVar3 = (ga.e) this.c.get();
        String strPlaceholder2 = uIComponent.placeholder();
        kotlin.jvm.internal.j.f(strPlaceholder2, strTnTj78);
        MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) eVar3;
        mayaPayBillsFormFragment2.getClass();
        String string = mayaPayBillsFormFragment2.getString(R.string.maya_error_pay_bills_missing_field, strPlaceholder2);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("buc2X"));
        ((C) mayaPayBillsFormFragment2.S1()).w(strPlaceholder2, string, mayaPayBillsFormFragment2.f13428M0);
    }

    public final boolean s(String str) {
        if (str != null && !C2576A.H(str)) {
            return true;
        }
        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
        AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.f13436s0;
        String strTnTj78 = numX49.tnTj78("buc2G");
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        appCompatEditText.setText(appCompatEditText.getText());
        AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.f13436s0;
        if (appCompatEditText2 != null) {
            appCompatEditText2.clearFocus();
            return false;
        }
        kotlin.jvm.internal.j.n(strTnTj78);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(com.paymaya.domain.model.BillerInput r7) {
        /*
            r6 = this;
            java.util.Map r7 = r7.mBillerFields()
            r0 = 1
            if (r7 == 0) goto L8a
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.paymaya.domain.model.BillerField r1 = (com.paymaya.domain.model.BillerField) r1
            kotlin.jvm.internal.j.d(r1)
            java.lang.String r2 = r1.mValue()
            java.lang.String r3 = "buc23"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            if (r2 != 0) goto L31
            r2 = r3
        L31:
            boolean r4 = zj.C2576A.H(r2)
            if (r4 == 0) goto L3e
            boolean r2 = r1.mIsRequired()
            if (r2 == 0) goto Lf
            goto L51
        L3e:
            java.lang.String r4 = r1.mRegex()
            if (r4 == 0) goto Lf
            boolean r5 = zj.C2576A.H(r4)
            if (r5 == 0) goto L4b
            goto Lf
        L4b:
            boolean r2 = com.paymaya.common.utility.AbstractC1213b.U(r4, r2)
            if (r2 != 0) goto Lf
        L51:
            java.lang.ref.WeakReference r0 = r6.c
            java.lang.Object r0 = r0.get()
            ga.e r0 = (ga.e) r0
            java.lang.String r1 = r1.mParameter()
            if (r1 != 0) goto L60
            goto L61
        L60:
            r3 = r1
        L61:
            com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment r0 = (com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment) r0
            r0.getClass()
            Ci.b r0 = r0.f13417A0
            if (r0 == 0) goto L88
            java.lang.Object r0 = r0.f
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L88
            java.lang.Object r0 = r0.get(r3)
            com.paymaya.mayaui.common.view.widget.MayaInputLayout r0 = (com.paymaya.mayaui.common.view.widget.MayaInputLayout) r0
            if (r0 == 0) goto L88
            androidx.appcompat.widget.AppCompatEditText r0 = r0.getInputEditText()
            if (r0 == 0) goto L88
            android.text.Editable r1 = r0.getText()
            r0.setText(r1)
            r0.clearFocus()
        L88:
            r0 = 0
            goto Lf
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C.t(com.paymaya.domain.model.BillerInput):boolean");
    }

    public final void u(Amount amount) {
        if (amount != null) {
            ga.e eVar = (ga.e) this.c.get();
            String formattedValue = amount.getFormattedValue();
            kotlin.jvm.internal.j.f(formattedValue, numX49.tnTj78("buc2y"));
            ((MayaPayBillsFormFragment) eVar).W1(formattedValue);
        }
    }

    public final void v(BillsPayRequest billsPayRequest) {
        BillerDetails billerDetails;
        List<UIComponent> listMOtherFields;
        String strType;
        Map<String, String> mapMOtherFields = billsPayRequest.mOtherFields();
        if (mapMOtherFields == null || mapMOtherFields.isEmpty() || (billerDetails = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13428M0) == null || (listMOtherFields = billerDetails.mOtherFields()) == null) {
            return;
        }
        for (UIComponent uIComponent : listMOtherFields) {
            String str = mapMOtherFields.get(uIComponent.parameter());
            if (str != null && !C2576A.H(str) && (strType = uIComponent.type()) != null) {
                int iHashCode = strType.hashCode();
                String strTnTj78 = numX49.tnTj78("buc2v");
                switch (iHashCode) {
                    case -1655575466:
                        if (strType.equals(numX49.tnTj78("buc2T"))) {
                            List<UIValue> listValues = uIComponent.values();
                            UIValue uIValue = null;
                            Object obj = null;
                            if (listValues != null) {
                                Iterator<T> it = listValues.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (kotlin.jvm.internal.j.b(((UIValue) next).value(), str)) {
                                            obj = next;
                                        }
                                    }
                                }
                                uIValue = (UIValue) obj;
                            }
                            if (uIValue != null) {
                                ga.e eVar = (ga.e) this.c.get();
                                String strParameter = uIComponent.parameter();
                                kotlin.jvm.internal.j.f(strParameter, strTnTj78);
                                ((MayaPayBillsFormFragment) eVar).Y1(strParameter, uIValue.display());
                            }
                        }
                        break;
                    case -1217487446:
                        if (strType.equals(numX49.tnTj78("buc2Y")) && this.f8560d.e().isBillsPayHandleDeepLinkWithOtherFieldsConfig()) {
                            ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).Q1().setBillerFieldInput(uIComponent, str, true);
                        }
                        break;
                    case -1031434259:
                        if (strType.equals(numX49.tnTj78("buc2A"))) {
                            ga.e eVar2 = (ga.e) this.c.get();
                            String strParameter2 = uIComponent.parameter();
                            kotlin.jvm.internal.j.f(strParameter2, strTnTj78);
                            ((MayaPayBillsFormFragment) eVar2).Y1(strParameter2, str);
                        }
                        break;
                    case 3076014:
                        if (strType.equals(numX49.tnTj78("buc27"))) {
                            try {
                                String strDateFormat = uIComponent.dateFormat();
                                if (strDateFormat == null) {
                                    strDateFormat = "yyyy-MM-dd";
                                }
                                String strPrint = DateTimeFormat.forPattern("MMM d, yyyy").print(DateTimeFormat.forPattern(strDateFormat).parseDateTime(str));
                                ga.e eVar3 = (ga.e) this.c.get();
                                String strParameter3 = uIComponent.parameter();
                                kotlin.jvm.internal.j.f(strParameter3, strTnTj78);
                                ((MayaPayBillsFormFragment) eVar3).Y1(strParameter3, strPrint);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void w(String str, String str2, BillerDetails billerDetails) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("buc2R"));
        if (!this.f8560d.e().isBillsPayEventsV2Enabled() || billerDetails == null) {
            return;
        }
        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
        mayaPayBillsFormFragment.getClass();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("buc2p"));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("buc20"), str);
        map.put(numX49.tnTj78("buc2g"), str2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategorySlug = billerDetails.mCategorySlug();
        if (strMCategorySlug != null) {
            c1219hE.j.put(numX49.tnTj78("buc2f"), strMCategorySlug);
        }
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategory = billerDetails.mCategory();
        if (strMCategory != null) {
            c1219hE.j.put(numX49.tnTj78("buc21"), strMCategory);
        }
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        String strMSlug = billerDetails.mSlug();
        if (strMSlug != null) {
            c1219hE.j.put(numX49.tnTj78("buc2n"), strMSlug);
        }
        c1219hE.k(EnumC1212a.BILLER_NAME, billerDetails.mName());
        mayaPayBillsFormFragment.o1().b(c1219hE);
    }

    public final void x(ImageUrl imageUrl) {
        String strO = com.paymaya.common.utility.C.O(imageUrl);
        if (strO != null) {
            MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) this.c.get());
            mayaPayBillsFormFragment.getClass();
            mayaPayBillsFormFragment.getActivity();
            ImageView imageView = mayaPayBillsFormFragment.f13433p0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("buc2s"));
                throw null;
            }
            Context context = imageView.getContext();
            kotlin.jvm.internal.j.f(context, numX49.tnTj78("buc2x"));
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.mayaDrawable_BillerPlaceholder, typedValue, true);
            com.paymaya.common.utility.C.e0(strO, imageView, typedValue.resourceId);
        }
    }

    public final void y(String str, boolean z4) {
        ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1().put(str, Boolean.valueOf(z4));
        Map mapR1 = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).R1();
        boolean z5 = false;
        if (!mapR1.isEmpty()) {
            Iterator it = mapR1.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z5 = true;
                    break;
                }
            }
        }
        boolean z8 = !z5;
        Button button = ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13437v0;
        if (button != null) {
            button.setEnabled(z8);
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("buc25"));
            throw null;
        }
    }

    public final boolean z() {
        String str;
        String str2;
        return this.f8560d.e().isMayaBillerReminderEnabled() && !this.j && (str = (String) ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).I0.getValue()) != null && (C2576A.H(str) ^ true) && (str2 = (String) ((MayaPayBillsFormFragment) ((ga.e) this.c.get())).f13425J0.getValue()) != null && (C2576A.H(str2) ^ true);
    }
}
