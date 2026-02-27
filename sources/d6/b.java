package D6;

import N5.C0441c;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.common.view.widget.MayaHorizontalLabelWithArrow;
import kotlin.jvm.internal.j;
import qc.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaCardsFragment f984b;
    public final C0441c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context mContext, C0441c c0441c, MayaCardsFragment mCardsViewHolderListener) {
        super((MayaHorizontalLabelWithArrow) c0441c.f4066b);
        j.g(mContext, "mContext");
        j.g(mCardsViewHolderListener, "mCardsViewHolderListener");
        this.f983a = mContext;
        this.f984b = mCardsViewHolderListener;
        this.c = c0441c;
        this.f985d = new c(this, 15);
    }
}
