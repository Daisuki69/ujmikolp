package Gb;

import Kh.B;
import M8.A0;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import cc.D;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.navigation.NavigationBarView;
import com.paymaya.R;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferReceiptFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyReceiptFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment;
import java.io.File;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements g0, NavigationBarView.OnItemSelectedListener, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1956b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, boolean z4, int i) {
        this.f1955a = i;
        this.c = obj;
        this.f1956b = z4;
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        switch (this.f1955a) {
            case 0:
                boolean z4 = this.f1956b;
                MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) this.c;
                if (z4) {
                    mayaSendMoneyReceiptFragment.M1().postDelayed(new E8.l(mayaSendMoneyReceiptFragment, 4), 50L);
                }
                o oVar = mayaSendMoneyReceiptFragment.f13824K0;
                if (oVar != null) {
                    Uri uriC = h0.c(mayaSendMoneyReceiptFragment.getActivity(), file);
                    MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) oVar;
                    mayaSendMoneyActivity.n1();
                    B5.i.D(mayaSendMoneyActivity, "Share Receipt", null, uriC);
                }
                break;
            case 1:
                TravelTicketFragment travelTicketFragment = (TravelTicketFragment) this.c;
                boolean z5 = this.f1956b;
                Ee.a aVar = travelTicketFragment.f14935S;
                if (file != null) {
                    TravelTicketFragment travelTicketFragment2 = (TravelTicketFragment) aVar.c.get();
                    Toast.makeText(travelTicketFragment2.getActivity(), travelTicketFragment2.getString(R.string.pma_label_image_saved), 0).show();
                } else if (!z5) {
                    TravelTicketFragment travelTicketFragment3 = (TravelTicketFragment) aVar.c.get();
                    B bE = AbstractC1955a.p(travelTicketFragment3.requireActivity()).e(zh.b.a());
                    Gh.f fVar = new Gh.f(new He.b(travelTicketFragment3), Eh.d.f1366d);
                    bE.g(fVar);
                    travelTicketFragment3.f14937U.a(fVar);
                } else {
                    TravelTicketFragment travelTicketFragment4 = (TravelTicketFragment) aVar.c.get();
                    Toast.makeText(travelTicketFragment4.getActivity(), travelTicketFragment4.getString(R.string.pma_label_image_not_saved), 0).show();
                }
                break;
            case 2:
            case 3:
            default:
                boolean z8 = this.f1956b;
                MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment = (MayaBankTransferReceiptFragment) this.c;
                if (z8) {
                    mayaBankTransferReceiptFragment.M1().postDelayed(new androidx.window.layout.adapter.extensions.a(mayaBankTransferReceiptFragment, 27), 50L);
                }
                t6.j jVar = mayaBankTransferReceiptFragment.f11587H0;
                if (jVar != null) {
                    Uri uriC2 = h0.c(mayaBankTransferReceiptFragment.getActivity(), file);
                    MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) jVar;
                    mayaBankTransferActivity.n1();
                    B5.i.D(mayaBankTransferActivity, "Share Receipt", null, uriC2);
                }
                break;
            case 4:
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) this.c;
                if (this.f1956b) {
                    mayaShopPurchaseHistoryReceiptFragment.M1().postDelayed(new androidx.window.layout.adapter.extensions.a(mayaShopPurchaseHistoryReceiptFragment, 3), 50L);
                }
                D d10 = mayaShopPurchaseHistoryReceiptFragment.R0;
                if (d10 != null) {
                    String string = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.maya_shop_share_receipt);
                    Uri uriC3 = h0.c(mayaShopPurchaseHistoryReceiptFragment.getActivity(), file);
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) d10;
                    mayaShopV2Activity.n1();
                    B5.i.D(mayaShopV2Activity, string, null, uriC3);
                }
                break;
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return NavigationUI.m128setupWithNavController$lambda8((NavController) this.c, this.f1956b, menuItem);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = A0.r((Context) this.c).edit();
        editorEdit.putBoolean("proxy_retention", this.f1956b);
        editorEdit.apply();
    }

    public /* synthetic */ n(boolean z4, Object obj, int i) {
        this.f1955a = i;
        this.f1956b = z4;
        this.c = obj;
    }
}
