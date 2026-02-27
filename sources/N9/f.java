package N9;

import B5.i;
import L9.C0325c;
import M8.M1;
import Ng.AbstractC0493a;
import Q6.o;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.datastore.core.CorruptionException;
import b3.C0868H;
import b3.C0869I;
import cc.InterfaceC1097j;
import cj.AbstractC1115a;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.V;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.dataprivacy.view.activity.impl.MayaDataPrivacyActivity;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditOTPFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFormFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import g9.InterfaceC1507b;
import h9.C1547f;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import t3.C2268a;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4347b;

    public /* synthetic */ f(Object obj, int i) {
        this.f4346a = i;
        this.f4347b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        V[] allowedQRPHCodeTypes;
        io.reactivex.rxjava3.disposables.b bVar;
        InterfaceC1097j interfaceC1097j;
        switch (this.f4346a) {
            case 0:
                ActivityResult result = (ActivityResult) obj;
                int i = NewMayaCreditActivity.f13081x;
                j.g(result, "result");
                ((f) this.f4347b).invoke(result);
                return Unit.f18162a;
            case 1:
                List barcodes = (List) obj;
                j.g(barcodes, "barcodes");
                Iterator it = barcodes.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) this.f4347b;
                    if (!zHasNext) {
                        if (barcodes.isEmpty()) {
                            ((Ja.b) mayaMLKitQRScannerFragment.H1()).l();
                        }
                        v3.d dVar = mayaMLKitQRScannerFragment.f13593l0;
                        if (dVar != null) {
                            try {
                                dVar.close();
                            } catch (IOException unused) {
                                yk.a.b();
                            }
                            break;
                        }
                        return Unit.f18162a;
                    }
                    C2268a c2268a = (C2268a) it.next();
                    if (!C.e(c2268a.f20149a.a())) {
                        Ia.a aVarH1 = mayaMLKitQRScannerFragment.H1();
                        String strA = c2268a.f20149a.a();
                        j.d(strA);
                        Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                        if (eVar == null || (allowedQRPHCodeTypes = ((MayaQRActivity) eVar).V1()) == null) {
                            allowedQRPHCodeTypes = V.values();
                        }
                        Ja.b bVar2 = (Ja.b) aVarH1;
                        j.g(allowedQRPHCodeTypes, "allowedQRPHCodeTypes");
                        if (!bVar2.f) {
                            bVar2.o(strA, 1, allowedQRPHCodeTypes);
                        }
                    }
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                ((Ja.f) ((MayaRequestMoneyFormFragment) this.f4347b).r1()).k();
                return Unit.f18162a;
            case 3:
                Hh.b bVar3 = (Hh.b) this.f4347b;
                Object obj2 = bVar3.get();
                Dh.a aVar = Dh.a.f1154a;
                if (obj2 != aVar && (bVar = (io.reactivex.rxjava3.disposables.b) bVar3.getAndSet(aVar)) != aVar) {
                    try {
                        ((Ah.b) bVar3.f2176b).onComplete();
                    } finally {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                    }
                }
                return Unit.f18162a;
            case 4:
                Byte b8 = (Byte) obj;
                byte bByteValue = b8.byteValue();
                StringBuilder sb2 = (StringBuilder) this.f4347b;
                if (bByteValue == 32) {
                    sb2.append("%20");
                } else if (AbstractC0493a.f4419a.contains(b8) || AbstractC0493a.c.contains(b8)) {
                    sb2.append((char) bByteValue);
                } else {
                    sb2.append(AbstractC0493a.g(bByteValue));
                }
                return Unit.f18162a;
            case 5:
                View it2 = (View) obj;
                int i4 = MayaDataPrivacyActivity.f12260s;
                j.g(it2, "it");
                ((MayaDataPrivacyActivity) this.f4347b).finish();
                return Unit.f18162a;
            case 6:
                O.d templateContext = (O.d) this.f4347b;
                j.g(templateContext, "$templateContext");
                templateContext.a();
                return Unit.f18162a;
            case 7:
                PayMayaError payMayaError = (PayMayaError) obj;
                X6.f fVar = (X6.f) ((o) this.f4347b).c.get();
                String strValueOf = String.valueOf(payMayaError != null ? payMayaError.mSpiel() : null);
                MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) fVar;
                Y6.j jVar = mayaSessionExpiredFragment.f11935f0;
                if (jVar != null) {
                    ((MayaSessionExpiredActivity) jVar).X1(2131231238, mayaSessionExpiredFragment.getString(R.string.maya_label_unable_to_log_you_in), strValueOf);
                }
                return Unit.f18162a;
            case 8:
                ActivityResult result2 = (ActivityResult) obj;
                j.g(result2, "result");
                int resultCode = result2.getResultCode();
                MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment = (MayaCreditConfirmTransferFragment) this.f4347b;
                if (resultCode == 1011 || resultCode == 1015) {
                    ((C0325c) mayaCreditConfirmTransferFragment.G1()).m();
                } else if (resultCode == 1016) {
                    ((C0325c) mayaCreditConfirmTransferFragment.G1()).k();
                }
                return Unit.f18162a;
            case 9:
                NewMayaCreditOTPFragment newMayaCreditOTPFragment = (NewMayaCreditOTPFragment) this.f4347b;
                Object obj3 = newMayaCreditOTPFragment.f13299k0;
                if (obj3 != null) {
                    ((l) obj3).V1(newMayaCreditOTPFragment);
                }
                return Unit.f18162a;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb3 = new StringBuilder();
                Rj.e eVar2 = (Rj.e) this.f4347b;
                sb3.append(eVar2.f[iIntValue]);
                sb3.append(": ");
                sb3.append(eVar2.f5564g[iIntValue].h());
                return sb3.toString();
            case 11:
                MayaChangeMinOTPFragment mayaChangeMinOTPFragment = (MayaChangeMinOTPFragment) this.f4347b;
                Object obj4 = mayaChangeMinOTPFragment.f13945k0;
                if (obj4 != null) {
                    ((l) obj4).V1(mayaChangeMinOTPFragment);
                }
                return Unit.f18162a;
            case 12:
                ActivityResult result3 = (ActivityResult) obj;
                int i6 = MayaSessionExpiredActivity.f11789v;
                j.g(result3, "result");
                ((M1) this.f4347b).invoke(result3);
                return Unit.f18162a;
            case 13:
                ActivityResult result4 = (ActivityResult) obj;
                int i10 = MayaSessionExpiredActivity.f11789v;
                j.g(result4, "result");
                ((C7.f) this.f4347b).invoke(result4);
                return Unit.f18162a;
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                StringBuilder sb4 = new StringBuilder();
                Tj.o oVar = (Tj.o) this.f4347b;
                sb4.append(oVar.e[iIntValue2]);
                sb4.append(": ");
                sb4.append(oVar.g(iIntValue2).h());
                return sb4.toString();
            case 15:
                Pair urlMeta = (Pair) obj;
                W.e eVar3 = (W.e) this.f4347b;
                j.g(urlMeta, "urlMeta");
                String str = (String) urlMeta.f18160a;
                int iOrdinal = ((Q.a) urlMeta.f18161b).ordinal();
                Ag.l lVar = eVar3.f6162a;
                if (iOrdinal == 0) {
                    return ((T.b) lVar.invoke()).f(str);
                }
                if (iOrdinal == 1) {
                    return ((T.b) lVar.invoke()).e(str);
                }
                if (iOrdinal == 2) {
                    return ((T.b) lVar.invoke()).d(str);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                View it3 = (View) obj;
                int i11 = MayaLoansCreditCardActivity.f12712u;
                j.g(it3, "it");
                MayaLoansCreditCardActivity mayaLoansCreditCardActivity = (MayaLoansCreditCardActivity) this.f4347b;
                C1220i c1220iK1 = mayaLoansCreditCardActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.LOANS_CREDIT_CARD);
                c1219hD.r(EnumC1216e.DASHBOARD);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaLoansCreditCardActivity, c1219hD);
                mayaLoansCreditCardActivity.n1().s(mayaLoansCreditCardActivity, false);
                return Unit.f18162a;
            case 17:
                PayMayaError payMayaError2 = (PayMayaError) obj;
                InterfaceC1507b interfaceC1507b = (InterfaceC1507b) ((Z8.c) this.f4347b).c.get();
                String strValueOf2 = String.valueOf(payMayaError2 != null ? payMayaError2.mSpiel() : null);
                MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) interfaceC1507b;
                h9.j jVar2 = mayaLoginFragment.f12788h0;
                if (jVar2 != null) {
                    ((MayaLoginActivity) jVar2).X1(2131231238, mayaLoginFragment.getString(R.string.maya_label_unable_to_log_you_in), strValueOf2);
                }
                return Unit.f18162a;
            case 18:
                View it4 = (View) obj;
                int i12 = MayaShopV2Activity.f13985B;
                j.g(it4, "it");
                ((W4.b) this.f4347b).invoke();
                return Unit.f18162a;
            case 19:
                View it5 = (View) obj;
                int i13 = MayaShopV2Activity.f13985B;
                j.g(it5, "it");
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) this.f4347b;
                C1220i c1220iK12 = mayaShopV2Activity.k1();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.SHOP);
                c1219hD2.r(EnumC1216e.DASHBOARD);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.UPGRADE_NOW);
                c1219hD2.i();
                c1220iK12.c(mayaShopV2Activity, c1219hD2);
                mayaShopV2Activity.n1().s(mayaShopV2Activity, false);
                return Unit.f18162a;
            case 20:
                MayaAddFavoriteActivity mayaAddFavoriteActivity = (MayaAddFavoriteActivity) this.f4347b;
                View it6 = (View) obj;
                int i14 = MayaAddFavoriteActivity.f12316o;
                j.g(it6, "it");
                Q6.l lVar2 = mayaAddFavoriteActivity.f12317n;
                if (lVar2 == null) {
                    j.n("mActivityPresenter");
                    throw null;
                }
                FavoriteDetails favoriteDetails = (FavoriteDetails) ((MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get())).getIntent().getParcelableExtra("favorite_details");
                BillerTransaction billerTransaction = (BillerTransaction) ((MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get())).getIntent().getParcelableExtra("biller_transaction");
                TransferRecipient transferRecipient = (TransferRecipient) ((MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get())).getIntent().getParcelableExtra("transfer_recipient");
                if (favoriteDetails == null || (billerTransaction == null && transferRecipient == null)) {
                    if (favoriteDetails != null) {
                        MayaAddFavoriteActivity mayaAddFavoriteActivity2 = (MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get());
                        mayaAddFavoriteActivity2.setResult(6);
                        mayaAddFavoriteActivity2.finish();
                    }
                } else if (((MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get())).getIntent().getBooleanExtra("is_result", false)) {
                    MayaAddFavoriteActivity mayaAddFavoriteActivity3 = (MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get());
                    mayaAddFavoriteActivity3.setResult(6);
                    mayaAddFavoriteActivity3.finish();
                } else {
                    MayaAddFavoriteActivity mayaAddFavoriteActivity4 = (MayaAddFavoriteActivity) ((Z7.a) lVar2.c.get());
                    mayaAddFavoriteActivity4.n1();
                    i.j(mayaAddFavoriteActivity4);
                }
                return Unit.f18162a;
            case 21:
                int i15 = MayaRegistrationV2Activity.f13663v;
                ((Nb.c) this.f4347b).invoke("denied");
                yk.a.d();
                return Unit.f18162a;
            case 22:
                ShopHomeSectionItem it7 = (ShopHomeSectionItem) obj;
                j.g(it7, "it");
                return Boolean.valueOf(it7.getViewType() == ((ShopHomeSectionItem.VIEW_TYPE) this.f4347b));
            case 23:
                CorruptionException ex = (CorruptionException) obj;
                j.g(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new C0868H(((C0869I) this.f4347b).f8391a.a(null), null, null);
            case 24:
                ActivityResult result5 = (ActivityResult) obj;
                int i16 = MayaLoginActivity.f12721v;
                j.g(result5, "result");
                ((eb.g) this.f4347b).invoke(result5);
                return Unit.f18162a;
            case 25:
                ActivityResult result6 = (ActivityResult) obj;
                int i17 = MayaLoginActivity.f12721v;
                j.g(result6, "result");
                ((C7.f) this.f4347b).invoke(result6);
                return Unit.f18162a;
            case 26:
                View it8 = (View) obj;
                int i18 = MayaLoginActivity.f12721v;
                j.g(it8, "it");
                ((C1547f) this.f4347b).invoke();
                return Unit.f18162a;
            case 27:
                View it9 = (View) obj;
                int i19 = MayaLoginActivity.f12721v;
                j.g(it9, "it");
                ((C1547f) this.f4347b).invoke();
                return Unit.f18162a;
            case 28:
                Order transaction = (Order) obj;
                j.g(transaction, "transaction");
                MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = (MayaShopPaymentConfirmationFragment) this.f4347b;
                mayaShopPaymentConfirmationFragment.getClass();
                PaymentConfirmationSummary paymentConfirmationSummary = mayaShopPaymentConfirmationFragment.f14024X;
                if (paymentConfirmationSummary != null && (interfaceC1097j = mayaShopPaymentConfirmationFragment.f14027a0) != null) {
                    ((MayaShopV2Activity) interfaceC1097j).i(transaction, paymentConfirmationSummary);
                }
                return Unit.f18162a;
            default:
                return obj == ((AbstractC1115a) this.f4347b) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
