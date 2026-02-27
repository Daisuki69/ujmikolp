package o6;

import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.BankTransfer;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import s6.InterfaceC2240a;
import t6.InterfaceC2270a;

/* JADX INFO: renamed from: o6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968b implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18785b;
    public final /* synthetic */ BankTransferV3CreateResponse c;

    public /* synthetic */ C1968b(c cVar, BankTransferV3CreateResponse bankTransferV3CreateResponse, int i) {
        this.f18784a = i;
        this.f18785b = cVar;
        this.c = bankTransferV3CreateResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public final void accept(Object obj) {
        FavoriteDetails.Builder builder;
        FavoriteDetails.Builder builderMContentPreview;
        BankTransfer toFavoriteTemplate;
        BankTransfer toFavoriteTemplate2;
        switch (this.f18784a) {
            case 0:
                MFAChallengeInformation it = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((InterfaceC2240a) this.f18785b.c.get())).w1();
                c cVar = this.f18785b;
                BankTransferV3CreateResponse bankTransferV3CreateResponse = this.c;
                MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get());
                mayaBankTransferConfirmationFragment.getClass();
                InterfaceC2270a interfaceC2270a = mayaBankTransferConfirmationFragment.f11547f0;
                if (interfaceC2270a != null) {
                    ((MayaBankTransferActivity) interfaceC2270a).d2(bankTransferV3CreateResponse);
                }
                InterfaceC2240a interfaceC2240a = (InterfaceC2240a) cVar.c.get();
                BankTransferV3 bankTransfer = bankTransferV3CreateResponse.getBankTransfer();
                InterfaceC2270a interfaceC2270a2 = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).f11547f0;
                FavoriteDetails favoriteDetailsBuild = null;
                favoriteDetailsBuild = null;
                json = null;
                String json = null;
                favoriteDetailsBuild = null;
                favoriteDetailsBuild = null;
                favoriteDetailsBuild = null;
                favoriteDetailsBuild = null;
                FavoriteCount favoriteCount = interfaceC2270a2 != null ? (FavoriteCount) ((MayaBankTransferActivity) interfaceC2270a2).Y1().f2942g : null;
                InterfaceC2270a interfaceC2270a3 = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).f11547f0;
                FavoriteDetails favoriteDetails = interfaceC2270a3 != null ? (FavoriteDetails) ((MayaBankTransferActivity) interfaceC2270a3).Y1().h : null;
                if (cVar.f18787g.e().isFavoritesServiceAvailable() && (favoriteCount == null || !favoriteCount.hasReachedLimit())) {
                    if (favoriteDetails == null) {
                        FavoriteDetails.Builder builderMType = FavoriteDetails.sBuilder().mType("bank");
                        if (bankTransfer != null && (toFavoriteTemplate2 = bankTransfer.getToFavoriteTemplate()) != null) {
                            json = toFavoriteTemplate2.toJson();
                        }
                        favoriteDetailsBuild = builderMType.mTemplateJson(json).build();
                    } else if (!kotlin.jvm.internal.j.b(bankTransfer != null ? bankTransfer.getToFavoriteTemplate() : null, BankTransfer.fromJson(favoriteDetails.mTemplateJson()).toFavoriteTemplate()) && (builder = favoriteDetails.toBuilder()) != null && (builderMContentPreview = builder.mContentPreview(null)) != null) {
                        FavoriteDetails.Builder builderMTemplateJson = builderMContentPreview.mTemplateJson((bankTransfer == null || (toFavoriteTemplate = bankTransfer.getToFavoriteTemplate()) == null) ? null : toFavoriteTemplate.toJson());
                        if (builderMTemplateJson != null) {
                            favoriteDetailsBuild = builderMTemplateJson.build();
                        }
                    }
                }
                InterfaceC2270a interfaceC2270a4 = ((MayaBankTransferConfirmationFragment) interfaceC2240a).f11547f0;
                if (interfaceC2270a4 != null) {
                    ((MayaBankTransferActivity) interfaceC2270a4).Y1().h = favoriteDetailsBuild;
                }
                break;
            default:
                ((MayaBaseFragment) ((InterfaceC2240a) this.f18785b.c.get())).w1();
                c cVar2 = this.f18785b;
                PayMayaError payMayaErrorF = cVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                BankTransferV3CreateResponse bankTransferV3CreateResponse2 = this.c;
                ((MayaBaseFragment) ((InterfaceC2240a) cVar2.c.get())).w1();
                if (!payMayaErrorF.isSessionTimeout()) {
                    if (cVar2.f18787g.e().isAppEventV2BankTransferEnabled()) {
                        ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar2.c.get())).H1(payMayaErrorF, "BANK_TRANSFER_MFA_SETUP");
                    } else {
                        InterfaceC2240a interfaceC2240a2 = (InterfaceC2240a) cVar2.c.get();
                        C1219h c1219h = new C1219h();
                        c1219h.n(12);
                        c1219h.i();
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219h.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                        ((MayaBaseFragment) interfaceC2240a2).A1(c1219h);
                    }
                    if (payMayaErrorF.mErrorCode() != -317) {
                        MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment2 = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar2.c.get());
                        InterfaceC2270a interfaceC2270a5 = mayaBankTransferConfirmationFragment2.f11547f0;
                        if (interfaceC2270a5 != null) {
                            ((MayaBankTransferActivity) interfaceC2270a5).a(payMayaErrorF, mayaBankTransferConfirmationFragment2.getString(R.string.pma_toast_error_title_send_money_error));
                        }
                    } else {
                        MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment3 = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar2.c.get());
                        mayaBankTransferConfirmationFragment3.getClass();
                        InterfaceC2270a interfaceC2270a6 = mayaBankTransferConfirmationFragment3.f11547f0;
                        if (interfaceC2270a6 != null) {
                            ((MayaBankTransferActivity) interfaceC2270a6).d2(bankTransferV3CreateResponse2);
                        }
                    }
                }
                break;
        }
    }
}
