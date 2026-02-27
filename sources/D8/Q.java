package D8;

import N5.C0486w0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycPhotoTip;
import com.paymaya.domain.model.KycTip;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeIdPhotoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends AbstractC2509a implements B8.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1020d;

    public Q(com.paymaya.data.preference.a aVar) {
        this.f1020d = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        KycCmsContentData data;
        super.j();
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycTakeIdPhotoFragment) ((K8.M) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycPhotoTip> photoTips = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getPhotoTips();
        if (photoTips == null) {
            photoTips = C1112C.f9377a;
        }
        if (photoTips.isEmpty()) {
            C0486w0 c0486w0 = (C0486w0) ((MayaKycTakeIdPhotoFragment) ((K8.M) this.c.get())).G1();
            c0486w0.c.setVisibility(8);
            c0486w0.f4254d.setVisibility(8);
            return;
        }
        List<KycPhotoTip> list = photoTips;
        KycTip.Companion companion = KycTip.Companion;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(companion.fromPhotoTips((KycPhotoTip) it.next()));
        }
        MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment = (MayaKycTakeIdPhotoFragment) ((K8.M) this.c.get());
        mayaKycTakeIdPhotoFragment.getClass();
        C0486w0 c0486w02 = (C0486w0) mayaKycTakeIdPhotoFragment.G1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mayaKycTakeIdPhotoFragment.getActivity());
        RecyclerView recyclerView = c0486w02.f4254d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new J8.m(arrayList));
        Context contextRequireContext = mayaKycTakeIdPhotoFragment.requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(mayaKycTakeIdPhotoFragment.requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        ((C0486w0) mayaKycTakeIdPhotoFragment.G1()).f4254d.addItemDecoration(bVar);
    }
}
