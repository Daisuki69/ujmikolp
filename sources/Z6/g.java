package Z6;

import N5.Y0;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f6900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6901b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gb.d f6902d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Y0 y0) {
        ConstraintLayout constraintLayout = y0.f4038b;
        super(constraintLayout);
        this.f6900a = y0.f4039d;
        this.f6901b = y0.c;
        this.c = constraintLayout.getContext();
        this.f6902d = new Gb.d(this, 29);
    }
}
