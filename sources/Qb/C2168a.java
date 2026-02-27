package qb;

import Ag.l;
import Ke.b;
import N5.C0453g;
import N5.Y0;
import We.A;
import We.E;
import We.G;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.paymaya.R;
import com.paymaya.domain.model.RewardsCatalog;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import o6.f;
import sb.C2247a;
import sb.C2248b;
import sb.C2249c;

/* JADX INFO: renamed from: qb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2168a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f19762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19763b = new ArrayList();
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19764d;

    public C2168a(f fVar) {
        this.f19762a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.c) {
            return 3;
        }
        return this.f19763b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.c) {
            return 2;
        }
        return i == this.f19763b.size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        if (holder instanceof C2249c) {
            return;
        }
        boolean z4 = holder instanceof C2247a;
        f fVar = this.f19762a;
        if (z4) {
            ArrayList arrayList = this.f19763b;
            if (i < arrayList.size()) {
                RewardsCatalog item = (RewardsCatalog) arrayList.get(i);
                j.g(item, "item");
                String title = item.getTitle();
                j.g(title, "title");
                C0453g c0453g = ((C2247a) holder).f20032a;
                ((TextView) c0453g.e).setText(title);
                String points = item.getPoints();
                j.g(points, "points");
                ((TextView) c0453g.f4095d).setText(points);
                String thumbnail = item.getThumbnail();
                G g8 = A.d().g(thumbnail != null ? Uri.parse(thumbnail) : null);
                g8.c = true;
                E e = g8.f6359b;
                e.f6351b = true;
                e.e = 17;
                g8.b(R.drawable.maya_img_catalog_tile_placeholder_inset);
                g8.e((ShapeableImageView) c0453g.c, null);
                ConstraintLayout constraintLayout = (ConstraintLayout) c0453g.f4094b;
                j.f(constraintLayout, "getRoot(...)");
                b.b(constraintLayout, new l(23, fVar, item));
                return;
            }
        }
        if (holder instanceof C2248b) {
            C2248b c2248b = (C2248b) holder;
            boolean z5 = this.f19764d;
            Y0 y0 = c2248b.f20033a;
            if (z5) {
                y0.c.setImageResource(R.drawable.maya_ic_gift_emoji);
                String string = c2248b.itemView.getContext().getString(R.string.maya_label_see_all);
                j.f(string, "getString(...)");
                y0.f4039d.setText(string);
            } else {
                y0.c.setImageResource(R.drawable.maya_ic_card_emoji);
                String string2 = c2248b.itemView.getContext().getString(R.string.maya_label_get_maya_black);
                j.f(string2, "getString(...)");
                y0.f4039d.setText(string2);
            }
            ConstraintLayout constraintLayout2 = y0.f4038b;
            j.f(constraintLayout2, "getRoot(...)");
            b.b(constraintLayout2, new W4.b(fVar, 24));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_item_rewards_catalog, parent, false);
            int i4 = R.id.image_view_merchant_thumbnail;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_merchant_thumbnail);
            if (shapeableImageView != null) {
                i4 = R.id.text_view_reward_miles_range;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reward_miles_range);
                if (textView != null) {
                    i4 = R.id.text_view_reward_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reward_title);
                    if (textView2 != null) {
                        return new C2247a(new C0453g(22, (ConstraintLayout) viewInflate, shapeableImageView, textView, textView2));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_item_rewards_catalog_shimmer, parent, false);
            if (viewInflate2 != null) {
                return new C2249c((CardView) viewInflate2);
            }
            throw new NullPointerException("rootView");
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.maya_item_see_all_rewards_catalog, parent, false);
        int i6 = R.id.image_view_gift;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.image_view_gift);
        if (imageView != null) {
            i6 = R.id.text_view_see_all;
            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.text_view_see_all);
            if (textView3 != null) {
                return new C2248b(new Y0((ConstraintLayout) viewInflate3, imageView, textView3, 0));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i6)));
    }
}
