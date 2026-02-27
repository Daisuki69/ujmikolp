package r6;

import N5.m1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import i8.C1593a;
import kotlin.jvm.internal.j;
import u6.InterfaceC2304b;
import v6.C2344b;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBankTransferListFragment f19876a;

    public a(MayaBankTransferListFragment mayaBankTransferListFragment) {
        super(new C2383a());
        this.f19876a = mayaBankTransferListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C2344b holder = (C2344b) viewHolder;
        j.g(holder, "holder");
        Favorite favorite = (Favorite) getItem(i);
        holder.f = favorite;
        if (favorite != null) {
            C1593a c1593a = holder.h;
            c1593a.getClass();
            ((C2344b) ((InterfaceC2304b) c1593a.c.get())).f20483d.setImageResource(R.drawable.maya_ic_bank_transfer_placeholder_green);
            InterfaceC2304b interfaceC2304b = (InterfaceC2304b) c1593a.c.get();
            ((C2344b) interfaceC2304b).f20481a.setText(favorite.mAlias());
            InterfaceC2304b interfaceC2304b2 = (InterfaceC2304b) c1593a.c.get();
            ((C2344b) interfaceC2304b2).c.setText(favorite.mContentPreview().mText1());
            InterfaceC2304b interfaceC2304b3 = (InterfaceC2304b) c1593a.c.get();
            ((C2344b) interfaceC2304b3).f20482b.setText(favorite.mContentPreview().mText2());
            if (j.b(favorite.mIsMaintenance(), Boolean.TRUE)) {
                C2344b c2344b = (C2344b) ((InterfaceC2304b) c1593a.c.get());
                c2344b.e.setVisibility(0);
                c2344b.c.setAlpha(0.4f);
                c2344b.f20482b.setAlpha(0.4f);
                c2344b.f20481a.setAlpha(0.4f);
                c2344b.f20483d.setAlpha(0.4f);
                return;
            }
            C2344b c2344b2 = (C2344b) ((InterfaceC2304b) c1593a.c.get());
            c2344b2.e.setVisibility(8);
            c2344b2.c.setAlpha(1.0f);
            c2344b2.f20482b.setAlpha(1.0f);
            c2344b2.f20481a.setAlpha(1.0f);
            c2344b2.f20483d.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        int i4 = C2344b.i;
        MayaBankTransferListFragment listener = this.f19876a;
        j.g(listener, "listener");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_favorite_card, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i6 = R.id.icon_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.icon_image);
        if (imageView != null) {
            i6 = R.id.text_view_alias;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_alias);
            if (textView != null) {
                i6 = R.id.text_view_line1;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_line1);
                if (textView2 != null) {
                    i6 = R.id.text_view_line2;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_line2);
                    if (textView3 != null) {
                        i6 = R.id.text_view_maintenance;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance);
                        if (textView4 != null) {
                            return new C2344b(new m1(constraintLayout, constraintLayout, imageView, textView, textView2, textView3, textView4, 0), listener);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }
}
