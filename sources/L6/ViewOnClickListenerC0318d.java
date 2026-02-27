package L6;

import android.os.Parcelable;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullLinkedAccountsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;

/* JADX INFO: renamed from: L6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0318d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2827b;
    public final /* synthetic */ Parcelable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2828d;

    public /* synthetic */ ViewOnClickListenerC0318d(Object obj, int i, Parcelable parcelable, int i4) {
        this.f2826a = i4;
        this.f2828d = obj;
        this.f2827b = i;
        this.c = parcelable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2826a) {
            case 0:
                MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) this.f2828d;
                int i = this.f2827b;
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) this.c;
                Callback.onClick_enter(view);
                try {
                    MayaBankPullFragment.R1(mayaBankPullFragment, i, bankPullPaymentOption);
                    return;
                } finally {
                }
            case 1:
                MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = (MayaBankPullLinkedAccountsFragment) this.f2828d;
                int i4 = this.f2827b;
                BankPullPaymentOption bankPullPaymentOption2 = (BankPullPaymentOption) this.c;
                Callback.onClick_enter(view);
                try {
                    MayaBankPullLinkedAccountsFragment.H1(mayaBankPullLinkedAccountsFragment, i4, bankPullPaymentOption2);
                    return;
                } finally {
                }
            case 2:
                MayaVaultedCardsFragment mayaVaultedCardsFragment = (MayaVaultedCardsFragment) this.f2828d;
                int i6 = this.f2827b;
                VaultedCard vaultedCard = (VaultedCard) this.c;
                Callback.onClick_enter(view);
                try {
                    MayaVaultedCardsFragment.Q1(mayaVaultedCardsFragment, i6, vaultedCard);
                    return;
                } finally {
                }
            case 3:
                S9.c cVar = (S9.c) this.f2828d;
                int i10 = this.f2827b;
                CreditAgreement creditAgreement = (CreditAgreement) this.c;
                Callback.onClick_enter(view);
                try {
                    S9.c.D(cVar, i10, creditAgreement);
                    return;
                } finally {
                }
            default:
                Tb.a aVar = (Tb.a) this.f2828d;
                int i11 = this.f2827b;
                DeviceInformation deviceInformation = (DeviceInformation) this.c;
                Callback.onClick_enter(view);
                try {
                    MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment = aVar.f5818a;
                    mayaDeviceManagementMainFragment.getClass();
                    mayaDeviceManagementMainFragment.Q1(i11, deviceInformation);
                    Sb.s sVar = mayaDeviceManagementMainFragment.f13975z0;
                    if (sVar != null) {
                        ((MayaDeviceManagementActivity) sVar).Y1(deviceInformation);
                    }
                    return;
                } finally {
                }
        }
    }
}
