package Ae;

import Ac.e;
import B5.i;
import Fc.c;
import K8.B;
import K8.InterfaceC0285j;
import Ka.b;
import N5.C0472p;
import N5.C0477s;
import N5.H0;
import Uh.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmExitBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycRestartBottomSheetDialogFragment;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersCollectionFragment;
import com.paymaya.ui.invest.view.activity.impl.InvestActivity;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import com.paymaya.ui.support.view.activity.impl.SupportActivity;
import com.paymaya.ui.support.view.fragment.impl.SupportFragment;
import com.paymaya.ui.travel.view.activity.impl.TravelActivity;
import com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f261d;

    public /* synthetic */ a(int i) {
        this.f261d = i;
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        switch (this.f261d) {
            case 0:
                Be.a view = (Be.a) obj;
                j.g(view, "view");
                super.h(view);
                AbstractC1236z.g((SupportActivity) view, R.id.pma_activity_support_fragment_container, new SupportFragment());
                break;
            default:
                super.h(obj);
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public void j() {
        switch (this.f261d) {
            case 2:
                super.j();
                MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) ((C9.a) this.c.get());
                mayaMissionsActivity.getClass();
                AbstractC1236z.g(mayaMissionsActivity, R.id.maya_activity_missions_fragment_container, new MayaMissionsFragment());
                break;
            case 8:
                super.j();
                MayaKycConfirmExitBottomSheetDialogFragment mayaKycConfirmExitBottomSheetDialogFragment = (MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) this.c.get());
                mayaKycConfirmExitBottomSheetDialogFragment.getClass();
                ImageView imageViewIcon = ((C0472p) mayaKycConfirmExitBottomSheetDialogFragment.s1()).f4175d;
                j.f(imageViewIcon, "imageViewIcon");
                AbstractC1955a.w(imageViewIcon, "https://kyc-cms-bucket-test.s3.ap-southeast-1.amazonaws.com/Question_Icon.png", true);
                break;
            case 16:
                super.j();
                MayaKycRestartBottomSheetDialogFragment mayaKycRestartBottomSheetDialogFragment = (MayaKycRestartBottomSheetDialogFragment) ((B) this.c.get());
                mayaKycRestartBottomSheetDialogFragment.getClass();
                ImageView imageViewRestartQuestionIcon = ((C0477s) mayaKycRestartBottomSheetDialogFragment.s1()).f4202d;
                j.f(imageViewRestartQuestionIcon, "imageViewRestartQuestionIcon");
                AbstractC1955a.w(imageViewRestartQuestionIcon, "https://kyc-cms-bucket-test.s3.ap-southeast-1.amazonaws.com/Question_Icon.png", true);
                break;
            case 21:
                super.j();
                MayaVouchersCollectionFragment mayaVouchersCollectionFragment = (MayaVouchersCollectionFragment) ((c) this.c.get());
                Context contextRequireContext = mayaVouchersCollectionFragment.requireContext();
                j.f(contextRequireContext, "requireContext(...)");
                mayaVouchersCollectionFragment.f14310X = new e(contextRequireContext, mayaVouchersCollectionFragment.getChildFragmentManager(), 0);
                H0 h02 = mayaVouchersCollectionFragment.f14307U;
                j.d(h02);
                ViewPager viewPager = h02.c;
                viewPager.setOffscreenPageLimit(3);
                viewPager.setAdapter(mayaVouchersCollectionFragment.f14310X);
                viewPager.addOnPageChangeListener(new Gc.e(mayaVouchersCollectionFragment));
                TabLayout tabLayout = h02.f3644d;
                tabLayout.setupWithViewPager(viewPager);
                int tabCount = tabLayout.getTabCount();
                for (int i = 0; i < tabCount; i++) {
                    if (tabLayout.getTabAt(i) != null) {
                        View childAt = tabLayout.getChildAt(0);
                        j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                        View childAt2 = ((ViewGroup) childAt).getChildAt(i);
                        if (i == 0) {
                            childAt2.setId(R.id.pma_fragment_vouchers_collection_tab_available);
                        } else if (i == 1) {
                            childAt2.setId(R.id.pma_fragment_vouchers_collection_tab_claimed);
                        } else if (i == 2) {
                            childAt2.setId(R.id.pma_fragment_vouchers_collection_tab_expired);
                        }
                    }
                }
                break;
            case 22:
                super.j();
                InvestActivity investActivity = (InvestActivity) ((Ed.a) this.c.get());
                investActivity.getClass();
                AbstractC1236z.g(investActivity, R.id.pma_activity_invest_fragment_container, new InvestPreviewFragment());
                break;
            case 25:
                super.j();
                PurchasedTicket purchasedTicket = (PurchasedTicket) ((TravelActivity) ((Fe.a) this.c.get())).getIntent().getParcelableExtra("purchased_ticket");
                if (C.e(purchasedTicket)) {
                    TravelActivity travelActivity = (TravelActivity) ((Fe.a) this.c.get());
                    travelActivity.finish();
                    travelActivity.e.getClass();
                    Intent intent = new Intent(travelActivity, (Class<?>) MayaTravelActivity.class);
                    intent.setData(travelActivity.getIntent().getData());
                    i.v0(travelActivity, intent);
                    travelActivity.startActivity(intent);
                } else {
                    TravelActivity travelActivity2 = (TravelActivity) ((Fe.a) this.c.get());
                    travelActivity2.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("purchased_ticket", purchasedTicket);
                    bundle.putBoolean("show_confetti", false);
                    TravelTicketFragment travelTicketFragment = new TravelTicketFragment();
                    travelTicketFragment.setArguments(bundle);
                    AbstractC1236z.g(travelActivity2, R.id.fragment_container_frame_layout_pma_activity_travel, travelTicketFragment);
                }
                break;
            case 27:
                super.j();
                MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) ((b) this.c.get());
                mayaRequestMoneyActivity.getClass();
                MayaRequestMoneyFragment mayaRequestMoneyFragment = new MayaRequestMoneyFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("transfer_app_link", null);
                mayaRequestMoneyFragment.setArguments(bundle2);
                AbstractC1236z.g(mayaRequestMoneyActivity, R.id.fragment_container, mayaRequestMoneyFragment);
                break;
            default:
                super.j();
                break;
        }
    }

    public void k(boolean z4) {
        ((MayaKycRestartBottomSheetDialogFragment) ((B) this.c.get())).f12584W = z4;
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycRestartBottomSheetDialogFragment) ((B) this.c.get())).requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar) {
        super(dVar);
        this.f261d = 21;
    }
}
