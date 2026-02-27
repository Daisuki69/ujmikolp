package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4165b;
    public final ImageView c;

    public /* synthetic */ n1(ConstraintLayout constraintLayout, ImageView imageView, int i) {
        this.f4164a = i;
        this.f4165b = constraintLayout;
        this.c = imageView;
    }

    public static n1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_id_thumbnail, viewGroup, false);
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_id_image);
        if (imageView != null) {
            return new n1((ConstraintLayout) viewInflate, imageView, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.image_view_id_image)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4164a) {
        }
        return this.f4165b;
    }
}
