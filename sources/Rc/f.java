package Rc;

import N5.Y0;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.R;
import com.paymaya.domain.model.ShareSaveAppInfo;
import kotlin.jvm.internal.j;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetDialogFragment f5487a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e eVar) {
        super(new C2383a());
        this.f5487a = (BottomSheetDialogFragment) eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ad.d holder = (ad.d) viewHolder;
        j.g(holder, "holder");
        Object item = getItem(i);
        j.f(item, "getItem(...)");
        ShareSaveAppInfo shareSaveAppInfo = (ShareSaveAppInfo) item;
        holder.c = shareSaveAppInfo;
        Pc.e eVar = holder.f7136d;
        eVar.getClass();
        Zc.a aVar = (Zc.a) eVar.c.get();
        ((ad.d) aVar).f7134a.f4039d.setText(shareSaveAppInfo.getLabel());
        if (shareSaveAppInfo.equals(ShareSaveAppInfo.Companion.getSAVE_IMAGE())) {
            ((ad.d) ((Zc.a) eVar.c.get())).f7134a.c.setImageResource(R.drawable.pma_ic_save_primary);
            return;
        }
        if (shareSaveAppInfo.getIconBitmap() == null) {
            ((ad.d) ((Zc.a) eVar.c.get())).f7134a.c.setImageResource(R.drawable.pma_ic_default_share_save);
            return;
        }
        Zc.a aVar2 = (Zc.a) eVar.c.get();
        Bitmap bitmap = shareSaveAppInfo.getIconBitmap();
        ad.d dVar = (ad.d) aVar2;
        dVar.getClass();
        j.g(bitmap, "bitmap");
        dVar.f7134a.c.setImageBitmap(bitmap);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Rc.e, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pma_view_holder_share_save, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.icon_image_view_pma_view_holder_share_save;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.icon_image_view_pma_view_holder_share_save);
        if (imageView != null) {
            i4 = R.id.text_view_pma_view_holder_share_save;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_pma_view_holder_share_save);
            if (textView != null) {
                return new ad.d(new Y0(constraintLayout, imageView, textView, 5), this.f5487a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
