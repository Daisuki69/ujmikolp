package Q6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.NumberPicker;
import b9.InterfaceC0925a;
import b9.InterfaceC0928d;
import c6.InterfaceC1076a;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.SendMoneyCard;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaServiceUnavailableActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaUpdaterFragment;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteReminderScheduleBottomSheetFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWizardActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycNudgeActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycNudgeFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyActivity;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.MyQRFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFragment;
import com.paymaya.ui.sendmoney.view.activity.impl.SendMoneyCardActivity;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;
import hb.InterfaceC1558a;
import ie.InterfaceC1600a;
import kotlin.ranges.IntRange;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5280d;

    public /* synthetic */ l(int i) {
        this.f5280d = i;
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        switch (this.f5280d) {
            case 15:
                InterfaceC0928d view = (InterfaceC0928d) obj;
                kotlin.jvm.internal.j.g(view, "view");
                super.h(view);
                MayaWizardActivity mayaWizardActivity = (MayaWizardActivity) ((InterfaceC0928d) this.c.get());
                mayaWizardActivity.getClass();
                AbstractC1236z.g(mayaWizardActivity, R.id.fragment_container_layout, new MayaWizardFragment());
                break;
            default:
                super.h(obj);
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public void j() {
        int iW;
        MayaLoginFragment mayaLoginFragment;
        Parcelable parcelable;
        boolean z4;
        switch (this.f5280d) {
            case 0:
                super.j();
                S6.f fVar = (S6.f) this.c.get();
                Bundle extras = ((MayaServiceUnavailableActivity) ((S6.f) this.c.get())).getIntent().getExtras();
                String string = extras != null ? extras.getString("unavailable_description") : null;
                MayaServiceUnavailableActivity mayaServiceUnavailableActivity = (MayaServiceUnavailableActivity) fVar;
                mayaServiceUnavailableActivity.getClass();
                AbstractC1236z.a(mayaServiceUnavailableActivity, R.id.frame_layout_container, M2.b.a0(string, 3));
                return;
            case 1:
                super.j();
                MayaSessionExpiredActivity mayaSessionExpiredActivity = (MayaSessionExpiredActivity) ((S6.g) this.c.get());
                mayaSessionExpiredActivity.getClass();
                AbstractC1236z.g(mayaSessionExpiredActivity, R.id.fragment_container_layout, new MayaSessionExpiredFragment());
                return;
            case 4:
                super.j();
                MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) ((S6.i) this.c.get());
                mayaUpdaterActivity.getClass();
                AbstractC1236z.a(mayaUpdaterActivity, R.id.frame_layout_container, new MayaUpdaterFragment());
                return;
            case 5:
                super.j();
                MayaShopActivity mayaShopActivity = (MayaShopActivity) ((Yb.a) this.c.get());
                String dataString = mayaShopActivity.getIntent().getDataString();
                ShopV3Fragment shopV3Fragment = new ShopV3Fragment();
                Bundle bundle = new Bundle();
                bundle.putString("shop_list_data", dataString);
                bundle.putBoolean("is_in_activity", true);
                shopV3Fragment.setArguments(bundle);
                AbstractC1236z.g(mayaShopActivity, R.id.frame_layout_fragment_container, shopV3Fragment);
                String dataString2 = ((MayaShopActivity) ((Yb.a) this.c.get())).getIntent().getDataString();
                if (dataString2 == null || C2576A.H(dataString2) || !C.Y(dataString2) || (iW = C.w(dataString2)) == 0) {
                    return;
                }
                if (iW == 3) {
                    MayaShopActivity mayaShopActivity2 = (MayaShopActivity) ((Yb.a) this.c.get());
                    mayaShopActivity2.e.Y(mayaShopActivity2, null);
                }
                ((MayaShopActivity) ((Yb.a) this.c.get())).getIntent().setData(null);
                return;
            case 6:
                super.j();
                FavoriteDetails favoriteDetails = (FavoriteDetails) ((MayaAddFavoriteActivity) ((Z7.a) this.c.get())).getIntent().getParcelableExtra("favorite_details");
                BillerTransaction billerTransaction = (BillerTransaction) ((MayaAddFavoriteActivity) ((Z7.a) this.c.get())).getIntent().getParcelableExtra("biller_transaction");
                TransferRecipient transferRecipient = (TransferRecipient) ((MayaAddFavoriteActivity) ((Z7.a) this.c.get())).getIntent().getParcelableExtra("transfer_recipient");
                if (favoriteDetails != null && billerTransaction != null) {
                    MayaAddFavoriteActivity mayaAddFavoriteActivity = (MayaAddFavoriteActivity) ((Z7.a) this.c.get());
                    mayaAddFavoriteActivity.getClass();
                    MayaAddFavoriteFragment mayaAddFavoriteFragment = new MayaAddFavoriteFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("favorite_details", favoriteDetails);
                    bundle2.putParcelable("biller_transaction", billerTransaction);
                    mayaAddFavoriteFragment.setArguments(bundle2);
                    AbstractC1236z.g(mayaAddFavoriteActivity, R.id.frame_layout_container, mayaAddFavoriteFragment);
                    return;
                }
                if (favoriteDetails != null && transferRecipient != null) {
                    MayaAddFavoriteActivity mayaAddFavoriteActivity2 = (MayaAddFavoriteActivity) ((Z7.a) this.c.get());
                    mayaAddFavoriteActivity2.getClass();
                    MayaAddFavoriteFragment mayaAddFavoriteFragment2 = new MayaAddFavoriteFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("favorite_details", favoriteDetails);
                    bundle3.putParcelable("transfer_recipient", transferRecipient);
                    mayaAddFavoriteFragment2.setArguments(bundle3);
                    AbstractC1236z.g(mayaAddFavoriteActivity2, R.id.frame_layout_container, mayaAddFavoriteFragment2);
                    return;
                }
                if (favoriteDetails != null) {
                    MayaAddFavoriteActivity mayaAddFavoriteActivity3 = (MayaAddFavoriteActivity) ((Z7.a) this.c.get());
                    mayaAddFavoriteActivity3.getClass();
                    MayaAddFavoriteFragment mayaAddFavoriteFragment3 = new MayaAddFavoriteFragment();
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("favorite_details", favoriteDetails);
                    mayaAddFavoriteFragment3.setArguments(bundle4);
                    AbstractC1236z.g(mayaAddFavoriteActivity3, R.id.frame_layout_container, mayaAddFavoriteFragment3);
                    return;
                }
                return;
            case 10:
                super.j();
                Integer num = (Integer) ((MayaFavoriteReminderScheduleBottomSheetFragment) ((c8.d) this.c.get())).f12355X.getValue();
                MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment = (MayaFavoriteReminderScheduleBottomSheetFragment) ((c8.d) this.c.get());
                NumberPicker numberPicker = mayaFavoriteReminderScheduleBottomSheetFragment.f12351T;
                if (numberPicker == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDayWheel");
                    throw null;
                }
                numberPicker.setMinValue(1);
                NumberPicker numberPicker2 = mayaFavoriteReminderScheduleBottomSheetFragment.f12351T;
                if (numberPicker2 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDayWheel");
                    throw null;
                }
                numberPicker2.setMaxValue(31);
                if (num == null || !new IntRange(1, 31, 1).a(num.intValue())) {
                    return;
                }
                c8.d dVar = (c8.d) this.c.get();
                int iIntValue = num.intValue();
                NumberPicker numberPicker3 = ((MayaFavoriteReminderScheduleBottomSheetFragment) dVar).f12351T;
                if (numberPicker3 != null) {
                    numberPicker3.setValue(iIntValue);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mNumberPickerDayWheel");
                    throw null;
                }
            case 13:
                super.j();
                MayaLoginActivity mayaLoginActivity = (MayaLoginActivity) ((InterfaceC0925a) this.c.get());
                Intent intent = mayaLoginActivity.getIntent();
                PayMayaError payMayaError = intent != null ? (PayMayaError) intent.getParcelableExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR) : null;
                String stringExtra = mayaLoginActivity.getIntent().getStringExtra("title");
                if (payMayaError == null) {
                    mayaLoginFragment = new MayaLoginFragment();
                } else {
                    MayaLoginFragment mayaLoginFragment2 = new MayaLoginFragment();
                    Bundle bundle5 = new Bundle();
                    bundle5.putParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError);
                    bundle5.putString("title", stringExtra);
                    mayaLoginFragment2.setArguments(bundle5);
                    mayaLoginFragment = mayaLoginFragment2;
                }
                AbstractC1236z.g(mayaLoginActivity, R.id.fragment_container, mayaLoginFragment);
                return;
            case 19:
                super.j();
                if (!"scan".equals(((QRActivity) ((ae.b) this.c.get())).getIntent().getExtras().getString("action"))) {
                    QRActivity qRActivity = (QRActivity) ((ae.b) this.c.get());
                    qRActivity.getClass();
                    AbstractC1236z.g(qRActivity, R.id.pma_activity_qr_fragment_container, new MyQRFragment());
                    return;
                }
                QRActivity qRActivity2 = (QRActivity) ((ae.b) this.c.get());
                qRActivity2.getClass();
                boolean z5 = false;
                try {
                    z5 = qRActivity2.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
                } catch (Exception unused) {
                    yk.a.b();
                }
                if (z5) {
                    QRActivity qRActivity3 = (QRActivity) ((ae.b) this.c.get());
                    qRActivity3.getClass();
                    AbstractC1236z.g(qRActivity3, R.id.pma_activity_qr_fragment_container, new MLKitQRScannerFragment());
                    return;
                } else {
                    QRActivity qRActivity4 = (QRActivity) ((ae.b) this.c.get());
                    qRActivity4.getClass();
                    AbstractC1236z.g(qRActivity4, R.id.pma_activity_qr_fragment_container, new QRScannerFragment());
                    return;
                }
            case 20:
                super.j();
                RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) ((ae.c) this.c.get());
                requestMoneyActivity.getClass();
                AbstractC1236z.g(requestMoneyActivity, R.id.pma_activity_request_money_fragment_container, new RequestMoneyFragment());
                return;
            case 22:
                super.j();
                MayaAccountLimitsActivity mayaAccountLimitsActivity = (MayaAccountLimitsActivity) ((InterfaceC1076a) this.c.get());
                mayaAccountLimitsActivity.getClass();
                AbstractC1236z.g(mayaAccountLimitsActivity, R.id.frame_layout_fragment_container, new MayaAccountLimitsFragment());
                return;
            case 27:
                super.j();
                ReKycNudgeActivity reKycNudgeActivity = (ReKycNudgeActivity) ((InterfaceC1558a) this.c.get());
                reKycNudgeActivity.getClass();
                AbstractC1236z.g(reKycNudgeActivity, R.id.fragment_container, new ReKycNudgeFragment());
                return;
            case 28:
                super.j();
                Bundle extras2 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                if ((extras2 != null ? (Transfer) extras2.getParcelable("transfer") : null) != null) {
                    InterfaceC1600a interfaceC1600a = (InterfaceC1600a) this.c.get();
                    Bundle extras3 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    parcelable = extras3 != null ? (Transfer) extras3.getParcelable("transfer") : null;
                    Bundle extras4 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    z4 = extras4 != null ? extras4.getBoolean("is_receiver") : false;
                    SendMoneyCardActivity sendMoneyCardActivity = (SendMoneyCardActivity) interfaceC1600a;
                    sendMoneyCardActivity.getClass();
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable("transfer", parcelable);
                    bundle6.putBoolean("is_receiver", z4);
                    SendMoneyCardFragment sendMoneyCardFragment = new SendMoneyCardFragment();
                    sendMoneyCardFragment.setArguments(bundle6);
                    AbstractC1236z.g(sendMoneyCardActivity, R.id.fragment_container_frame_layout_pma_activity_send_money_card, sendMoneyCardFragment);
                    return;
                }
                Bundle extras5 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                if ((extras5 != null ? (UserActivity) extras5.getParcelable("user_activity") : null) != null) {
                    InterfaceC1600a interfaceC1600a2 = (InterfaceC1600a) this.c.get();
                    Bundle extras6 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    parcelable = extras6 != null ? (UserActivity) extras6.getParcelable("user_activity") : null;
                    Bundle extras7 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    z4 = extras7 != null ? extras7.getBoolean("is_receiver") : false;
                    SendMoneyCardActivity sendMoneyCardActivity2 = (SendMoneyCardActivity) interfaceC1600a2;
                    sendMoneyCardActivity2.getClass();
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable("user_activity", parcelable);
                    bundle7.putBoolean("is_receiver", z4);
                    SendMoneyCardFragment sendMoneyCardFragment2 = new SendMoneyCardFragment();
                    sendMoneyCardFragment2.setArguments(bundle7);
                    AbstractC1236z.g(sendMoneyCardActivity2, R.id.fragment_container_frame_layout_pma_activity_send_money_card, sendMoneyCardFragment2);
                    return;
                }
                Bundle extras8 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                if ((extras8 != null ? (SendMoneyCard) extras8.getParcelable("send_money_card") : null) != null) {
                    InterfaceC1600a interfaceC1600a3 = (InterfaceC1600a) this.c.get();
                    Bundle extras9 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    parcelable = extras9 != null ? (SendMoneyCard) extras9.getParcelable("send_money_card") : null;
                    Bundle extras10 = ((SendMoneyCardActivity) ((InterfaceC1600a) this.c.get())).getIntent().getExtras();
                    z4 = extras10 != null ? extras10.getBoolean("is_receiver") : false;
                    SendMoneyCardActivity sendMoneyCardActivity3 = (SendMoneyCardActivity) interfaceC1600a3;
                    sendMoneyCardActivity3.getClass();
                    Bundle bundle8 = new Bundle();
                    bundle8.putParcelable("send_money_card", parcelable);
                    bundle8.putBoolean("is_receiver", z4);
                    SendMoneyCardFragment sendMoneyCardFragment3 = new SendMoneyCardFragment();
                    sendMoneyCardFragment3.setArguments(bundle8);
                    AbstractC1236z.g(sendMoneyCardActivity3, R.id.fragment_container_frame_layout_pma_activity_send_money_card, sendMoneyCardFragment3);
                    return;
                }
                return;
            default:
                super.j();
                return;
        }
    }
}
