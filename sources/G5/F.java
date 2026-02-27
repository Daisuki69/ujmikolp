package G5;

import N5.C0479t;
import N5.E1;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import re.InterfaceC2202b;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1722b;

    public /* synthetic */ F(Object obj, int i) {
        this.f1721a = i;
        this.f1722b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void f(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void g(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void h(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void i(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void j(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void k(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void l(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s9) {
        switch (this.f1721a) {
            case 0:
                G g8 = (G) this.f1722b;
                int i = g8.f1724b;
                AppCompatEditText appCompatEditText = g8.f1723a;
                appCompatEditText.setSelection(i);
                appCompatEditText.removeTextChangedListener(this);
                return;
            case 1:
                return;
            case 2:
                if (((MayaSendMoneyFragment) this.f1722b).f13803e1 && s9 != null) {
                    s9.clear();
                }
                Ab.b bVarP1 = ((MayaSendMoneyFragment) this.f1722b).P1();
                if (s9 != null) {
                    s9.toString();
                }
                Bb.n nVar = (Bb.n) bVarP1;
                nVar.A();
                nVar.z();
                if (nVar.q() || com.paymaya.common.utility.C.a0(((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).Q1())) {
                    ConstraintLayout constraintLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13788O0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConstraintLayoutDecorationPersonalization");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout2 = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13788O0;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintLayoutDecorationPersonalization");
                    throw null;
                }
            case 3:
                return;
            case 4:
                J8.k kVar = ((MayaKycSingleSelectionBottomSheetDialogFragment) this.f1722b).f12610V;
                if (kVar == null) {
                    kotlin.jvm.internal.j.n("singleSelectionAdapter");
                    throw null;
                }
                String strValueOf = String.valueOf(s9);
                List list = kVar.f2473a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (C2576A.x(((KycSelectionItem) obj).getText(), strValueOf, true)) {
                        arrayList.add(obj);
                    }
                }
                kVar.e = arrayList;
                kVar.notifyDataSetChanged();
                boolean zIsEmpty = kVar.e.isEmpty();
                MayaKycSingleSelectionBottomSheetDialogFragment mayaKycSingleSelectionBottomSheetDialogFragment = kVar.f2475d;
                if (zIsEmpty) {
                    ((C0479t) mayaKycSingleSelectionBottomSheetDialogFragment.s1()).c.setVisibility(0);
                    return;
                } else {
                    ((C0479t) mayaKycSingleSelectionBottomSheetDialogFragment.s1()).c.setVisibility(8);
                    return;
                }
            case 5:
            case 6:
                return;
            case 7:
                Wb.b bVarY1 = ((MayaShopPaymentFragment) this.f1722b).Y1();
                String strValueOf2 = String.valueOf(s9);
                Xb.o oVar = (Xb.o) bVarY1;
                if (strValueOf2.length() == 0) {
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).X1();
                    mayaAutoCompleteInputLayoutX1.f11986t = false;
                    mayaAutoCompleteInputLayoutX1.c();
                } else {
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX12 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).X1();
                    mayaAutoCompleteInputLayoutX12.f11986t = true;
                    mayaAutoCompleteInputLayoutX12.c();
                }
                oVar.u(strValueOf2);
                return;
            default:
                kotlin.jvm.internal.j.g(s9, "s");
                if (((ShopV3PaymentFragment) this.f1722b).f14822k0) {
                    s9.clear();
                }
                InterfaceC2202b interfaceC2202bG1 = ((ShopV3PaymentFragment) this.f1722b).G1();
                String recipientText = s9.toString();
                se.f fVar = (se.f) interfaceC2202bG1;
                kotlin.jvm.internal.j.g(recipientText, "recipientText");
                if (recipientText.length() == 0) {
                    ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).J1();
                    E1 e12 = ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14814c0;
                    kotlin.jvm.internal.j.d(e12);
                    e12.f3611y.setVisibility(0);
                    return;
                }
                E1 e13 = ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14814c0;
                kotlin.jvm.internal.j.d(e13);
                e13.f3611y.setVisibility(8);
                E1 e14 = ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14814c0;
                kotlin.jvm.internal.j.d(e14);
                e14.e.setVisibility(0);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f1721a) {
            case 0:
            case 1:
                break;
            case 2:
                Bb.n nVar = (Bb.n) ((MayaSendMoneyFragment) this.f1722b).P1();
                ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13803e1 = false;
                if (!C2576A.H(((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13801c1) && i6 < i4) {
                    MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
                    mayaSendMoneyFragment.getClass();
                    mayaSendMoneyFragment.f13800b1 = "";
                    MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
                    mayaSendMoneyFragment2.getClass();
                    mayaSendMoneyFragment2.f13801c1 = "";
                    ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13803e1 = true;
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                Xb.o oVar = (Xb.o) ((MayaShopPaymentFragment) this.f1722b).Y1();
                String str = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).f14038x0;
                if (str != null && str.length() != 0 && i4 <= 0) {
                    MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                    mayaShopPaymentFragment.getClass();
                    mayaShopPaymentFragment.f14038x0 = "";
                    MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                    mayaShopPaymentFragment2.getClass();
                    mayaShopPaymentFragment2.w0 = "";
                    break;
                }
                break;
            default:
                se.f fVar = (se.f) ((ShopV3PaymentFragment) this.f1722b).G1();
                ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14822k0 = false;
                String str2 = ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14821j0;
                if (str2 != null && str2.length() != 0 && i6 <= 0) {
                    ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((ve.e) fVar.c.get());
                    shopV3PaymentFragment.getClass();
                    shopV3PaymentFragment.f14821j0 = "";
                    ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) ((ve.e) fVar.c.get());
                    shopV3PaymentFragment2.getClass();
                    shopV3PaymentFragment2.f14820i0 = "";
                    ((ShopV3PaymentFragment) ((ve.e) fVar.c.get())).f14822k0 = true;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s9, int i, int i4, int i6) {
        String string;
        String string2;
        String str = "";
        switch (this.f1721a) {
            case 0:
                return;
            case 1:
                B9.c cVarS1 = ((MayaMissionsEnterCodeBottomSheetFragment) this.f1722b).s1();
                String string3 = s9 != null ? s9.toString() : null;
                if (string3 == null || C2576A.H(string3)) {
                    Button button = ((MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVarS1.c.get())).f12995a0;
                    if (button != null) {
                        button.setEnabled(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConfirmButton");
                        throw null;
                    }
                }
                Button button2 = ((MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVarS1.c.get())).f12995a0;
                if (button2 != null) {
                    button2.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConfirmButton");
                    throw null;
                }
            case 2:
                return;
            case 3:
                ((MayaCashInViaCardFormFragment) this.f1722b).H1().k();
                return;
            case 4:
                MayaKycSingleSelectionBottomSheetDialogFragment mayaKycSingleSelectionBottomSheetDialogFragment = (MayaKycSingleSelectionBottomSheetDialogFragment) this.f1722b;
                com.paymaya.data.preference.a aVar = mayaKycSingleSelectionBottomSheetDialogFragment.f12611W;
                if (aVar == null) {
                    kotlin.jvm.internal.j.n("mPreference");
                    throw null;
                }
                if (aVar.e().isKycUxTofuRedesignEnabled() && mayaKycSingleSelectionBottomSheetDialogFragment.u1()) {
                    return;
                }
                if (s9 == null || s9.length() != 0) {
                    ((C0479t) mayaKycSingleSelectionBottomSheetDialogFragment.s1()).f4211b.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_search_light, 0, R.drawable.maya_ic_close, 0);
                    return;
                } else {
                    ((C0479t) mayaKycSingleSelectionBottomSheetDialogFragment.s1()).f4211b.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_search_light, 0, 0, 0);
                    return;
                }
            case 5:
                KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) this.f1722b;
                Function1<String, Unit> onTextChangeListener = kycMayaInputLayout.getOnTextChangeListener();
                if (onTextChangeListener != null) {
                    if (s9 != null && (string = s9.toString()) != null) {
                        str = string;
                    }
                    onTextChangeListener.invoke(str);
                }
                if (kycMayaInputLayout.m && kycMayaInputLayout.f12696l) {
                    kycMayaInputLayout.f12696l = false;
                    kycMayaInputLayout.d();
                    return;
                }
                return;
            case 6:
                A7.j jVarS1 = ((MayaDisplayNamePasswordBottomSheetDialogFragment) this.f1722b).s1();
                String string4 = s9 != null ? s9.toString() : null;
                if (string4 == null || C2576A.H(string4)) {
                    Button button3 = ((MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVarS1.c.get())).f13857W;
                    if (button3 != null) {
                        button3.setEnabled(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConfirmButton");
                        throw null;
                    }
                }
                Button button4 = ((MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVarS1.c.get())).f13857W;
                if (button4 != null) {
                    button4.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConfirmButton");
                    throw null;
                }
            case 7:
                Wb.b bVarY1 = ((MayaShopPaymentFragment) this.f1722b).Y1();
                if (s9 == null || (string2 = s9.toString()) == null) {
                    string2 = "";
                }
                Xb.o oVar = (Xb.o) bVarY1;
                MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                mayaShopPaymentFragment.getClass();
                mayaShopPaymentFragment.w0 = "";
                if (string2.length() == 0) {
                    MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = mayaShopPaymentFragment2.X1();
                    String string5 = mayaShopPaymentFragment2.getString(R.string.maya_label_account_number);
                    kotlin.jvm.internal.j.f(string5, "getString(...)");
                    mayaAutoCompleteInputLayoutX1.requestFocus();
                    mayaAutoCompleteInputLayoutX1.setHelperErrorText(mayaShopPaymentFragment2.getString(R.string.maya_error_pay_bills_missing_field, string5));
                    mayaAutoCompleteInputLayoutX1.f11984r = true;
                    mayaAutoCompleteInputLayoutX1.c();
                } else {
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX12 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).X1();
                    mayaAutoCompleteInputLayoutX12.f11984r = false;
                    mayaAutoCompleteInputLayoutX12.c();
                }
                ProductV3 productV3 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).t0;
                if (productV3 != null) {
                    oVar.x(productV3);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.j.g(s9, "s");
                ((ShopV3PaymentFragment) this.f1722b).G1();
                String string6 = s9.toString();
                kotlin.jvm.internal.j.g(string6, "string");
                return;
        }
    }
}
