package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import dOYHB6.lN8Dz0.yf3D09;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentViewHolder extends RecyclerView.ViewHolder {
    private FragmentViewHolder(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    public static FragmentViewHolder create(@NonNull ViewGroup viewGroup) {
        yf3D09 yf3d09 = new yf3D09(viewGroup.getContext());
        yf3d09.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        yf3d09.setId(ViewCompat.generateViewId());
        yf3d09.setSaveEnabled(false);
        return new FragmentViewHolder(yf3d09);
    }

    @NonNull
    public FrameLayout getContainer() {
        return (FrameLayout) this.itemView;
    }
}
