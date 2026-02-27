package D8;

import N5.C0488x0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycSelfieTips;
import com.paymaya.domain.model.KycTip;
import com.paymaya.domain.model.KycVideoTip;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeVideoSelfieFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC2509a implements B8.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1021d;

    public S(com.paymaya.data.preference.a aVar, S5.c cVar) {
        this.f1021d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        String iconUrl;
        String description;
        String header;
        KycCmsContentData data2;
        super.j();
        List<KycVideoTip> videoTips = null;
        videoTips = null;
        if (this.f1021d.e().isKycUxTofuRedesignEnabled()) {
            MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
            ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4263d.c.setVisibility(8);
            FragmentActivity fragmentActivityRequireActivity = ((MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get())).requireActivity();
            kotlin.jvm.internal.j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity)).Z1().f;
            KycSelfieTips selfieTips = (kycCmsContent == null || (data2 = kycCmsContent.getData()) == null) ? null : data2.getSelfieTips();
            if (selfieTips != null && (header = selfieTips.getHeader()) != null) {
                if (header.length() <= 0) {
                    header = null;
                }
                if (header != null) {
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment2 = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
                    mayaKycTakeVideoSelfieFragment2.getClass();
                    ((C0488x0) mayaKycTakeVideoSelfieFragment2.G1()).c.f.setText(header);
                }
            }
            if (selfieTips != null && (description = selfieTips.getDescription()) != null) {
                if (description.length() <= 0) {
                    description = null;
                }
                if (description != null) {
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment3 = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
                    mayaKycTakeVideoSelfieFragment3.getClass();
                    ((C0488x0) mayaKycTakeVideoSelfieFragment3.G1()).c.e.setText(description);
                }
            }
            if (selfieTips != null && (iconUrl = selfieTips.getIconUrl()) != null) {
                String str = iconUrl.length() > 0 ? iconUrl : null;
                if (str != null) {
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment4 = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
                    mayaKycTakeVideoSelfieFragment4.getClass();
                    AbstractC1955a.w(((C0488x0) mayaKycTakeVideoSelfieFragment4.G1()).c.f4054d, str, false);
                }
            }
            ((C0488x0) ((MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get())).G1()).c.c.setVisibility(0);
            return;
        }
        ((C0488x0) ((MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get())).G1()).c.c.setVisibility(8);
        FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(fragmentActivityRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent2 = ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity2)).Z1().f;
        if (kycCmsContent2 != null && (data = kycCmsContent2.getData()) != null) {
            videoTips = data.getVideoTips();
        }
        if (videoTips == null) {
            videoTips = C1112C.f9377a;
        }
        if (videoTips.isEmpty()) {
            MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment5 = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
            ((C0488x0) mayaKycTakeVideoSelfieFragment5.G1()).f4263d.c.setVisibility(8);
            return;
        }
        List<KycVideoTip> list = videoTips;
        KycTip.Companion companion = KycTip.Companion;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(companion.fromVideoTips((KycVideoTip) it.next()));
        }
        MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment6 = (MayaKycTakeVideoSelfieFragment) ((K8.N) this.c.get());
        mayaKycTakeVideoSelfieFragment6.getClass();
        ((C0488x0) mayaKycTakeVideoSelfieFragment6.G1()).f4263d.c.setVisibility(0);
        RecyclerView recyclerView = ((C0488x0) mayaKycTakeVideoSelfieFragment6.G1()).f4263d.f3877d;
        recyclerView.setLayoutManager(new LinearLayoutManager(mayaKycTakeVideoSelfieFragment6.getActivity()));
        recyclerView.setAdapter(new J8.m(arrayList));
        Context contextRequireContext = mayaKycTakeVideoSelfieFragment6.requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(mayaKycTakeVideoSelfieFragment6.requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerView.addItemDecoration(bVar);
    }
}
