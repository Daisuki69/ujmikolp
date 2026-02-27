package w1;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f20576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f20577b;
    public final Drawable[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20578d;

    public n(t tVar, String[] strArr, Drawable[] drawableArr) {
        this.f20578d = tVar;
        this.f20576a = strArr;
        this.f20577b = new String[strArr.length];
        this.c = drawableArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20576a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m mVar = (m) viewHolder;
        mVar.f20573a.setText(this.f20576a[i]);
        String str = this.f20577b[i];
        TextView textView = mVar.f20574b;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.c[i];
        ImageView imageView = mVar.c;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        t tVar = this.f20578d;
        return new m(tVar, LayoutInflater.from(tVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) null));
    }
}
