package M8;

import N5.C0439b0;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;

/* JADX INFO: renamed from: M8.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0397q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycDocumentIdGuideFragment f3355b;
    public final /* synthetic */ int c;

    public /* synthetic */ RunnableC0397q0(MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment, int i, int i4) {
        this.f3354a = i4;
        this.f3355b = mayaKycDocumentIdGuideFragment;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.f3354a) {
            case 0:
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = this.f3355b;
                RecyclerView.LayoutManager layoutManager = ((C0439b0) mayaKycDocumentIdGuideFragment.G1()).f.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                int i = this.c;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i, 0);
                }
                ((C0439b0) mayaKycDocumentIdGuideFragment.G1()).f.post(new RunnableC0397q0(mayaKycDocumentIdGuideFragment, i, 1));
                break;
            default:
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment2 = this.f3355b;
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((C0439b0) mayaKycDocumentIdGuideFragment2.G1()).f.findViewHolderForAdapterPosition(this.c);
                if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                    ((C0439b0) mayaKycDocumentIdGuideFragment2.G1()).e.smoothScrollTo(0, ((C0439b0) mayaKycDocumentIdGuideFragment2.G1()).f.getTop() + view.getTop());
                    break;
                }
                break;
        }
    }
}
