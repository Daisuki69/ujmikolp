package C7;

import Ah.o;
import G6.v;
import G7.n;
import android.content.Intent;
import android.location.Location;
import android.text.Editable;
import android.view.View;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import pg.t;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f755b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f756d;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.f754a = i;
        this.f755b = obj;
        this.c = obj2;
        this.f756d = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
        Object obj2 = this.c;
        Object obj3 = this.f756d;
        Object obj4 = this.f755b;
        switch (this.f754a) {
            case 0:
                View it = (View) obj;
                int i = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) obj4;
                C1220i c1220iK1 = mayaDashboardActivity.k1();
                C1219h c1219hD = C1219h.d((EnumC1215d) obj2);
                c1219hD.r((EnumC1216e) obj3);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaDashboardActivity, c1219hD);
                mayaDashboardActivity.n1().s(mayaDashboardActivity, false);
                return Unit.f18162a;
            case 1:
                View it2 = (View) obj;
                int i4 = MayaSendMoneyActivity.f13736B;
                j.g(it2, "it");
                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) obj4;
                if (mayaSendMoneyActivity.p1().e().isAppEventV2SendMoneyEnabled()) {
                    mayaSendMoneyActivity.a2("Save details to favorites", "Send Money Favorite Screen");
                } else {
                    C1220i c1220iK12 = mayaSendMoneyActivity.k1();
                    C1219h c1219hD2 = C1219h.d(EnumC1215d.SEND_MONEY);
                    c1219hD2.r(enumC1216e);
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.FAVORITES);
                    c1219hD2.i();
                    c1220iK12.c(mayaSendMoneyActivity, c1219hD2);
                }
                mayaSendMoneyActivity.n1();
                TransferRecipient transferRecipientMTransferRecipient = ((Transfer) obj2).mTransferRecipient();
                Intent intent = new Intent(mayaSendMoneyActivity, (Class<?>) MayaAddFavoriteActivity.class);
                intent.putExtra("favorite_details", (FavoriteDetails) obj3);
                intent.putExtra("transfer_recipient", transferRecipientMTransferRecipient);
                intent.putExtra("is_result", true);
                mayaSendMoneyActivity.f13746w.launch(intent);
                return Unit.f18162a;
            case 2:
                Map processedMap = (Map) obj;
                j.g(processedMap, "processedMap");
                t tVar = (t) obj2;
                j.d(tVar);
                ((n) obj4).o(processedMap, tVar);
                ((u) obj3).f18191a = true;
                return Unit.f18162a;
            case 3:
                View it3 = (View) obj;
                int i6 = MayaCashInActivity.f11609r;
                j.g(it3, "it");
                ((i) obj4).invoke((ExecutePullFunds) obj2, (BankPullPaymentOption) obj3);
                return Unit.f18162a;
            case 4:
                Location location = (Location) obj;
                Ne.d dVar = (Ne.d) obj4;
                N9.f fVar = (N9.f) obj2;
                Ag.j jVar = (Ag.j) obj3;
                Dh.c cVar = dVar.h;
                if (location != null) {
                    Ne.a aVar = new Ne.a(dVar, location.getLatitude(), location.getLongitude());
                    o oVarA = zh.b.a();
                    Gh.d dVar2 = new Gh.d(1, new v(jVar, 23), new Gc.h(fVar, 21));
                    try {
                        Lh.g gVar = new Lh.g(dVar2, oVarA);
                        try {
                            Lh.a aVar2 = new Lh.a(gVar);
                            gVar.a(aVar2);
                            try {
                                aVar.a(aVar2);
                            } catch (Throwable th2) {
                                AbstractC0983W.G(th2);
                                aVar2.a(th2);
                            }
                            cVar.c(dVar2, dVar.a(null, null));
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (Throwable th3) {
                            AbstractC0983W.G(th3);
                            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                            nullPointerException.initCause(th3);
                            throw nullPointerException;
                        }
                    } catch (NullPointerException e7) {
                        throw e7;
                    } catch (Throwable th4) {
                        throw AbstractC1213b.L(th4, "subscribeActual failed", th4);
                    }
                    break;
                } else {
                    cVar.a(dVar.a(fVar, jVar));
                }
                return Unit.f18162a;
            case 5:
                MayaDropDown mayaDropDown = (MayaDropDown) obj4;
                mayaDropDown.post(new I6.a(13, mayaDropDown, (Function2) obj2, (FieldType) obj3));
                return Unit.f18162a;
            case 6:
                String submissionDetails = (String) obj;
                int i10 = MayaLoansCreditCardActivity.f12712u;
                j.g(submissionDetails, "submissionDetails");
                MayaLoansCreditCardActivity mayaLoansCreditCardActivity = (MayaLoansCreditCardActivity) obj4;
                LinkedHashSet linkedHashSet = E.f10412a;
                E.a("MayaLoansCreditCardActivity", "onSubmitSuccess ".concat(submissionDetails));
                FlutterEngineCache.getInstance().remove("loansCreditCard");
                mayaLoansCreditCardActivity.X1();
                Object obj5 = ((LinkedHashMap) mayaLoansCreditCardActivity.W1().n()).get("loans_credit_card_maya_black_phase2");
                Boolean bool = Boolean.TRUE;
                if (j.b(obj5, bool)) {
                    t tVar2 = mayaLoansCreditCardActivity.f12719t;
                    if (tVar2 != null) {
                        tVar2.success(bool);
                    }
                    mayaLoansCreditCardActivity.f12719t = null;
                } else {
                    StringBuilder sb2 = new StringBuilder("ccReviewingApplicationScreen?");
                    sb2.append("product_key=" + ((String) obj2) + "&");
                    sb2.append("loan_application_id=".concat((String) obj3));
                    String string = sb2.toString();
                    mayaLoansCreditCardActivity.n1();
                    B5.i.y(mayaLoansCreditCardActivity, string);
                }
                return Unit.f18162a;
            case 7:
                View it4 = (View) obj;
                int i11 = MayaPayBillsActivity.f13334x;
                j.g(it4, "it");
                MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) obj4;
                C1220i c1220iK13 = mayaPayBillsActivity.k1();
                C1219h c1219hD3 = C1219h.d(EnumC1215d.PAY_BILLS);
                c1219hD3.r(enumC1216e);
                c1219hD3.n(17);
                c1219hD3.t(EnumC1217f.FAVORITES);
                c1219hD3.i();
                c1220iK13.c(mayaPayBillsActivity, c1219hD3);
                mayaPayBillsActivity.n1();
                Intent intent2 = new Intent(mayaPayBillsActivity, (Class<?>) MayaAddFavoriteActivity.class);
                intent2.putExtra("favorite_details", (FavoriteDetails) obj3);
                intent2.putExtra("biller_transaction", (BillerTransaction) obj2);
                intent2.putExtra("is_result", true);
                mayaPayBillsActivity.f13343v.launch(intent2);
                return Unit.f18162a;
            default:
                ((Boolean) obj).booleanValue();
                MayaInputLayout mayaInputLayout = (MayaInputLayout) obj4;
                Editable text = mayaInputLayout.getInputEditText().getText();
                String string2 = text != null ? text.toString() : null;
                MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) obj3;
                if (string2 == null || C2576A.H(string2)) {
                    MayaInputLayout mayaInputLayout2 = (MayaInputLayout) obj2;
                    mayaInputLayout2.setHelperErrorText(mayaBankTransferFormFragment.getString(R.string.pma_error_missing_field, mayaInputLayout.getLabel()));
                    mayaInputLayout2.p();
                    mayaInputLayout2.r();
                }
                boolean z4 = mayaInputLayout.f12073w;
                mayaBankTransferFormFragment.T1(mayaBankTransferFormFragment.Q1(mayaInputLayout), z4 ? mayaInputLayout.getHelperErrorSpielTextView().getText().toString() : null, z4);
                return Unit.f18162a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(Function2 function2, ExecutePullFunds executePullFunds, BankPullPaymentOption bankPullPaymentOption) {
        this.f754a = 3;
        this.f755b = (i) function2;
        this.c = executePullFunds;
        this.f756d = bankPullPaymentOption;
    }
}
