package qf;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferReceiptFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileLearnMoreBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.ui.ekyc.view.dialog.impl.EkycIdDetailDialogFragment;
import com.paymaya.ui.ekyc.view.dialog.impl.EkycPhotoCaptureTutorialDialogFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ReceiptFragment;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.overseas.fragment.GuideFragment;
import java.util.List;
import o6.o;
import q7.ViewOnClickListenerC2167a;
import s6.InterfaceC2244e;
import s7.C2245a;
import v6.C2343a;
import v6.C2344b;
import w1.h;
import w1.m;
import w1.p;
import w1.t;
import xe.C2470a;
import xe.C2471b;
import xe.C2472c;
import xe.C2474e;
import xe.C2475f;
import xe.g;
import xe.i;
import xe.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19779b;

    public /* synthetic */ d(Object obj, int i) {
        this.f19778a = i;
        this.f19779b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v41, types: [com.paymaya.common.base.BaseLoadingFragment, ue.y] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19778a) {
            case 0:
                AuthingFragment.m191instrumented$0$b$V((AuthingFragment) this.f19779b, view);
                return;
            case 1:
                C2245a c2245a = (C2245a) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    o7.b bVar = c2245a.f20030b;
                    bVar.f18809a.U1(c2245a.c);
                    return;
                } finally {
                }
            case 2:
                MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    MayaBankTransferConfirmationFragment.I1(mayaBankTransferConfirmationFragment);
                    return;
                } finally {
                }
            case 3:
                MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment = (MayaBankTransferReceiptFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    o oVarM2 = mayaBankTransferReceiptFragment.m2();
                    if (mayaBankTransferReceiptFragment.I0) {
                        ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) oVarM2.c.get())).n2();
                    } else {
                        ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) oVarM2.c.get())).o2();
                    }
                    return;
                } finally {
                }
            case 4:
                GuideFragment.m193x961510d8((GuideFragment) this.f19779b, view);
                return;
            case 5:
                C2343a c2343a = (C2343a) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2343a.D(c2343a);
                    return;
                } finally {
                }
            case 6:
                C2344b c2344b = (C2344b) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2344b.D(c2344b);
                    return;
                } finally {
                }
            case 7:
                h hVar = (h) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    hVar.i();
                    return;
                } finally {
                }
            case 8:
                m mVar = (m) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    int adapterPosition = mVar.getAdapterPosition();
                    t tVar = mVar.f20575d;
                    if (adapterPosition == 0) {
                        tVar.d(tVar.t0);
                    } else if (adapterPosition == 1) {
                        tVar.d(tVar.f20642z0);
                    } else {
                        tVar.u0.dismiss();
                    }
                    return;
                } finally {
                }
            case 9:
                p pVar = (p) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    pVar.i();
                    return;
                } finally {
                }
            case 10:
                ShopV3ReceiptFragment shopV3ReceiptFragment = (ShopV3ReceiptFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    ShopV3ReceiptFragment.c2(shopV3ReceiptFragment);
                    return;
                } finally {
                }
            case 11:
                com.tencent.could.huiyansdk.view.b.m194instrumented$0$a$LandroidcontentContextV((com.tencent.could.huiyansdk.view.b) this.f19779b, view);
                return;
            case 12:
                EkycIdDetailDialogFragment ekycIdDetailDialogFragment = (EkycIdDetailDialogFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    ekycIdDetailDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 13:
                EkycPhotoCaptureTutorialDialogFragment ekycPhotoCaptureTutorialDialogFragment = (EkycPhotoCaptureTutorialDialogFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    ekycPhotoCaptureTutorialDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 14:
                C2470a c2470a = (C2470a) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2470a.D(c2470a);
                    return;
                } finally {
                }
            case 15:
                C2471b c2471b = (C2471b) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2471b.D(c2471b);
                    return;
                } finally {
                }
            case 16:
                C2472c c2472c = (C2472c) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2472c.D(c2472c);
                    return;
                } finally {
                }
            case 17:
                C2474e c2474e = (C2474e) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2474e.D(c2474e);
                    return;
                } finally {
                }
            case 18:
                C2475f c2475f = (C2475f) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    C2475f.D(c2475f);
                    return;
                } finally {
                }
            case 19:
                g gVar = (g) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    g.D(gVar);
                    return;
                } finally {
                }
            case 20:
                xe.h hVar2 = (xe.h) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    xe.h.D(hVar2);
                    return;
                } finally {
                }
            case 21:
                i iVar = (i) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    i.D(iVar);
                    return;
                } finally {
                }
            case 22:
                l lVar = (l) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    l lVar2 = (l) lVar.i.f18793b;
                    ShopPurchaseHistory shopPurchaseHistory = lVar2.j;
                    if (shopPurchaseHistory != null) {
                        lVar2.f20975a.e(shopPurchaseHistory);
                    }
                    return;
                } finally {
                }
            case 23:
                xe.m mVar2 = (xe.m) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    mVar2.h.Y0(mVar2.i);
                    return;
                } finally {
                }
            case 24:
                Callback.onClick_enter(view);
                View.OnClickListener onClickListener = (View.OnClickListener) this.f19779b;
                if (onClickListener != null) {
                    try {
                        onClickListener.onClick(view);
                    } finally {
                    }
                }
                return;
            case 25:
                Callback.onClick_enter(view);
                try {
                    ((ViewOnClickListenerC2167a) this.f19779b).onClick(view);
                    return;
                } finally {
                }
            case 26:
                MayaProfileLearnMoreBottomSheetDialogFragment mayaProfileLearnMoreBottomSheetDialogFragment = (MayaProfileLearnMoreBottomSheetDialogFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    mayaProfileLearnMoreBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 27:
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) this.f19779b;
                List list = MayaUnderWritingRequirementsFragment.f14251d0;
                Callback.onClick_enter(view);
                try {
                    MayaUnderWritingRequirementsFragment.e2(mayaUnderWritingRequirementsFragment);
                    return;
                } finally {
                }
            case 28:
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) this.f19779b;
                Callback.onClick_enter(view);
                try {
                    MayaUserContactReferenceFragment.i2(mayaUserContactReferenceFragment);
                    return;
                } finally {
                }
            default:
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) this.f19779b;
                List list2 = MayaUserProfileUpdateFragment.f14261f0;
                Callback.onClick_enter(view);
                try {
                    MayaUserProfileUpdateFragment.t2(mayaUserProfileUpdateFragment);
                    return;
                } finally {
                }
        }
    }
}
