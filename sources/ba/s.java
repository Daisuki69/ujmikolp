package ba;

import E8.RunnableC0218a;
import Kh.C0310o;
import M8.H0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.C1112C;
import cj.L;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Billable;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerField;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.BillsPayRequestDetails;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteContentPreview;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UIValue;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1277p;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V;
import com.paymaya.domain.store.W;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import dOYHB6.tiZVw8.numX49;
import ha.C1554g;
import ha.C1555h;
import ha.C1557j;
import ha.ViewOnClickListenerC1553f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;
import v5.C2342a;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends AbstractC2509a implements aa.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f8603d;
    public final C1273n e;
    public final C1277p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1247a f8604g;
    public final W h;
    public final Q i;
    public final Dh.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BillerInput.Builder f8605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Billable f8606l;
    public Favorite m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FavoriteDetails f8607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FavoriteCount f8608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public UIComponent f8609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UIComponent f8610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UIComponent f8611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zj.o f8615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BillerDetails f8616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Biller f8618y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.paymaya.data.preference.a aVar, C1273n c1273n, C1277p c1277p, C1247a c1247a, W w6, Q q9, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucT"));
        this.f8603d = aVar;
        this.e = c1273n;
        this.f = c1277p;
        this.f8604g = c1247a;
        this.h = w6;
        this.i = q9;
        this.j = new Dh.c(1);
        this.f8612s = true;
        this.f8613t = true;
        this.f8614u = new ArrayList();
        this.f8615v = new zj.o(numX49.tnTj78("bucR"));
    }

    public static UIComponent k(UIComponent uIComponent, BillsPayRequest billsPayRequest) {
        Map<String, String> mapMOtherFields = billsPayRequest != null ? billsPayRequest.mOtherFields() : null;
        String strParameter = uIComponent.parameter();
        if (mapMOtherFields == null || !mapMOtherFields.containsKey(strParameter)) {
            return uIComponent;
        }
        String strDisplay = mapMOtherFields.get(strParameter);
        List<UIValue> listValues = uIComponent.values();
        if (numX49.tnTj78("bucp").equalsIgnoreCase(uIComponent.type()) && listValues != null) {
            Iterator<UIValue> it = listValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UIValue next = it.next();
                if (kotlin.jvm.internal.j.b(next.value(), strDisplay)) {
                    strDisplay = next.display();
                    break;
                }
            }
        }
        UIComponent uIComponentBuild = uIComponent.toBuilder().defaultValue(strDisplay).build();
        kotlin.jvm.internal.j.f(uIComponentBuild, numX49.tnTj78("buc0"));
        return uIComponentBuild;
    }

    public final void A(Pair pair) {
        String strMTemplateJson;
        Map<String, String> mapMOtherFields;
        Map<String, BillerField> mapMBillerFields;
        List<UIComponent> listMOtherFields;
        kotlin.jvm.internal.j.g(pair, numX49.tnTj78("bucg"));
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).L1();
        BillerDetails billerDetails = (BillerDetails) pair.f18160a;
        this.f8616w = billerDetails;
        if (billerDetails != null) {
            ga.c cVar = (ga.c) this.c.get();
            String strMName = billerDetails.mName();
            TextView textView = ((MayaPayBillsBIRFragment) cVar).f13395q0;
            if (textView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("buc1"));
                throw null;
            }
            textView.setText(strMName);
            ImageUrlUnfiltered imageUrlUnfilteredMIconUrl = billerDetails.mIconUrl();
            String strO = com.paymaya.common.utility.C.O(imageUrlUnfilteredMIconUrl != null ? imageUrlUnfilteredMIconUrl.mAndroidImageUrl() : null);
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
            mayaPayBillsBIRFragment.getActivity();
            ImageView imageView = mayaPayBillsBIRFragment.f13394p0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucf"));
                throw null;
            }
            com.paymaya.common.utility.C.e0(strO, imageView, R.drawable.maya_ic_pay_bills_category_placeholder);
        }
        this.j.d();
        BillerInput.Builder builderSBuilder = BillerInput.sBuilder();
        BillerDetails billerDetails2 = this.f8616w;
        BillerInput.Builder builderMSlug = builderSBuilder.mSlug(billerDetails2 != null ? billerDetails2.mSlug() : null);
        kotlin.jvm.internal.j.g(builderMSlug, numX49.tnTj78("bucn"));
        this.f8605k = builderMSlug;
        w();
        FavoriteDetails favoriteDetails = this.f8607n;
        BillsPayRequest billsPayRequestFromJson = BillsPayRequest.fromJson(favoriteDetails != null ? favoriteDetails.mTemplateJson() : null);
        BillerDetails billerDetails3 = this.f8616w;
        if (billerDetails3 != null && (listMOtherFields = billerDetails3.mOtherFields()) != null) {
            for (UIComponent uIComponentK : listMOtherFields) {
                List<UIValue> listValues = uIComponentK.values();
                if (listValues != null && !listValues.isEmpty()) {
                    List<UIValue> listValues2 = uIComponentK.values();
                    if (listValues2 != null) {
                        cj.w.o(listValues2, new E8.x(new Sb.i(3), 4));
                    }
                    uIComponentK = uIComponentK.toBuilder().values(listValues2).build();
                }
                if (numX49.tnTj78("bucx").equalsIgnoreCase(uIComponentK.parameter())) {
                    uIComponentK = k(uIComponentK, billsPayRequestFromJson);
                    MayaInputLayout mayaInputLayout = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).w0;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucs"));
                        throw null;
                    }
                    mayaInputLayout.setVisibility(0);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).Q1(uIComponentK);
                } else if (numX49.tnTj78("buc5").equalsIgnoreCase(uIComponentK.parameter())) {
                    uIComponentK = k(uIComponentK, billsPayRequestFromJson);
                    MayaInputLayout mayaInputLayout2 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13399x0;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucJ"));
                        throw null;
                    }
                    mayaInputLayout2.setVisibility(0);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).T1(uIComponentK);
                } else if (numX49.tnTj78("bucI").equalsIgnoreCase(uIComponentK.parameter())) {
                    this.f8609p = k(uIComponentK, billsPayRequestFromJson);
                } else if (numX49.tnTj78("bucq").equalsIgnoreCase(uIComponentK.parameter())) {
                    UIComponent uIComponentK2 = k(uIComponentK, billsPayRequestFromJson);
                    this.f8610q = uIComponentK2;
                    MayaInputLayout mayaInputLayout3 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13381A0;
                    if (mayaInputLayout3 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucz"));
                        throw null;
                    }
                    mayaInputLayout3.setVisibility(0);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).S1(uIComponentK2);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).g2(C1112C.f9377a, uIComponentK2.parameter(), uIComponentK2.placeholder(), uIComponentK2.defaultValue(), false);
                } else if (numX49.tnTj78("bucl").equalsIgnoreCase(uIComponentK.parameter())) {
                    UIComponent uIComponentK3 = k(uIComponentK, billsPayRequestFromJson);
                    this.f8611r = uIComponentK3;
                    MayaInputLayout mayaInputLayout4 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13382B0;
                    if (mayaInputLayout4 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucW"));
                        throw null;
                    }
                    mayaInputLayout4.setVisibility(0);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).U1(uIComponentK3);
                    ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).h2(C1112C.f9377a, uIComponentK3.parameter(), uIComponentK3.placeholder(), uIComponentK3.defaultValue(), false);
                } else {
                    uIComponentK = k(uIComponentK, billsPayRequestFromJson);
                    o(uIComponentK);
                }
                BillerField billerFieldGenerateBillerField = BillerField.generateBillerField(uIComponentK);
                q().addBillerField(billerFieldGenerateBillerField.toBuilder().mValue(uIComponentK.defaultValue()).build());
                if (numX49.tnTj78("bucP9").equalsIgnoreCase(uIComponentK.type())) {
                    q().setBillerFieldInput(uIComponentK, billerFieldGenerateBillerField.mValue(), true);
                }
            }
        }
        BillerDetails billerDetails4 = this.f8616w;
        n(billerDetails4 != null ? billerDetails4.mOtherFields() : null);
        UIComponent uIComponent = this.f8609p;
        if (uIComponent != null) {
            MayaInputLayout mayaInputLayout5 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13400z0;
            if (mayaInputLayout5 == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPP"));
                throw null;
            }
            mayaInputLayout5.setVisibility(0);
            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).R1(uIComponent, this.h.a());
        }
        ((MayaBaseLoadingFragment) ((ga.c) this.c.get())).f10359n0 = true;
        x(this.f8616w);
        BillerInput billerInputBuild = q().build();
        ArrayList arrayList = this.f8614u;
        if (arrayList.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            arrayList.add(M.i(new Pair(numX49.tnTj78("bucPb"), bool)));
            arrayList.add(M.i(new Pair(numX49.tnTj78("bucP2"), bool)));
            if (billerInputBuild != null && (mapMBillerFields = billerInputBuild.mBillerFields()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, BillerField> entry : mapMBillerFields.entrySet()) {
                    if (kotlin.jvm.internal.j.b(entry.getValue().mType(), numX49.tnTj78("bucPL"))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    String strMParameter = ((BillerField) ((Map.Entry) it.next()).getValue()).mParameter();
                    if (strMParameter == null) {
                        strMParameter = numX49.tnTj78("bucPr");
                    }
                    arrayList.add(M.i(new Pair(strMParameter, Boolean.valueOf(!((BillerField) r5.getValue()).mIsRequired()))));
                }
            }
        }
        if (this.m != null) {
            for (Map map : this.f8614u) {
                for (Map.Entry entry2 : map.entrySet()) {
                    String str = (String) entry2.getKey();
                    boolean zBooleanValue = ((Boolean) entry2.getValue()).booleanValue();
                    boolean zContainsKey = (billsPayRequestFromJson == null || (mapMOtherFields = billsPayRequestFromJson.mOtherFields()) == null) ? false : mapMOtherFields.containsKey(str);
                    if (zContainsKey) {
                        zBooleanValue = zContainsKey;
                    }
                    map.put(str, Boolean.valueOf(zBooleanValue));
                }
            }
        }
        Billable billable = this.f8606l;
        if (billable != null) {
            if (billable.getAmount() != null) {
                ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).b2(billable.getAmount().getFormattedValue());
            }
            String accountNumber = billable.getAccountNumber();
            if (accountNumber != null && !C2576A.H(accountNumber)) {
                ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).a2(billable.getAccountNumber());
            }
            ((ga.c) this.c.get()).getClass();
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
            AppCompatEditText appCompatEditText = mayaPayBillsBIRFragment2.t0;
            if (appCompatEditText == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPB"));
                throw null;
            }
            appCompatEditText.setEnabled(false);
            AppCompatEditText appCompatEditText2 = mayaPayBillsBIRFragment2.f13397s0;
            if (appCompatEditText2 == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPk"));
                throw null;
            }
            appCompatEditText2.setEnabled(false);
            Ci.b bVar = mayaPayBillsBIRFragment2.f13389J0;
            if (bVar == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPZ"));
                throw null;
            }
            Iterator it2 = ((HashMap) bVar.f).entrySet().iterator();
            while (it2.hasNext()) {
                ((MayaInputLayout) ((Map.Entry) it2.next()).getValue()).getInputEditText().setEnabled(false);
            }
        }
        FavoriteDetails favoriteDetails2 = this.f8607n;
        if (favoriteDetails2 == null || (strMTemplateJson = favoriteDetails2.mTemplateJson()) == null || strMTemplateJson.length() == 0) {
            return;
        }
        BillsPayRequest billsPayRequest = (BillsPayRequest) com.paymaya.common.utility.A.f10366a.e(favoriteDetails2.mTemplateJson(), BillsPayRequest.class);
        ga.c cVar2 = (ga.c) this.c.get();
        Amount amountMAmount = billsPayRequest.mAmount();
        ((MayaPayBillsBIRFragment) cVar2).b2(amountMAmount != null ? amountMAmount.getFormattedValue() : null);
        ga.c cVar3 = (ga.c) this.c.get();
        BillsPayRequestDetails billsPayRequestDetailsMBiller = billsPayRequest.mBiller();
        ((MayaPayBillsBIRFragment) cVar3).a2(billsPayRequestDetailsMBiller != null ? billsPayRequestDetailsMBiller.mAccountNumber() : null);
    }

    public final void B(UIComponent uIComponent, String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucPu"));
        if (numX49.tnTj78("bucPV").equalsIgnoreCase(uIComponent.parameter())) {
            q().setBillerFieldInput(uIComponent, str, AbstractC1234x.k(uIComponent.dateFormat(), str, numX49.tnTj78("bucPS")));
        } else {
            q().setBillerFieldInput(uIComponent, str);
        }
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).d2(l(q().build()) && m());
    }

    public final void C(UIComponent uIComponent, String str) {
        Object next;
        kotlin.jvm.internal.j.g(uIComponent, numX49.tnTj78("bucPj"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucPd"));
        List<UIValue> listValues = uIComponent.values();
        if (listValues != null) {
            Iterator<T> it = listValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (str.equalsIgnoreCase(((UIValue) next).display())) {
                        break;
                    }
                }
            }
            UIValue uIValue = (UIValue) next;
            if (uIValue != null) {
                q().setBillerFieldInput(uIComponent, uIValue.value(), uIValue.display());
            }
        }
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).d2(l(q().build()) && m());
    }

    @Override // y5.AbstractC2509a
    public final void i() {
        this.j.d();
        super.i();
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        FavoriteContentPreview favoriteContentPreviewMContentPreview;
        Intent intent;
        Intent intent2;
        List<UIComponent> listMOtherFields;
        ImageUrlUnfiltered imageUrlUnfilteredMIconUrl;
        int i = 3;
        int i4 = 2;
        int i6 = 0;
        int i10 = 1;
        super.j();
        Bundle arguments = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
        String strTnTj78 = numX49.tnTj78("bucPi");
        if ((arguments != null ? (Billable) arguments.getParcelable(strTnTj78) : null) != null) {
            Bundle arguments2 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
            this.f8606l = arguments2 != null ? (Billable) arguments2.getParcelable(strTnTj78) : null;
            Bundle arguments3 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
            Billable billable = arguments3 != null ? (Billable) arguments3.getParcelable(strTnTj78) : null;
            this.f8617x = billable != null ? billable.getBillerSlug() : null;
        } else {
            Bundle arguments4 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
            String strTnTj782 = numX49.tnTj78("bucPE");
            if ((arguments4 != null ? (Favorite) arguments4.getParcelable(strTnTj782) : null) != null) {
                Bundle arguments5 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                this.m = arguments5 != null ? (Favorite) arguments5.getParcelable(strTnTj782) : null;
                Bundle arguments6 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                Favorite favorite = arguments6 != null ? (Favorite) arguments6.getParcelable(strTnTj782) : null;
                this.f8617x = (favorite == null || (favoriteContentPreviewMContentPreview = favorite.mContentPreview()) == null) ? null : favoriteContentPreviewMContentPreview.mMeta();
            } else {
                Bundle arguments7 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                String strTnTj783 = numX49.tnTj78("bucPF");
                if ((arguments7 != null ? (Biller) arguments7.getParcelable(strTnTj783) : null) != null) {
                    Bundle arguments8 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                    this.f8618y = arguments8 != null ? (Biller) arguments8.getParcelable(strTnTj783) : null;
                    Bundle arguments9 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                    Biller biller = arguments9 != null ? (Biller) arguments9.getParcelable(strTnTj783) : null;
                    this.f8617x = biller != null ? biller.mSlug() : null;
                } else {
                    Bundle arguments10 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
                    this.f8617x = arguments10 != null ? arguments10.getString(numX49.tnTj78("bucPH")) : null;
                }
            }
        }
        Bundle arguments11 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getArguments();
        this.f8608o = arguments11 != null ? (FavoriteCount) arguments11.getParcelable(numX49.tnTj78("bucPO")) : null;
        boolean z4 = ((MayaBaseLoadingFragment) ((ga.c) this.c.get())).f10359n0;
        String strTnTj784 = numX49.tnTj78("bucPQ");
        if (z4) {
            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).L1();
            ga.c cVar = (ga.c) this.c.get();
            BillerDetails billerDetails = this.f8616w;
            String strMName = billerDetails != null ? billerDetails.mName() : null;
            TextView textView = ((MayaPayBillsBIRFragment) cVar).f13395q0;
            if (textView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPD"));
                throw null;
            }
            textView.setText(strMName);
            ga.c cVar2 = (ga.c) this.c.get();
            BillerDetails billerDetails2 = this.f8616w;
            String strO = com.paymaya.common.utility.C.O((billerDetails2 == null || (imageUrlUnfilteredMIconUrl = billerDetails2.mIconUrl()) == null) ? null : imageUrlUnfilteredMIconUrl.mAndroidImageUrl());
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar2;
            mayaPayBillsBIRFragment.getActivity();
            ImageView imageView = mayaPayBillsBIRFragment.f13394p0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPm"));
                throw null;
            }
            com.paymaya.common.utility.C.e0(strO, imageView, R.drawable.maya_ic_pay_bills_category_placeholder);
            this.j.d();
            w();
            BillerDetails billerDetails3 = this.f8616w;
            if (billerDetails3 != null && (listMOtherFields = billerDetails3.mOtherFields()) != null) {
                for (UIComponent uIComponentBuild : listMOtherFields) {
                    List<UIValue> listValues = uIComponentBuild.values();
                    if (listValues != null && !listValues.isEmpty()) {
                        List<UIValue> listValues2 = uIComponentBuild.values();
                        if (listValues2 != null) {
                            cj.w.o(listValues2, new E8.x(new Sb.i(2), 3));
                        }
                        uIComponentBuild = uIComponentBuild.toBuilder().values(listValues2).build();
                    }
                    if (numX49.tnTj78("bucPt").equalsIgnoreCase(uIComponentBuild.parameter())) {
                        MayaInputLayout mayaInputLayout = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).w0;
                        if (mayaInputLayout == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bucPU"));
                            throw null;
                        }
                        mayaInputLayout.setVisibility(0);
                        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).Q1(uIComponentBuild);
                    } else if (numX49.tnTj78("bucPe").equalsIgnoreCase(uIComponentBuild.parameter())) {
                        MayaInputLayout mayaInputLayout2 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13399x0;
                        if (mayaInputLayout2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bucP8"));
                            throw null;
                        }
                        mayaInputLayout2.setVisibility(0);
                        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).T1(uIComponentBuild);
                    } else if (numX49.tnTj78("bucPC").equalsIgnoreCase(uIComponentBuild.parameter())) {
                        this.f8609p = uIComponentBuild.toBuilder().build();
                        ArrayList arrayListA = this.h.a();
                        MayaInputLayout mayaInputLayout3 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13400z0;
                        if (mayaInputLayout3 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bucP4"));
                            throw null;
                        }
                        mayaInputLayout3.setVisibility(0);
                        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).R1(uIComponentBuild, arrayListA);
                    } else if (numX49.tnTj78("bucPo").equalsIgnoreCase(uIComponentBuild.parameter())) {
                        UIComponent uIComponentBuild2 = uIComponentBuild.toBuilder().build();
                        this.f8610q = uIComponentBuild2;
                        if (uIComponentBuild2 == null) {
                            continue;
                        } else {
                            MayaInputLayout mayaInputLayout4 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13381A0;
                            if (mayaInputLayout4 == null) {
                                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPK"));
                                throw null;
                            }
                            mayaInputLayout4.setVisibility(0);
                            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).S1(uIComponentBuild2);
                        }
                    } else if (numX49.tnTj78("bucPw").equalsIgnoreCase(uIComponentBuild.parameter())) {
                        UIComponent uIComponentBuild3 = uIComponentBuild.toBuilder().build();
                        this.f8611r = uIComponentBuild3;
                        if (uIComponentBuild3 == null) {
                            continue;
                        } else {
                            MayaInputLayout mayaInputLayout5 = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13382B0;
                            if (mayaInputLayout5 == null) {
                                kotlin.jvm.internal.j.n(numX49.tnTj78("bucPc"));
                                throw null;
                            }
                            mayaInputLayout5.setVisibility(0);
                            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).U1(uIComponentBuild3);
                        }
                    } else {
                        BillerField billerField = q().getBillerField(uIComponentBuild.toBuilder().build());
                        UIComponent uIComponentBuild4 = uIComponentBuild.toBuilder().defaultValue(billerField != null ? billerField.mValue() : null).build();
                        q().addBillerField(BillerField.generateBillerField(uIComponentBuild4));
                        kotlin.jvm.internal.j.d(uIComponentBuild4);
                        o(uIComponentBuild4);
                    }
                }
            }
            BillerDetails billerDetails4 = this.f8616w;
            n(billerDetails4 != null ? billerDetails4.mOtherFields() : null);
            AppCompatEditText appCompatEditText = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13397s0;
            if (appCompatEditText == null) {
                kotlin.jvm.internal.j.n(strTnTj784);
                throw null;
            }
            appCompatEditText.requestFocus();
            x(this.f8616w);
            BillerField billerField2 = q().getBillerField(this.f8609p);
            String strMValue = billerField2 != null ? billerField2.mValue() : null;
            ArrayList arrayListB = this.h.b(strMValue);
            BillerField billerField3 = q().getBillerField(this.f8610q);
            String strMValue2 = billerField3 != null ? billerField3.mValue() : null;
            BillerField billerField4 = q().getBillerField(this.f8611r);
            String strMValue3 = billerField4 != null ? billerField4.mValue() : null;
            List listC = this.h.c(strMValue, strMValue2);
            ga.c cVar3 = (ga.c) this.c.get();
            UIComponent uIComponent = this.f8610q;
            String strParameter = uIComponent != null ? uIComponent.parameter() : null;
            UIComponent uIComponent2 = this.f8610q;
            String strPlaceholder = uIComponent2 != null ? uIComponent2.placeholder() : null;
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) cVar3;
            mayaPayBillsBIRFragment2.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0218a(mayaPayBillsBIRFragment2, arrayListB, strParameter, strPlaceholder, strMValue2, 4), 200L);
            ga.c cVar4 = (ga.c) this.c.get();
            kotlin.jvm.internal.j.d(listC);
            UIComponent uIComponent3 = this.f8611r;
            String strParameter2 = uIComponent3 != null ? uIComponent3.parameter() : null;
            UIComponent uIComponent4 = this.f8611r;
            String strPlaceholder2 = uIComponent4 != null ? uIComponent4.placeholder() : null;
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = (MayaPayBillsBIRFragment) cVar4;
            mayaPayBillsBIRFragment3.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0218a(mayaPayBillsBIRFragment3, listC, strParameter2, strPlaceholder2, strMValue3, 5), 400L);
            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).d2(l(q().build()) && m());
        } else {
            p();
        }
        e(new C0310o(this.f8604g.c().e(zh.b.a()), new r(this, i10), Eh.d.c, Eh.d.f1365b).f());
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment4 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
        mayaPayBillsBIRFragment4.getClass();
        C1554g c1554g = new C1554g(mayaPayBillsBIRFragment4, i6);
        AppCompatEditText appCompatEditText2 = mayaPayBillsBIRFragment4.f13397s0;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n(strTnTj784);
            throw null;
        }
        MayaInputLayout mayaInputLayout6 = mayaPayBillsBIRFragment4.f13396r0;
        if (mayaInputLayout6 == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bucPX"));
            throw null;
        }
        AbstractC0983W.c(appCompatEditText2, mayaInputLayout6, new C1554g(mayaPayBillsBIRFragment4, i10), new C1554g(mayaPayBillsBIRFragment4, i4), c1554g);
        G5.A a8 = new G5.A(c1554g, new C1554g(mayaPayBillsBIRFragment4, i), new C1554g(mayaPayBillsBIRFragment4, 4), 8);
        AppCompatEditText appCompatEditText3 = mayaPayBillsBIRFragment4.t0;
        if (appCompatEditText3 == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bucPa"));
            throw null;
        }
        appCompatEditText3.addTextChangedListener(a8);
        FragmentActivity activity = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).getActivity();
        String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
        if (7 == com.paymaya.common.utility.C.w(dataString)) {
            String strL = com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("bucPh"));
            String strL2 = com.paymaya.common.utility.C.L(dataString, numX49.tnTj78("bucPM"));
            if (strL != null && !C2576A.H(strL)) {
                ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).a2(strL);
            }
            if (strL2 != null && !C2576A.H(strL2) && com.paymaya.common.utility.C.q0(strL2).doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).b2(strL2);
            }
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment5 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
            C1219h c1219hM1 = mayaPayBillsBIRFragment5.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put(numX49.tnTj78("bucPN"), numX49.tnTj78("bucP6"));
            FragmentActivity activity2 = mayaPayBillsBIRFragment5.getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.setData(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(com.paymaya.domain.model.BillerInput r13) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s.l(com.paymaya.domain.model.BillerInput):boolean");
    }

    public final boolean m() {
        Iterator it = this.f8614u.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).entrySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void n(List list) {
        ArrayList arrayList;
        AppCompatEditText inputEditText;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!kotlin.jvm.internal.j.b(((UIComponent) obj).type(), numX49.tnTj78("bucPy"))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        UIComponent uIComponent = arrayList != null ? (UIComponent) C1110A.G(arrayList) : null;
        if (kotlin.jvm.internal.j.b(uIComponent != null ? uIComponent.type() : null, numX49.tnTj78("bucPv"))) {
            ga.c cVar = (ga.c) this.c.get();
            String strParameter = uIComponent.parameter();
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar;
            Ci.b bVar = mayaPayBillsBIRFragment.f13389J0;
            if (bVar == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bucP7"));
                throw null;
            }
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ((HashMap) bVar.f).get(strParameter);
            if (mayaInputLayout == null || (inputEditText = mayaInputLayout.getInputEditText()) == null) {
                return;
            }
            inputEditText.setImeOptions(6);
            inputEditText.setOnEditorActionListener(new Ke.e(mayaPayBillsBIRFragment, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public final void o(UIComponent uIComponent) {
        ?? arrayList;
        String strType = uIComponent.type();
        if (strType != null) {
            int iHashCode = strType.hashCode();
            String strTnTj78 = numX49.tnTj78("bucPA");
            switch (iHashCode) {
                case -1655575466:
                    if (strType.equals(numX49.tnTj78("bucPg"))) {
                        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                        mayaPayBillsBIRFragment.getClass();
                        String string = kotlin.jvm.internal.j.b(uIComponent.placeholder(), numX49.tnTj78("bucPf")) ? mayaPayBillsBIRFragment.getString(R.string.maya_label_pay_bills_select_rdo_code) : null;
                        String strI = We.s.i(mayaPayBillsBIRFragment.getClass().getSimpleName(), uIComponent.parameter());
                        mayaPayBillsBIRFragment.X1(uIComponent.parameter(), strI);
                        List<UIValue> listValues = uIComponent.values();
                        if (listValues != null) {
                            List<UIValue> list = listValues;
                            arrayList = new ArrayList(cj.t.l(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((UIValue) it.next()).display());
                            }
                        } else {
                            arrayList = C1112C.f9377a;
                        }
                        Ci.b bVar = mayaPayBillsBIRFragment.f13389J0;
                        if (bVar != null) {
                            bVar.f(uIComponent, string, new C1555h(mayaPayBillsBIRFragment, uIComponent, 6), new E8.p(mayaPayBillsBIRFragment, uIComponent, (Object) arrayList, strI, 7), new C1557j(mayaPayBillsBIRFragment, uIComponent, 8));
                            return;
                        } else {
                            kotlin.jvm.internal.j.n(strTnTj78);
                            throw null;
                        }
                    }
                    return;
                case -1217487446:
                    if (strType.equals(numX49.tnTj78("bucP0"))) {
                        q().setBillerFieldInput(uIComponent, uIComponent.defaultValue(), true);
                        return;
                    }
                    return;
                case -1031434259:
                    if (strType.equals(numX49.tnTj78("bucPT"))) {
                        MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                        mayaPayBillsBIRFragment2.getClass();
                        String strPlaceholder = uIComponent.placeholder();
                        String string2 = kotlin.jvm.internal.j.b(strPlaceholder, numX49.tnTj78("bucPR")) ? mayaPayBillsBIRFragment2.getString(R.string.maya_label_pay_bills_enter_tin) : kotlin.jvm.internal.j.b(strPlaceholder, numX49.tnTj78("bucPp")) ? mayaPayBillsBIRFragment2.getString(R.string.maya_label_pay_bills_enter_tin_branch_code) : null;
                        Ci.b bVar2 = mayaPayBillsBIRFragment2.f13389J0;
                        if (bVar2 != null) {
                            bVar2.g(uIComponent, string2, new C1555h(mayaPayBillsBIRFragment2, uIComponent, 5), new C1557j(mayaPayBillsBIRFragment2, uIComponent, 5), new C1557j(mayaPayBillsBIRFragment2, uIComponent, 6), new C1557j(mayaPayBillsBIRFragment2, uIComponent, 7));
                            return;
                        } else {
                            kotlin.jvm.internal.j.n(strTnTj78);
                            throw null;
                        }
                    }
                    return;
                case 3076014:
                    if (strType.equals(numX49.tnTj78("bucPY"))) {
                        MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                        mayaPayBillsBIRFragment3.getClass();
                        Ci.b bVar3 = mayaPayBillsBIRFragment3.f13389J0;
                        if (bVar3 != null) {
                            bVar3.d(uIComponent, mayaPayBillsBIRFragment3.getString(R.string.maya_content_description_pay_bills_date), mayaPayBillsBIRFragment3.getString(R.string.maya_label_pay_bills_hint_return_date), new H0(1, mayaPayBillsBIRFragment3, uIComponent), new C1555h(mayaPayBillsBIRFragment3, uIComponent, 7), new C1554g(mayaPayBillsBIRFragment3, 7), new C1557j(mayaPayBillsBIRFragment3, uIComponent, 9));
                            return;
                        } else {
                            kotlin.jvm.internal.j.n(strTnTj78);
                            throw null;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void p() {
        int i = 2;
        int i4 = 0;
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).O1();
        Ah.p pVarC = this.e.c(this.f8617x);
        W w6 = this.h;
        Ah.p<Response<Void>> formSeriesHead = w6.f11401b.getFormSeriesHead();
        V v7 = new V(w6, 1);
        formSeriesHead.getClass();
        Lh.f fVar = new Lh.f(new Lh.d(new Lh.f(formSeriesHead, v7, 0), new V(w6, i), i), new com.google.firebase.messaging.n(23), 0);
        Favorite favorite = this.m;
        if (favorite != null) {
            e(new Lh.d(new Lh.d(new Lh.h(Ah.p.k(pVarC, fVar, new Lh.i(this.i.b(favorite != null ? favorite.mId() : null).d(n.c), null, new C2342a(null)), new T3.l(this, 21)), zh.b.a(), 0), new p(this, 1), i), new q(this, 1), i4).e());
        } else {
            e(new Lh.d(new Lh.d(new Lh.h(Ah.p.l(pVarC, fVar, n.f8595b), zh.b.a(), 0), new q(this, 0), i), new r(this, i4), i4).e());
        }
    }

    public final BillerInput.Builder q() {
        BillerInput.Builder builder = this.f8605k;
        if (builder != null) {
            return builder;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bucP1"));
        throw null;
    }

    public final void r(UIComponent uIComponent, String str) {
        kotlin.jvm.internal.j.g(uIComponent, numX49.tnTj78("bucPn"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucPx"));
        if (C2576A.H(str)) {
            s(uIComponent);
            return;
        }
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).W1(uIComponent.parameter());
    }

    public final void s(UIComponent uIComponent) {
        kotlin.jvm.internal.j.g(uIComponent, numX49.tnTj78("bucPs"));
        String strParameter = uIComponent.parameter();
        if (!uIComponent.required()) {
            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).W1(strParameter);
            kotlin.jvm.internal.j.d(strParameter);
            v(strParameter, true);
            return;
        }
        ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).e2(strParameter, uIComponent.placeholder());
        Ci.b bVar = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13389J0;
        if (bVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bucPI"));
            throw null;
        }
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((HashMap) bVar.f).get(strParameter);
        if (mayaInputLayout != null) {
            mayaInputLayout.p();
            mayaInputLayout.s();
        }
        kotlin.jvm.internal.j.d(strParameter);
        v(strParameter, false);
        ga.c cVar = (ga.c) this.c.get();
        String strPlaceholder = uIComponent.placeholder();
        kotlin.jvm.internal.j.f(strPlaceholder, numX49.tnTj78("bucP5"));
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar;
        mayaPayBillsBIRFragment.getClass();
        String string = mayaPayBillsBIRFragment.getString(R.string.maya_error_pay_bills_missing_field, strPlaceholder);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bucPJ"));
        ((s) mayaPayBillsBIRFragment.V1()).t(strPlaceholder, string);
    }

    public final void t(String str, String str2) {
        BillerDetails billerDetails;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucPq"));
        if (!this.f8603d.e().isBillsPayEventsV2Enabled() || (billerDetails = this.f8616w) == null) {
            return;
        }
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
        mayaPayBillsBIRFragment.getClass();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("bucPz"));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("bucPl"), str);
        map.put(numX49.tnTj78("bucPW"), str2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategory = billerDetails.mCategory();
        if (strMCategory != null) {
            c1219hE.j.put(numX49.tnTj78("bucb9"), strMCategory);
        }
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategorySlug = billerDetails.mCategorySlug();
        if (strMCategorySlug != null) {
            c1219hE.j.put(numX49.tnTj78("bucbP"), strMCategorySlug);
        }
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        String strMName = billerDetails.mName();
        if (strMName != null) {
            c1219hE.j.put(numX49.tnTj78("bucbb"), strMName);
        }
        c1219hE.k(EnumC1212a.BILLER_SLUG, billerDetails.mSlug());
        mayaPayBillsBIRFragment.o1().b(c1219hE);
    }

    public final void u(int i, String str) {
        if (this.f8603d.e().isBillsPayEventsV2Enabled()) {
            Biller biller = this.f8618y;
            Map mapH = biller != null ? M.h(new Pair(EnumC1212a.CATEGORY_SLUG, biller.mCategorySlug()), new Pair(EnumC1212a.CATEGORY_NAME, biller.mCategory()), new Pair(EnumC1212a.BILLER_SLUG, biller.mSlug()), new Pair(EnumC1212a.BILLER_NAME, biller.mName())) : L.c(new Pair(EnumC1212a.BILLER_SLUG, this.f8617x));
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
            mayaPayBillsBIRFragment.getClass();
            C1219h c1219hE = C1219h.e(numX49.tnTj78("bucb2"));
            String strValueOf = String.valueOf(i);
            HashMap map = c1219hE.j;
            map.put(numX49.tnTj78("bucbL"), strValueOf);
            map.put(numX49.tnTj78("bucbr"), str);
            map.put(numX49.tnTj78("bucbZ"), numX49.tnTj78("bucbk"));
            for (Map.Entry entry : mapH.entrySet()) {
                c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            mayaPayBillsBIRFragment.o1().b(c1219hE);
        }
    }

    public final void v(String str, boolean z4) {
        Object next;
        Iterator it = this.f8614u.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map) next).containsKey(str)) {
                    break;
                }
            }
        }
        Map map = (Map) next;
        if (map != null) {
            map.put(str, Boolean.valueOf(z4));
        }
    }

    public final void w() {
        final int i = 1;
        final int i4 = 0;
        v(numX49.tnTj78("bucbB"), false);
        final MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
        AppCompatEditText appCompatEditText = mayaPayBillsBIRFragment.f13397s0;
        String strTnTj78 = numX49.tnTj78("bucbu");
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        appCompatEditText.setOnFocusChangeListener(new ha.k(mayaPayBillsBIRFragment, 1));
        aa.b bVarV1 = mayaPayBillsBIRFragment.V1();
        Ci.b bVar = mayaPayBillsBIRFragment.f13389J0;
        String strTnTj782 = numX49.tnTj78("bucbV");
        if (bVar == null) {
            kotlin.jvm.internal.j.n(strTnTj782);
            throw null;
        }
        AppCompatEditText appCompatEditText2 = mayaPayBillsBIRFragment.f13397s0;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        Gh.f fVarI = Ci.b.i(of.p.E(appCompatEditText2), new Function1() { // from class: ha.l
            /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ha.l.invoke(java.lang.Object):java.lang.Object");
            }
        });
        if (mayaPayBillsBIRFragment.f13389J0 == null) {
            kotlin.jvm.internal.j.n(strTnTj782);
            throw null;
        }
        AppCompatEditText appCompatEditText3 = mayaPayBillsBIRFragment.t0;
        if (appCompatEditText3 == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bucbS"));
            throw null;
        }
        ((s) bVarV1).j.c((io.reactivex.rxjava3.disposables.b[]) Arrays.copyOf(new io.reactivex.rxjava3.disposables.b[]{fVarI, Ci.b.i(of.p.E(appCompatEditText3), new Function1() { // from class: ha.l
            /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ha.l.invoke(java.lang.Object):java.lang.Object");
            }
        })}, 2));
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
        AppCompatEditText appCompatEditText4 = mayaPayBillsBIRFragment2.f13397s0;
        if (appCompatEditText4 != null) {
            appCompatEditText4.addTextChangedListener(new G5.A((Function0) null, new C1554g(mayaPayBillsBIRFragment2, 5), new C1554g(mayaPayBillsBIRFragment2, 6), 9));
        } else {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
    }

    public final void x(BillerDetails billerDetails) {
        List<String> listMNotes;
        if (billerDetails != null) {
            BillerMetadata billerMetadataMMetadata = billerDetails.mMetadata();
            String strTnTj78 = numX49.tnTj78("bucbj");
            if (billerMetadataMMetadata == null || (listMNotes = billerMetadataMMetadata.mNotes()) == null) {
                Group group = ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).f13386F0;
                if (group == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                group.setVisibility(8);
            } else {
                List<String> list = listMNotes;
                ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()) + numX49.tnTj78("bucbd"));
                }
                ga.c cVar = (ga.c) this.c.get();
                int size = listMNotes.size();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar;
                TextView textView = mayaPayBillsBIRFragment.f13387G0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbE"));
                    throw null;
                }
                textView.setText(mayaPayBillsBIRFragment.requireContext().getResources().getQuantityText(R.plurals.maya_label_pay_bills_reminder, size));
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                Group group2 = mayaPayBillsBIRFragment2.f13386F0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                group2.setVisibility(0);
                TextView textView2 = mayaPayBillsBIRFragment2.f13388H0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbi"));
                    throw null;
                }
                textView2.setText(com.paymaya.common.utility.C.k(arrayList));
            }
            BillerMetadata billerMetadataMMetadata2 = billerDetails.mMetadata();
            String strMAccountNumberPlaceHolder = billerMetadataMMetadata2 != null ? billerMetadataMMetadata2.mAccountNumberPlaceHolder() : null;
            String strTnTj782 = numX49.tnTj78("bucbF");
            if (strMAccountNumberPlaceHolder == null || C2576A.H(strMAccountNumberPlaceHolder)) {
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                MayaInputLayout mayaInputLayout = mayaPayBillsBIRFragment3.f13396r0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                String strTnTj783 = numX49.tnTj78("bucbH");
                mayaInputLayout.setLabel(strTnTj783);
                MayaInputLayout mayaInputLayout2 = mayaPayBillsBIRFragment3.f13396r0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout2.o(strTnTj783, false);
            } else {
                ga.c cVar2 = (ga.c) this.c.get();
                String strMAccountNumberPlaceHolder2 = billerMetadataMMetadata2 != null ? billerMetadataMMetadata2.mAccountNumberPlaceHolder() : null;
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment4 = (MayaPayBillsBIRFragment) cVar2;
                MayaInputLayout mayaInputLayout3 = mayaPayBillsBIRFragment4.f13396r0;
                if (mayaInputLayout3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout3.setLabel(strMAccountNumberPlaceHolder2);
                MayaInputLayout mayaInputLayout4 = mayaPayBillsBIRFragment4.f13396r0;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout4.o(strMAccountNumberPlaceHolder2, false);
            }
            BillerMetadata billerMetadataMMetadata3 = billerDetails.mMetadata();
            String strMAmountPlaceHolder = billerMetadataMMetadata3 != null ? billerMetadataMMetadata3.mAmountPlaceHolder() : null;
            String strTnTj784 = numX49.tnTj78("bucbO");
            if (strMAmountPlaceHolder == null || C2576A.H(strMAmountPlaceHolder)) {
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment5 = (MayaPayBillsBIRFragment) ((ga.c) this.c.get());
                MayaInputLayout mayaInputLayout5 = mayaPayBillsBIRFragment5.u0;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj784);
                    throw null;
                }
                String strTnTj785 = numX49.tnTj78("bucbQ");
                mayaInputLayout5.setLabel(strTnTj785);
                MayaInputLayout mayaInputLayout6 = mayaPayBillsBIRFragment5.u0;
                if (mayaInputLayout6 != null) {
                    mayaInputLayout6.o(strTnTj785, true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj784);
                    throw null;
                }
            }
            ga.c cVar3 = (ga.c) this.c.get();
            String strMAmountPlaceHolder2 = billerMetadataMMetadata3 != null ? billerMetadataMMetadata3.mAmountPlaceHolder() : null;
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment6 = (MayaPayBillsBIRFragment) cVar3;
            MayaInputLayout mayaInputLayout7 = mayaPayBillsBIRFragment6.u0;
            if (mayaInputLayout7 == null) {
                kotlin.jvm.internal.j.n(strTnTj784);
                throw null;
            }
            mayaInputLayout7.setLabel(strMAmountPlaceHolder2);
            MayaInputLayout mayaInputLayout8 = mayaPayBillsBIRFragment6.u0;
            if (mayaInputLayout8 != null) {
                mayaInputLayout8.o(strMAmountPlaceHolder2, true);
            } else {
                kotlin.jvm.internal.j.n(strTnTj784);
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s.y():void");
    }

    public final void z(PayMayaError payMayaError) {
        if (payMayaError.isSessionTimeout()) {
            ((MayaPayBillsBIRFragment) ((ga.c) this.c.get())).L1();
            return;
        }
        if (payMayaError.isNetworkError()) {
            ga.c cVar = (ga.c) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar;
            mayaPayBillsBIRFragment.getClass();
            MayaBaseLoadingFragment.N1(mayaPayBillsBIRFragment, 100, strMSpiel, null, new ViewOnClickListenerC1553f(mayaPayBillsBIRFragment, 2), 28);
            return;
        }
        ga.c cVar2 = (ga.c) this.c.get();
        String strMSpiel2 = payMayaError.mSpiel();
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) cVar2;
        mayaPayBillsBIRFragment2.getClass();
        MayaBaseLoadingFragment.N1(mayaPayBillsBIRFragment2, 200, strMSpiel2, null, new ViewOnClickListenerC1553f(mayaPayBillsBIRFragment2, 3), 28);
    }
}
